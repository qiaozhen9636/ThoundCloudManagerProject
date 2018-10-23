/**
 * Copyright (C), 2018-2018, XXX有限公司
 * FileName: DepDataServiceImpl
 * Author:   Administrator
 * Date:     2018/10/19 14:46
 * Description: 部门输出实现类
 * History:
 * <author>          <time>          <version>          <desc>
 * qiaozhen         修改时间          版本号             描述
 */
package com.github.qiaozhen9636.thoundcloudmanager.user.output.Impl;

import com.github.qiaozhen9636.thoundcloudmanager.user.beans.BaseUser;
import com.github.qiaozhen9636.thoundcloudmanager.user.beans.UserDetial;
import com.github.qiaozhen9636.thoundcloudmanager.user.output.DepDataService;
import com.github.qiaozhen9636.thoundcloudmanager.user.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈部门输出实现类〉
 *
 * @author Administrator
 * @create 2018/10/19
 * @since 1.0.0
 */
@Service("DepDataService")
public class DepDataServiceImpl implements DepDataService{

    @Autowired
    DepartmentService depService;


    public boolean createDepDataService(int id) {
        if (depService.findDepartmentByDepId(id) != null) {
            return true;
        }else {
            return false;
        }
    }

    public boolean createDepDataService(String name) {
        if (depService.findDepartmentByDepName(name) != null) {
            return true;
        }else {
            return false;
        }
    }

    public String getDepartmentName() {
        return depService.getDepartmentName();
    }

    public int getDepartmentLevel() {
        return depService.getDepartmentLevel();
    }

    public String getDepartmentLeaderName() {
        return depService.getDepartmentLeader().getuName();
    }

    public String getDepartmentLeaderHeadPhoto() {
        return depService.getDepartmentLeader().getuHeadUrl();
    }

    public boolean isDepartmentLeaderLogin() {
        if (depService.getDepartmentLeader().getuLoginType()==1)return true;
        else return false;
    }

    public long getDepartmentLeaderPhone() {
        return 0;
    }

    public String getDepartmentLeaderEmain() {
        return null;
    }

    public List<String> getDepartmentFunctions() {
        return depService.getDepartmentFunctions();
    }

    public String getFunctionOfDepartment(String function) {
        return depService.getFunctionOfDepartment(function);
    }

    public List<String> getDepartmentOffice() {
        return depService.getDepartmentOffice();
    }

    public String getOfficeOfDepartmentName(String office) {
        return depService.getOfficeOfDepartmentName(office);
    }

    public List<BaseUser> getDepartmentMemberList() {
        return null;
    }

    public List<UserDetial> getDepartmentMemberMessageList() {
        return null;
    }

    public List<String> getParentDepNames() {
        List<String> resultList = new ArrayList<String>();
        String name = this.getDepartmentName();
        int id=-1;
        while (id!=0){
             id = depService.getParentId();
            depService.findDepartmentByDepId(id);
            resultList.add(depService.getDepartmentName());
        }
        depService.findDepartmentByDepName(name);
        return resultList;
    }

    public String getParentDepName() {
        String name = this.getDepartmentName();
        int id = depService.getParentId();
        String resultName = depService.findDepartmentByDepId(id).getDepName();
        depService.findDepartmentByDepName(name);
        return resultName;
    }

    public List<String> getDepartmentNamesByLevel(int level) {
        return depService.getDepartmentNamesByLevel(level);
    }
}
