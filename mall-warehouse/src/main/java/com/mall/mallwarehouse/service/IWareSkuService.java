package com.mall.mallwarehouse.service;

import com.mall.mallwarehouse.entity.WareSku;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * ï¿½ï¿½Æ·ï¿½ï¿½ï¿½ 服务类
 * </p>
 *
 * @author Jiayu
 * @since 2023-10-25
 */
public interface IWareSkuService extends IService<WareSku> {
    boolean reduceStock(Long skuId, Integer quantity);
}
