/**
 * Copyright (C), 2018-2018, XXX有限公司
 * FileName: NowUserServiceImpl
 * Author:   Administrator
 * Date:     2018/10/15 20:35
 * Description: NowUserService的实现类
 * History:
 * <author>          <time>          <version>          <desc>
 * qiaozhen         修改时间          版本号             描述
 */
package com.github.qiaozhen9636.thoundcloudmanager.user.service.impl;

import com.github.qiaozhen9636.thoundcloudmanager.user.beans.BaseUser;
import com.github.qiaozhen9636.thoundcloudmanager.user.beans.Department;
import com.github.qiaozhen9636.thoundcloudmanager.user.mappers.UserDao;
import com.github.qiaozhen9636.thoundcloudmanager.user.service.DepartmentService;
import com.github.qiaozhen9636.thoundcloudmanager.user.service.NowUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 〈一句话功能简述〉<br> 
 * 〈NowUserService的实现类〉
 *
 * @author Administrator
 * @create 2018/10/15
 * @since 1.0.0
 */
@Service
public class NowUserServiceImpl implements NowUserService {
    @Autowired
    private BaseUser baseUser;
    @Autowired
    private BaseUser DEFBASEUSER;
    @Autowired
    private UserDao userDao;
    @Autowired
    DepartmentService depService;
    private String password="uninited";

    public boolean findUser(String userName, String password) {
        this.password=password;
        baseUser = userDao.findUserStatusByLoginName(userName);
        System.out.println(baseUser);
        return baseUser.getuId()!=-1;
    }

    public String getDepartmentName() {
        depService.findDepartmentByDepId(baseUser.getDepId());
        return depService.getDepartmentName();
    }

    public String getUserPosition() {
        Department department = depService.findDepartmentByDepId(baseUser.getDepId());
        BaseUser depLeader = department.getDepLeader();
        System.err.println(department);
        if (baseUser.getuName().equals(depLeader.getuName()))return department.getDepClassName();
        else return "职工";
    }

    @Override
    public void setSalt(String salt) {
        userDao.insertSalt(baseUser.getuId(),salt);
    }

    public void setBaseUser(BaseUser baseUser) {
        this.baseUser = baseUser;
    }

    public BaseUser getBaseUserData() {
        return baseUser;
    }

    public boolean checkPassword() {
        return baseUser.getuPassword().equals(password);
    }

    public void setUserLoginType(boolean b) {
        if (b){
            baseUser.setuLoginType(1);
            userDao.setUserLoginType(baseUser.getuId(),1);
        }else {
            baseUser.setuLoginType(0);
            userDao.setUserLoginType(baseUser.getuId(),0);
        }
    }

    public int getuLoginType() {
        return baseUser.getuLoginType();
    }
}
