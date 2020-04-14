package com.design.service.impl;

import com.design.dao.ArticleDao;
import com.design.entity.TArticle;
import com.design.entity.TNotice;
import com.design.service.IArticleService;
import com.design.utils.EmptyUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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

    @Override
    public TNotice getAllNotice() {
        List<TNotice> list = articleDao.getAllNotice();
        TNotice tNotice = new TNotice();
        if (!EmptyUtil.isEmpty(list)){
            Map<String,List<TNotice>> map= list.stream().collect(Collectors.groupingBy(e -> e.getStatus()));
            map.forEach((key,value) -> {
                if ("1".equals(key)){
                    tNotice.setNotices1(map.get(key));
                }
                if ("2".equals(key)){
                    tNotice.setNotices2(map.get(key));
                }
                if ("3".equals(key)){
                    tNotice.setNotices3(map.get(key));
                }
            });
        }
        return tNotice;
    }
}
