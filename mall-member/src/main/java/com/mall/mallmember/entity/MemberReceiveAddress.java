package com.mall.mallmember.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * ï¿½ï¿½Ô±ï¿½Õ»ï¿½ï¿½ï¿½Ö·
 * </p>
 *
 * @author Jiayu
 * @since 2023-10-25
 */
@TableName("ums_member_receive_address")
@ApiModel(value = "MemberReceiveAddress对象", description = "ï¿½ï¿½Ô±ï¿½Õ»ï¿½ï¿½ï¿½Ö·")
public class MemberReceiveAddress implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("member_id")
    private Long memberId;

    @ApiModelProperty("ï¿½Õ»ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½")
    private String name;

    @ApiModelProperty("ï¿½ç»°")
    private String phone;

    @ApiModelProperty("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½")
    private String postCode;

    @ApiModelProperty("Ê¡ï¿½ï¿½/Ö±Ï½ï¿½ï¿½")
    private String province;

    @ApiModelProperty("ï¿½ï¿½ï¿½ï¿½")
    private String city;

    @ApiModelProperty("ï¿½ï¿½")
    private String region;

    @ApiModelProperty("ï¿½ï¿½Ï¸ï¿½ï¿½Ö·(ï¿½Öµï¿½)")
    private String detailAddress;

    @ApiModelProperty("Ê¡ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½")
    private String areacode;

    @ApiModelProperty("ï¿½Ç·ï¿½Ä¬ï¿½ï¿½")
    private Boolean defaultStatus;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDetailAddress() {
        return detailAddress;
    }

    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress;
    }

    public String getAreacode() {
        return areacode;
    }

    public void setAreacode(String areacode) {
        this.areacode = areacode;
    }

    public Boolean getDefaultStatus() {
        return defaultStatus;
    }

    public void setDefaultStatus(Boolean defaultStatus) {
        this.defaultStatus = defaultStatus;
    }

    @Override
    public String toString() {
        return "MemberReceiveAddress{" +
            "id = " + id +
            ", memberId = " + memberId +
            ", name = " + name +
            ", phone = " + phone +
            ", postCode = " + postCode +
            ", province = " + province +
            ", city = " + city +
            ", region = " + region +
            ", detailAddress = " + detailAddress +
            ", areacode = " + areacode +
            ", defaultStatus = " + defaultStatus +
        "}";
    }
}
