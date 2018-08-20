package com.pddz.price.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Carrier {

 @Id
  private String carrierId;
  private String nameEn;
  private String nameCn;
  private String code;
  private String companyId;
  private String countryId;
  private String containerCode;
  private String logoUrlSmall;
  private String logoUrlBig;
  private String contact;
  private String tel;
  private String mobile;
  private String fax;
  private String email;
  private String address;
  private String trackUrl;
  private String rarUrl;
  private Double taxRate;
  private Long isWaipei;
  private Long flag;
  private java.sql.Timestamp createTime;
  private String createStaffid;
  private java.sql.Timestamp updateTime;
  private String updateStaffid;
  private String hostId;
  private String remark;
  private String dealTypeId;

}
