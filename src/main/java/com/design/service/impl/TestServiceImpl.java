package com.design.service.impl;

import com.design.dao.TestDao;
import com.design.entity.TLoginuser;
import com.design.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: zhu
 * @Date: 2020/4/8 11:09
 */
@Service
@Transactional
public class TestServiceImpl implements ITestService {

    @Autowired
    private TestDao testDao;
    @Override
    public List<TLoginuser> getAllUser() {
        return testDao.getAllUser();
    }
}
