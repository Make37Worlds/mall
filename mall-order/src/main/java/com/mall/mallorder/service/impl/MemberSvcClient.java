package com.mall.mallorder.service.impl;

import com.mall.mallorder.entity.DTO.MemberInfo;
import com.mall.mallorder.entity.DTO.OrderRequest;
import com.mall.mallorder.entity.ResultInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "mall-member-service", url = "http://mall-member-service")
public interface MemberSvcClient {

    @GetMapping("/member/findMemberById")
    ResultInfo getMemberById(@RequestParam("id") Long id);
}