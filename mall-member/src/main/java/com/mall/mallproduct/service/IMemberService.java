package com.mall.mallproduct.service;

import com.mall.mallproduct.entity.Member;
import com.baomidou.mybatisplus.extension.service.IService;
import com.mall.mallproduct.entity.MemberLoginLog;
import com.mall.mallproduct.entity.MemberReceiveAddress;
import com.mall.mallproduct.entity.MemberStatisticsInfo;
import com.mall.mallproduct.entity.vo.MemberVo;

import java.util.List;

/**
 * <p>
 * »áÔ± 服务类
 * </p>
 *
 * @author Jiayu
 * @since 2023-10-25
 */
public interface IMemberService extends IService<Member> {

    Member getMemberByName(String name);

    MemberVo getMemberVoByName(String name);

    Member getMemberById(Long memberId);

    List<MemberLoginLog> getLoginLogsForMember(Long memberId);

    List<MemberReceiveAddress> getAddressesForMember(Long memberId);

    MemberStatisticsInfo getStatisticsForMember(Long memberId);

    boolean addMember(Member member);

}
