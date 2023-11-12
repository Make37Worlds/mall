package com.mall.mallwarehouse;

import com.mall.mallwarehouse.controller.WareSkuController;
import com.mall.mallwarehouse.enums.ResultCode;
import com.mall.mallwarehouse.service.IWareSkuService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.mockito.BDDMockito.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
public class WareSkuControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private IWareSkuService wareSkuService;

    @Test
    public void testReduceStock() throws Exception {
        Long productId = 1L;
        Integer quantity = 10;

        // 假设当库存足够时，reduceStock 方法返回 true
        given(wareSkuService.reduceStock(productId, quantity)).willReturn(true);

        mockMvc.perform(MockMvcRequestBuilders.post("/wareSku/reduceStock")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"productId\": \"" + productId + "\", \"quantity\": \"" + quantity + "\"}")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.code").value("1"));

        // 测试库存不足的情况
        given(wareSkuService.reduceStock(productId, quantity)).willReturn(false);

        mockMvc.perform(MockMvcRequestBuilders.post("/wareSku/reduceStock")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"productId\": \"" + productId + "\", \"quantity\": \"" + quantity + "\"}")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.code").value("50002"));
    }
}
