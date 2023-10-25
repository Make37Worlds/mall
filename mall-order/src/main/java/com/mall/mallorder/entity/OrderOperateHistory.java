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
 * ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½Ê·ï¿½ï¿½Â¼
 * </p>
 *
 * @author Jiayu
 * @since 2023-10-25
 */
@TableName("oms_order_operate_history")
@ApiModel(value = "OrderOperateHistory对象", description = "ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½Ê·ï¿½ï¿½Â¼")
public class OrderOperateHistory implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("ï¿½ï¿½ï¿½ï¿½id")
    private Long orderId;

    @ApiModelProperty("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½[ï¿½Ã»ï¿½ï¿½ï¿½ÏµÍ³ï¿½ï¿½ï¿½ï¿½Ì¨ï¿½ï¿½ï¿½ï¿½Ô±]")
    private String operateMan;

    @ApiModelProperty("ï¿½ï¿½ï¿½ï¿½Ê±ï¿½ï¿½")
    private LocalDateTime createTime;

    @ApiModelProperty("ï¿½ï¿½ï¿½ï¿½×´Ì¬ï¿½ï¿½0->ï¿½ï¿½ï¿½ï¿½ï¿½î£»1->ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½2->ï¿½Ñ·ï¿½ï¿½ï¿½ï¿½ï¿½3->ï¿½ï¿½ï¿½ï¿½É£ï¿½4->ï¿½Ñ¹Ø±Õ£ï¿½5->ï¿½ï¿½Ð§ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½")
    private Byte orderStatus;

    @ApiModelProperty("ï¿½ï¿½×¢")
    private String note;

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

    public String getOperateMan() {
        return operateMan;
    }

    public void setOperateMan(String operateMan) {
        this.operateMan = operateMan;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public Byte getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Byte orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "OrderOperateHistory{" +
            "id = " + id +
            ", orderId = " + orderId +
            ", operateMan = " + operateMan +
            ", createTime = " + createTime +
            ", orderStatus = " + orderStatus +
            ", note = " + note +
        "}";
    }
}
