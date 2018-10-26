/**
 * Copyright (C), 2018-2018, XXX有限公司
 * FileName: ResultMessage
 * Author:   Administrator
 * Date:     2018/10/24 20:00
 * Description: 从服务器端返回的数据
 * History:
 * <author>          <time>          <version>          <desc>
 * qiaozhen         修改时间          版本号             描述
 */
package com.github.qiaozhen9636.thoundcloudmanager.indexModule.webContotlor.vo;

import com.github.qiaozhen9636.thoundcloudmanager.indexModule.webContotlor.contant.ErrorCodes;

import java.lang.reflect.Field;

/**
 * 〈一句话功能简述〉<br> 
 * 〈从服务器端返回的数据〉
 *
 * @author Administrator
 * @create 2018/10/24
 * @since 1.0.0
 */

public class ResultMessage {
    private int errorCode = 200;
    private String message = null;
    private Object data = null;
    public ResultMessage(int code,Object data) {
        this.errorCode = code;
        this.message = new ErrorCodes().searchName(code);
        this.data = data;
    }

    public ResultMessage(String code,Object data){
        try {
            this.errorCode = new ErrorCodes().searchIntContant(code);
        } catch (NoSuchFieldException e) {
            System.err.println("寻找了一个错误的返回错误码");
            e.printStackTrace();
        }
        this.data = data;
    }

    public ResultMessage(int errorCode, String message, Object data) {
        this.errorCode = errorCode;
        this.message = message;
        this.data = data;
    }

    public static ResultMessage SUCCESS(Object data){
        return  new ResultMessage(200,data);
    }

    public static ResultMessage UNLOGIN(Object data){
        return  new ResultMessage(201,data);
    }

    @Override
        public String toString() {
            Field[] fields = this.getClass().getDeclaredFields();
            String resultString = this.getClass().getSimpleName()+"{";
            for (Field field : fields) {
                try {
                    resultString = resultString+field.getName()+"="+field.get(this)+", ";
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }

            resultString = resultString.substring(0,resultString.lastIndexOf(','))+"}";

            return resultString;
        }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
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
