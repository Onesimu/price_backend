package com.pddz.price.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Port {

 @Id
  private String portId;
  private String nameEn;
  private String nameCn;
  private String code;
  private String countryId;
  private String state;
  private String routeLineAreaId;
  private Long isCommon;
  private Long flag;
  private java.sql.Timestamp createTime;
  private String createStaffid;
  private java.sql.Timestamp updateTime;
  private String updateStaffid;
  private String hostId;
  private String remark;
  private String declareType;
  private String longitude;
  private String latitude;

}
