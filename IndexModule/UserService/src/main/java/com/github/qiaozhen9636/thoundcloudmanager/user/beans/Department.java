/**
 * Copyright (C), 2018-2018, XXX有限公司
 * FileName: DepentMent
 * Author:   Administrator
 * Date:     2018/10/15 19:31
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * qiaozhen         修改时间          版本号             描述
 */
package com.github.qiaozhen9636.thoundcloudmanager.user.beans;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2018/10/15
 * @since 1.0.0
 */
@Component
public class Department {
    private int depId;
    private String depName;
    private BaseUser depLeader;
    private int depLevel;
    private List<String> DepFuns;
    private List<String> DepPlaces;

    public Department() {
    }

    public Department(int depId, String depName, BaseUser depLeader, int depLevel, List<String> depFuns, List<String> depPlaces) {
        this.depId = depId;
        this.depName = depName;
        this.depLeader = depLeader;
        this.depLevel = depLevel;
        DepFuns = depFuns;
        DepPlaces = depPlaces;
    }

    public int getDepId() {
        return depId;
    }

    public void setDepId(int depId) {
        this.depId = depId;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public BaseUser getDepLeader() {
        return depLeader;
    }

    public void setDepLeader(BaseUser depLeader) {
        this.depLeader = depLeader;
    }

    public int getDepLevel() {
        return depLevel;
    }

    public void setDepLevel(int depLevel) {
        this.depLevel = depLevel;
    }

    public List<String> getDepFuns() {
        return DepFuns;
    }

    public void setDepFuns(List<String> depFuns) {
        DepFuns = depFuns;
    }

    public List<String> getDepPlaces() {
        return DepPlaces;
    }

    public void setDepPlaces(List<String> depPlaces) {
        DepPlaces = depPlaces;
    }

    @Override
    public String toString() {
        return "Department{" +
                "depId=" + depId +
                ", depName='" + depName + '\'' +
                ", depLeader=" + depLeader +
                ", depLevel=" + depLevel +
                ", DepFuns=" + DepFuns +
                ", DepPlaces=" + DepPlaces +
                '}';
    }
}
