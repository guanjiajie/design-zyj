package com.design.entity;


import com.design.common.PageModel;

public class TPersonJob extends PageModel {

  private String id;
  private String createName;
  private String createTime;
  private String startTime;
  private String endTime;
  private String workTime;
  private String workContent;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getCreateName() {
    return createName;
  }

  public void setCreateName(String createName) {
    this.createName = createName;
  }


  public String getCreateTime() {
    return createTime;
  }

  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public String getWorkTime() {
    return workTime;
  }

  public void setWorkTime(String workTime) {
    this.workTime = workTime;
  }


  public String getWorkContent() {
    return workContent;
  }

  public void setWorkContent(String workContent) {
    this.workContent = workContent;
  }

}
