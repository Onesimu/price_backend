package com.pddz.price.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Seaexpressprice {

    @Id
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

}
