package com.design.service.impl;

import com.design.common.Page;
import com.design.dao.PersonJobDao;
import com.design.entity.TPersonJob;
import com.design.service.IPersonJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigInteger;
import java.util.List;

/**
 * @Author: guanjiajie
 * @Date: 2020/4/18 14:55
 */
@Service
@Transactional
public class PersonJobServiceImpl implements IPersonJobService {

    @Autowired
    private PersonJobDao personJobDao;

    @Override
    public Page<TPersonJob> getPersonJobList(TPersonJob tPersonJob) {
        BigInteger count = personJobDao.getPersonJobListCount(tPersonJob);
        tPersonJob.setTotal(count);
        List<TPersonJob> list = personJobDao.getPersonJobList(tPersonJob);

        Page<TPersonJob> page = new Page<>();
        page.setTotal(count);
        page.setTotalPages(tPersonJob.getTotalPages());
        page.setData(list);
        return page;
    }
}
