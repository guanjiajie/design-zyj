package com.design.service;

import com.design.entity.TArticle;
import com.design.entity.TNotice;

import java.util.List;

/**
 * @Author: guanjiajie
 * @Date: 2020/4/14 17:55
 */
public interface IArticleService {

    List<TArticle> getAllArticle();
    TNotice getAllNotice();

    boolean addArticle(TArticle tArticle);
    boolean deleteArticle(TArticle tArticle);
    boolean updateNotice(TNotice tNotice);
}
