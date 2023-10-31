package com.mall.mallmember.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * spuÍ¼Æ¬
 * </p>
 *
 * @author Jiayu
 * @since 2023-10-25
 */
@TableName("pms_spu_images")
@ApiModel(value = "SpuImages对象", description = "spuÍ¼Æ¬")
public class SpuImages implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("spu_id")
    private Long spuId;

    @ApiModelProperty("Í¼Æ¬ï¿½ï¿½")
    private String imgName;

    @ApiModelProperty("Í¼Æ¬ï¿½ï¿½Ö·")
    private String imgUrl;

    @ApiModelProperty("Ë³ï¿½ï¿½")
    private Integer imgSort;

    @ApiModelProperty("ï¿½Ç·ï¿½Ä¬ï¿½ï¿½Í¼")
    private Byte defaultImg;

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

    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName;
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

    public Byte getDefaultImg() {
        return defaultImg;
    }

    public void setDefaultImg(Byte defaultImg) {
        this.defaultImg = defaultImg;
    }

    @Override
    public String toString() {
        return "SpuImages{" +
            "id = " + id +
            ", spuId = " + spuId +
            ", imgName = " + imgName +
            ", imgUrl = " + imgUrl +
            ", imgSort = " + imgSort +
            ", defaultImg = " + defaultImg +
        "}";
    }
}
