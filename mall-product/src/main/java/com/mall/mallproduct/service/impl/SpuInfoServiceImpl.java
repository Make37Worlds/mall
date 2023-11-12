package com.mall.mallproduct.service.impl;

import com.mall.mallproduct.entity.SpuInfo;
import com.mall.mallproduct.mapper.SpuInfoMapper;
import com.mall.mallproduct.service.ISpuInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 * spuï¿½ï¿½Ï¢ 服务实现类
 * </p>
 *
 * @author Jiayu
 * @since 2023-10-25
 */
@Service
public class SpuInfoServiceImpl extends ServiceImpl<SpuInfoMapper, SpuInfo> implements ISpuInfoService {
    @Override
    public SpuInfo getSpuInfoByName(String spuName) {
        return baseMapper.selectBySpuName(spuName);
    }

    @Override
    public List<SpuInfo> getSpuInfoByPublishStatus(Byte publishStatus) {
        return baseMapper.selectByPublishStatus(publishStatus);
    }

    @Override
    public List<SpuInfo> getSpuInfoCreatedAfter(LocalDateTime createTime) {
        return baseMapper.selectByCreateTimeAfter(createTime);
    }

    @Override
    public List<SpuInfo> getAllProducts() {
        return this.list();
    }

    @Override
    public boolean addSpu(SpuInfo spu) {
        return this.save(spu);
    }

    @Override
    public Object getSpuInfoById(String spuId) { return baseMapper.selectBySpuId(spuId);
    }

    @Override
    public List<SpuInfo> getProductsByUserId(String sellerId) {
        return baseMapper.selectBySellerId(sellerId);
    }
}
