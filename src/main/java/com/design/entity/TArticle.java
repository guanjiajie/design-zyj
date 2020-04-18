package com.design.entity;


import com.design.common.PageModel;

public class TArticle extends PageModel {

  private int id;
  private String title;
  private String content;
  private String publishName;
  private String publishTime;

  public String getPublishName() {
    return publishName;
  }

  public void setPublishName(String publishName) {
    this.publishName = publishName;
  }

  public String getPublishTime() {
    return publishTime;
  }

  public void setPublishTime(String publishTime) {
    this.publishTime = publishTime;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

}
