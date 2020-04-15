package com.design.controller;

import com.design.common.MyException;
import com.design.common.Result;
import com.design.common.ResultEnum;
import com.design.entity.TStatistics;
import com.design.service.IStatisticsService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: guanjiajie
 * @Date: 2020/4/15 16:56
 */
@RestController
@RequestMapping("/statistic")
@CrossOrigin
public class TstatisticsController {

    @Autowired
    private IStatisticsService iStatisticsService;
    private Logger logger = Logger.getLogger(this.getClass());

    @PostMapping("/getAllStatistics")
    public Result getAllStatistics(TStatistics tStatistics){
        try {
            return Result.success(iStatisticsService.getAllStatistics());
        } catch (MyException me){
            me.printStackTrace();
            logger.error(ResultEnum.ERROR.getCode(),me);
            return Result.error(ResultEnum.ERROR.getCode(),ResultEnum.ERROR.getMsg());
        } catch (Exception e){
            e.printStackTrace();
            logger.error(ResultEnum.UNKONW_ERROR.getCode(),e);
            return Result.error(ResultEnum.UNKONW_ERROR.getCode(),ResultEnum.UNKONW_ERROR.getMsg());
        }
    }
}
