package com.mall.mallorder.mapper;

import com.mall.mallorder.entity.Order;
import com.mall.mallorder.entity.OrderItem;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½Ï¢ Mapper 接口
 * </p>
 *
 * @author Jiayu
 * @since 2023-10-25
 */
@Mapper
public interface OrderItemMapper extends BaseMapper<OrderItem> {
    @Insert("INSERT INTO oms_order_item (order_id, order_sn, spu_id, spu_name, spu_pic, spu_brand, category_id, sku_id, sku_name, sku_pic, sku_price, sku_quantity) VALUES (#{orderId}, #{orderSn}, #{spuId}, #{spuName}, #{spuPic}, #{spuBrand}, #{categoryId}, #{skuId}, #{skuName}, #{skuPic}, #{skuPrice}, #{skuQuantity})")
    int insert(OrderItem orderItem);
}
