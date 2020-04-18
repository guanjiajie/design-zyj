package com.design.service;

import com.design.entity.TPlan;

import java.util.List;

/**
 * @Author: guanjiajie
 * @Date: 2020/4/13 16:38
 */
public interface IPlanService {

    List<TPlan> getAllPlan();
    boolean insertPlan(TPlan tPlan);
    boolean updatePlanStatus(TPlan tPlan);
    boolean deletePlan(TPlan tPlan);
}
