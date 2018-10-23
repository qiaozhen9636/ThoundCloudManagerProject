/**
 * Copyright (C), 2018-2018, XXX有限公司
 * FileName: User
 * Author:   Administrator
 * Date:     2018/10/16 19:23
 * Description: User
 * History:
 * <author>          <time>          <version>          <desc>
 * qiaozhen         修改时间          版本号             描述
 */
package com.github.qiaozhen9636.thoundcloudmanager.indexModule.webContotlor.vo;

import java.math.BigDecimal;

/**
 * 〈一句话功能简述〉<br> 
 * 〈User〉
 *
 * @author Administrator
 * @create 2018/10/16
 * @since 1.0.0
 */

public class User {
    private String nickName;
    private String password;
    private int Integral;
    private BigDecimal balance;
    private int  todo;
    private String depName;
    private String thisclassName;

    public User() {
    }

    public User(String nickName, String password) {
        this.nickName = nickName;
        this.password = password;
    }

    public User(String nickName, String password, int integral, BigDecimal balance, int todo) {
        this.nickName = nickName;
        this.password = password;
        Integral = integral;
        this.balance = balance;
        this.todo = todo;
    }

    public User(String nickName, String password, int integral, BigDecimal balance, int todo, String depName, String thisclassName) {
        this.nickName = nickName;
        this.password = password;
        Integral = integral;
        this.balance = balance;
        this.todo = todo;
        this.depName = depName;
        this.thisclassName = thisclassName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIntegral() {
        return Integral;
    }

    public void setIntegral(int integral) {
        Integral = integral;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public int getTodo() {
        return todo;
    }

    public void setTodo(int todo) {
        this.todo = todo;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public String getThisclassName() {
        return thisclassName;
    }

    public void setThisclassName(String thisclassName) {
        this.thisclassName = thisclassName;
    }
}
