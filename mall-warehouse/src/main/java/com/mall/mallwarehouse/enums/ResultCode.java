package com.mall.mallwarehouse.enums;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.ArrayList;
import java.util.List;

public enum ResultCode {
    /* 成功状态码 */
    SUCCESS(1, "成功"),
    CODE_EXIT(2, "该地址已经导入"),
    ERROR(500,"请求失败"),

    /* 参数错误：10001-19999 */
    PARAM_IS_INVALID(10001, "站点信息为空"),
    PARAM_IS_BLANK(10002, "参数ID为空"),
    PARAM_TYPE_BIND_ERROR(10003, "参数类型错误"),
    PARAM_NOT_COMPLETE(10004, "评分项缺失"),
    PARAM_NOT_EMAIL(10005, "邮箱地址未传"),
    PARAM_NOT_A_EMAIL(10006, "邮箱地址错误"),
    PARAM_TIME_ERROR(10007, "时间未传"),
    PARAM_TYPE(10008, "筛选类型，按类型查询未传"),
    PARAM_TIME_FOMAT(10009, "时间格式错误"),
    PARAM_STATIONS_ERROR(10010, "站点未选择"),
    PARAM_IS_ERROR(10011,"参数错误"),
    PARAM_IS_LOSS(10012,"请给所有人员评分"),
    /* 用户错误：20001-29999*/
    USER_NOT_LOGGED_IN(20001, "用户未登录"),
    USER_LOGIN_ERROR(20002, "账号不存在或密码错误"),
    USER_IS_LOCKED(20003, "账号已被锁定"),
    USER_UNLOCKED_ERROR(20004, "账号解锁失败"),
    USER_NOT_EXIST(20005, "用户不存在"),
    USER_HAS_EXISTED(20006, "用户已存在"),
    LOGINNAME_HAS_EXISTED(20007, "登录名已存在"),
    LOGINNAME_PWD_NOT_EXIST(20008, "用户名、密码不能为空"),
    OLD_LOGIN_PWD_ERROR(20009, "原密码错误"),
    LOGIN_PWD_EDIT_ERROR(20010, "密码修改失败"),
    LOGIN_SMS_CODE_ERROR(20011, "短信验证失败"),
    USER_QUESTION_ERROR(20012, "密保问题答案不正确"),
    USER_QUESTION_NOT_EXIST(20013, "还未设定密保"),
    PWD_IS_NULL(20014, "请输入密码"),
    LOGIN_PWD_ERROR(20015, "密码输入错误"),
    IMAGE_CODE_ERROR(20016, "验证码输入错误或过期"),
    IMAGE_CODE_EXPIRED(20017, "验证码已过期"),
    USER_NOT_CCY(20018, "当前用户不是抽查员"),
    NO_PERMISSION_OPERATION(20019, "无权限操作"),
    ADD_ERROR(20020,"查询站点编码或者imei或站点名称重复"),
    USER_LOGGED_IN(20021, "账号在其他地方登录"),
    DATA_RANGE(20022, "角色数据范围未传"),
    DATA_RANGE_ROLE(20023, "数据角色未传"),
    DATA_RANGE_LOSS(20024, "没有分配数据权限"),
    USER_NOT_PERMISSION(20025, "用户没有权限"),
    AREA_NOT_EXIST(20026, "该地区不存在"),
    USER_IS_CANCELLATION(20027, "用户已被注销"),
    ACTIVITY_OVER(20028, "该活动已经结束或被锁定"),
    ACTIVITY_NOT_EXIST(20029, "该活动已被删除"),
    DEP_NOT_MODEL(20030, "该部门没有绑定打分权重模型"),
    /* 系统错误：40001-49999 */
    SYSTEM_INNER_ERROR(40001, "系统繁忙，请稍后重试"),
    JWT_ERRCODE_NULL(40002, "签名不存在"),
    JWT_ERRCODE_EXPIRE(40003, "签名已过期"),
    JWT_ERRCODE_FAIL(40004, "签名验证不通过"),
    IP_IS_EMPTY(40005, "ip不存在"),
    IP_IS_ERROR(40006, "ip错误"),

