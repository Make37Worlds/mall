package com.mall.mallorder.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;


/**
 * <p>
 * ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½Ï¢
 * </p>
 *
 * @author Jiayu
 * @since 2023-10-25
 */
@TableName("oms_order_item")
public class OrderItem implements Serializable {

    private static final long serialVersionUID = 1L;


    @TableId(value = "id", type = IdType.AUTO)
    private Long id;


    private Long orderId;


    private String orderSn;


    private Long spuId;


    private String spuName;


    private String spuPic;


    private String spuBrand;


    private Long categoryId;


    private Long skuId;


    private String skuName;


    private String skuPic;


    private BigDecimal skuPrice;


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
