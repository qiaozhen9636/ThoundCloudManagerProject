/**
 * Copyright (C), 2018-2018, XXX有限公司
 * FileName: UserDetial
 * Author:   Administrator
 * Date:     2018/10/17 17:35
 * Description: 用户的详情信息bean
 * History:
 * <author>          <time>          <version>          <desc>
 * qiaozhen         修改时间          版本号             描述
 */
package com.github.qiaozhen9636.thoundcloudmanager.user.beans;

import java.util.Date;

/**
 * 〈一句话功能简述〉<br> 
 * 〈用户的详情信息bean〉
 *
 * @author Administrator
 * @create 2018/10/17
 * @since 1.0.0
 */

public class UserDetial {
    private String nickName;
    private String photoUrl;
    private Date birth;
    private boolean male;
    private int depId;
    private String nation;
    private long cardNum;
    private String address;
    private String natives;
    private String party;
    private String qualifications;
    private String collage;
    private long phone;
    private String email;

    public UserDetial() {
    }

    public UserDetial(String nickName, String photoUrl, Date birth, boolean male, int depId, String nation, long cardNum, String address, String natives, String party, String qualifications, String collage, long phone, String email) {
        this.nickName = nickName;
        this.photoUrl = photoUrl;
        this.birth = birth;
        this.male = male;
        this.depId = depId;
        this.nation = nation;
        this.cardNum = cardNum;
        this.address = address;
        this.natives = natives;
        this.party = party;
        this.qualifications = qualifications;
        this.collage = collage;
        this.phone = phone;
        this.email = email;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    public int getDepId() {
        return depId;
    }

    public void setDepId(int depId) {
        this.depId = depId;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public long getCardNum() {
        return cardNum;
    }

    public void setCardNum(long cardNum) {
        this.cardNum = cardNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNatives() {
        return natives;
    }

    public void setNatives(String natives) {
        this.natives = natives;
    }

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }

    public String getQualifications() {
        return qualifications;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }

    public String getCollage() {
        return collage;
    }

    public void setCollage(String collage) {
        this.collage = collage;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserDetial{" +
                "nickName='" + nickName + '\'' +
                ", photoUrl='" + photoUrl + '\'' +
                ", birth=" + birth +
                ", male=" + male +
                ", depId=" + depId +
                ", nation='" + nation + '\'' +
                ", cardNum=" + cardNum +
                ", address='" + address + '\'' +
                ", natives='" + natives + '\'' +
                ", party='" + party + '\'' +
                ", qualifications='" + qualifications + '\'' +
                ", collage='" + collage + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                '}';
    }
}
