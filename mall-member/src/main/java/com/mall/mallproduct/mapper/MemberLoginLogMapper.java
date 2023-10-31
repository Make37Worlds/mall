package com.mall.mallproduct.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mall.mallproduct.entity.MemberLoginLog;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MemberLoginLogMapper extends BaseMapper<MemberLoginLog> {

    // Basic CRUD methods are inherited from BaseMapper

    @Select("SELECT * FROM ums_member_login_log WHERE member_id = #{memberId} ORDER BY create_time DESC")
    List<MemberLoginLog> findByMemberIdOrderByCreateTimeDesc(@Param("memberId") Long memberId);

    @Select("SELECT COUNT(*) FROM ums_member_login_log WHERE member_id = #{memberId}")
    Integer countByMemberId(@Param("memberId") Long memberId);

    @Select("SELECT * FROM ums_member_login_log WHERE ip = #{ip} ORDER BY create_time DESC")
    List<MemberLoginLog> findByIpOrderByCreateTimeDesc(@Param("ip") String ip);

    @Select("SELECT * FROM ums_member_login_log WHERE city = #{city} ORDER BY create_time DESC")
    List<MemberLoginLog> findByCityOrderByCreateTimeDesc(@Param("city") String city);

    // ... you can add other specific query methods based on your application needs

}
