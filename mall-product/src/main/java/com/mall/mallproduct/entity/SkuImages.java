package com.mall.mallproduct.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * skuÍ¼Æ¬
 * </p>
 *
 * @author Jiayu
 * @since 2023-10-25
 */
@TableName("pms_sku_images")
@ApiModel(value = "SkuImages对象", description = "skuÍ¼Æ¬")
public class SkuImages implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("sku_id")
    private Long skuId;

    @ApiModelProperty("Í¼Æ¬ï¿½ï¿½Ö·")
    private String imgUrl;

    @ApiModelProperty("ï¿½ï¿½ï¿½ï¿½")
    private Integer imgSort;

    @ApiModelProperty("Ä¬ï¿½ï¿½Í¼[0 - ï¿½ï¿½ï¿½ï¿½Ä¬ï¿½ï¿½Í¼ï¿½ï¿½1 - ï¿½ï¿½Ä¬ï¿½ï¿½Í¼]")
    private Integer defaultImg;

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

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Integer getImgSort() {
        return imgSort;
    }

    public void setImgSort(Integer imgSort) {
        this.imgSort = imgSort;
    }

    public Integer getDefaultImg() {
        return defaultImg;
    }

    public void setDefaultImg(Integer defaultImg) {
        this.defaultImg = defaultImg;
    }

    @Override
    public String toString() {
        return "SkuImages{" +
            "id = " + id +
            ", skuId = " + skuId +
            ", imgUrl = " + imgUrl +
            ", imgSort = " + imgSort +
            ", defaultImg = " + defaultImg +
        "}";
    }
}
