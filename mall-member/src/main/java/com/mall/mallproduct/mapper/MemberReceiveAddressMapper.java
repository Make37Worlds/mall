package com.mall.mallproduct.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mall.mallproduct.entity.MemberReceiveAddress;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MemberReceiveAddressMapper extends BaseMapper<MemberReceiveAddress> {

    @Select("SELECT * FROM ums_member_receive_address WHERE member_id = #{memberId} ORDER BY default_status DESC, id ASC")
    List<MemberReceiveAddress> findByMemberIdOrderByDefaultStatus(@Param("memberId") Long memberId);

    @Select("SELECT * FROM ums_member_receive_address WHERE member_id = #{memberId} AND default_status = 1 LIMIT 1")
    MemberReceiveAddress findDefaultByMemberId(@Param("memberId") Long memberId);

    @Select("SELECT COUNT(*) FROM ums_member_receive_address WHERE member_id = #{memberId}")
    Integer countByMemberId(@Param("memberId") Long memberId);

}
