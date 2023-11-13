package com.mall.mallorder.service.impl;

import com.mall.mallorder.entity.OrderItem;
import com.mall.mallorder.mapper.OrderItemMapper;
import com.mall.mallorder.service.IOrderItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½Ï¢ 服务实现类
 * </p>
 *
 * @author Jiayu
 * @since 2023-10-25
 */
@Service
public class OrderItemServiceImpl extends ServiceImpl<OrderItemMapper, OrderItem> implements IOrderItemService {
    private final OrderItemMapper orderItemMapper;

    @Autowired
    public OrderItemServiceImpl(OrderItemMapper orderItemMapper) {
        this.orderItemMapper = orderItemMapper;
    }

    @Override
    public boolean addOrderItem(OrderItem orderItem) {
        return orderItemMapper.insert(orderItem) > 0;
    }
}
