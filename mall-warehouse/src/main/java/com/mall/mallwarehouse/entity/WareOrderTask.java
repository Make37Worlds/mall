package com.mall.mallwarehouse.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * ï¿½ï¿½æ¹¤ï¿½ï¿½ï¿½ï¿½
 * </p>
 *
 * @author Jiayu
 * @since 2023-10-25
 */
@TableName("wms_ware_order_task")
@ApiModel(value = "WareOrderTask对象", description = "ï¿½ï¿½æ¹¤ï¿½ï¿½ï¿½ï¿½")
public class WareOrderTask implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("order_id")
    private Long orderId;

    @ApiModelProperty("order_sn")
    private String orderSn;

    @ApiModelProperty("ï¿½Õ»ï¿½ï¿½ï¿½")
    private String consignee;

    @ApiModelProperty("ï¿½Õ»ï¿½ï¿½Ëµç»°")
    private String consigneeTel;

    @ApiModelProperty("ï¿½ï¿½ï¿½Íµï¿½Ö·")
    private String deliveryAddress;

    @ApiModelProperty("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½×¢")
    private String orderComment;

    @ApiModelProperty("ï¿½ï¿½ï¿½î·½Ê½ï¿½ï¿½ 1:ï¿½ï¿½ï¿½ß¸ï¿½ï¿½ï¿½ 2:ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½î¡¿")
    private Boolean paymentWay;

    @ApiModelProperty("ï¿½ï¿½ï¿½ï¿½×´Ì¬")
    private Byte taskStatus;

    @ApiModelProperty("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½")
    private String orderBody;

    @ApiModelProperty("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½")
    private String trackingNo;

    @ApiModelProperty("create_time")
    private LocalDateTime createTime;

    @ApiModelProperty("ï¿½Ö¿ï¿½id")
    private Long wareId;

    @ApiModelProperty("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½×¢")
    private String taskComment;

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

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public String getConsigneeTel() {
        return consigneeTel;
    }

    public void setConsigneeTel(String consigneeTel) {
        this.consigneeTel = consigneeTel;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getOrderComment() {
        return orderComment;
    }

    public void setOrderComment(String orderComment) {
        this.orderComment = orderComment;
    }

    public Boolean getPaymentWay() {
        return paymentWay;
    }

    public void setPaymentWay(Boolean paymentWay) {
        this.paymentWay = paymentWay;
    }

    public Byte getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(Byte taskStatus) {
        this.taskStatus = taskStatus;
    }

    public String getOrderBody() {
        return orderBody;
    }

    public void setOrderBody(String orderBody) {
        this.orderBody = orderBody;
    }

    public String getTrackingNo() {
        return trackingNo;
    }

    public void setTrackingNo(String trackingNo) {
        this.trackingNo = trackingNo;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public Long getWareId() {
        return wareId;
    }

    public void setWareId(Long wareId) {
        this.wareId = wareId;
    }

    public String getTaskComment() {
        return taskComment;
    }

    public void setTaskComment(String taskComment) {
        this.taskComment = taskComment;
    }

    @Override
    public String toString() {
        return "WareOrderTask{" +
            "id = " + id +
            ", orderId = " + orderId +
            ", orderSn = " + orderSn +
            ", consignee = " + consignee +
            ", consigneeTel = " + consigneeTel +
            ", deliveryAddress = " + deliveryAddress +
            ", orderComment = " + orderComment +
            ", paymentWay = " + paymentWay +
            ", taskStatus = " + taskStatus +
            ", orderBody = " + orderBody +
            ", trackingNo = " + trackingNo +
            ", createTime = " + createTime +
            ", wareId = " + wareId +
            ", taskComment = " + taskComment +
        "}";
    }
}
