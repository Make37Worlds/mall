package com.mall.mallproducts;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.mall.mallproduct.controller.SpuInfoController;
import com.mall.mallproduct.service.impl.SpuInfoServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.Optional;

@ExtendWith(MockitoExtension.class)
@WebMvcTest(SpuInfoController.class)
public class SpuInfoControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private SpuInfoServiceImpl spuInfoService;

    @InjectMocks
    private SpuInfoController spuInfoController;

    @BeforeEach
    public void setup(WebApplicationContext wac) {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }

    @Test
    public void testGetSpuInfo_NotFound() throws Exception {
        // Arrange
        String spuId = "nonexistent";
        when(spuInfoService.getSpuInfoById(spuId)).thenReturn(Optional.empty()); // Assuming your service returns Optional

        // Act and Assert
        mockMvc.perform(get("/spuInfo/{id}", spuId).contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isNotFound());
    }


}
