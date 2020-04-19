package com.design.dao;

import com.design.entity.TStatistics;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: zhu
 * @Date: 2020/4/15 16:17
 */
@Repository
public interface StatisticsDao {

    List<TStatistics> getAllStatistics();
}
