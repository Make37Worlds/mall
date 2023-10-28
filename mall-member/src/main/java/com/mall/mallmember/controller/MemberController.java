package com.mall.mallmember.controller;

import com.mall.mallmember.service.OrderServiceClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * »áÔ± 前端控制器
 * </p>
 *
 * @author Jiayu
 * @since 2023-10-25
 */
@RestController
@RequestMapping("/mallmember/member")
public class MemberController {
    private final OrderServiceClient orderServiceClient;

    public MemberController(OrderServiceClient orderServiceClient) {
        this.orderServiceClient = orderServiceClient;
    }

    @GetMapping("/test")
    public String getMemberOrders() {
        return "success";
    }
    @GetMapping("{memberId}/orders")
    public String getMemberOrders(@PathVariable String memberId) {
        return orderServiceClient.fetchOrderDetailsForMember(memberId);
    }

}
