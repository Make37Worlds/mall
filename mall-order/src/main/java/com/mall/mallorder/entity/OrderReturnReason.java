package com.mall.mallorder.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * ï¿½Ë»ï¿½Ô­ï¿½ï¿½
 * </p>
 *
 * @author Jiayu
 * @since 2023-10-25
 */
@TableName("oms_order_return_reason")
@ApiModel(value = "OrderReturnReason对象", description = "ï¿½Ë»ï¿½Ô­ï¿½ï¿½")
public class OrderReturnReason implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("ï¿½Ë»ï¿½Ô­ï¿½ï¿½ï¿½ï¿½")
    private String name;

    @ApiModelProperty("ï¿½ï¿½ï¿½ï¿½")
    private Integer sort;

    @ApiModelProperty("ï¿½ï¿½ï¿½ï¿½×´Ì¬")
    private Boolean status;

    @ApiModelProperty("create_time")
    private LocalDateTime createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
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
        return "OrderReturnReason{" +
            "id = " + id +
            ", name = " + name +
            ", sort = " + sort +
            ", status = " + status +
            ", createTime = " + createTime +
        "}";
    }
}
