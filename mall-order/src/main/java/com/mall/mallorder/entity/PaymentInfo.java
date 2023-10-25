package com.mall.mallorder.entity;

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
 * Ö§ï¿½ï¿½ï¿½ï¿½Ï¢ï¿½ï¿½
 * </p>
 *
 * @author Jiayu
 * @since 2023-10-25
 */
@TableName("oms_payment_info")
@ApiModel(value = "PaymentInfo对象", description = "Ö§ï¿½ï¿½ï¿½ï¿½Ï¢ï¿½ï¿½")
public class PaymentInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("ï¿½ï¿½ï¿½ï¿½ï¿½Å£ï¿½ï¿½ï¿½ï¿½ï¿½Òµï¿½ï¿½Å£ï¿½")
    private String orderSn;

    @ApiModelProperty("ï¿½ï¿½ï¿½ï¿½id")
    private Long orderId;

    @ApiModelProperty("Ö§ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½Ë®ï¿½ï¿½")
    private String alipayTradeNo;

    @ApiModelProperty("Ö§ï¿½ï¿½ï¿½Ü½ï¿½ï¿½")
    private BigDecimal totalAmount;

    @ApiModelProperty("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½")
    private String subject;

    @ApiModelProperty("Ö§ï¿½ï¿½×´Ì¬")
    private String paymentStatus;

    @ApiModelProperty("ï¿½ï¿½ï¿½ï¿½Ê±ï¿½ï¿½")
    private LocalDateTime createTime;

    @ApiModelProperty("È·ï¿½ï¿½Ê±ï¿½ï¿½")
    private LocalDateTime confirmTime;

    @ApiModelProperty("ï¿½Øµï¿½ï¿½ï¿½ï¿½ï¿½")
    private String callbackContent;

    @ApiModelProperty("ï¿½Øµï¿½Ê±ï¿½ï¿½")
    private LocalDateTime callbackTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getAlipayTradeNo() {
        return alipayTradeNo;
    }

    public void setAlipayTradeNo(String alipayTradeNo) {
        this.alipayTradeNo = alipayTradeNo;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getConfirmTime() {
        return confirmTime;
    }

    public void setConfirmTime(LocalDateTime confirmTime) {
        this.confirmTime = confirmTime;
    }

    public String getCallbackContent() {
        return callbackContent;
    }

    public void setCallbackContent(String callbackContent) {
        this.callbackContent = callbackContent;
    }

    public LocalDateTime getCallbackTime() {
        return callbackTime;
    }

    public void setCallbackTime(LocalDateTime callbackTime) {
        this.callbackTime = callbackTime;
    }

    @Override
    public String toString() {
        return "PaymentInfo{" +
            "id = " + id +
            ", orderSn = " + orderSn +
            ", orderId = " + orderId +
            ", alipayTradeNo = " + alipayTradeNo +
            ", totalAmount = " + totalAmount +
            ", subject = " + subject +
            ", paymentStatus = " + paymentStatus +
            ", createTime = " + createTime +
            ", confirmTime = " + confirmTime +
            ", callbackContent = " + callbackContent +
            ", callbackTime = " + callbackTime +
        "}";
    }
}
