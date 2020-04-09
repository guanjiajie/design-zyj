package com.design.entity;


import com.design.common.PageModel;

public class TNotice extends PageModel {

  private int id;
  private String status;
  private String noticeTitle;
  private String noticeContent;


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