    /* 数据错误：50001-599999 */
    RESULT_DATA_NONE(50001, "数据未找到"),
    DATA_IS_WRONG(50002, "数据有误"),
    DATA_ALREADY_EXISTED(50003, "模型名称已存在"),
    DATA_ADD_ERROR(50004, "数据新增失败"),
    DATA_EDIT_ERROR(50005, "数据更新失败"),
    DATA_DELETE_ERROR(50006, "数据删除失败"),
    DATA_QUERY_NONE(50007, "查询无结果"),
    DATA_OPERATE_ERROR(50008, "操作失败,不属于自有站点"),
    DATA_SAVE_ERROR(50009, "数据保存出错"),
    DATA_UPLOAD_ERROR(50010, "数据上传出错"),
    DATA_CAN_NOT_DEL(50011, "只能删除来源是资料管理的附件"),
    DATA_HISTORY_NULL(50012, "该记录暂无历史留痕"),
    DATA_EXIST(50013, "记录已存在"),
    DATA_CODE(50014, "用户未绑定公司"),
    DATA_CODE_ACCOUNT(50018, "用户未绑定账号类型"),
    DATA_ADMIN(50015, "不能新增超级管理员"),
    RESULT_DATA_ROLE(50016, "该角色未找到"),
    USER_SELF_DELETE_ERROR(50017, "用户不能删除自己"),
    HOUSE_EXIST(50018, "房屋信息已存在"),
    HOUSE_OWNER_EXIST(50019, "房主电话已重复"),
    CODE_OUT_ERROR(50020, "批量导出二维码失败，请重试"),
    HOUSE_PARA_ERROR(50021, "楼栋号/单元号/楼层号/室号缺失"),
    AREA_IS_NULL(50022, "导入的小区不存在"),
    IDCARD_FAILURE(50023, "身份证格式错误"),
    /* 接口错误：60001-69999 */
    INTERFACE_INNER_INVOKE_ERROR(60001, ""),
    INTERFACE_OUTTER_INVOKE_ERROR(60002, "外部系统接口调用异常"),
    INTERFACE_FORBID_VISIT(60003, "该接口禁止访问"),
    INTERFACE_ADDRESS_INVALID(60004, "接口地址无效"),
    INTERFACE_REQUEST_TIMEOUT(60005, "接口请求超时"),
    INTERFACE_EXCEED_LOAD(60006, "接口负载过高"),


    INTERFACE_ADD_ERROR(60007, "站点添加失败"),
    INTERFACE_ADD_ERROR2(60008, "添加站点的相关参数错误"),
    /* 业务受理系统：70001-79999 */
    INFO_IS_LOCKED(70001, "该条信息已被锁定"),
    INFO_ERROR(70002, "该条信息为到提醒日期"),
    UPDATE_USER_ERROR(70003, "更新用户不是当前公司的用户"),
    UPDATE_USER_ERROR1(70004, "更新用户不是登录用户"),
    /* 文件受理系统：80001-89999 */
    DIR_NOT_EMPTY(80001, "文件夹不为空"),
    DIR_NOT_CHOOSE(80002, "索引不能为空"),
    CATEGORY_NOT_CHOOSE(80003, "请先选择一个类"),
    DIR_ERROR(80004, "目标文件夹是源文件夹的子文件夹"),
    FILE_IS_NULL(80005, "没有上传的文件"),
    DIR_EXIST(80006, "同名文件夹已存在"),
    CATEGORY_EXIST(80007, "类目已存在"),
    FILE_IS_MAX(80008, "文件大小不得超过10MB"),

    FILE_OUT(80009,"设备处于非在线状态，应用失败"),

    FILE_FAILURE(80010,"文件上传失败"),
    FILE_IS_MIN(80011,"文件大小不得为0"),
    FILE_NOT_EXIST(80012,"文件不存在"),




    /* 权限错误：90001-99999 */
    PERMISSION_NO_ACCESS(90001, "无访问权限"),

    /** ============HeYin================ */
    DATE_FORMAT_ERROR(120000,"日期格式不对"),
    SECTION_AREA_EXIST_CUSTOMER(120001,"片区下面存在客户,不能删除!"),
    CUSTOMER_INFO_NOT_REPEAT(120002,"企业名称,交易代码,交易简称,电网户号不能重复!"),
    SECTION_EXIST(120003,"片区名称不能重复!"),
    SOCKET_NOT_RESPONSE(120004, "终端没有响应!"),
    CURRENT_USER_EMPTY(120005,"查询当前用户为空!"),
    AREA_IS_USING(120006,"该地区正在使用,不能删除!"),
    CURRENT_USER_NOT_ADD_CUSTOMER(120007,"当前用户不能添加新客户!"),
    CUSTOMER_HAS_SIGN_NOT_DELETE(120008,"已签约的客户不能删除!"),
    CONNECT_WAY_TABLE_NUMBER_NOT_ALL_SELECT(120009,"电能表和接线方式不能同时选择!");


    private static final Log LOGGER = LogFactory.getLog(ResultCode.class);

    private Integer code;

    private String message;

    ResultCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }


    public Integer code() {
        return this.code;
    }


    public String message() {
        return this.message;
    }


    public static String getMessage(String name) {
        for (ResultCode item : ResultCode.values()) {
            if (item.name().equals(name)) {
                return item.message;
            }
        }
        return name;
    }


    public static Integer getCode(String name) {
        for (ResultCode item : ResultCode.values()) {
            if (item.name().equals(name)) {
                return item.code;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return this.name();
    }

    /**
     * 校验重复的code值
     * @param args String[]
     */
    public static void main(String[] args) {
        ResultCode[] apiResultCodes = ResultCode.values();
        List<Integer> codeList = new ArrayList<Integer>();
        for (ResultCode apiResultCode : apiResultCodes) {
            if (codeList.contains(apiResultCode.code)) {
                LOGGER.info(apiResultCode.code);
            } else {
                codeList.add(apiResultCode.code());
            }
        }
    }
}
