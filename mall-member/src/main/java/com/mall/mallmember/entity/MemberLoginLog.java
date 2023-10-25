package com.mall.mallmember.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * ï¿½ï¿½Ô±ï¿½ï¿½Â¼ï¿½ï¿½Â¼
 * </p>
 *
 * @author Jiayu
 * @since 2023-10-25
 */
@TableName("ums_member_login_log")
@ApiModel(value = "MemberLoginLog对象", description = "ï¿½ï¿½Ô±ï¿½ï¿½Â¼ï¿½ï¿½Â¼")
public class MemberLoginLog implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("member_id")
    private Long memberId;

    @ApiModelProperty("ï¿½ï¿½ï¿½ï¿½Ê±ï¿½ï¿½")
    private LocalDateTime createTime;

    @ApiModelProperty("ip")
    private String ip;

    @ApiModelProperty("city")
    private String city;

    @ApiModelProperty("ï¿½ï¿½Â¼ï¿½ï¿½ï¿½ï¿½[1-webï¿½ï¿½2-app]")
    private Boolean loginType;

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

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Boolean getLoginType() {
        return loginType;
    }

    public void setLoginType(Boolean loginType) {
        this.loginType = loginType;
    }

    @Override
    public String toString() {
        return "MemberLoginLog{" +
            "id = " + id +
            ", memberId = " + memberId +
            ", createTime = " + createTime +
            ", ip = " + ip +
            ", city = " + city +
            ", loginType = " + loginType +
        "}";
    }
}
