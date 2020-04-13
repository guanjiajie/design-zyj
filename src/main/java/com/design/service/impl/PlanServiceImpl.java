package com.design.service.impl;

import com.design.dao.PlanDao;
import com.design.entity.TPlan;
import com.design.service.IPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: guanjiajie
 * @Date: 2020/4/13 16:39
 */
@Service
@Transactional
public class PlanServiceImpl implements IPlanService {

    @Autowired
    private PlanDao planDao;

    @Override
    public List<TPlan> getAllPlan() {
        List<TPlan> list = planDao.getAllPlan();
        return list;
    }
}
