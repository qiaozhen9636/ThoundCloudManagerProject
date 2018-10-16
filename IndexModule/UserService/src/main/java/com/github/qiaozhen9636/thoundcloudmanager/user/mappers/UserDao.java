/**
 * Copyright (C), 2018-2018, XXX有限公司
 * FileName: UserDao
 * Author:   Administrator
 * Date:     2018/10/15 21:12
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * qiaozhen         修改时间          版本号             描述
 */
package com.github.qiaozhen9636.thoundcloudmanager.user.mappers;

import com.github.qiaozhen9636.thoundcloudmanager.user.beans.BaseUser;
import org.apache.ibatis.annotations.Param;

public interface UserDao {

    BaseUser findUserStatusByLoginName(String name);

    void setUserLoginType(@Param(value = "uid") int getuId,@Param(value = "type") int i);
}
