package com.mall.mallmember.entity;

import com.mall.mallmember.constants.enums.ResultCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @version 1.0
 * description: 对请求结果进行包装
 */
@ApiModel(value = "返回结果")
public class ResultInfo<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 状态码 */
    @ApiModelProperty(value = "状态码")
    private Integer code;
    /** 消息 */
    @ApiModelProperty(value = "消息")
    private String msg;
    /** 数据对象 */
    @ApiModelProperty(value = "数据")
    private T data;


    public ResultInfo(){}

    public ResultInfo(Integer code, String msg, T data){
        this.code = code;
        this.msg = msg;
        this.data = data;
    }


    public static ResultInfo success() {
        ResultInfo resultInfo = new ResultInfo();
        resultInfo.setResultCode(ResultCode.SUCCESS);
        return resultInfo;
    }


    public static ResultInfo success(Object data) {
        ResultInfo resultInfo = new ResultInfo();
        resultInfo.setResultCode(ResultCode.SUCCESS);
        resultInfo.setData(data);
        return resultInfo;
    }


    public static ResultInfo failure(ResultCode resultCode) {
        ResultInfo resultInfo = new ResultInfo();
        resultInfo.setResultCode(resultCode);
        return resultInfo;
    }

    public static ResultInfo failure(ResultCode resultCode, Object data) {
        ResultInfo resultInfo = new ResultInfo();
        resultInfo.setResultCode(resultCode);
        resultInfo.setData(data);
        return resultInfo;
    }


    public void setResultCode(ResultCode code) {
        this.code = code.code();
        this.msg = code.message();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }


}
