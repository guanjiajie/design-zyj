package com.design.controller;

import com.design.common.MyException;
import com.design.common.Result;
import com.design.common.ResultEnum;
import com.design.entity.TDepartment;
import com.design.service.IDepartmentService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: guanjiajie
 * @Date: 2020/4/9 14:08
 */
@RestController
@RequestMapping("/department")
@CrossOrigin
public class DepartmentController {

    @Autowired
    private IDepartmentService iDepartmentService;
    private Logger logger = Logger.getLogger(this.getClass());

    @PostMapping("/getAllDepartment")
    public Result getAllDepartment( TDepartment tDepartment){
        try {
            return Result.success(iDepartmentService.getAllDepartment(tDepartment));
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
