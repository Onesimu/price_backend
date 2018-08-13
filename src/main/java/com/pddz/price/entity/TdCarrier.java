package com.pddz.price.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class TdCarrier {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
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


  public String getCarrierId() {
    return carrierId;
  }

  public void setCarrierId(String carrierId) {
    this.carrierId = carrierId;
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


  public String getCompanyId() {
    return companyId;
  }

  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }


  public String getCountryId() {
    return countryId;
  }

  public void setCountryId(String countryId) {
    this.countryId = countryId;
  }


  public String getContainerCode() {
    return containerCode;
  }

  public void setContainerCode(String containerCode) {
    this.containerCode = containerCode;
  }


  public String getLogoUrlSmall() {
    return logoUrlSmall;
  }

  public void setLogoUrlSmall(String logoUrlSmall) {
    this.logoUrlSmall = logoUrlSmall;
  }


  public String getLogoUrlBig() {
    return logoUrlBig;
  }

  public void setLogoUrlBig(String logoUrlBig) {
    this.logoUrlBig = logoUrlBig;
  }


  public String getContact() {
    return contact;
  }

  public void setContact(String contact) {
    this.contact = contact;
  }


  public String getTel() {
    return tel;
  }

  public void setTel(String tel) {
    this.tel = tel;
  }


  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }


  public String getFax() {
    return fax;
  }

  public void setFax(String fax) {
    this.fax = fax;
  }


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public String getTrackUrl() {
    return trackUrl;
  }

  public void setTrackUrl(String trackUrl) {
    this.trackUrl = trackUrl;
  }


  public String getRarUrl() {
    return rarUrl;
  }

  public void setRarUrl(String rarUrl) {
    this.rarUrl = rarUrl;
  }


  public Double getTaxRate() {
    return taxRate;
  }

  public void setTaxRate(Double taxRate) {
    this.taxRate = taxRate;
  }


  public Long getIsWaipei() {
    return isWaipei;
  }

  public void setIsWaipei(Long isWaipei) {
    this.isWaipei = isWaipei;
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


  public String getDealTypeId() {
    return dealTypeId;
  }

  public void setDealTypeId(String dealTypeId) {
    this.dealTypeId = dealTypeId;
  }

}
