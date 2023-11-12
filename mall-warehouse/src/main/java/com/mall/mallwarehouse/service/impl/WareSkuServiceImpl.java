package com.mall.mallwarehouse.service.impl;

import com.mall.mallwarehouse.entity.WareSku;
import com.mall.mallwarehouse.mapper.WareSkuMapper;
import com.mall.mallwarehouse.service.IWareSkuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * ï¿½ï¿½Æ·ï¿½ï¿½ï¿½ 服务实现类
 * </p>
 *
 * @author Jiayu
 * @since 2023-10-25
 */
@Service
public class WareSkuServiceImpl extends ServiceImpl<WareSkuMapper, WareSku> implements IWareSkuService {

    @Override
    public boolean reduceStock(Long skuId, Integer quantity) {
        // 实现减少库存的逻辑
        WareSku wareSku = this.baseMapper.selectBySkuId(skuId);
        if (wareSku != null && wareSku.getStock() >= quantity) {
            this.baseMapper.decreaseStock(skuId,quantity);
            return true;
        }
        return false;
    }
}
