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
 * ï¿½ï¿½ï¿½ï¿½
 * </p>
 *
 * @author Jiayu
 * @since 2023-10-25
 */
@TableName("oms_order")
@ApiModel(value = "Order对象", description = "ï¿½ï¿½ï¿½ï¿½")
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("member_id")
    private Long memberId;

    @ApiModelProperty("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½")
    private String orderSn;

    @ApiModelProperty("create_time")
    private LocalDateTime createTime;

    @ApiModelProperty("ï¿½Ã»ï¿½ï¿½ï¿½")
    private String memberUsername;

    @ApiModelProperty("ï¿½ï¿½ï¿½ï¿½ï¿½Ü¶ï¿½")
    private BigDecimal totalAmount;

    @ApiModelProperty("Ó¦ï¿½ï¿½ï¿½Ü¶ï¿½")
    private BigDecimal payAmount;

    @ApiModelProperty("ï¿½Ë·Ñ½ï¿½ï¿½")
    private BigDecimal freightAmount;

    @ApiModelProperty("Ö§ï¿½ï¿½ï¿½ï¿½Ê½ï¿½ï¿½1->Ö§ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½2->Î¢ï¿½Å£ï¿½3->ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ 4->ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½î£»ï¿½ï¿½")
    private Byte payType;

    @ApiModelProperty("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½Ô´[0->PCï¿½ï¿½ï¿½ï¿½ï¿½ï¿½1->appï¿½ï¿½ï¿½ï¿½]")
    private Byte sourceType;

    @ApiModelProperty("ï¿½ï¿½ï¿½ï¿½×´Ì¬ï¿½ï¿½0->ï¿½ï¿½ï¿½ï¿½ï¿½î£»1->ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½2->ï¿½Ñ·ï¿½ï¿½ï¿½ï¿½ï¿½3->ï¿½ï¿½ï¿½ï¿½É£ï¿½4->ï¿½Ñ¹Ø±Õ£ï¿½5->ï¿½ï¿½Ð§ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½")
    private Byte status;

    @ApiModelProperty("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½Ë¾(ï¿½ï¿½ï¿½Í·ï¿½Ê½)")
    private String deliveryCompany;

    @ApiModelProperty("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½")
    private String deliverySn;

    @ApiModelProperty("ï¿½ï¿½ï¿½Ô»ï¿½ÃµÄ³É³ï¿½Öµ")
    private Integer growth;

    @ApiModelProperty("ï¿½Õ»ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½")
    private String receiverName;

    @ApiModelProperty("ï¿½Õ»ï¿½ï¿½Ëµç»°")
    private String receiverPhone;

    @ApiModelProperty("ï¿½Õ»ï¿½ï¿½ï¿½ï¿½Ê±ï¿½")
    private String receiverPostCode;

    @ApiModelProperty("Ê¡ï¿½ï¿½/Ö±Ï½ï¿½ï¿½")
    private String receiverProvince;

    @ApiModelProperty("ï¿½ï¿½ï¿½ï¿½")
    private String receiverCity;

    @ApiModelProperty("ï¿½ï¿½")
    private String receiverRegion;

    @ApiModelProperty("ï¿½ï¿½Ï¸ï¿½ï¿½Ö·")
    private String receiverDetailAddress;

    @ApiModelProperty("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½×¢")
    private String note;

    @ApiModelProperty("È·ï¿½ï¿½ï¿½Õ»ï¿½×´Ì¬[0->Î´È·ï¿½Ï£ï¿½1->ï¿½ï¿½È·ï¿½ï¿½]")
    private Byte confirmStatus;

    @ApiModelProperty("É¾ï¿½ï¿½×´Ì¬ï¿½ï¿½0->Î´É¾ï¿½ï¿½ï¿½ï¿½1->ï¿½ï¿½É¾ï¿½ï¿½ï¿½ï¿½")
    private Byte deleteStatus;

    @ApiModelProperty("Ö§ï¿½ï¿½Ê±ï¿½ï¿½")
    private LocalDateTime paymentTime;

    @ApiModelProperty("ï¿½ï¿½ï¿½ï¿½Ê±ï¿½ï¿½")
    private LocalDateTime deliveryTime;

    @ApiModelProperty("È·ï¿½ï¿½ï¿½Õ»ï¿½Ê±ï¿½ï¿½")
    private LocalDateTime receiveTime;

    @ApiModelProperty("ï¿½ï¿½ï¿½ï¿½Ê±ï¿½ï¿½")
    private LocalDateTime commentTime;

    @ApiModelProperty("ï¿½Þ¸ï¿½Ê±ï¿½ï¿½")
    private LocalDateTime modifyTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getMemberUsername() {
        return memberUsername;
    }

    public void setMemberUsername(String memberUsername) {
        this.memberUsername = memberUsername;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public BigDecimal getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    public BigDecimal getFreightAmount() {
        return freightAmount;
    }

    public void setFreightAmount(BigDecimal freightAmount) {
        this.freightAmount = freightAmount;
    }

    public Byte getPayType() {
        return payType;
    }

    public void setPayType(Byte payType) {
        this.payType = payType;
    }

    public Byte getSourceType() {
        return sourceType;
    }

    public void setSourceType(Byte sourceType) {
        this.sourceType = sourceType;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getDeliveryCompany() {
        return deliveryCompany;
    }

    public void setDeliveryCompany(String deliveryCompany) {
        this.deliveryCompany = deliveryCompany;
    }

    public String getDeliverySn() {
        return deliverySn;
    }

    public void setDeliverySn(String deliverySn) {
        this.deliverySn = deliverySn;
    }

    public Integer getGrowth() {
        return growth;
    }

    public void setGrowth(Integer growth) {
        this.growth = growth;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverPhone() {
        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    public String getReceiverPostCode() {
        return receiverPostCode;
    }

    public void setReceiverPostCode(String receiverPostCode) {
        this.receiverPostCode = receiverPostCode;
    }

    public String getReceiverProvince() {
        return receiverProvince;
    }

    public void setReceiverProvince(String receiverProvince) {
        this.receiverProvince = receiverProvince;
    }

    public String getReceiverCity() {
        return receiverCity;
    }

    public void setReceiverCity(String receiverCity) {
        this.receiverCity = receiverCity;
    }

    public String getReceiverRegion() {
        return receiverRegion;
    }

    public void setReceiverRegion(String receiverRegion) {
        this.receiverRegion = receiverRegion;
    }

    public String getReceiverDetailAddress() {
        return receiverDetailAddress;
    }

    public void setReceiverDetailAddress(String receiverDetailAddress) {
        this.receiverDetailAddress = receiverDetailAddress;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Byte getConfirmStatus() {
        return confirmStatus;
    }

    public void setConfirmStatus(Byte confirmStatus) {
        this.confirmStatus = confirmStatus;
    }

    public Byte getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(Byte deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    public LocalDateTime getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(LocalDateTime paymentTime) {
        this.paymentTime = paymentTime;
    }

    public LocalDateTime getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(LocalDateTime deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public LocalDateTime getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(LocalDateTime receiveTime) {
        this.receiveTime = receiveTime;
    }

    public LocalDateTime getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(LocalDateTime commentTime) {
        this.commentTime = commentTime;
    }

    public LocalDateTime getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    public String toString() {
        return "Order{" +
            "id = " + id +
            ", memberId = " + memberId +
            ", orderSn = " + orderSn +
            ", createTime = " + createTime +
            ", memberUsername = " + memberUsername +
            ", totalAmount = " + totalAmount +
            ", payAmount = " + payAmount +
            ", freightAmount = " + freightAmount +
            ", payType = " + payType +
            ", sourceType = " + sourceType +
            ", status = " + status +
            ", deliveryCompany = " + deliveryCompany +
            ", deliverySn = " + deliverySn +
            ", growth = " + growth +
            ", receiverName = " + receiverName +
            ", receiverPhone = " + receiverPhone +
            ", receiverPostCode = " + receiverPostCode +
            ", receiverProvince = " + receiverProvince +
            ", receiverCity = " + receiverCity +
            ", receiverRegion = " + receiverRegion +
            ", receiverDetailAddress = " + receiverDetailAddress +
            ", note = " + note +
            ", confirmStatus = " + confirmStatus +
            ", deleteStatus = " + deleteStatus +
            ", paymentTime = " + paymentTime +
            ", deliveryTime = " + deliveryTime +
            ", receiveTime = " + receiveTime +
            ", commentTime = " + commentTime +
            ", modifyTime = " + modifyTime +
        "}";
    }
}
