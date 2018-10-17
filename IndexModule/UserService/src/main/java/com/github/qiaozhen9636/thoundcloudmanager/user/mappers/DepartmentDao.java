/**
 * Copyright (C), 2018-2018, XXX有限公司
 * FileName: DepartmentDao
 * Author:   Administrator
 * Date:     2018/10/17 20:28
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * qiaozhen         修改时间          版本号             描述
 */
package com.github.qiaozhen9636.thoundcloudmanager.user.mappers;

import com.github.qiaozhen9636.thoundcloudmanager.user.beans.Department;

import java.util.List;

public interface DepartmentDao {
    Department findDepartmentByDepId(int depId);

    Department findDepartmentByDepName(String depName);
//
//    String getFunctionsByName(String function);
//
//    String getDepPlaceByName(String office);

    List<String> getDepsByLevel(int level);

    String findParentName(int depId);
}
