package com.design.manage.common;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;


public class Page<T> implements Serializable{

    private List<T> data;           //数据
    private String packData;    // 压缩后得json数据
    private BigInteger total;       //总条数
    private Integer totalPages;     //总页数
    private int page;   //当前页

    private String nowDate; // 数据库当前时间

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public String getPackData() {
        return packData;
    }

    public void setPackData(String packData) {
        this.packData = packData;
    }

    public BigInteger getTotal() {
        return total;
    }

    public void setTotal(BigInteger total) {
        this.total = total;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public String getNowDate() {
        return nowDate;
    }

    public void setNowDate(String nowDate) {
        this.nowDate = nowDate;
    }
}
