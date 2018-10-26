/**
 * Copyright (C), 2018-2018, XXX有限公司
 * FileName: NowUserService
 * Author:   Administrator
 * Date:     2018/10/15 19:15
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * qiaozhen         修改时间          版本号             描述
 */
package com.github.qiaozhen9636.thoundcloudmanager.user.service;

import com.github.qiaozhen9636.thoundcloudmanager.user.beans.BaseUser;

public interface NowUserService {
    BaseUser getBaseUserData();

    boolean checkPassword();

    void setUserLoginType(boolean b);

    int getuLoginType();

    boolean findUser(String userName, String password);

    String getDepartmentName();

    String getUserPosition();

    void setSalt(String salt);
}
