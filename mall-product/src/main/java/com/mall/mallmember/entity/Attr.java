package com.mall.mallmember.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * ï¿½ï¿½Æ·ï¿½ï¿½ï¿½ï¿½
 * </p>
 *
 * @author Jiayu
 * @since 2023-10-25
 */
@TableName("pms_attr")
@ApiModel(value = "Attr对象", description = "ï¿½ï¿½Æ·ï¿½ï¿½ï¿½ï¿½")
public class Attr implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("ï¿½ï¿½ï¿½ï¿½id")
    @TableId(value = "attr_id", type = IdType.AUTO)
    private Long attrId;

    @ApiModelProperty("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½")
    private String attrName;

    @ApiModelProperty("ï¿½Ç·ï¿½ï¿½ï¿½Òªï¿½ï¿½ï¿½ï¿½[0-ï¿½ï¿½ï¿½ï¿½Òªï¿½ï¿½1-ï¿½ï¿½Òª]")
    private Byte searchType;

    @ApiModelProperty("ï¿½ï¿½ï¿½ï¿½Í¼ï¿½ï¿½")
    private String icon;

    @ApiModelProperty("ï¿½ï¿½Ñ¡Öµï¿½Ð±ï¿½[ï¿½Ã¶ï¿½ï¿½Å·Ö¸ï¿½]")
    private String valueSelect;

    @ApiModelProperty("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½[0-ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½Ô£ï¿½1-ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½Ô£ï¿½2-ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½Ç»ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½]")
    private Byte attrType;

    @ApiModelProperty("ï¿½ï¿½ï¿½ï¿½×´Ì¬[0 - ï¿½ï¿½ï¿½Ã£ï¿½1 - ï¿½ï¿½ï¿½ï¿½]")
    private Long enable;

    @ApiModelProperty("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½")
    private Long catelogId;

    @ApiModelProperty("ï¿½ï¿½ï¿½ï¿½Õ¹Ê¾ï¿½ï¿½ï¿½Ç·ï¿½Õ¹Ê¾ï¿½Ú½ï¿½ï¿½ï¿½ï¿½Ï£ï¿½0-ï¿½ï¿½ 1-ï¿½Ç¡ï¿½ï¿½ï¿½ï¿½ï¿½skuï¿½ï¿½ï¿½ï¿½È»ï¿½ï¿½ï¿½Ôµï¿½ï¿½ï¿½")
    private Byte showDesc;

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

    public Byte getSearchType() {
        return searchType;
    }

    public void setSearchType(Byte searchType) {
        this.searchType = searchType;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getValueSelect() {
        return valueSelect;
    }

    public void setValueSelect(String valueSelect) {
        this.valueSelect = valueSelect;
    }

    public Byte getAttrType() {
        return attrType;
    }

    public void setAttrType(Byte attrType) {
        this.attrType = attrType;
    }

    public Long getEnable() {
        return enable;
    }

    public void setEnable(Long enable) {
        this.enable = enable;
    }

    public Long getCatelogId() {
        return catelogId;
    }

    public void setCatelogId(Long catelogId) {
        this.catelogId = catelogId;
    }

    public Byte getShowDesc() {
        return showDesc;
    }

    public void setShowDesc(Byte showDesc) {
        this.showDesc = showDesc;
    }

    @Override
    public String toString() {
        return "Attr{" +
            "attrId = " + attrId +
            ", attrName = " + attrName +
            ", searchType = " + searchType +
            ", icon = " + icon +
            ", valueSelect = " + valueSelect +
            ", attrType = " + attrType +
            ", enable = " + enable +
            ", catelogId = " + catelogId +
            ", showDesc = " + showDesc +
        "}";
    }
}
