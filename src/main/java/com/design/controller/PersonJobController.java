package com.design.controller;

import com.design.common.MyException;
import com.design.common.Result;
import com.design.common.ResultEnum;
import com.design.entity.TPersonJob;
import com.design.service.IPersonJobService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: zhu
 * @Date: 2020/4/18 14:57
 */

@RestController
@RequestMapping("/personJob")
@CrossOrigin
public class PersonJobController {

    @Autowired
    private IPersonJobService iPersonJobService;
    private Logger logger = Logger.getLogger(this.getClass());

    @PostMapping("/getPersonJobList")
    public Result getPersonJobList( TPersonJob tPersonJob){
        try {
            return Result.success(iPersonJobService.getPersonJobList(tPersonJob));
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

    @PostMapping("/addPersonJob")
    public Result addPersonJob( TPersonJob tPersonJob){
        try {
            iPersonJobService.addPersonJob(tPersonJob);
            return Result.success();
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

    @PostMapping("/deletePersonJob")
    public Result deletePersonJob( TPersonJob tPersonJob){
        try {
            iPersonJobService.deletePersonJob(tPersonJob);
            return Result.success();
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
