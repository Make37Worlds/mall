package com.mall.mallwarehouse.mapper;

import com.mall.mallwarehouse.entity.WareSku;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

/**
 * <p>
 * ï¿½ï¿½Æ·ï¿½ï¿½ï¿½ Mapper 接口
 * </p>
 *
 * @author Jiayu
 * @since 2023-10-25
 */

@Mapper
public interface WareSkuMapper extends BaseMapper<WareSku> {
    @Update("UPDATE wms_ware_sku SET stock = stock - #{quantity} WHERE sku_id = #{skuId} AND stock >= #{quantity}")
    int decreaseStock(@Param("skuId") Long skuId, @Param("quantity") Integer quantity);
}
