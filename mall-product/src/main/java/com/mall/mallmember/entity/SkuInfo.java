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
 * skuï¿½ï¿½Ï¢
 * </p>
 *
 * @author Jiayu
 * @since 2023-10-25
 */
@TableName("pms_sku_info")
@ApiModel(value = "SkuInfo对象", description = "skuï¿½ï¿½Ï¢")
public class SkuInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("skuId")
    @TableId(value = "sku_id", type = IdType.AUTO)
    private Long skuId;

    @ApiModelProperty("spuId")
    private Long spuId;

    @ApiModelProperty("skuï¿½ï¿½ï¿½ï¿½")
    private String skuName;

    @ApiModelProperty("skuï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½")
    private String skuDesc;

    @ApiModelProperty("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½id")
    private Long catalogId;

    @ApiModelProperty("Æ·ï¿½ï¿½id")
    private Long brandId;

    @ApiModelProperty("Ä¬ï¿½ï¿½Í¼Æ¬")
    private String skuDefaultImg;

    @ApiModelProperty("ï¿½ï¿½ï¿½ï¿½")
    private String skuTitle;

    @ApiModelProperty("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½")
    private String skuSubtitle;

    @ApiModelProperty("ï¿½Û¸ï¿½")
    private BigDecimal price;

    @ApiModelProperty("ï¿½ï¿½ï¿½ï¿½")
    private Long saleCount;

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public Long getSpuId() {
        return spuId;
    }

    public void setSpuId(Long spuId) {
        this.spuId = spuId;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public String getSkuDesc() {
        return skuDesc;
    }

    public void setSkuDesc(String skuDesc) {
        this.skuDesc = skuDesc;
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

    public String getSkuDefaultImg() {
        return skuDefaultImg;
    }

    public void setSkuDefaultImg(String skuDefaultImg) {
        this.skuDefaultImg = skuDefaultImg;
    }

    public String getSkuTitle() {
        return skuTitle;
    }

    public void setSkuTitle(String skuTitle) {
        this.skuTitle = skuTitle;
    }

    public String getSkuSubtitle() {
        return skuSubtitle;
    }

    public void setSkuSubtitle(String skuSubtitle) {
        this.skuSubtitle = skuSubtitle;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Long getSaleCount() {
        return saleCount;
    }

    public void setSaleCount(Long saleCount) {
        this.saleCount = saleCount;
    }

    @Override
    public String toString() {
        return "SkuInfo{" +
            "skuId = " + skuId +
            ", spuId = " + spuId +
            ", skuName = " + skuName +
            ", skuDesc = " + skuDesc +
            ", catalogId = " + catalogId +
            ", brandId = " + brandId +
            ", skuDefaultImg = " + skuDefaultImg +
            ", skuTitle = " + skuTitle +
            ", skuSubtitle = " + skuSubtitle +
            ", price = " + price +
            ", saleCount = " + saleCount +
        "}";
    }
}
