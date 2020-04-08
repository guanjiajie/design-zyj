package com.design.entity;


public class TStatistics {

  private int rowid;
  private String year;
  private int month;
  private int projectNum;
  private int personNum;
  private int income;
  private int expenditure;


  public int getRowid() {
    return rowid;
  }

  public void setRowid(int rowid) {
    this.rowid = rowid;
  }


  public String getYear() {
    return year;
  }

  public void setYear(String year) {
    this.year = year;
  }


  public int getMonth() {
    return month;
  }

  public void setMonth(int month) {
    this.month = month;
  }


  public int getProjectNum() {
    return projectNum;
  }

  public void setProjectNum(int projectNum) {
    this.projectNum = projectNum;
  }


  public int getPersonNum() {
    return personNum;
  }

  public void setPersonNum(int personNum) {
    this.personNum = personNum;
  }


  public int getIncome() {
    return income;
  }

  public void setIncome(int income) {
    this.income = income;
  }


  public int getExpenditure() {
    return expenditure;
  }

  public void setExpenditure(int expenditure) {
    this.expenditure = expenditure;
  }

}
