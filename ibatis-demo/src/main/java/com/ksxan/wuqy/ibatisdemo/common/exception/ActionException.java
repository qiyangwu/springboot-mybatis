package com.ksxan.wuqy.ibatisdemo.common.exception;


import com.ksxan.wuqy.ibatisdemo.common.response.ResponseData;
import com.ksxan.wuqy.ibatisdemo.common.response.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Action层异常
 *
 * @author wuqy
 * @date 2019-07-14
 */
@RestControllerAdvice
public class ActionException {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 全局异常处理，反正异常返回统一格式的数据
     *
     * @param ex 异常
     * @return res
     */
    @ExceptionHandler(value = Exception.class)
    public ResponseData exceptionHandler(Exception ex) {
        ResponseData responseData = new ResponseData();
        responseData.setResult(Result.error(ex.getMessage()));
        //发生异常进行日志记录，写入数据库或者其他处理，此处省略
        logger.error(">>>>>捕捉到全局异常>>>>{}", ex.getMessage());
        ex.printStackTrace();
        return responseData;
    }

}
