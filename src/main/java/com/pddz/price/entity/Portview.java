package com.pddz.price.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Portview {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
  private String portId;
  private String nameEn;
  private String nameCn;
  private String code;
  private String countryId;
  private String state;
  private String routeLineAreaId;
  private String routeLineArea;
  private String routeLineAreaCode;
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
  private String countryNameCn;
  private String countryNameEn;
  private String countryCode;
  private String regionId;


  public String getPortId() {
    return portId;
  }

  public void setPortId(String portId) {
    this.portId = portId;
  }


  public String getNameEn() {
    return nameEn;
  }

  public void setNameEn(String nameEn) {
    this.nameEn = nameEn;
  }


  public String getNameCn() {
    return nameCn;
  }

  public void setNameCn(String nameCn) {
    this.nameCn = nameCn;
  }


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }


  public String getCountryId() {
    return countryId;
  }

  public void setCountryId(String countryId) {
    this.countryId = countryId;
  }


  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  public String getRouteLineAreaId() {
    return routeLineAreaId;
  }

  public void setRouteLineAreaId(String routeLineAreaId) {
    this.routeLineAreaId = routeLineAreaId;
  }


  public String getRouteLineArea() {
    return routeLineArea;
  }

  public void setRouteLineArea(String routeLineArea) {
    this.routeLineArea = routeLineArea;
  }


  public String getRouteLineAreaCode() {
    return routeLineAreaCode;
  }

  public void setRouteLineAreaCode(String routeLineAreaCode) {
    this.routeLineAreaCode = routeLineAreaCode;
  }


  public Long getIsCommon() {
    return isCommon;
  }

  public void setIsCommon(Long isCommon) {
    this.isCommon = isCommon;
  }


  public Long getFlag() {
    return flag;
  }

  public void setFlag(Long flag) {
    this.flag = flag;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public String getCreateStaffid() {
    return createStaffid;
  }

  public void setCreateStaffid(String createStaffid) {
    this.createStaffid = createStaffid;
  }


  public java.sql.Timestamp getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(java.sql.Timestamp updateTime) {
    this.updateTime = updateTime;
  }


  public String getUpdateStaffid() {
    return updateStaffid;
  }

  public void setUpdateStaffid(String updateStaffid) {
    this.updateStaffid = updateStaffid;
  }


  public String getHostId() {
    return hostId;
  }

  public void setHostId(String hostId) {
    this.hostId = hostId;
  }


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }


  public String getDeclareType() {
    return declareType;
  }

  public void setDeclareType(String declareType) {
    this.declareType = declareType;
  }


  public String getLongitude() {
    return longitude;
  }

  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }


  public String getLatitude() {
    return latitude;
  }

  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }


  public String getCountryNameCn() {
    return countryNameCn;
  }

  public void setCountryNameCn(String countryNameCn) {
    this.countryNameCn = countryNameCn;
  }


  public String getCountryNameEn() {
    return countryNameEn;
  }

  public void setCountryNameEn(String countryNameEn) {
    this.countryNameEn = countryNameEn;
  }


  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  public String getRegionId() {
    return regionId;
  }

  public void setRegionId(String regionId) {
    this.regionId = regionId;
  }

}
