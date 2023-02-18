package com.example.domian;

public class ResultFromCode {
    private Integer code;
    private Object data;
    private String message;

    @Override
    public String toString() {
        return "ResultFromCode{" +
                "code=" + code +
                ", data=" + data +
                ", message='" + message + '\'' +
                '}';
    }

    public ResultFromCode(Integer code, Object data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    public ResultFromCode(Integer code, Object data) {
        this.code = code;
        this.data = data;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public Object getData() {
        return data;
    }

    public String getMessage() {
        return message;
    }
}
