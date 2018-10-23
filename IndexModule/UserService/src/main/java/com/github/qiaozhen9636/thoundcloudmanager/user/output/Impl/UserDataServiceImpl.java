/**
 * Copyright (C), 2018-2018, XXX有限公司
 * FileName: UserDataServiceImpl
 * Author:   Administrator
 * Date:     2018/10/15 12:22
 * Description: UserData的实现类
 * History:
 * <author>          <time>          <version>          <desc>
 * qiaozhen         修改时间          版本号             描述
 */
package com.github.qiaozhen9636.thoundcloudmanager.user.output.Impl;

import com.github.qiaozhen9636.thoundcloudmanager.user.output.UserDataService;
import com.github.qiaozhen9636.thoundcloudmanager.user.service.DepartmentService;
import com.github.qiaozhen9636.thoundcloudmanager.user.service.NowUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 〈一句话功能简述〉<br>
 * 〈UserData的实现类〉
 *
 * @author Administrator
 * @create 2018/10/15
 * @since 1.0.0
 */
@Service(value = "UserDataService")
public class UserDataServiceImpl implements UserDataService {

    @Autowired
    private NowUserService userService;
    @Autowired
    private DepartmentService testService;
//    private AllUserService dataService;


    public int test() {
        testService.findDepartmentByDepId(2);
        return testService.getParentId();
    }

    public String createUserDataService(String userName, String password) {
        if (userService != null) {
            if (!userService.findUser(userName, password)) {
                System.out.println("未找到用户");
                return "未找到用户";
            } else {
                System.out.println("已找到用户");
                if (userService.getuLoginType() == 0) {
                    System.out.println("用户未登录,开始验证账户密码");
                    if (this.checkPasswordResult()) {
                        System.out.println("用户名密码一致，开始修改登录状态");
                        userService.setUserLoginType(true);
                        System.out.println("正在设置用户:" + userName + " / " + password);
                    } else {
                        System.out.println("用户名与密码不匹配");
                        return "用户名与密码不匹配";
                    }
                } else {
                    System.out.println("用户已登录");
                    return "用户已登录";
                }
            }
        }
        return null;
    }

    public String resetUserDataService(String UserName, String password) {
        removeUserDataService();
        return createUserDataService(UserName,password);
    }

    public void removeUserDataService() {
        userService.setUserLoginType(false);
    }



    public String register(String nickName, String photoUrl, Date birth, boolean male, String depName, String nation, long cardNum, String address, String natives, String party, String qualifications, String collage, long phone, String email) {
        return null;
//        dataService.addUser(nickName,photoUrl,birth,male,depName,nation,cardNum,address,natives
//                ,party,qualifications,collage,phone,email);
    }

    public String resetOneMessageOfUser(Object message, String messageType) {
        return null;
    }

    public Object getOneMessageOfUser(String messageName) {
        return null;
    }

    public boolean checkPasswordResult() {
        return userService.checkPassword();
    }

    public String getUserName() {
        return userService.getBaseUserData().getuName();
    }

    public int getIntegral() {
        return userService.getBaseUserData().getuIntegeral();
    }

    public String getUserDepName() {
        return userService.getDepartmentName();
    }

    public String getUserPosition() {
        return userService.getUserPosition();
    }

    public BigDecimal getUserBalance() {
        return userService.getBaseUserData().getuBalance();
    }

    public int getUserTodo() {
        return userService.getBaseUserData().getuTODO();
    }

    public boolean checkxLogin() {
        return userService.getuLoginType()==1;
    }
}
