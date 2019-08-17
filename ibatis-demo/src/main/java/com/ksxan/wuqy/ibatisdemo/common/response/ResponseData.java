package com.ksxan.wuqy.ibatisdemo.common.response;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.lang.NonNull;

import java.io.Serializable;
import java.util.List;

/**
 * @Author wuqy
 * @Date 2019/7/12 17:09
 */
public class ResponseData<T> implements Serializable {
    private List<T> rows;
    private Result result = Result.success();
    /**
     * map转JSON
     */
    private JSONObject data;

    public ResponseData(int status, String message) {
        result = new Result(status, message);
    }

    public ResponseData() {
        super();
    }

    public JSONObject getData() {
        return data;
    }

    public static JSONObject getClearData() {
        return new JSONObject();
    }

    public static ResponseData build() {
        return new ResponseData();
    }

    public ResponseData put(String key, Object value) {
        if (data == null) {
            data = new JSONObject();
        }
        data.put(key, value);
        return this;
    }

    public ResponseData setData(JSONObject data) {
        this.data = data;
        return this;
    }

    public List<T> getRows() {
        return rows;
    }

    public ResponseData setRows(List<T> rows) {
        this.rows = rows;
        return this;
    }

    public Result getResult() {
        return result;
    }

    public ResponseData setResult(Result result) {
        this.result = result;
        return this;
    }

    public static ResponseData error(@NonNull String message) {
        return build().setResult(Result.error(message));
    }

    public static ResponseData success(@NonNull String message) {
        return build().setResult(Result.success(message));
    }

    public static ResponseData paramError() {
        return build().setResult(Result.paramError());
    }

    public static ResponseData paramError(@NonNull String message) {
        return build().setResult(Result.paramError(message));
    }

    public static ResponseData failure(@NonNull String message) {
        return build().setResult(Result.failure(message));
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
