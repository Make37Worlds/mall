package com.mall.mallproduct.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mall.mallproduct.entity.MemberCollectSpu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MemberCollectSpuMapper extends BaseMapper<MemberCollectSpu> {

    @Select("SELECT * FROM ums_member_collect_spu WHERE member_id = #{memberId}")
    List<MemberCollectSpu> findByMemberId(@Param("memberId") Long memberId);

    @Select("SELECT * FROM ums_member_collect_spu WHERE spu_id = #{spuId}")
    List<MemberCollectSpu> findBySpuId(@Param("spuId") Long spuId);

    @Select("SELECT * FROM ums_member_collect_spu WHERE member_id = #{memberId} AND spu_id = #{spuId}")
    MemberCollectSpu findByMemberIdAndSpuId(@Param("memberId") Long memberId, @Param("spuId") Long spuId);

    @Select("SELECT * FROM ums_member_collect_spu WHERE spu_name LIKE CONCAT('%', #{spuName}, '%')")
    List<MemberCollectSpu> findBySpuNameContains(@Param("spuName") String spuName);

}
