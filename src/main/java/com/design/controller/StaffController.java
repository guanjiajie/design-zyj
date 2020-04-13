package com.design.controller;

import com.design.common.MyException;
import com.design.common.Result;
import com.design.common.ResultEnum;
import com.design.entity.TStaff;
import com.design.service.IStaffService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: guanjiajie
 * @Date: 2020/4/9 11:11
 */
@RestController
@RequestMapping("/staff")
@CrossOrigin
public class StaffController {

    @Autowired
    private IStaffService iStaffService;
    private Logger logger = Logger.getLogger(this.getClass());

    @PostMapping("/getAllStaff")
    public Result getAllStaff( TStaff tStaff){
        try {
            return Result.success(iStaffService.getAllStaff(tStaff));
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
