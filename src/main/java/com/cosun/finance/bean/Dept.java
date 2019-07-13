package com.cosun.finance.bean;

import java.io.Serializable;
import java.util.List;

/**
 * @author:homey Wong
 * @date:2019/5/9 0009 上午 9:44
 * @Description:
 * @Modified By:
 * @Modified-date:
 */
public class Dept implements Serializable {

    private static final long serialVersionUID = -1496868843470416075L;

    private Integer id;
    private List<Integer> ids;
    private String deptname;//部门名称
    private String bigDeptName;//大部门

    // 分页属性
    private int currentPage = 1;// 用于接收页面传过来的当前页数
    private int maxPage;// 最大页数
    private int recordCount;// 总记录数
    private int pageSize = 10;
    private int currentPageTotalNum;


    public String getBigDeptName() {
        return bigDeptName;
    }

    public void setBigDeptName(String bigDeptName) {
        this.bigDeptName = bigDeptName;
    }

    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
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
        if(this.currentPage!=0)
            return (currentPage - 1) * pageSize;
        return 0;
    }

    public void setCurrentPageTotalNum(int currentPageTotalNum) {
        this.currentPageTotalNum = currentPageTotalNum;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

}
