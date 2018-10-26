/**
 * Copyright (C), 2018-2018, XXX有限公司
 * FileName: DepDataService
 * Author:   Administrator
 * Date:     2018/10/19 12:14
 * Description: 部门相关服务
 * History:
 * <author>          <time>          <version>          <desc>
 * qiaozhen         修改时间          版本号             描述
 */
package com.github.qiaozhen9636.thoundcloudmanager.user.output;

import com.github.qiaozhen9636.thoundcloudmanager.user.beans.UserDetial;

import java.util.List;

public interface DepDataService {


    /**
     * @param id
     * @return
     */
    public boolean createDepDataService(int id);

    /**
     * @param name
     * @return
     */
    public boolean createDepDataService(String name);



    /**
     * @return 获取部门名称
     */
    String getDepartmentName();

    /**
     * @return 当前部门级别
     */
    int getDepartmentLevel();

    /**
     * @return 获取部门负责人昵称
     */
    String getDepartmentLeaderName();

    /**
     * @return 获得部门负责人头像
     */
    String getDepartmentLeaderHeadPhoto();

    /**
     * @return 获取部门负责人在线状态
     */
    boolean isDepartmentLeaderLogin();

    /**
     * @return 获取部门负责人联系方式
     */
    long getDepartmentLeaderPhone();


    /**
     * @return 获取部门联系人邮箱
     */
    String getDepartmentLeaderEmain();

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
     * @return 部门成员名单
     */
    List<String> getDepartmentMemberNameList();

    /**
     * @return 部门成员登录名称列表
     */
    List<String> getDepartmentMemberUserNameList();

    /**
     * @param userName 目标用户名
     * @return 该用户的登录状态
     */
    int getMemberLoginTypeByUserName(String userName);

    /**
     * @param userName 目标用户名
     * @return 用户的待办事项数量
     */
    int getMemberTODOByUserName(String userName);



    /**
     * @return 部门成员详细信息名单
     */
    List<UserDetial> getDepartmentMemberMessageList();

    /**
     * @return 获取所有上级部门名称
     */
    List<String> getParentDepNames();

    /**
     * @return 获取上一级部门名称
     */
    String getParentDepName();

    /**
     * 获取某个层级的所有部门名称
     * @param level 部门级别
     * @return 部门名称列表
     */
    List<String> getDepartmentNamesByLevel(int level);

    /**
     * @return 检查是此Service否创建
     */
    boolean checkCreate();
}
