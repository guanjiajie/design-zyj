package com.design.service.impl;

import com.design.common.MyException;
import com.design.common.ResultEnum;
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

    @Override
    public boolean insertPlan(TPlan tPlan) {
        int ret = planDao.insertPlan(tPlan);
        if (ret < 1){
            throw new MyException(ResultEnum.ERROR.getCode(),"新增失败");
        }
        return true;
    }
}
