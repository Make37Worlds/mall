package com.mall.mallorder.service.impl;

import com.mall.mallorder.entity.DTO.OrderRequest;
import com.mall.mallorder.entity.ResultInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "mall-warehouse-service", url = "http://mall-warehouse-service")
public interface WarehouseServiceClient {

    @PostMapping("/api/mallwarehouse/wareSku/reduceStock")
    ResultInfo reduceStock(@RequestBody OrderRequest request);
}
