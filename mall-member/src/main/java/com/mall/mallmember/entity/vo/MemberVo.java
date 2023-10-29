package com.mall.mallmember.entity.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.mall.mallmember.entity.Member;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


@Data
@TableName("ums_member")
public class MemberVo extends Member{

    @ApiModelProperty(value = "token")
    @TableField(exist = false)
    private String token;

    @ApiModelProperty(value = "过期时间")
    @TableField(exist = false)
    private String expiration;

    @ApiModelProperty(value = "1-；0-")
    @TableField(exist = false)
    private Integer role;

}
