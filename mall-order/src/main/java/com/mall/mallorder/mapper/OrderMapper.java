package com.mall.mallorder.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mall.mallorder.entity.Order;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * ï¿½ï¿½ï¿½ï¿½ Mapper 接口
 * </p>
 *
 * @author Jiayu
 * @since 2023-10-25
 */
@Mapper
public interface OrderMapper extends BaseMapper<Order> {
    @Insert("INSERT INTO oms_order (member_id, order_sn, create_time, member_username, total_amount, pay_amount, freight_amount, pay_type, source_type, status, delivery_company, delivery_sn, growth, receiver_name, receiver_phone, receiver_post_code, receiver_province, receiver_city, receiver_region, receiver_detail_address, note, confirm_status, delete_status) VALUES (#{memberId}, #{orderSn}, #{createTime}, #{memberUsername}, #{totalAmount}, #{payAmount}, #{freightAmount}, #{payType}, #{sourceType}, #{status}, #{deliveryCompany}, #{deliverySn}, #{growth}, #{receiverName}, #{receiverPhone}, #{receiverPostCode}, #{receiverProvince}, #{receiverCity}, #{receiverRegion}, #{receiverDetailAddress}, #{note}, #{confirmStatus}, #{deleteStatus})")
    int insertOrder(Order order);
}
