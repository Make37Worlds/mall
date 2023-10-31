package com.mall.mallproduct.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mall.mallproduct.entity.MemberStatisticsInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.math.BigDecimal;

@Mapper
public interface MemberStatisticsInfoMapper extends BaseMapper<MemberStatisticsInfo> {


    @Select("SELECT * FROM ums_member_statistics_info WHERE member_id = #{memberId}")
    MemberStatisticsInfo findByMemberId(@Param("memberId") Long memberId);

    @Select("SELECT SUM(consume_amount) FROM ums_member_statistics_info WHERE member_id = #{memberId}")
    BigDecimal totalConsumeAmountByMemberId(@Param("memberId") Long memberId);

    @Select("SELECT SUM(coupon_amount) FROM ums_member_statistics_info WHERE member_id = #{memberId}")
    BigDecimal totalCouponAmountByMemberId(@Param("memberId") Long memberId);

    @Select("SELECT AVG(order_count) FROM ums_member_statistics_info")
    Double averageOrderCount();

}
