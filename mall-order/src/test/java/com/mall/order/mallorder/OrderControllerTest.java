package com.mall.order.mallorder;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import com.mall.mallorder.controller.OrderController;
import com.mall.mallorder.entity.DTO.MemberInfo;
import com.mall.mallorder.entity.DTO.OrderRequest;
import com.mall.mallorder.entity.Order;
import com.mall.mallorder.entity.ResultInfo;
import com.mall.mallorder.service.IOrderItemService;
import com.mall.mallorder.service.IOrderService;
import com.mall.mallorder.service.impl.MemberSvcClient;
import com.mall.mallorder.service.impl.WarehouseServiceClient;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class OrderControllerTest {

    @Mock
    private WarehouseServiceClient warehouseServiceClient;

    @Mock
    private MemberSvcClient memberSvcClient;

    @Mock
    private IOrderService orderService;

    @Mock
    private IOrderItemService orderItemService;

    @InjectMocks
    private OrderController orderController;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testCreateOrderWithStockCheck_Success() {
        // Arrange
        Long memberId = 1L;
        OrderRequest request = new OrderRequest(); // Populate with test data
        ResultInfo mockStockResponse = ResultInfo.success();
        MemberInfo mockMember = new MemberInfo(); // Populate with test data
        when(warehouseServiceClient.reduceStock(request)).thenReturn(mockStockResponse);
        when(memberSvcClient.getMemberById(memberId)).thenReturn(mockMember);
        when(orderService.createOrder(any(Order.class))).thenReturn(true);
    }
}

