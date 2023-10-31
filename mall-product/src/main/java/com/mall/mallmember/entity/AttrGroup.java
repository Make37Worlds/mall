package com.mall.mallmember.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * ï¿½ï¿½ï¿½Ô·ï¿½ï¿½ï¿½
 * </p>
 *
 * @author Jiayu
 * @since 2023-10-25
 */
@TableName("pms_attr_group")
@ApiModel(value = "AttrGroup对象", description = "ï¿½ï¿½ï¿½Ô·ï¿½ï¿½ï¿½")
public class AttrGroup implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("ï¿½ï¿½ï¿½ï¿½id")
    @TableId(value = "attr_group_id", type = IdType.AUTO)
    private Long attrGroupId;

    @ApiModelProperty("ï¿½ï¿½ï¿½ï¿½")
    private String attrGroupName;

    @ApiModelProperty("ï¿½ï¿½ï¿½ï¿½")
    private Integer sort;

    @ApiModelProperty("ï¿½ï¿½ï¿½ï¿½")
    private String descript;

    @ApiModelProperty("ï¿½ï¿½Í¼ï¿½ï¿½")
    private String icon;

    @ApiModelProperty("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½id")
    private Long catelogId;

    public Long getAttrGroupId() {
        return attrGroupId;
    }

    public void setAttrGroupId(Long attrGroupId) {
        this.attrGroupId = attrGroupId;
    }

    public String getAttrGroupName() {
        return attrGroupName;
    }

    public void setAttrGroupName(String attrGroupName) {
        this.attrGroupName = attrGroupName;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Long getCatelogId() {
        return catelogId;
    }

    public void setCatelogId(Long catelogId) {
        this.catelogId = catelogId;
    }

    @Override
    public String toString() {
        return "AttrGroup{" +
            "attrGroupId = " + attrGroupId +
            ", attrGroupName = " + attrGroupName +
            ", sort = " + sort +
            ", descript = " + descript +
            ", icon = " + icon +
            ", catelogId = " + catelogId +
        "}";
    }
}
