package com.mall.mallwarehouse.controller;

import com.mall.mallwarehouse.entity.OrderRequest;
import com.mall.mallwarehouse.entity.ResultInfo;
import com.mall.mallwarehouse.enums.ResultCode;
import com.mall.mallwarehouse.service.IWareSkuService;
import com.mall.mallwarehouse.service.impl.WareSkuServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/wareSku")
public class WareSkuController {

    private final IWareSkuService wareSkuService;

    public WareSkuController(IWareSkuService wareSkuService) {
        this.wareSkuService = wareSkuService;
    }

    @PostMapping("/reduceStock")
    public ResultInfo reduceStock(@RequestBody OrderRequest stockRequest) {
        boolean success = wareSkuService.reduceStock(stockRequest.getProductId(), stockRequest.getQuantity());
        if (success) {
            return ResultInfo.success();
        } else {
            return ResultInfo.failure(ResultCode.DATA_IS_WRONG,"stock is not enough");
        }

    }
}
