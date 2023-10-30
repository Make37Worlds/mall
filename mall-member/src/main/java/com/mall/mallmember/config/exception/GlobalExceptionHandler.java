package com.mall.mallmember.config.exception;

import com.mall.mallmember.common.CommonException;
import com.mall.mallmember.constants.enums.ResultCode;
import com.mall.mallmember.entity.ResultInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ResponseBody
    @ExceptionHandler(Exception.class)
    public ResultInfo handleException(HttpServletRequest request, Exception e) {
        log(request,e);
        ResultInfo resultInfo = new ResultInfo();

        if(e instanceof CommonException){
            CommonException common = (CommonException) e;
            resultInfo.setCode(ResultCode.ERROR.code());
            resultInfo.setMsg(common.getMessage());
            return resultInfo;
        }

        String msg = e.getMessage();
        resultInfo.setResultCode(ResultCode.ERROR);
        if(msg.contains("Subject does not have role")){
            return resultInfo;
        }
        resultInfo.setMsg("请求失败");
        return resultInfo;
    }

    public void log(HttpServletRequest request, Exception exception){
        log.error("异常信息如下：" + exception.getMessage());
        StringBuilder exStr=new StringBuilder("");
        StackTraceElement[] trace=exception.getStackTrace();
//        获取堆栈信息并输出为打印的形式
        for(StackTraceElement s:trace){
            exStr.append("\tat " + s + "\r\n");
        }
        String lineSeparatorStr = System.getProperty("line.separator");
        //打印error级别的堆栈日志
        log.error("访问地址："+request.getRequestURL()+",请求方法："+request.getMethod()+",远程地址："+request.getRemoteAddr()+ lineSeparatorStr +"错误堆栈信息如下:"+ lineSeparatorStr +exStr);

    }
}
