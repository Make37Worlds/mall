package com.mall.mallmember;
import com.mall.mallmember.entity.ResultInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.mall.mallmember.service.OrderServiceClient;
import com.mall.mallmember.service.IMemberService;
import com.mall.mallmember.entity.Member;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.mockito.Mockito.when;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;


@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
public class MemberControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private OrderServiceClient orderServiceClient;

    @MockBean
    private IMemberService memberService;
    @Test
    public void testGetMemberByName() throws Exception {
        Member mockMember = new Member();
        mockMember.setUsername("John Doe");
        // set other properties as needed

        when(memberService.getMemberByName("John Doe")).thenReturn(mockMember);

        mockMvc.perform(get("/member/findMemberByName")
                        .param("name", "John Doe")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().json(new ObjectMapper().writeValueAsString(ResultInfo.success(mockMember))));
    }


    @Test
    public void testGetMemberOrders() throws Exception {
        when(orderServiceClient.fetchOrderDetailsForMember(anyString())).thenReturn("Order Details");

        mockMvc.perform(get("/member/1/orders"))
                .andExpect(status().isOk())
                .andExpect(content().string("Order Details"));
    }

    @Test
    public void testAddMember() throws Exception {
        Member member = new Member();
        member.setUsername("John");
        member.setPassword("123");
        when(memberService.addMember(any(Member.class))).thenReturn(true);

        mockMvc.perform(post("/member/add")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(new ObjectMapper().writeValueAsString(member)))
                .andExpect(status().isOk())
                .andExpect(content().string("Member added successfully!"));
    }
}
