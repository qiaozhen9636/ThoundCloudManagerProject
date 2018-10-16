/**
 * Copyright (C), 2018-2018, XXX有限公司
 * FileName: BaseUser
 * Author:   Administrator
 * Date:     2018/10/15 19:25
 * Description: 存储在缓存中的常用的用户信息
 * History:
 * <author>          <time>          <version>          <desc>
 * qiaozhen         修改时间          版本号             描述
 */
package com.github.qiaozhen9636.thoundcloudmanager.user.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * 〈一句话功能简述〉<br> 
 * 〈存储在缓存中的常用的用户信息〉
 *
 * @author Administrator
 * @create 2018/10/15
 * @since 1.0.0
 */
@Component
public class BaseUser {
    @Value("${BaseUser.Id}")
    private int uId;
    @Value("${BaseUser.Headurl}")
    private String uHeadUrl;
    @Value("${BaseUser.Name}")
    private String uName;
    @Value("${BaseUser.Password}")
    private String uPassword;
    @Value("${BaseUser.LoginType}")
    private int uLoginType;
    @Autowired
    private DepentMent depentMent;
    @Value("${BaseUser.Balance}")
    private BigDecimal uBalance;
    @Value("${BaseUser.Integeral}")
    private int uIntegeral;
    @Value("${BaseUser.TODO}")
    private int uTODO;

    public BaseUser() {
    }

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public String getuHeadUrl() {
        return uHeadUrl;
    }

    public void setuHeadUrl(String uHeadUrl) {
        this.uHeadUrl = uHeadUrl;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword;
    }

    public int getuLoginType() {
        return uLoginType;
    }

    public void setuLoginType(int uLoginType) {
        this.uLoginType = uLoginType;
    }

    public DepentMent getDepentMent() {
        return depentMent;
    }

    public void setDepentMent(DepentMent depentMent) {
        this.depentMent = depentMent;
    }

    public BigDecimal getuBalance() {
        return uBalance;
    }

    public void setuBalance(BigDecimal uBalance) {
        this.uBalance = uBalance;
    }

    public int getuIntegeral() {
        return uIntegeral;
    }

    public void setuIntegeral(int uIntegeral) {
        this.uIntegeral = uIntegeral;
    }

    public int getuTODO() {
        return uTODO;
    }

    public void setuTODO(int uTODO) {
        this.uTODO = uTODO;
    }

    @Override
    public String toString() {
        return "BaseUser{" +
                "uId=" + uId +
                ", uHeadUrl='" + uHeadUrl + '\'' +
                ", uName='" + uName + '\'' +
                ", uPassword='" + uPassword + '\'' +
                ", uLoginType=" + uLoginType +
                ", depentMent=" + depentMent +
                ", uBalance=" + uBalance +
                ", uIntegeral=" + uIntegeral +
                ", uTODO=" + uTODO +
                '}';
    }
}
