package com.mall.mallproduct;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mall.mallproduct.controller.SpuInfoController;
import com.mall.mallproduct.entity.SpuInfo;
import com.mall.mallproduct.service.impl.SpuInfoServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
@WebMvcTest(SpuInfoController.class)
class SpuInfoControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private SpuInfoServiceImpl spuInfoService;

    @Autowired
    private ObjectMapper objectMapper;

    private SpuInfo spuInfo;

    @BeforeEach
    void setUp() {
        spuInfo = new SpuInfo();
        spuInfo.setId(1L);
        spuInfo.setSpuName("Product1");
        spuInfo.setSpuDescription("Description1");
        spuInfo.setCatalogId(1L);
        spuInfo.setBrandId(1L);
        spuInfo.setWeight(new BigDecimal("10.5"));
        spuInfo.setPublishStatus((byte) 1);
        spuInfo.setSellerId(1L);
    }


    @Test
    void shouldAddSpu() throws Exception {
        SpuInfo spuInfo = new SpuInfo();

        when(spuInfoService.addSpu(any(SpuInfo.class))).thenReturn(true);

        mockMvc.perform(post("/spuInfo/add")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(spuInfo)))
                .andExpect(status().isOk())
                .andExpect(content().string("{\"code\":1,\"msg\":\"æ\u0088\u0090å\u008A\u009F\",\"data\":true}"));
    }


    @Test
    void shouldGetSpuInfoByName() throws Exception {
        when(spuInfoService.getSpuInfoByName("Product1")).thenReturn(spuInfo);

        mockMvc.perform(get("/spuInfo/name/Product1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.spuName").value("Product1"));
    }

//    @Test
//    void shouldGetProductsByUserId() throws Exception {
//        // 准备数据
//        List<SpuInfo> spuInfos = Arrays.asList(spuInfo); // 假设 spuInfo 是您想要返回的产品信息
//        String userId = "1"; // 假设的用户ID
//
//        // 模拟服务层返回数据
//        when(spuInfoService.getProductsByUserId(userId)).thenReturn(spuInfos);
//
//        // 执行请求并验证结果
//        mockMvc.perform(get("/spuInfo/user/products")
//                        .header("X-User-ID", userId))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$[0].code").value("Product1")); // 验证返回的数据
//    }


}
