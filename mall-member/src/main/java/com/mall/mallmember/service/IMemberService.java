package com.mall.mallmember.service;

import com.mall.mallmember.entity.Member;
import com.baomidou.mybatisplus.extension.service.IService;
import com.mall.mallmember.entity.MemberLoginLog;
import com.mall.mallmember.entity.MemberReceiveAddress;
import com.mall.mallmember.entity.MemberStatisticsInfo;
import org.springframework.beans.factory.annotation.Autowired;

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

    Member getMemberById(Long memberId);

    List<MemberLoginLog> getLoginLogsForMember(Long memberId);

    List<MemberReceiveAddress> getAddressesForMember(Long memberId);

    MemberStatisticsInfo getStatisticsForMember(Long memberId);

    boolean addMember(Member member);
}
