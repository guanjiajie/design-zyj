package com.design.entity;


public class TReport {

  private int id;
  private String type;
  private String nowWork;
  private String nextWork;
  private String workSummary;
  private String remarks;


  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public String getNowWork() {
    return nowWork;
  }

  public void setNowWork(String nowWork) {
    this.nowWork = nowWork;
  }


  public String getNextWork() {
    return nextWork;
  }

  public void setNextWork(String nextWork) {
    this.nextWork = nextWork;
  }


  public String getWorkSummary() {
    return workSummary;
  }

  public void setWorkSummary(String workSummary) {
    this.workSummary = workSummary;
  }


  public String getRemarks() {
    return remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }

}
