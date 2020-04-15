package com.design.controller;

import com.design.common.MyException;
import com.design.common.Result;
import com.design.common.ResultEnum;
import com.design.entity.TProject;
import com.design.service.IProjectService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: guanjiajie
 * @Date: 2020/4/15 17:55
 */
@RestController
@RequestMapping("/project")
@CrossOrigin
public class ProjectController {

    @Autowired
    private IProjectService iProjectService;
    private Logger logger = Logger.getLogger(this.getClass());

    @PostMapping("/getAllProjects")
    public Result getAllProjects(TProject tProject){
        try {
            return Result.success(iProjectService.getAllProjects());
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
