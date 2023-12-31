package com.mall.mallmember.controller;

import com.mall.mallmember.constants.enums.ResultCode;
import com.mall.mallmember.entity.*;

import com.mall.mallmember.service.IMemberService;
import com.mall.mallmember.service.OrderServiceClient;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/member")
public class MemberController {

    private final OrderServiceClient orderServiceClient;

    private final IMemberService memberService;

    public MemberController(OrderServiceClient orderServiceClient, IMemberService memberService) {
        this.orderServiceClient = orderServiceClient;
        this.memberService = memberService;
    }

    @GetMapping("/test")
    public String test() {
        return "success";
    }

    @GetMapping("/{memberId}/orders")
    public String getMemberOrders(@PathVariable String memberId) {
        return orderServiceClient.fetchOrderDetailsForMember(memberId);
    }

    @GetMapping("/{memberId}")
    public Member getMemberDetails(@PathVariable Long memberId) {
        return memberService.getMemberById(memberId);
    }

    @GetMapping("/findMemberByName")
    public ResultInfo getMemberByName(@RequestParam String name) {
        return ResultInfo.success(memberService.getMemberByName(name));
    }

    @GetMapping("/findMemberById")
    public ResultInfo getMemberById(@RequestParam Long id) {
        return ResultInfo.success(memberService.getMemberById(id));
    }

    @GetMapping("/{memberId}/loginlogs")
    public List<MemberLoginLog> getMemberLoginLogs(@PathVariable Long memberId) {
        return memberService.getLoginLogsForMember(memberId);
    }

    @GetMapping("/{memberId}/addresses")
    public List<MemberReceiveAddress> getMemberAddresses(@PathVariable Long memberId) {
        return memberService.getAddressesForMember(memberId);
    }

    @GetMapping("/{memberId}/stats")
    public MemberStatisticsInfo getMemberStats(@PathVariable Long memberId) {
        return memberService.getStatisticsForMember(memberId);
    }

    @PostMapping("/add")
    public ResultInfo addMember(@RequestBody Member member) {
        String password = member.getPassword();
        member.setPassword(DigestUtils.sha256Hex(password));
        if (memberService.addMember(member)) {
            return ResultInfo.success("Member added successfully!");
        } else {
            return ResultInfo.failure(ResultCode.PARAM_IS_ERROR, "Failed to add member!");
        }
    }

}
