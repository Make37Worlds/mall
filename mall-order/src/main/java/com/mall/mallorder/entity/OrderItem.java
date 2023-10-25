package com.mall.mallorder.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½Ï¢
 * </p>
 *
 * @author Jiayu
 * @since 2023-10-25
 */
@TableName("oms_order_item")
@ApiModel(value = "OrderItem对象", description = "ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½Ï¢")
public class OrderItem implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("order_id")
    private Long orderId;

    @ApiModelProperty("order_sn")
    private String orderSn;

    @ApiModelProperty("spu_id")
    private Long spuId;

    @ApiModelProperty("spu_name")
    private String spuName;

    @ApiModelProperty("spu_pic")
    private String spuPic;

    @ApiModelProperty("Æ·ï¿½ï¿½")
    private String spuBrand;

    @ApiModelProperty("ï¿½ï¿½Æ·ï¿½ï¿½ï¿½ï¿½id")
    private Long categoryId;

    @ApiModelProperty("ï¿½ï¿½Æ·skuï¿½ï¿½ï¿½")
    private Long skuId;

    @ApiModelProperty("ï¿½ï¿½Æ·skuï¿½ï¿½ï¿½ï¿½")
    private String skuName;

    @ApiModelProperty("ï¿½ï¿½Æ·skuÍ¼Æ¬")
    private String skuPic;

    @ApiModelProperty("ï¿½ï¿½Æ·skuï¿½Û¸ï¿½")
    private BigDecimal skuPrice;

    @ApiModelProperty("ï¿½ï¿½Æ·ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½")
    private Integer skuQuantity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public Long getSpuId() {
        return spuId;
    }

    public void setSpuId(Long spuId) {
        this.spuId = spuId;
    }

    public String getSpuName() {
        return spuName;
    }

    public void setSpuName(String spuName) {
        this.spuName = spuName;
    }

    public String getSpuPic() {
        return spuPic;
    }

    public void setSpuPic(String spuPic) {
        this.spuPic = spuPic;
    }

    public String getSpuBrand() {
        return spuBrand;
    }

    public void setSpuBrand(String spuBrand) {
        this.spuBrand = spuBrand;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public String getSkuPic() {
        return skuPic;
    }

    public void setSkuPic(String skuPic) {
        this.skuPic = skuPic;
    }

    public BigDecimal getSkuPrice() {
        return skuPrice;
    }

    public void setSkuPrice(BigDecimal skuPrice) {
        this.skuPrice = skuPrice;
    }

    public Integer getSkuQuantity() {
        return skuQuantity;
    }

    public void setSkuQuantity(Integer skuQuantity) {
        this.skuQuantity = skuQuantity;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
            "id = " + id +
            ", orderId = " + orderId +
            ", orderSn = " + orderSn +
            ", spuId = " + spuId +
            ", spuName = " + spuName +
            ", spuPic = " + spuPic +
            ", spuBrand = " + spuBrand +
            ", categoryId = " + categoryId +
            ", skuId = " + skuId +
            ", skuName = " + skuName +
            ", skuPic = " + skuPic +
            ", skuPrice = " + skuPrice +
            ", skuQuantity = " + skuQuantity +
        "}";
    }
}
