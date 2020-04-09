package com.design.entity;


import com.design.common.PageModel;

import java.util.List;

public class TDepartment extends PageModel {

    private int rowid;
    private String resourceId;
    private String parentId;
    private String department;
    private String type;

    private List<TDepartment> departments;


    public List<TDepartment> getDepartments() {
        return departments;
    }

    public void setDepartments(List<TDepartment> departments) {
        this.departments = departments;
    }

    public int getRowid() {
        return rowid;
    }

    public void setRowid(int rowid) {
        this.rowid = rowid;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }


    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }


    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
