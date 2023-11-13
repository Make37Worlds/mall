package com.mall.mallorder.controller;

import com.mall.mallorder.constants.enums.ResultCode;
import com.mall.mallorder.entity.DTO.MemberInfo;
import com.mall.mallorder.entity.DTO.OrderRequest;
import com.mall.mallorder.entity.Order;
import com.mall.mallorder.entity.ResultInfo;
import com.mall.mallorder.service.IOrderItemService;
import com.mall.mallorder.service.IOrderService;
import com.mall.mallorder.service.impl.MemberSvcClient;
import com.mall.mallorder.service.impl.WarehouseServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

import java.lang.reflect.Member;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * <p>
 * ï¿½ï¿½ï¿½ï¿½ 前端控制器
 * </p>
 *
 * @author Jiayu
 * @since 2023-10-25
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    private final IOrderItemService orderItemService;
    private final IOrderService orderService;

    @Autowired
    private WarehouseServiceClient warehouseServiceClient;

    @Autowired
    private MemberSvcClient memberSvcClient;
    public OrderController(IOrderService orderService, IOrderItemService orderItemService) {
        this.orderItemService = orderItemService;
        this.orderService = orderService;
    }

    @PostMapping("/create")
    public ResultInfo createOrder(@RequestBody Order order) {
        boolean isCreated = orderService.createOrder(order);
        if (isCreated) {
            return ResultInfo.success("Order created successfully.");
        } else {
            return ResultInfo.failure(ResultCode.DATA_ADD_ERROR,"Failed to create order.");
        }
    }

    @PostMapping("/createWithStockCheck")
    public ResultInfo createOrderWithStockCheck(@RequestHeader("X-User-ID") Long memberId, @RequestBody OrderRequest request) {
        ResultInfo stockReduced = warehouseServiceClient.reduceStock(request);
        if (stockReduced.getCode() != 1) {
            return ResultInfo.failure(ResultCode.DATA_ADD_ERROR,"stock not enough");
        }
        MemberInfo member = (MemberInfo) memberSvcClient.getMemberById(memberId).getData();
        Order order = new Order();
        order.setMemberId(memberId);
        order.setCreateTime(LocalDateTime.now());
        order.setMemberUsername(member.getUsername());
        order.setReceiverCity(member.getCity());
        boolean orderItemCreated = orderItemService.addOrderItem(request.toOrderItem());
        boolean orderCreated = orderService.createOrder(order);
        if (orderCreated && orderItemCreated) {
            return ResultInfo.success(order);
        } else {
            return ResultInfo.failure(ResultCode.DATA_ADD_ERROR,"Failed to create order.");
        }
    }

    @GetMapping("/{memberId}")
    public String getOrderDetails(@PathVariable String memberId) {
        return "Order details for member: " + memberId;
    }



}
