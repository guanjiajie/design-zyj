package com.design.entity;


import java.util.List;

public class TStatistics {

  private int rowid;
  private String year;
  private int month;
  private int projectNum;
  private int personNum;
  private double income;
  private String expenditure;

  private List<Integer> months;
  private List<Integer> projectNums;
  private List<Double> incomes;

  public List<Integer> getMonths() {
    return months;
  }

  public void setMonths(List<Integer> months) {
    this.months = months;
  }

  public List<Integer> getProjectNums() {
    return projectNums;
  }

  public void setProjectNums(List<Integer> projectNums) {
    this.projectNums = projectNums;
  }

  public List<Double> getIncomes() {
    return incomes;
  }

  public void setIncomes(List<Double> incomes) {
    this.incomes = incomes;
  }

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


  public double getIncome() {
    return income;
  }

  public void setIncome(double income) {
    this.income = income;
  }


  public String getExpenditure() {
    return expenditure;
  }

  public void setExpenditure(String expenditure) {
    this.expenditure = expenditure;
  }

}
