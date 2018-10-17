/**
 * Copyright (C), 2018-2018, XXX有限公司
 * FileName: DepartmentService
 * Author:   Administrator
 * Date:     2018/10/17 12:11
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * qiaozhen         修改时间          版本号             描述
 */
package com.github.qiaozhen9636.thoundcloudmanager.user.service;

import com.github.qiaozhen9636.thoundcloudmanager.user.beans.BaseUser;
import com.github.qiaozhen9636.thoundcloudmanager.user.beans.Department;

import java.util.List;

public interface DepartmentService {
    /**
     * 通过部门id查找设置部门
     * @param depId 部门id
     */
    Department findDepartmentByDepId(int depId);

    /**
     * 通过部门名称查找设置部门
     * @param depName
     */
    Department findDepartmentByDepName(String depName);

    /**
     * @return 获取部门名称
     */
    String getDepartmentName();

    /**
     * @return 当前部门级别
     */
    int getDepartmentLevel();

    /**
     * @return 获取部门负责人信息
     */
    BaseUser getDepartmentLeader();

//    /**
//     * @return 部门成员基础信息名单
//     */
//    List<BaseUser> getDepartmentMemberList();
//
//    /**
//     * @return 部门成员详细信息名单
//     */
//    List<UserDetial> getDepartmentMemberMessageList();

    /**
     * 获取部门职能
     * @return 部门职能列表
     */
    List<String> getDepartmentFunctions();

    /**
     * @param function 职能名称
     * @return  有该职能的部门
     */
    String getFunctionOfDepartment(String function);

    /**
     * 获取部门工作地点信息
     * @return 部门工作地点信息
     */
    List<String> getDepartmentOffice();

    /**
     * @param office 工作地点名称
     * @return  工作地点所属部门名称
     */
    String getOfficeOfDepartmentName(String office);

    /**
     * 获取某个层级的所有部门名称
     * @param level 部门级别
     * @return 部门名称列表
     */
    List<String> getDepartmentNamesByLevel(int level);

    /**
     * 获得上级部门领导人信息
     * @return 上级领导人信息
     */
    BaseUser getParentLeader();

    /**
     * 获得上级部门名称
     * @return 上级部门名称
     */
    String getParentName();
}
