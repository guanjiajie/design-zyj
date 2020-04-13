package com.design.controller;

import com.design.common.MyException;
import com.design.common.Result;
import com.design.common.ResultEnum;
import com.design.entity.TPlan;
import com.design.service.IPlanService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: guanjiajie
 * @Date: 2020/4/13 16:41
 */
@RestController
@RequestMapping("/plan")
public class PlanController {

    @Autowired
    private IPlanService iPlanService;
    private Logger logger = Logger.getLogger(this.getClass());

    @PostMapping("/getAllPlan")
    public Result getAllPlan(){
        try {
            return Result.success(iPlanService.getAllPlan());
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

    @PostMapping("/addPlan")
    public Result addPlan(TPlan tPlan){
        try {
            iPlanService.insertPlan(tPlan);
            return Result.setSuccessMsg("新增成功");
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
