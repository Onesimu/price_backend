package com.pddz.price.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Userinfo {

 @Id
// @GeneratedValue(strategy = GenerationType.IDENTITY)
  private String staffId;
  private String hostId;
  private String password;
  private String companyId;
  private String departmentId;
  private String staffName;
  private String contacts;
  private String tel;
  private String email;
  private String emailpwd;
  private String fax;
  private Long flag;
  private String remark;
  private String createStaffid;
  private java.sql.Timestamp createTime;
  private String updateStaffid;
  private java.sql.Timestamp updateTime;
  private java.sql.Timestamp exptime;
  private Long logintype;


  public String getStaffId() {
    return staffId;
  }

  public void setStaffId(String staffId) {
    this.staffId = staffId;
  }


  public String getHostId() {
    return hostId;
  }

  public void setHostId(String hostId) {
    this.hostId = hostId;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public String getCompanyId() {
    return companyId;
  }

  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }


  public String getDepartmentId() {
    return departmentId;
  }

  public void setDepartmentId(String departmentId) {
    this.departmentId = departmentId;
  }


  public String getStaffName() {
    return staffName;
  }

  public void setStaffName(String staffName) {
    this.staffName = staffName;
  }


  public String getContacts() {
    return contacts;
  }

  public void setContacts(String contacts) {
    this.contacts = contacts;
  }


  public String getTel() {
    return tel;
  }

  public void setTel(String tel) {
    this.tel = tel;
  }


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public String getEmailpwd() {
    return emailpwd;
  }

  public void setEmailpwd(String emailpwd) {
    this.emailpwd = emailpwd;
  }


  public String getFax() {
    return fax;
  }

  public void setFax(String fax) {
    this.fax = fax;
  }


  public Long getFlag() {
    return flag;
  }

  public void setFlag(Long flag) {
    this.flag = flag;
  }


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }


  public String getCreateStaffid() {
    return createStaffid;
  }

  public void setCreateStaffid(String createStaffid) {
    this.createStaffid = createStaffid;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public String getUpdateStaffid() {
    return updateStaffid;
  }

  public void setUpdateStaffid(String updateStaffid) {
    this.updateStaffid = updateStaffid;
  }


  public java.sql.Timestamp getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(java.sql.Timestamp updateTime) {
    this.updateTime = updateTime;
  }


  public java.sql.Timestamp getExptime() {
    return exptime;
  }

  public void setExptime(java.sql.Timestamp exptime) {
    this.exptime = exptime;
  }


  public Long getLogintype() {
    return logintype;
  }

  public void setLogintype(Long logintype) {
    this.logintype = logintype;
  }

}
