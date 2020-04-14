package com.design.entity;


import com.design.common.PageModel;

import java.util.List;

public class TNotice extends PageModel {

  private int id;
  private String status;
  private String noticeTitle;
  private String noticeContent;

  private List<TNotice> notices1; //企业
  private List<TNotice> notices2; //私信
  private List<TNotice> notices3; //系统


  public List<TNotice> getNotices1() {
    return notices1;
  }

  public void setNotices1(List<TNotice> notices1) {
    this.notices1 = notices1;
  }

  public List<TNotice> getNotices2() {
    return notices2;
  }

  public void setNotices2(List<TNotice> notices2) {
    this.notices2 = notices2;
  }

  public List<TNotice> getNotices3() {
    return notices3;
  }

  public void setNotices3(List<TNotice> notices3) {
    this.notices3 = notices3;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public String getNoticeTitle() {
    return noticeTitle;
  }

  public void setNoticeTitle(String noticeTitle) {
    this.noticeTitle = noticeTitle;
  }


  public String getNoticeContent() {
    return noticeContent;
  }

  public void setNoticeContent(String noticeContent) {
    this.noticeContent = noticeContent;
  }

}
