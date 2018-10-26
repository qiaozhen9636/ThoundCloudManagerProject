/**
 * Copyright (C), 2018-2018, XXX有限公司
 * FileName: Contant
 * Author:   Administrator
 * Date:     2018/10/24 20:23
 * Description: 常量类基类
 * History:
 * <author>          <time>          <version>          <desc>
 * qiaozhen         修改时间          版本号             描述
 */
package com.github.qiaozhen9636.thoundcloudmanager.indexModule.webContotlor.contant;

import java.lang.reflect.Field;

/**
 * 〈一句话功能简述〉<br>
 * 〈常量类基类〉
 *
 * @author Administrator
 * @create 2018/10/24
 * @since 1.0.0
 */

public class Contant {
    public int searchIntContant(String name) throws NoSuchFieldException {
        try {
            return this.getClass().getDeclaredField(name).getInt(this);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return e.hashCode();
        }
    }

    public String searchStringContant(String name) throws NoSuchFieldException {
        try {
            return (String) this.getClass().getDeclaredField(name).get(this);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String searchName(Object value) {
        Field[] fields = this.getClass().getDeclaredFields();
        for (Field field : fields) {
            try {
                if(value.equals(field.get(this))){
                    return field.getName();
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public String toString() {
        Field[] fields = this.getClass().getDeclaredFields();
        String resultString = this.getClass().getSimpleName() + " {";
        for (Field field : fields) {
            try {
                resultString = resultString + field.getName() + "=" + field.get(this) + ", ";
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        resultString = resultString.substring(0, resultString.lastIndexOf(',')) + "}";

        return resultString;
    }
}
