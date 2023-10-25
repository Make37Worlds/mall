package com.mall.mallwarehouse.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * ï¿½Ö¿ï¿½ï¿½ï¿½Ï¢
 * </p>
 *
 * @author Jiayu
 * @since 2023-10-25
 */
@TableName("wms_ware_info")
@ApiModel(value = "WareInfo对象", description = "ï¿½Ö¿ï¿½ï¿½ï¿½Ï¢")
public class WareInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("ï¿½Ö¿ï¿½ï¿½ï¿½")
    private String name;

    @ApiModelProperty("ï¿½Ö¿ï¿½ï¿½Ö·")
    private String address;

    @ApiModelProperty("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½")
    private String areacode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAreacode() {
        return areacode;
    }

    public void setAreacode(String areacode) {
        this.areacode = areacode;
    }

    @Override
    public String toString() {
        return "WareInfo{" +
            "id = " + id +
            ", name = " + name +
            ", address = " + address +
            ", areacode = " + areacode +
        "}";
    }
}
