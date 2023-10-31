package com.mall.mallmember.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * spuï¿½ï¿½Ï¢
 * </p>
 *
 * @author Jiayu
 * @since 2023-10-25
 */
@TableName("pms_spu_info")
@ApiModel(value = "SpuInfo对象", description = "spuï¿½ï¿½Ï¢")
public class SpuInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("ï¿½ï¿½Æ·id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("ï¿½ï¿½Æ·ï¿½ï¿½ï¿½ï¿½")
    private String spuName;

    @ApiModelProperty("ï¿½ï¿½Æ·ï¿½ï¿½ï¿½ï¿½")
    private String spuDescription;

    @ApiModelProperty("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½id")
    private Long catalogId;

    @ApiModelProperty("Æ·ï¿½ï¿½id")
    private Long brandId;

    private BigDecimal weight;

    @ApiModelProperty("ï¿½Ï¼ï¿½×´Ì¬[0 - ï¿½Â¼Ü£ï¿½1 - ï¿½Ï¼ï¿½]")
    private Byte publishStatus;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSpuName() {
        return spuName;
    }

    public void setSpuName(String spuName) {
        this.spuName = spuName;
    }

    public String getSpuDescription() {
        return spuDescription;
    }

    public void setSpuDescription(String spuDescription) {
        this.spuDescription = spuDescription;
    }

    public Long getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(Long catalogId) {
        this.catalogId = catalogId;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public Byte getPublishStatus() {
        return publishStatus;
    }

    public void setPublishStatus(Byte publishStatus) {
        this.publishStatus = publishStatus;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "SpuInfo{" +
            "id = " + id +
            ", spuName = " + spuName +
            ", spuDescription = " + spuDescription +
            ", catalogId = " + catalogId +
            ", brandId = " + brandId +
            ", weight = " + weight +
            ", publishStatus = " + publishStatus +
            ", createTime = " + createTime +
            ", updateTime = " + updateTime +
        "}";
    }

}
