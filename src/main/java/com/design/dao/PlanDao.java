package com.design.dao;

import com.design.entity.TPlan;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: guanjiajie
 * @Date: 2020/4/13 16:35
 */
@Repository
public interface PlanDao {

    List<TPlan> getAllPlan();
}
