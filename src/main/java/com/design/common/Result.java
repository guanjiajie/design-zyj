package com.design.manage.common;

import com.design.manage.common.Enums.ResultEnum;

public class Result {
    private Integer code;
    private String msg;
    private Object data;


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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }


    /**
     * 接口成功调用
     * @param object
     * @return
     */
    public static Result success(Object object) {
        Result result=new Result();
        result.setCode(ResultEnum.SUCCESS.getCode());
        result.setMsg("成功！");
        result.setData(object);
        return result;
    }


    /**
     * 接口成功调用
     * @param
     * @return
     */
    public static Result setSuccessMsg(String msg) {
        Result result=new Result();
        result.setCode(ResultEnum.SUCCESS.getCode());
        result.setMsg(msg);
        result.setData(null);
        return result;
    }

    /**
     * 接口成功调用
     * @param
     * @return
     */
    public static Result success() {
        Result result=new Result();
        result.setCode(ResultEnum.SUCCESS.getCode());
        result.setMsg("成功！");
        result.setData(null);
        return result;
    }

    /**
     * 接口成功调用
     * @param object
     * @return
     */
    public static Result success(String msg, Object object) {
        Result result=new Result();
        result.setCode(ResultEnum.SUCCESS.getCode());
        result.setMsg(msg);
        result.setData(object);
        return result;
    }

    /**
     * 接口失败调用
     * @param code
     * @param msg
     * @return
     */
    public static Result error(Integer code, String msg){
        Result result=new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
    /**
     * 接口失败调用
     * @param msg
     * @param msg
     * @return
     */
    public static Result error(String msg){
        Result result=new Result();
        result.setCode(ResultEnum.ERROR.getCode());
        result.setMsg(msg);
        return result;
    }
}
