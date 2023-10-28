package com.mall.mallorder.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Refund Information Entity
 */
@TableName("oms_refund_info")
public class RefundInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Long orderReturnId;

    private BigDecimal refund;

    private String refundSn;

    private Boolean refundStatus;

    private Byte refundChannel;

    private String refundContent;

    // Getter and Setter methods for all fields

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderReturnId() {
        return orderReturnId;
    }

    public void setOrderReturnId(Long orderReturnId) {
        this.orderReturnId = orderReturnId;
    }

    public BigDecimal getRefund() {
        return refund;
    }

    public void setRefund(BigDecimal refund) {
        this.refund = refund;
    }

    public String getRefundSn() {
        return refundSn;
    }

    public void setRefundSn(String refundSn) {
        this.refundSn = refundSn;
    }

    public Boolean getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(Boolean refundStatus) {
        this.refundStatus = refundStatus;
    }

    public Byte getRefundChannel() {
        return refundChannel;
    }

    public void setRefundChannel(Byte refundChannel) {
        this.refundChannel = refundChannel;
    }

    public String getRefundContent() {
        return refundContent;
    }

    public void setRefundContent(String refundContent) {
        this.refundContent = refundContent;
    }

    @Override
    public String toString() {
        return "RefundInfo{" +
                "id=" + id +
                ", orderReturnId=" + orderReturnId +
                ", refund=" + refund +
                ", refundSn='" + refundSn + '\'' +
                ", refundStatus=" + refundStatus +
                ", refundChannel=" + refundChannel +
                ", refundContent='" + refundContent + '\'' +
                '}';
    }
}
