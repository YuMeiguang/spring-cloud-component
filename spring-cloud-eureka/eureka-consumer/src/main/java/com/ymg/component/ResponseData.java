package com.ymg.component;

/**
 * @author yumg
 * @create 2019/10/28
 * @desc
 * @since 1.0.0
 **/
public class ResponseData {

    private Boolean status;

    private int code;

    private String message;

    private Object data;

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
