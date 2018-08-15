package com.pddz.price.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Seaexpresspriceview {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String sePriceId;
    private String routeLinePortLoadId;
    private String routeLinePortLoadNameCn;
    private String routeLinePortDischargeId;
    private String routeLinePortDischargeNameCn;
    private String transPortId;
    private String transPortNameCn;
    private java.sql.Timestamp fromDate;
    private java.sql.Timestamp toDate;
    private Long isAvl_20Gp;
    private Double costPrice_20Gp;
    private Double minPrice_20Gp;
    private Double refPrice_20Gp;
    private Double maxPrice_20Gp;
    private Long isAvl_40Gp;
    private Double costPrice_40Gp;
    private Double minPrice_40Gp;
    private Double refPrice_40Gp;
    private Double maxPrice_40Gp;
    private Long isAvl_40Hc;
    private Double costPrice_40Hc;
    private Double minPrice_40Hc;
    private Double refPrice_40Hc;
    private Double maxPrice_40Hc;
    private Double roadPrice_20Gp;
    private Double roadPrice_40Gp;
    private Double roadPrice_40Hc;
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
    private Long isCbc_20Gp;
    private Long isCbc_40Gp;
    private Long isCbc_40Hc;
    private Double publicPrice_20Gp;
    private Double publicPrice_40Gp;
    private Double publicPrice_40Hc;


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


    public String getRouteLinePortLoadNameCn() {
        return routeLinePortLoadNameCn;
    }

    public void setRouteLinePortLoadNameCn(String routeLinePortLoadNameCn) {
        this.routeLinePortLoadNameCn = routeLinePortLoadNameCn;
    }


    public String getRouteLinePortDischargeId() {
        return routeLinePortDischargeId;
    }

    public void setRouteLinePortDischargeId(String routeLinePortDischargeId) {
        this.routeLinePortDischargeId = routeLinePortDischargeId;
    }


    public String getRouteLinePortDischargeNameCn() {
        return routeLinePortDischargeNameCn;
    }

    public void setRouteLinePortDischargeNameCn(String routeLinePortDischargeNameCn) {
        this.routeLinePortDischargeNameCn = routeLinePortDischargeNameCn;
    }


    public String getTransPortId() {
        return transPortId;
    }

    public void setTransPortId(String transPortId) {
        this.transPortId = transPortId;
    }


    public String getTransPortNameCn() {
        return transPortNameCn;
    }

    public void setTransPortNameCn(String transPortNameCn) {
        this.transPortNameCn = transPortNameCn;
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


    public Long getIsAvl_20Gp() {
        return isAvl_20Gp;
    }

    public void setIsAvl_20Gp(Long isAvl_20Gp) {
        this.isAvl_20Gp = isAvl_20Gp;
    }

    public Double getCostPrice_20Gp() {
        return costPrice_20Gp;
    }

    public void setCostPrice_20Gp(Double costPrice_20Gp) {
        this.costPrice_20Gp = costPrice_20Gp;
    }

    public Double getMinPrice_20Gp() {
        return minPrice_20Gp;
    }

    public void setMinPrice_20Gp(Double minPrice_20Gp) {
        this.minPrice_20Gp = minPrice_20Gp;
    }

    public Double getRefPrice_20Gp() {
        return refPrice_20Gp;
    }

    public void setRefPrice_20Gp(Double refPrice_20Gp) {
        this.refPrice_20Gp = refPrice_20Gp;
    }

    public Double getMaxPrice_20Gp() {
        return maxPrice_20Gp;
    }

    public void setMaxPrice_20Gp(Double maxPrice_20Gp) {
        this.maxPrice_20Gp = maxPrice_20Gp;
    }

    public Long getIsAvl_40Gp() {
        return isAvl_40Gp;
    }

    public void setIsAvl_40Gp(Long isAvl_40Gp) {
        this.isAvl_40Gp = isAvl_40Gp;
    }

    public Double getCostPrice_40Gp() {
        return costPrice_40Gp;
    }

    public void setCostPrice_40Gp(Double costPrice_40Gp) {
        this.costPrice_40Gp = costPrice_40Gp;
    }

    public Double getMinPrice_40Gp() {
        return minPrice_40Gp;
    }

    public void setMinPrice_40Gp(Double minPrice_40Gp) {
        this.minPrice_40Gp = minPrice_40Gp;
    }

    public Double getRefPrice_40Gp() {
        return refPrice_40Gp;
    }

    public void setRefPrice_40Gp(Double refPrice_40Gp) {
        this.refPrice_40Gp = refPrice_40Gp;
    }

    public Double getMaxPrice_40Gp() {
        return maxPrice_40Gp;
    }

    public void setMaxPrice_40Gp(Double maxPrice_40Gp) {
        this.maxPrice_40Gp = maxPrice_40Gp;
    }

    public Long getIsAvl_40Hc() {
        return isAvl_40Hc;
    }

    public void setIsAvl_40Hc(Long isAvl_40Hc) {
        this.isAvl_40Hc = isAvl_40Hc;
    }

    public Double getCostPrice_40Hc() {
        return costPrice_40Hc;
    }

    public void setCostPrice_40Hc(Double costPrice_40Hc) {
        this.costPrice_40Hc = costPrice_40Hc;
    }

    public Double getMinPrice_40Hc() {
        return minPrice_40Hc;
    }

    public void setMinPrice_40Hc(Double minPrice_40Hc) {
        this.minPrice_40Hc = minPrice_40Hc;
    }

    public Double getRefPrice_40Hc() {
        return refPrice_40Hc;
    }

    public void setRefPrice_40Hc(Double refPrice_40Hc) {
        this.refPrice_40Hc = refPrice_40Hc;
    }

    public Double getMaxPrice_40Hc() {
        return maxPrice_40Hc;
    }

    public void setMaxPrice_40Hc(Double maxPrice_40Hc) {
        this.maxPrice_40Hc = maxPrice_40Hc;
    }

    public Double getRoadPrice_20Gp() {
        return roadPrice_20Gp;
    }

    public void setRoadPrice_20Gp(Double roadPrice_20Gp) {
        this.roadPrice_20Gp = roadPrice_20Gp;
    }

    public Double getRoadPrice_40Gp() {
        return roadPrice_40Gp;
    }

    public void setRoadPrice_40Gp(Double roadPrice_40Gp) {
        this.roadPrice_40Gp = roadPrice_40Gp;
    }

    public Double getRoadPrice_40Hc() {
        return roadPrice_40Hc;
    }

    public void setRoadPrice_40Hc(Double roadPrice_40Hc) {
        this.roadPrice_40Hc = roadPrice_40Hc;
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

    public Long getIsCbc_20Gp() {
        return isCbc_20Gp;
    }

    public void setIsCbc_20Gp(Long isCbc_20Gp) {
        this.isCbc_20Gp = isCbc_20Gp;
    }

    public Long getIsCbc_40Gp() {
        return isCbc_40Gp;
    }

    public void setIsCbc_40Gp(Long isCbc_40Gp) {
        this.isCbc_40Gp = isCbc_40Gp;
    }

    public Long getIsCbc_40Hc() {
        return isCbc_40Hc;
    }

    public void setIsCbc_40Hc(Long isCbc_40Hc) {
        this.isCbc_40Hc = isCbc_40Hc;
    }

    public Double getPublicPrice_20Gp() {
        return publicPrice_20Gp;
    }

    public void setPublicPrice_20Gp(Double publicPrice_20Gp) {
        this.publicPrice_20Gp = publicPrice_20Gp;
    }

    public Double getPublicPrice_40Gp() {
        return publicPrice_40Gp;
    }

    public void setPublicPrice_40Gp(Double publicPrice_40Gp) {
        this.publicPrice_40Gp = publicPrice_40Gp;
    }

    public Double getPublicPrice_40Hc() {
        return publicPrice_40Hc;
    }

    public void setPublicPrice_40Hc(Double publicPrice_40Hc) {
        this.publicPrice_40Hc = publicPrice_40Hc;
    }
}
