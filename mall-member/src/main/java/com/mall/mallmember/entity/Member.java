package com.mall.mallmember.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * »áÔ±
 * </p>
 *
 * @author Jiayu
 * @since 2023-10-25
 */
@TableName("ums_member")
@ApiModel(value = "Member对象", description = "»áÔ±")
public class Member implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("»áÔ±µÈ¼¶id")
    private Long levelId;

    @ApiModelProperty("ÓÃ»§Ãû")
    private String username;

    @ApiModelProperty("ÃÜÂë")
    private String password;

    @ApiModelProperty("êÇ³Æ")
    private String nickname;

    @ApiModelProperty("ÊÖ»úºÅÂë")
    private String mobile;

    @ApiModelProperty("ÓÊÏä")
    private String email;

    @ApiModelProperty("Í·Ïñ")
    private String header;

    @ApiModelProperty("ÐÔ±ð")
    private Byte gender;

    @ApiModelProperty("ÉúÈÕ")
    private LocalDate birth;

    @ApiModelProperty("ËùÔÚ³ÇÊÐ")
    private String city;

    @ApiModelProperty("Ö°Òµ")
    private String job;

    @ApiModelProperty("¸öÐÔÇ©Ãû")
    private String sign;

    @ApiModelProperty("ÆôÓÃ×´Ì¬")
    private Byte status;

    @ApiModelProperty("×¢²áÊ±¼ä")
    private LocalDateTime createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getLevelId() {
        return levelId;
    }

    public void setLevelId(Long levelId) {
        this.levelId = levelId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public Byte getGender() {
        return gender;
    }

    public void setGender(Byte gender) {
        this.gender = gender;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Member{" +
            "id = " + id +
            ", levelId = " + levelId +
            ", username = " + username +
            ", password = " + password +
            ", nickname = " + nickname +
            ", mobile = " + mobile +
            ", email = " + email +
            ", header = " + header +
            ", gender = " + gender +
            ", birth = " + birth +
            ", city = " + city +
            ", job = " + job +
            ", sign = " + sign +
            ", status = " + status +
            ", createTime = " + createTime +
        "}";
    }
}
