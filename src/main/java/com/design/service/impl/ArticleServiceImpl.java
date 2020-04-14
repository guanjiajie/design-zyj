package com.design.service.impl;

import com.design.dao.ArticleDao;
import com.design.entity.TArticle;
import com.design.service.IArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: guanjiajie
 * @Date: 2020/4/14 17:55
 */

@Service
@Transactional
public class ArticleServiceImpl implements IArticleService {

    @Autowired
    private ArticleDao articleDao;

    @Override
    public List<TArticle> getAllArticle() {
        List<TArticle> list = articleDao.getAllArticle();
        return list;

    }
}
