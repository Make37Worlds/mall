package com.mall.mallproduct.controller;

import com.mall.mallproduct.entity.ResultInfo;
import com.mall.mallproduct.entity.SpuInfo;
import com.mall.mallproduct.service.impl.SpuInfoServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/spuInfo")
public class SpuInfoController {
    private final SpuInfoServiceImpl spuInfoService;

    public SpuInfoController(SpuInfoServiceImpl spuInfoService) {
        this.spuInfoService = spuInfoService;
    }

    @GetMapping("/name/{spuName}")
    public ResponseEntity<SpuInfo> getSpuInfoByName(@PathVariable String spuName) {
        SpuInfo spuInfo = spuInfoService.getSpuInfoByName(spuName);
        if (spuInfo != null) {
            return ResponseEntity.ok(spuInfo);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/user/products")
    public ResponseEntity<List<SpuInfo>> getProductsByUserId(@RequestHeader("X-User-ID") String userId) {
        List<SpuInfo> spuInfos = spuInfoService.getProductsByUserId(userId);
        if (!spuInfos.isEmpty()) {
            return ResponseEntity.ok(spuInfos);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/all")
    public ResultInfo getAllProducts() {
        List<SpuInfo> products = spuInfoService.getAllProducts();
        return ResultInfo.success(products);
    }


    @PostMapping("/add")
    public ResultInfo addSpu(@RequestBody SpuInfo spuInfo) {
        boolean result = spuInfoService.addSpu(spuInfo);
        return ResultInfo.success(result);
    }



}
