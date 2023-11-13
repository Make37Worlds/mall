package com.mall.mallorder.service.impl;

import com.mall.mallorder.entity.Order;
import com.mall.mallorder.mapper.OrderMapper;
import com.mall.mallorder.service.IOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * <p>
 * ï¿½ï¿½ï¿½ï¿½ 服务实现类
 * </p>
 *
 * @author Jiayu
 * @since 2023-10-25
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements IOrderService {
    private final OrderMapper orderMapper;

    @Autowired
    public OrderServiceImpl(OrderMapper orderMapper) {
        this.orderMapper = orderMapper;
    }

    @Override
    public boolean createOrder(Order order) {

        order.setCreateTime(LocalDateTime.now());

        return orderMapper.insertOrder(order) > 0;
    }
}
