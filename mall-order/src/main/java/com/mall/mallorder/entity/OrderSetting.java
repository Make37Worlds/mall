package com.mall.mallorder.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½Ï¢
 * </p>
 *
 * @author Jiayu
 * @since 2023-10-25
 */
@TableName("oms_order_setting")
@ApiModel(value = "OrderSetting对象", description = "ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½Ï¢")
public class OrderSetting implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("ï¿½ï¿½É±ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½Ê±ï¿½Ø±ï¿½Ê±ï¿½ï¿½(ï¿½ï¿½)")
    private Integer flashOrderOvertime;

    @ApiModelProperty("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½Ê±Ê±ï¿½ï¿½(ï¿½ï¿½)")
    private Integer normalOrderOvertime;

    @ApiModelProperty("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½Ô¶ï¿½È·ï¿½ï¿½ï¿½Õ»ï¿½Ê±ï¿½ä£¨ï¿½ì£©")
    private Integer confirmOvertime;

    @ApiModelProperty("ï¿½Ô¶ï¿½ï¿½ï¿½É½ï¿½ï¿½ï¿½Ê±ï¿½ä£¬ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½Ë»ï¿½ï¿½ï¿½ï¿½ì£©")
    private Integer finishOvertime;

    @ApiModelProperty("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½Éºï¿½ï¿½Ô¶ï¿½ï¿½ï¿½ï¿½ï¿½Ê±ï¿½ä£¨ï¿½ì£©")
    private Integer commentOvertime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getFlashOrderOvertime() {
        return flashOrderOvertime;
    }

    public void setFlashOrderOvertime(Integer flashOrderOvertime) {
        this.flashOrderOvertime = flashOrderOvertime;
    }

    public Integer getNormalOrderOvertime() {
        return normalOrderOvertime;
    }

    public void setNormalOrderOvertime(Integer normalOrderOvertime) {
        this.normalOrderOvertime = normalOrderOvertime;
    }

    public Integer getConfirmOvertime() {
        return confirmOvertime;
    }

    public void setConfirmOvertime(Integer confirmOvertime) {
        this.confirmOvertime = confirmOvertime;
    }

    public Integer getFinishOvertime() {
        return finishOvertime;
    }

    public void setFinishOvertime(Integer finishOvertime) {
        this.finishOvertime = finishOvertime;
    }

    public Integer getCommentOvertime() {
        return commentOvertime;
    }

    public void setCommentOvertime(Integer commentOvertime) {
        this.commentOvertime = commentOvertime;
    }

    @Override
    public String toString() {
        return "OrderSetting{" +
            "id = " + id +
            ", flashOrderOvertime = " + flashOrderOvertime +
            ", normalOrderOvertime = " + normalOrderOvertime +
            ", confirmOvertime = " + confirmOvertime +
            ", finishOvertime = " + finishOvertime +
            ", commentOvertime = " + commentOvertime +
        "}";
    }
}
