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
    }
    

    @Test
    void shouldAddSpu() throws Exception {
        SpuInfo spuInfo = new SpuInfo();

        when(spuInfoService.addSpu(any(SpuInfo.class))).thenReturn(true);

        mockMvc.perform(post("/spuInfo/add")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(spuInfo)))
                .andExpect(status().isOk())
                .andExpect(content().string("{\"code\":200,\"msg\":\"æ\u0088\u0090å\u008A\u009F\",\"data\":true}"));
    }


    @Test
    void shouldGetSpuInfoByName() throws Exception {
        when(spuInfoService.getSpuInfoByName("Product1")).thenReturn(spuInfo);

        mockMvc.perform(get("/spuInfo/name/Product1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.spuName").value("Product1"));
    }

}
