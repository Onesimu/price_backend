package com.pddz.price.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Userinfo {

 @Id
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

}
