/**
 * Copyright (C), 2018-2018, XXX有限公司
 * FileName: DepartmentServiceImpl
 * Author:   Administrator
 * Date:     2018/10/17 19:05
 * Description: DepartmentService的实现类
 * History:
 * <author>          <time>          <version>          <desc>
 * qiaozhen         修改时间          版本号             描述
 */
package com.github.qiaozhen9636.thoundcloudmanager.user.service.impl;

import com.github.qiaozhen9636.thoundcloudmanager.user.beans.BaseUser;
import com.github.qiaozhen9636.thoundcloudmanager.user.beans.Department;
import com.github.qiaozhen9636.thoundcloudmanager.user.mappers.DepartmentDao;
import com.github.qiaozhen9636.thoundcloudmanager.user.mappers.UserDao;
import com.github.qiaozhen9636.thoundcloudmanager.user.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈DepartmentService的实现类〉
 *
 * @author Administrator
 * @create 2018/10/17
 * @since 1.0.0
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    DepartmentDao depDao;
    @Autowired
    UserDao userDao;
    @Autowired
    Department department;
    public Department findDepartmentByDepId(int depId) {
        System.out.println("1");
        department = depDao.findDepartmentByDepId(depId);
        return department;
    }

    public Department findDepartmentByDepName(String depName) {
        department = depDao.findDepartmentByDepName(depName);
        return department;
    }

    public String getDepartmentName() {
        return department.getDepName();
    }

    public int getDepartmentLevel() {
        return department.getDepLevel();
    }

    public BaseUser getDepartmentLeader() {
        return department.getDepLeader();
    }

    public List<String> getDepartmentFunctions() {
        return department.getDepFuns();
    }

    public String getFunctionOfDepartment(String function) {
        return null;
//        depDao.getFunctionsByName(function);
    }

    public List<String> getDepartmentOffice() {
        return department.getDepPlaces();
    }

    public String getOfficeOfDepartmentName(String office) {
        return null;
//        depDao.getDepPlaceByName(office);
    }

    public List<String> getDepartmentNamesByLevel(int level) {
        return depDao.getDepsByLevel(level);
    }

    public BaseUser getParentLeader() {
        return department.getDepLeader();
    }

    public String getParentName() {
        return depDao.findParentName(department.getDepId());
    }
}
