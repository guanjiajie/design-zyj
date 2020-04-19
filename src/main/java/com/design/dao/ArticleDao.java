package com.design.dao;

import com.design.entity.TArticle;
import com.design.entity.TNotice;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: guanjiajie
 * @Date: 2020/4/14 17:52
 */
@Repository
public interface ArticleDao {

    List<TArticle> getAllArticle();

    List<TNotice> getAllNotice();

    int addArticle(TArticle tArticle);
    int deleteArticle(TArticle tArticle);
    int updateNotice(TNotice tNotice);
}
