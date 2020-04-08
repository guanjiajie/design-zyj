package com.design.controller;

import com.design.common.MyException;
import com.design.common.Result;
import com.design.common.ResultEnum;
import com.design.service.ITestService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: guanjiajie
 * @Date: 2020/4/8 11:10
 */
@Controller
public class TestController {

    @Autowired
    private ITestService iTestService;
    private Logger logger = Logger.getLogger(this.getClass());

    @PostMapping("/test")
    @ResponseBody
    public Result getAllUser(){
        try {
            return Result.success(iTestService.getAllUser());
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
