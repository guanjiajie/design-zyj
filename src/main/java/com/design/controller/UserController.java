package com.design.controller;

import com.design.common.MyException;
import com.design.common.Result;
import com.design.common.ResultEnum;
import com.design.entity.TLoginuser;
import com.design.service.IUserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Author:
 * @Date: 2020/4/8 14:49
 */
@Controller
@RequestMapping("/user")
@CrossOrigin
public class UserController {

    @Autowired
    private IUserService iUserService;

    private Logger logger = Logger.getLogger(this.getClass());


    /**
     * @author: 
     * @description: 
     * @date: 2020/4/8 15:48
     * @param tLoginuser
     * @return com.design.common.Result
    */
    @PostMapping("/login")
    @ResponseBody
    public Result login( TLoginuser tLoginuser){
        try {
            return Result.success(iUserService.login(tLoginuser));
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

    @PostMapping("/register")
    @ResponseBody
    public Result register( TLoginuser tLoginuser){
        try {
            iUserService.register(tLoginuser);
            return Result.success();
        } catch (MyException me){
            me.printStackTrace();
            logger.error(ResultEnum.ERROR.getCode(),me);
            return Result.error(ResultEnum.ERROR.getCode(), me.getMessage());
        } catch (Exception e){
            e.printStackTrace();
            logger.error(ResultEnum.UNKONW_ERROR.getCode(),e);
            return Result.error(ResultEnum.UNKONW_ERROR.getCode(),ResultEnum.UNKONW_ERROR.getMsg());
        }
    }
}
