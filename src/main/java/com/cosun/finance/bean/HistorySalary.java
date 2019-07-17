package com.cosun.finance.bean;

import java.io.Serializable;
import java.util.Date;


public class HistorySalary implements Serializable {

    private static final long serialVersionUID = 3941220683407513988L;

    private Integer id;
    private String name;
    private String empNo;
    private Double compreSalary;
    private Double posSalary;
    private Double jobSalary;
    private Double meritSalary;
    private Double allMoney;
    private Date updateTime;
    // 分页属性

    private String remark;

    private String updateTimeStr;

    public String getUpdateTimeStr() {
        return updateTimeStr;
    }

    public void setUpdateTimeStr(String updateTimeStr) {
        this.updateTimeStr = updateTimeStr;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setAllMoney(Double allMoney) {
        this.allMoney = allMoney;
    }

    public Double getAllMoney() {
        Double all = 0.0;
        if (this.getCompreSalary() != null)
            all += this.getCompreSalary();
        if (this.getPosSalary() != null)
            all += this.getPosSalary();
        if (this.getJobSalary() != null)
            all += this.getJobSalary();
        if (this.getMeritSalary() != null)
            all += this.getMeritSalary();
        return all;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public Double getCompreSalary() {
        return compreSalary == null ? 0.0 : compreSalary;
    }

    public void setCompreSalary(Double compreSalary) {
        this.compreSalary = compreSalary;
    }

    public Double getPosSalary() {
        return posSalary == null ? 0.0 : posSalary;
    }

    public void setPosSalary(Double posSalary) {
        this.posSalary = posSalary;
    }

    public Double getJobSalary() {
        return jobSalary == null ? 0.0 : jobSalary;
    }

    public void setJobSalary(Double jobSalary) {
        this.jobSalary = jobSalary;
    }

    public Double getMeritSalary() {
        return meritSalary == null ? 0.0 : meritSalary;
    }

    public void setMeritSalary(Double meritSalary) {
        this.meritSalary = meritSalary;
    }
}
