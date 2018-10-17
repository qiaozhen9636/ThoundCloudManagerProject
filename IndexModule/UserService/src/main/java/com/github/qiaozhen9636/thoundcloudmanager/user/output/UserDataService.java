/**
 * Copyright (C), 2018-2018, XXX有限公司
 * FileName: UserDataService
 * Author:   Administrator
 * Date:     2018/10/12 8:44
 * Description: 获取与userdata相关信息
 * History:
 * <author>          <time>          <version>          <desc>
 * qiaozhen     2018/10/15 8:40         1.0       增加了一些新的方法
 */
package com.github.qiaozhen9636.thoundcloudmanager.user.output;

import com.github.qiaozhen9636.thoundcloudmanager.user.beans.Department;

import java.math.BigDecimal;
import java.util.Date;


public interface UserDataService {

    Department test();

    /**
     * 设置新的服务中用户
     * @param userName 用户的登录名
     * @param password 用户的登录密码
     * @return 提示错误信息
     */
    String createUserDataService(String userName,String password);

    /**
     * 修改服务中的用户
     * @param UserName  用户登录名
     * @param password  用户登录密码
     * @return 提示错误信息
     */
    String resetUserDataService(String UserName,String password);


    /**
     *  结束对当前用户的服务
     */
    void removeUserDataService();

    /**
     * 设置用户信息
     * @param nickName  用户昵称
     * @param photoUrl  用户头像地址
     * @param birth     用户生日
     * @param male      用户性别
     * @param depName   用户部门名称
     * @param nation    用户民族
     * @param cardNum   用户身份证号码
     * @param address   用户地址
     * @param natives   用户籍贯
     * @param party     用户政治面貌
     * @param qualifications    用户学历
     * @param collage   用户毕业院校
     * @param phone     用户电话
     * @param email     用户邮箱
     * @return  提示信息
     *          只有当返回值为空时，该设置才算成功
     */
    String register(String nickName,String photoUrl,Date birth,boolean male,String depName,String nation,
                     long cardNum,String address,String natives,String party,String qualifications,String collage,
                     long phone, String email);

    /**
     * 修改某一项用户信息
     * @param message   新的用户信息
     * @param messageType   修改信息的类型
     * @return  提示信息
     *          只有当返回值为空时，该设置才成功
     */
    String resetOneMessageOfUser(Object message,String messageType);

    /**
     * 获取某一项用户基础信息（Message表中的信息，而不是登录用信息）
     * @param messageName   信息名称
     * @return  信息内容
     */
    Object getOneMessageOfUser(String messageName);

    /**
     * 获取用户信息验证的结果
     * @return true 与数据库中一致 false 与数据库中不一致
     */
    boolean checkPasswordResult();

    /**
     * 获取用户的昵称（不是登录用的用户名）
     * 在执行该方法前必须先执行过check方法
     * @return 用户名称
     */
    String getUserName();

    /**
     * 获取用户积分
     * @return 用户积分
     */
    int getIntegral();

    /**
     * @return 获得用户所在部门的名称
     */
    String getUserDepName();

    /**
     * @return  获取用户职位
     */
    String getUserPosition();

    /**
     * @return  获取用户余额
     */
    BigDecimal getUserBalance();

    /**
     * @return  获取用户代办事项
     */
    int getUserTodo();

    /**
     * @return 已登录则为true，否则为false
     */
    boolean checkxLogin();
}
