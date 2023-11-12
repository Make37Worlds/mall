package com.mall.mallproduct.service;

import com.mall.mallproduct.entity.SpuInfo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 * spuï¿½ï¿½Ï¢ 服务类
 * </p>
 *
 * @author Jiayu
 * @since 2023-10-25
 */
public interface ISpuInfoService extends IService<SpuInfo> {

    SpuInfo getSpuInfoByName(String spuName);

    List<SpuInfo> getSpuInfoByPublishStatus(Byte publishStatus);

    List<SpuInfo> getSpuInfoCreatedAfter(LocalDateTime createTime);

    List<SpuInfo> getAllProducts();


    boolean addSpu(SpuInfo spu);

    Object getSpuInfoById(String spuId);

    List<SpuInfo> getProductsByUserId(String sellerId);
}
