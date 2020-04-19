package com.design.service.impl;

import com.design.dao.StatisticsDao;
import com.design.entity.TStatistics;
import com.design.service.IStatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Author: zhu
 * @Date: 2020/4/15 16:20
 */
@Service
@Transactional
public class StatisticsServiceImpl implements IStatisticsService {

    @Autowired
    private StatisticsDao statisticsDao;

    @Override
    public List<TStatistics> getAllStatistics() {

        List<TStatistics> list = statisticsDao.getAllStatistics();
        Map<String,List<TStatistics>> map = list.stream().collect(Collectors.groupingBy(TStatistics::getYear));

        List<Integer> months = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12));
        List<TStatistics> result = new ArrayList<>();

        map.forEach((key,value) -> {
            TStatistics tStatistics = new TStatistics();
            tStatistics.setYear(key.split("-")[0]);

            List<Integer> projectNums = new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0,0,0,0));
            List<Integer> personNums = new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0,0,0,0));
            List<Double> incomes = new ArrayList<>(Arrays.asList(0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0));
            List<Double> expenditures = new ArrayList<>(Arrays.asList(0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0));

            value.stream().forEach(e -> {
                for (int month : months){
                    if (month == e.getMonth()){
                        projectNums.remove(month-1);
                        projectNums.add(month-1,e.getMonth());

                        incomes.remove(month-1);
                        incomes.add(month-1,e.getIncome());

                        personNums.remove(month-1);
                        personNums.add(month-1,e.getPersonNum());

                        expenditures.remove(month-1);
                        expenditures.add(month-1,e.getExpenditure());
                    }
                }
            });

            tStatistics.setMonths(months);
            tStatistics.setProjectNums(projectNums);
            tStatistics.setIncomes(incomes);
            tStatistics.setPersonNums(personNums);
            tStatistics.setExpenditures(expenditures);
            result.add(tStatistics);
        });

        return result;
    }
}
