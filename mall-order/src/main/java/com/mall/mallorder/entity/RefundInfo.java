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
 * ï¿½Ë¿ï¿½ï¿½ï¿½Ï¢
 * </p>
 *
 * @author Jiayu
 * @since 2023-10-25
 */
@TableName("oms_refund_info")
@ApiModel(value = "RefundInfo对象", description = "ï¿½Ë¿ï¿½ï¿½ï¿½Ï¢")
public class RefundInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("ï¿½Ë¿ï¿½Ä¶ï¿½ï¿½ï¿½")
    private Long orderReturnId;

    @ApiModelProperty("ï¿½Ë¿ï¿½ï¿½ï¿½")
    private BigDecimal refund;

    @ApiModelProperty("ï¿½Ë¿î½»ï¿½ï¿½ï¿½ï¿½Ë®ï¿½ï¿½")
    private String refundSn;

    @ApiModelProperty("ï¿½Ë¿ï¿½×´Ì¬")
    private Boolean refundStatus;

    @ApiModelProperty("ï¿½Ë¿ï¿½ï¿½ï¿½ï¿½ï¿½[1-Ö§ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½2-Î¢ï¿½Å£ï¿½3-ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½4-ï¿½ï¿½ï¿½]")
    private Byte refundChannel;

    private String refundContent;

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
            "id = " + id +
            ", orderReturnId = " + orderReturnId +
            ", refund = " + refund +
            ", refundSn = " + refundSn +
            ", refundStatus = " + refundStatus +
            ", refundChannel = " + refundChannel +
            ", refundContent = " + refundContent +
        "}";
    }
}
