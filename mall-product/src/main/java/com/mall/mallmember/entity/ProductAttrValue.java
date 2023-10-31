package com.mall.mallmember.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * spuï¿½ï¿½ï¿½ï¿½Öµ
 * </p>
 *
 * @author Jiayu
 * @since 2023-10-25
 */
@TableName("pms_product_attr_value")
@ApiModel(value = "ProductAttrValue对象", description = "spuï¿½ï¿½ï¿½ï¿½Öµ")
public class ProductAttrValue implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("ï¿½ï¿½Æ·id")
    private Long spuId;

    @ApiModelProperty("ï¿½ï¿½ï¿½ï¿½id")
    private Long attrId;

    @ApiModelProperty("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½")
    private String attrName;

    @ApiModelProperty("ï¿½ï¿½ï¿½ï¿½Öµ")
    private String attrValue;

    @ApiModelProperty("Ë³ï¿½ï¿½")
    private Integer attrSort;

    @ApiModelProperty("ï¿½ï¿½ï¿½ï¿½Õ¹Ê¾ï¿½ï¿½ï¿½Ç·ï¿½Õ¹Ê¾ï¿½Ú½ï¿½ï¿½ï¿½ï¿½Ï£ï¿½0-ï¿½ï¿½ 1-ï¿½Ç¡ï¿½")
    private Byte quickShow;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSpuId() {
        return spuId;
    }

    public void setSpuId(Long spuId) {
        this.spuId = spuId;
    }

    public Long getAttrId() {
        return attrId;
    }

    public void setAttrId(Long attrId) {
        this.attrId = attrId;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    public String getAttrValue() {
        return attrValue;
    }

    public void setAttrValue(String attrValue) {
        this.attrValue = attrValue;
    }

    public Integer getAttrSort() {
        return attrSort;
    }

    public void setAttrSort(Integer attrSort) {
        this.attrSort = attrSort;
    }

    public Byte getQuickShow() {
        return quickShow;
    }

    public void setQuickShow(Byte quickShow) {
        this.quickShow = quickShow;
    }

    @Override
    public String toString() {
        return "ProductAttrValue{" +
            "id = " + id +
            ", spuId = " + spuId +
            ", attrId = " + attrId +
            ", attrName = " + attrName +
            ", attrValue = " + attrValue +
            ", attrSort = " + attrSort +
            ", quickShow = " + quickShow +
        "}";
    }
}
