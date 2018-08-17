package com.pddz.price.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Seaexpressprice {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String sePriceId;
    private String routeLinePortLoadId;
    private String routeLinePortDischargeId;
    private String transPortId;
    private java.sql.Timestamp fromDate;
    private java.sql.Timestamp toDate;
    private Long isAvl_20Gp;
    private Long isAvl_40Gp;
    private Long isAvl_40Hc;
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
    private String schedule;
    private String transMode;
    private Double publicPrice_20Gp;
    private Double publicPrice_40Gp;
    private Double publicPrice_40Hc;
    private Double publicPrice_40Hq;
    private Double publicPrice_45Hq;
    private Double publicPrice_40Rd;


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


    public Long getIsAvl_20Gp() {
        return isAvl_20Gp;
    }

    public void setIsAvl_20Gp(Long isAvl_20Gp) {
        this.isAvl_20Gp = isAvl_20Gp;
    }


    public Long getIsAvl_40Gp() {
        return isAvl_40Gp;
    }

    public void setIsAvl_40Gp(Long isAvl_40Gp) {
        this.isAvl_40Gp = isAvl_40Gp;
    }


    public Long getIsAvl_40Hc() {
        return isAvl_40Hc;
    }

    public void setIsAvl_40Hc(Long isAvl_40Hc) {
        this.isAvl_40Hc = isAvl_40Hc;
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

    public Double getPublicPrice_40Hq() {
        return publicPrice_40Hq;
    }

    public void setPublicPrice_40Hq(Double publicPrice_40Hq) {
        this.publicPrice_40Hq = publicPrice_40Hq;
    }

    public Double getPublicPrice_45Hq() {
        return publicPrice_45Hq;
    }

    public void setPublicPrice_45Hq(Double publicPrice_45Hq) {
        this.publicPrice_45Hq = publicPrice_45Hq;
    }

    public Double getPublicPrice_40Rd() {
        return publicPrice_40Rd;
    }

    public void setPublicPrice_40Rd(Double publicPrice_40Rd) {
        this.publicPrice_40Rd = publicPrice_40Rd;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getTransMode() {
        return transMode;
    }

    public void setTransMode(String transMode) {
        this.transMode = transMode;
    }
}
