package com.design.entity;


import com.design.common.PageModel;

public class TProject extends PageModel {

  private int id;
  private String projectName;
  private String startTime;
  private String endTime;
  private String chargePerson;
  private String speed;
  private String investor;


  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }


  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
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


  public String getChargePerson() {
    return chargePerson;
  }

  public void setChargePerson(String chargePerson) {
    this.chargePerson = chargePerson;
  }


  public String getSpeed() {
    return speed;
  }

  public void setSpeed(String speed) {
    this.speed = speed;
  }


  public String getInvestor() {
    return investor;
  }

  public void setInvestor(String investor) {
    this.investor = investor;
  }

}
