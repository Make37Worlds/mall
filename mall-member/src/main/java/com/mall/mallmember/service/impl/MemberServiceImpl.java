package com.mall.mallmember.service.impl;

import com.mall.mallmember.entity.Member;
import com.mall.mallmember.entity.MemberLoginLog;
import com.mall.mallmember.entity.MemberReceiveAddress;
import com.mall.mallmember.entity.MemberStatisticsInfo;
import com.mall.mallmember.entity.vo.MemberVo;
import com.mall.mallmember.mapper.MemberMapper;
import com.mall.mallmember.service.IMemberService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member> implements IMemberService {
    @Override
    public Member getMemberByName(String name){
        return baseMapper.findByUsername(name);
    }
    @Override
    public MemberVo getMemberVoByName(String name){
        MemberVo member = baseMapper.findVoByUsername(name);
        return member==null? new MemberVo(): member;
    }


    @Override
    public Member getMemberById(Long memberId) {
        return this.getById(memberId);
    }

    @Override
    public List<MemberLoginLog> getLoginLogsForMember(Long memberId) {
        return baseMapper.getLoginLogsForMember(memberId);
    }

    @Override
    public List<MemberReceiveAddress> getAddressesForMember(Long memberId) {
        return baseMapper.getAddressesForMember(memberId);
    }

    @Override
    public MemberStatisticsInfo getStatisticsForMember(Long memberId) {
        return baseMapper.getStatisticsForMember(memberId);
    }

    @Override
    public boolean addMember(Member member) {
        return this.save(member);
    }



}
