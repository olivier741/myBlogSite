package com.hak.base;

/**
 * @author hak
 * @description
 * @date 2020/8/15
 */
public class RestDto <T> {

    private static final String CODE_SUCCESS = "success";

    private static final String CODE_FAIL = "fail";

    private String code;
    private T data;
    private String msg;
    //private int count;

    public RestDto(){

    }

    public RestDto(String code){
        this.code = code;
    }

    public RestDto(String code, T data){
        this.code = code;
        this.data = data;
    }

    public RestDto(String code, String msg){
        this.code = code;
        this.msg = msg;
    }

    public RestDto(String code,String msg, T data){
        this.code = code;
        this.msg = msg;
        //this.count = count;
        this.data = data;
    }

    public static RestDto success(){
        return new RestDto(CODE_SUCCESS);
    }

    public static RestDto success(Object data){

        return new RestDto(CODE_SUCCESS, data);
    }

    public static RestDto layUISuccess(Object data){

        return new RestDto("0", data);

    }

    public static RestDto error(Exception e){

        return new RestDto("-1",e.getMessage());

    }

    public static RestDto error(String code ,String msg){

        return new RestDto(code,msg);

    }

    public static RestDto error(String msg){

        return new RestDto("-1",msg);

    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
