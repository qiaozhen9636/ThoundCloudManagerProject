/**
 * Copyright (C), 2018-2018, XXX有限公司
 * FileName: RedisService
 * Author:   Administrator
 * Date:     2018/10/15 19:05
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * qiaozhen         修改时间          版本号             描述
 */
package com.github.qiaozhen9636.thoundcloudmanager.user.service;

import com.github.qiaozhen9636.thoundcloudmanager.user.beans.BaseUser;
import org.springframework.stereotype.Service;

@Service
public interface RedisService {

    void setUserData(BaseUser baseUserData);
}
