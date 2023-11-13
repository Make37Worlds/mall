package com.mall.mallorder.service;

import com.mall.mallorder.entity.OrderItem;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½Ï¢ 服务类
 * </p>
 *
 * @author Jiayu
 * @since 2023-10-25
 */
public interface IOrderItemService extends IService<OrderItem> {

    boolean addOrderItem(OrderItem orderItem);
}
