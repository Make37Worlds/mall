package com.mall.mallproduct.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * spuï¿½ï¿½Ï¢ï¿½ï¿½ï¿½ï¿½
 * </p>
 *
 * @author Jiayu
 * @since 2023-10-25
 */
@TableName("pms_spu_info_desc")
@ApiModel(value = "SpuInfoDesc对象", description = "spuï¿½ï¿½Ï¢ï¿½ï¿½ï¿½ï¿½")
public class SpuInfoDesc implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("ï¿½ï¿½Æ·id")
    @TableId("spu_id")
    private Long spuId;

    @ApiModelProperty("ï¿½ï¿½Æ·ï¿½ï¿½ï¿½ï¿½")
    private String decript;

    public Long getSpuId() {
        return spuId;
    }

    public void setSpuId(Long spuId) {
        this.spuId = spuId;
    }

    public String getDecript() {
        return decript;
    }

    public void setDecript(String decript) {
        this.decript = decript;
    }

    @Override
    public String toString() {
        return "SpuInfoDesc{" +
            "spuId = " + spuId +
            ", decript = " + decript +
        "}";
    }
}
