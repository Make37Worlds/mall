package com.mall.mallorder.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

/**
 * <p>
 * ï¿½ï¿½ï¿½ï¿½ 前端控制器
 * </p>
 *
 * @author Jiayu
 * @since 2023-10-25
 */
@Controller
@RequestMapping("/mallorder/order")
public class OrderController {
    @GetMapping("/mallorder/orders/{memberId}")
    public String getOrderDetails(@PathVariable String memberId) {
        // For this example, we'll return a static message.
        // In a real-world scenario, you'd fetch actual order details from a database or another source.
        return "Order details for member: " + memberId;
    }

}
