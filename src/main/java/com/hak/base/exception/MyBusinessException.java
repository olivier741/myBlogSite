package com.hak.base.exception;

/**
 * @author hak
 * @description
 * @date 2020/8/19
 */
public class MyBusinessException extends RuntimeException {

    private String erroCode;

    private String erroMsg;

    public MyBusinessException(){
        super();
    }

    public String getErroCode() {
        return erroCode;
    }

    public MyBusinessException setErroCode(String erroCode) {
        this.erroCode = erroCode;
        return this;
    }

    public String getErroMsg() {
        return erroMsg;
    }

    public MyBusinessException setErroMsg(String erroMsg) {
        this.erroMsg = erroMsg;
        return this;
    }
}
