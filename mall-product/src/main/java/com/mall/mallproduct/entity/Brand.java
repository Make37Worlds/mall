package com.mall.mallproduct.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * Æ·ï¿½ï¿½
 * </p>
 *
 * @author Jiayu
 * @since 2023-10-25
 */
@TableName("pms_brand")
@ApiModel(value = "Brand对象", description = "Æ·ï¿½ï¿½")
public class Brand implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("Æ·ï¿½ï¿½id")
    @TableId(value = "brand_id", type = IdType.AUTO)
    private Long brandId;

    @ApiModelProperty("Æ·ï¿½ï¿½ï¿½ï¿½")
    private String name;

    @ApiModelProperty("Æ·ï¿½ï¿½logoï¿½ï¿½Ö·")
    private String logo;

    @ApiModelProperty("ï¿½ï¿½ï¿½ï¿½")
    private String descript;

    @ApiModelProperty("ï¿½ï¿½Ê¾×´Ì¬[0-ï¿½ï¿½ï¿½ï¿½Ê¾ï¿½ï¿½1-ï¿½ï¿½Ê¾]")
    private Byte showStatus;

    @ApiModelProperty("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½Ä¸")
    private String firstLetter;

    @ApiModelProperty("ï¿½ï¿½ï¿½ï¿½")
    private Integer sort;

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    public Byte getShowStatus() {
        return showStatus;
    }

    public void setShowStatus(Byte showStatus) {
        this.showStatus = showStatus;
    }

    public String getFirstLetter() {
        return firstLetter;
    }

    public void setFirstLetter(String firstLetter) {
        this.firstLetter = firstLetter;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        return "Brand{" +
            "brandId = " + brandId +
            ", name = " + name +
            ", logo = " + logo +
            ", descript = " + descript +
            ", showStatus = " + showStatus +
            ", firstLetter = " + firstLetter +
            ", sort = " + sort +
        "}";
    }
}
