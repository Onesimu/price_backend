package com.pddz.price.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class TdSeaexpressprice {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
  private String sePriceId;
  private String routeLinePortLoadId;
  private String routeLinePortDischargeId;
  private String transPortId;
  private java.sql.Timestamp fromDate;
  private java.sql.Timestamp toDate;
  private Long isAvl20Gp;
  private Double costPrice20Gp;
  private Double minPrice20Gp;
  private Double refPrice20Gp;
  private Double maxPrice20Gp;
  private Long isAvl40Gp;
  private Double costPrice40Gp;
  private Double minPrice40Gp;
  private Double refPrice40Gp;
  private Double maxPrice40Gp;
  private Long isAvl40Hc;
  private Double costPrice40Hc;
  private Double minPrice40Hc;
  private Double refPrice40Hc;
  private Double maxPrice40Hc;
  private Double roadPrice20Gp;
  private Double roadPrice40Gp;
  private Double roadPrice40Hc;
  private String overWeightRemark;
  private String additionalRemark;
  private String specialRemark;
  private String inSpecialRemark;
  private String transTypeId;
  private String contractNo;
  private String waiPeiCompanyId;
  private Long flag;
  private java.sql.Timestamp createTime;
  private String createStaffid;
  private java.sql.Timestamp updateTime;
  private String updateStaffid;
  private String hostId;
  private String remark;
  private Long isCbc20Gp;
  private Long isCbc40Gp;
  private Long isCbc40Hc;
  private Double publicPrice20Gp;
  private Double publicPrice40Gp;
  private Double publicPrice40Hc;


  public String getSePriceId() {
    return sePriceId;
  }

  public void setSePriceId(String sePriceId) {
    this.sePriceId = sePriceId;
  }


  public String getRouteLinePortLoadId() {
    return routeLinePortLoadId;
  }

  public void setRouteLinePortLoadId(String routeLinePortLoadId) {
    this.routeLinePortLoadId = routeLinePortLoadId;
  }


  public String getRouteLinePortDischargeId() {
    return routeLinePortDischargeId;
  }

  public void setRouteLinePortDischargeId(String routeLinePortDischargeId) {
    this.routeLinePortDischargeId = routeLinePortDischargeId;
  }


  public String getTransPortId() {
    return transPortId;
  }

  public void setTransPortId(String transPortId) {
    this.transPortId = transPortId;
  }


  public java.sql.Timestamp getFromDate() {
    return fromDate;
  }

  public void setFromDate(java.sql.Timestamp fromDate) {
    this.fromDate = fromDate;
  }


  public java.sql.Timestamp getToDate() {
    return toDate;
  }

  public void setToDate(java.sql.Timestamp toDate) {
    this.toDate = toDate;
  }


  public Long getIsAvl20Gp() {
    return isAvl20Gp;
  }

  public void setIsAvl20Gp(Long isAvl20Gp) {
    this.isAvl20Gp = isAvl20Gp;
  }


  public Double getCostPrice20Gp() {
    return costPrice20Gp;
  }

  public void setCostPrice20Gp(Double costPrice20Gp) {
    this.costPrice20Gp = costPrice20Gp;
  }


  public Double getMinPrice20Gp() {
    return minPrice20Gp;
  }

  public void setMinPrice20Gp(Double minPrice20Gp) {
    this.minPrice20Gp = minPrice20Gp;
  }


  public Double getRefPrice20Gp() {
    return refPrice20Gp;
  }

  public void setRefPrice20Gp(Double refPrice20Gp) {
    this.refPrice20Gp = refPrice20Gp;
  }


  public Double getMaxPrice20Gp() {
    return maxPrice20Gp;
  }

  public void setMaxPrice20Gp(Double maxPrice20Gp) {
    this.maxPrice20Gp = maxPrice20Gp;
  }


  public Long getIsAvl40Gp() {
    return isAvl40Gp;
  }

  public void setIsAvl40Gp(Long isAvl40Gp) {
    this.isAvl40Gp = isAvl40Gp;
  }


  public Double getCostPrice40Gp() {
    return costPrice40Gp;
  }

  public void setCostPrice40Gp(Double costPrice40Gp) {
    this.costPrice40Gp = costPrice40Gp;
  }


  public Double getMinPrice40Gp() {
    return minPrice40Gp;
  }

  public void setMinPrice40Gp(Double minPrice40Gp) {
    this.minPrice40Gp = minPrice40Gp;
  }


  public Double getRefPrice40Gp() {
    return refPrice40Gp;
  }

  public void setRefPrice40Gp(Double refPrice40Gp) {
    this.refPrice40Gp = refPrice40Gp;
  }


  public Double getMaxPrice40Gp() {
    return maxPrice40Gp;
  }

  public void setMaxPrice40Gp(Double maxPrice40Gp) {
    this.maxPrice40Gp = maxPrice40Gp;
  }


  public Long getIsAvl40Hc() {
    return isAvl40Hc;
  }

  public void setIsAvl40Hc(Long isAvl40Hc) {
    this.isAvl40Hc = isAvl40Hc;
  }


  public Double getCostPrice40Hc() {
    return costPrice40Hc;
  }

  public void setCostPrice40Hc(Double costPrice40Hc) {
    this.costPrice40Hc = costPrice40Hc;
  }


  public Double getMinPrice40Hc() {
    return minPrice40Hc;
  }

  public void setMinPrice40Hc(Double minPrice40Hc) {
    this.minPrice40Hc = minPrice40Hc;
  }


  public Double getRefPrice40Hc() {
    return refPrice40Hc;
  }

  public void setRefPrice40Hc(Double refPrice40Hc) {
    this.refPrice40Hc = refPrice40Hc;
  }


  public Double getMaxPrice40Hc() {
    return maxPrice40Hc;
  }

  public void setMaxPrice40Hc(Double maxPrice40Hc) {
    this.maxPrice40Hc = maxPrice40Hc;
  }


  public Double getRoadPrice20Gp() {
    return roadPrice20Gp;
  }

  public void setRoadPrice20Gp(Double roadPrice20Gp) {
    this.roadPrice20Gp = roadPrice20Gp;
  }


  public Double getRoadPrice40Gp() {
    return roadPrice40Gp;
  }

  public void setRoadPrice40Gp(Double roadPrice40Gp) {
    this.roadPrice40Gp = roadPrice40Gp;
  }


  public Double getRoadPrice40Hc() {
    return roadPrice40Hc;
  }

  public void setRoadPrice40Hc(Double roadPrice40Hc) {
    this.roadPrice40Hc = roadPrice40Hc;
  }


  public String getOverWeightRemark() {
    return overWeightRemark;
  }

  public void setOverWeightRemark(String overWeightRemark) {
    this.overWeightRemark = overWeightRemark;
  }


  public String getAdditionalRemark() {
    return additionalRemark;
  }

  public void setAdditionalRemark(String additionalRemark) {
    this.additionalRemark = additionalRemark;
  }


  public String getSpecialRemark() {
    return specialRemark;
  }

  public void setSpecialRemark(String specialRemark) {
    this.specialRemark = specialRemark;
  }


  public String getInSpecialRemark() {
    return inSpecialRemark;
  }

  public void setInSpecialRemark(String inSpecialRemark) {
    this.inSpecialRemark = inSpecialRemark;
  }


  public String getTransTypeId() {
    return transTypeId;
  }

  public void setTransTypeId(String transTypeId) {
    this.transTypeId = transTypeId;
  }


  public String getContractNo() {
    return contractNo;
  }

  public void setContractNo(String contractNo) {
    this.contractNo = contractNo;
  }


  public String getWaiPeiCompanyId() {
    return waiPeiCompanyId;
  }

  public void setWaiPeiCompanyId(String waiPeiCompanyId) {
    this.waiPeiCompanyId = waiPeiCompanyId;
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


  public Long getIsCbc20Gp() {
    return isCbc20Gp;
  }

  public void setIsCbc20Gp(Long isCbc20Gp) {
    this.isCbc20Gp = isCbc20Gp;
  }


  public Long getIsCbc40Gp() {
    return isCbc40Gp;
  }

  public void setIsCbc40Gp(Long isCbc40Gp) {
    this.isCbc40Gp = isCbc40Gp;
  }


  public Long getIsCbc40Hc() {
    return isCbc40Hc;
  }

  public void setIsCbc40Hc(Long isCbc40Hc) {
    this.isCbc40Hc = isCbc40Hc;
  }


  public Double getPublicPrice20Gp() {
    return publicPrice20Gp;
  }

  public void setPublicPrice20Gp(Double publicPrice20Gp) {
    this.publicPrice20Gp = publicPrice20Gp;
  }


  public Double getPublicPrice40Gp() {
    return publicPrice40Gp;
  }

  public void setPublicPrice40Gp(Double publicPrice40Gp) {
    this.publicPrice40Gp = publicPrice40Gp;
  }


  public Double getPublicPrice40Hc() {
    return publicPrice40Hc;
  }

  public void setPublicPrice40Hc(Double publicPrice40Hc) {
    this.publicPrice40Hc = publicPrice40Hc;
  }

}
