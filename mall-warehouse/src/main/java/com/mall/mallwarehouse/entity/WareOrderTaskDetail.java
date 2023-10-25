package com.mall.mallwarehouse.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
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
@TableName("wms_ware_order_task_detail")
@ApiModel(value = "WareOrderTaskDetail对象", description = "ï¿½ï¿½æ¹¤ï¿½ï¿½ï¿½ï¿½")
public class WareOrderTaskDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("sku_id")
    private Long skuId;

    @ApiModelProperty("sku_name")
    private String skuName;

    @ApiModelProperty("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½")
    private Integer skuNum;

    @ApiModelProperty("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½id")
    private Long taskId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Integer getSkuNum() {
        return skuNum;
    }

    public void setSkuNum(Integer skuNum) {
        this.skuNum = skuNum;
    }

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    @Override
    public String toString() {
        return "WareOrderTaskDetail{" +
            "id = " + id +
            ", skuId = " + skuId +
            ", skuName = " + skuName +
            ", skuNum = " + skuNum +
            ", taskId = " + taskId +
        "}";
    }
}
