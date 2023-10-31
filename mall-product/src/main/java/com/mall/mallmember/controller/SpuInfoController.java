package com.mall.mallmember.controller;

import com.mall.mallmember.entity.SpuInfo;
import com.mall.mallmember.service.impl.SpuInfoServiceImpl;
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

    @GetMapping("/all")
    public ResponseEntity<List<SpuInfo>> getAllProducts() {
        List<SpuInfo> products = spuInfoService.getAllProducts();
        return ResponseEntity.ok(products);
    }


    @PostMapping("/add")
    public ResponseEntity<Boolean> addSpu(@RequestBody SpuInfo spuInfo) {
        boolean result = spuInfoService.addSpu(spuInfo);
        return ResponseEntity.ok(result);
    }



}
