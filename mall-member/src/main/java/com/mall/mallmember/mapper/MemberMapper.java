package com.mall.mallmember.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mall.mallmember.entity.Member;
import com.mall.mallmember.entity.MemberLoginLog;
import com.mall.mallmember.entity.MemberReceiveAddress;
import com.mall.mallmember.entity.MemberStatisticsInfo;
import com.mall.mallmember.entity.vo.MemberVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.time.LocalDate;
import java.util.List;

@Mapper
public interface MemberMapper extends BaseMapper<Member> {

    @Select("SELECT * FROM ums_member WHERE username = #{username}")
    Member findByUsername(@Param("username") String username);

    @Select("SELECT * FROM ums_member WHERE username = #{username}")
    MemberVo findVoByUsername(@Param("username") String username);

    @Select("SELECT * FROM ums_member WHERE mobile = #{mobile}")
    Member findByMobile(@Param("mobile") String mobile);

    @Select("SELECT * FROM ums_member WHERE email = #{email}")
    Member findByEmail(@Param("email") String email);

    @Select("SELECT * FROM ums_member WHERE city = #{city}")
    List<Member> findMembersByCity(@Param("city") String city);

    @Select("SELECT * FROM ums_member WHERE gender = #{gender}")
    List<Member> findMembersByGender(@Param("gender") Byte gender);

    @Select("SELECT * FROM ums_member WHERE birth = #{birth}")
    List<Member> findMembersByBirth(@Param("birth") LocalDate birth);

    @Select("SELECT * FROM ums_member WHERE status = #{status}")
    List<Member> findMembersByStatus(@Param("status") Byte status);

    @Select("SELECT * FROM ums_member WHERE create_time >= #{fromDate} AND create_time <= #{toDate}")
    List<Member> findMembersByRegistrationDateRange(@Param("fromDate") LocalDate fromDate, @Param("toDate") LocalDate toDate);

    List<MemberLoginLog> getLoginLogsForMember(Long memberId);

    List<MemberReceiveAddress> getAddressesForMember(Long memberId);

    MemberStatisticsInfo getStatisticsForMember(Long memberId);


}
