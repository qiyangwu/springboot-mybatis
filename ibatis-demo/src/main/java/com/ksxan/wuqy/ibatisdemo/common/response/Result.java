package com.ksxan.wuqy.ibatisdemo.common.response;

import org.apache.commons.lang3.StringUtils;
import org.springframework.lang.NonNull;

/**
 * @Author wuqy
 * @Date 2019/7/12 18:40
 */
public class Result {
    private int status;
    private String message;

    public Result() {
        super();
    }

    public Result(int status, String message) {
        this.message = message;
        this.status = status;
    }

    /**
     * 接口成功
     */
    public static Result success() {
        return success("成功");
    }

    /**
     * 接口成功
     */
    public static Result success(String message) {
        return new Result(200, message);
    }

    /**
     * 业务错误级别
     *
     * @param message 失败原因
     * @return
     */
    public static Result failure(@NonNull String message) {
        return new Result(300, message);
    }

    /**
     * 自定义返回状态及说明。
     *
     * @param status  自定义状态码
     * @param message 失败原因
     * @return
     */
    public static Result failure(@NonNull Integer status, @NonNull String message) {
        return new Result(status, message);
    }

    /**
     * 参数错误
     */
    public static Result paramError() {
        return paramError("参数不完整，请核对非空参数");
    }

    /**
     * 参数错误
     *
     * @param message 错误说明
     * @return
     */
    public static Result paramError(String message) {
        return new Result(400, message);
    }


    /**
     * 检查非空参数。
     *
     * @param param 参数
     * @return 结果
     */
    public static Result checkParamNotNull(Object... param) {
        Result result = null;
        for (Object p : param) {
            if (p == null) {
                result = paramError();
                break;
            }
            if (p instanceof String) {
                if (StringUtils.isBlank((String) p) || "null".equals(p)) {
                    result = paramError();
                    break;
                }
            }
        }
        return result;
    }

    /**
     * 系统错误级别
     *
     * @param message 错误说明
     * @return
     */
    public static Result error(@NonNull String message) {
        return new Result(500, message);
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

