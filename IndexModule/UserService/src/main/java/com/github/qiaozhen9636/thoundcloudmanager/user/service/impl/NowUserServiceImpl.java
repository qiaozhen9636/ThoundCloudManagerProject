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
import com.github.qiaozhen9636.thoundcloudmanager.user.mappers.UserDao;
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
    private UserDao userDao;
    private String password="uninited";
    public boolean findUser(String userName, String password) {
        this.password=password;
        baseUser = userDao.findUserStatusByLoginName(userName);
        return baseUser.getuId()!=-1;
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
