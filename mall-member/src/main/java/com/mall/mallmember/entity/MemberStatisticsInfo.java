package com.mall.mallmember.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * ï¿½ï¿½Ô±Í³ï¿½ï¿½ï¿½ï¿½Ï¢
 * </p>
 *
 * @author Jiayu
 * @since 2023-10-25
 */
@TableName("ums_member_statistics_info")
@ApiModel(value = "MemberStatisticsInfo对象", description = "ï¿½ï¿½Ô±Í³ï¿½ï¿½ï¿½ï¿½Ï¢")
public class MemberStatisticsInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("ï¿½ï¿½Ô±id")
    private Long memberId;

    @ApiModelProperty("ï¿½Û¼ï¿½ï¿½ï¿½ï¿½Ñ½ï¿½ï¿½")
    private BigDecimal consumeAmount;

    @ApiModelProperty("ï¿½Û¼ï¿½ï¿½Å»Ý½ï¿½ï¿½")
    private BigDecimal couponAmount;

    @ApiModelProperty("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½")
    private Integer orderCount;

    @ApiModelProperty("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½")
    private Integer commentCount;

    @ApiModelProperty("ï¿½Ë»ï¿½ï¿½ï¿½ï¿½ï¿½")
    private Integer returnOrderCount;

    @ApiModelProperty("ï¿½ï¿½Â¼ï¿½ï¿½ï¿½ï¿½")
    private Integer loginCount;

    @ApiModelProperty("ï¿½ï¿½×¢ï¿½ï¿½ï¿½ï¿½")
    private Integer attendCount;

    @ApiModelProperty("ï¿½ï¿½Ë¿ï¿½ï¿½ï¿½ï¿½")
    private Integer fansCount;

    @ApiModelProperty("ï¿½Õ²Øµï¿½ï¿½ï¿½Æ·ï¿½ï¿½ï¿½ï¿½")
    private Integer collectProductCount;

    @ApiModelProperty("ï¿½Õ²Øµï¿½×¨ï¿½ï¿½î¶¯ï¿½ï¿½ï¿½ï¿½")
    private Integer collectSubjectCount;

    @ApiModelProperty("ï¿½Õ²Øµï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½")
    private Integer collectCommentCount;

    @ApiModelProperty("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½")
    private Integer inviteFriendCount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public BigDecimal getConsumeAmount() {
        return consumeAmount;
    }

    public void setConsumeAmount(BigDecimal consumeAmount) {
        this.consumeAmount = consumeAmount;
    }

    public BigDecimal getCouponAmount() {
        return couponAmount;
    }

    public void setCouponAmount(BigDecimal couponAmount) {
        this.couponAmount = couponAmount;
    }

    public Integer getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public Integer getReturnOrderCount() {
        return returnOrderCount;
    }

    public void setReturnOrderCount(Integer returnOrderCount) {
        this.returnOrderCount = returnOrderCount;
    }

    public Integer getLoginCount() {
        return loginCount;
    }

    public void setLoginCount(Integer loginCount) {
        this.loginCount = loginCount;
    }

    public Integer getAttendCount() {
        return attendCount;
    }

    public void setAttendCount(Integer attendCount) {
        this.attendCount = attendCount;
    }

    public Integer getFansCount() {
        return fansCount;
    }

    public void setFansCount(Integer fansCount) {
        this.fansCount = fansCount;
    }

    public Integer getCollectProductCount() {
        return collectProductCount;
    }

    public void setCollectProductCount(Integer collectProductCount) {
        this.collectProductCount = collectProductCount;
    }

    public Integer getCollectSubjectCount() {
        return collectSubjectCount;
    }

    public void setCollectSubjectCount(Integer collectSubjectCount) {
        this.collectSubjectCount = collectSubjectCount;
    }

    public Integer getCollectCommentCount() {
        return collectCommentCount;
    }

    public void setCollectCommentCount(Integer collectCommentCount) {
        this.collectCommentCount = collectCommentCount;
    }

    public Integer getInviteFriendCount() {
        return inviteFriendCount;
    }

    public void setInviteFriendCount(Integer inviteFriendCount) {
        this.inviteFriendCount = inviteFriendCount;
    }

    @Override
    public String toString() {
        return "MemberStatisticsInfo{" +
            "id = " + id +
            ", memberId = " + memberId +
            ", consumeAmount = " + consumeAmount +
            ", couponAmount = " + couponAmount +
            ", orderCount = " + orderCount +
            ", commentCount = " + commentCount +
            ", returnOrderCount = " + returnOrderCount +
            ", loginCount = " + loginCount +
            ", attendCount = " + attendCount +
            ", fansCount = " + fansCount +
            ", collectProductCount = " + collectProductCount +
            ", collectSubjectCount = " + collectSubjectCount +
            ", collectCommentCount = " + collectCommentCount +
            ", inviteFriendCount = " + inviteFriendCount +
        "}";
    }
}
