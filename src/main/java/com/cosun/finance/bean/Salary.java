package com.cosun.finance.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * @author:homey Wong
 * @date:2019/6/15 0015 上午 11:25
 * @Description:
 * @Modified By:
 * @Modified-date:
 */
public class Salary implements Serializable {

    private static final long serialVersionUID = 3941220683407513988L;

    private Integer id;
    private String name;
    private String empNo;
    private String inComDate;//入职日期
    private Double compreSalary;
    private Double posSalary;
    private Double jobSalary;
    private Double meritSalary;
    private Integer state;

    private String remark;
    private Integer type;

    private Double allMoney;
    private String inComDateStr;
    private String bigDeptName;
    private String deptName;

    private Date updateTime;
    // 分页属性
    private int currentPage = 1;// 用于接收页面传过来的当前页数
    private int maxPage;// 最大页数
    private int recordCount;// 总记录数
    private int pageSize = 10;
    private int currentPageTotalNum;
    private String sortMethod;
    private String sortByName;

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setAllMoney(Double allMoney) {
        this.allMoney = allMoney;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getMaxPage() {
        return maxPage;
    }

    public void setMaxPage(int maxPage) {
        this.maxPage = maxPage;
    }

    public int getRecordCount() {
        return recordCount;
    }

    public void setRecordCount(int recordCount) {
        this.recordCount = recordCount;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getCurrentPageTotalNum() {
        if (this.currentPage != 0)
            return (currentPage - 1) * pageSize;
        return 0;
    }

    public void setCurrentPageTotalNum(int currentPageTotalNum) {
        this.currentPageTotalNum = currentPageTotalNum;
    }

    public String getSortMethod() {
        return sortMethod;
    }

    public void setSortMethod(String sortMethod) {
        this.sortMethod = sortMethod;
    }

    public String getSortByName() {
        return sortByName;
    }

    public void setSortByName(String sortByName) {
        this.sortByName = sortByName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBigDeptName() {
        return bigDeptName;
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

    public void setBigDeptName(String bigDeptName) {
        this.bigDeptName = bigDeptName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getInComDateStr() {
        return inComDateStr;
    }

    public void setInComDateStr(String inComDateStr) {
        this.inComDateStr = inComDateStr;
    }

    public String getInComDate() {
        return inComDate;
    }

    public void setInComDate(String inComDate) {
        this.inComDate = inComDate;
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
        return compreSalary==null ? 0.0 : compreSalary;
    }

    public void setCompreSalary(Double compreSalary) {
        this.compreSalary = compreSalary;
    }

    public Double getPosSalary() {
        return posSalary==null ? 0.0 : posSalary;
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
