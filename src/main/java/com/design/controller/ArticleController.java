package com.design.controller;

import com.design.common.MyException;
import com.design.common.Result;
import com.design.common.ResultEnum;
import com.design.entity.TArticle;
import com.design.entity.TNotice;
import com.design.service.IArticleService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: zhu
 * @Date: 2020/4/14 17:57
 */
@RestController
@CrossOrigin
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private IArticleService iArticleService;
    private Logger logger = Logger.getLogger(this.getClass());

    @PostMapping("/getAllArticle")
    public Result getAllArticle(TArticle tArticle){
        try {
            return Result.success(iArticleService.getAllArticle());
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

    @PostMapping("/getAllNotice")
    public Result getAllNotice(TNotice tNotice){
        try {
            return Result.success(iArticleService.getAllNotice());
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

    @PostMapping("/addArticle")
    public Result addArticle( TArticle tArticle){
        try {
            iArticleService.addArticle(tArticle);
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

    @PostMapping("/deleteArticle")
    public Result deleteArticle(TArticle tArticle){
        try {
            iArticleService.deleteArticle(tArticle);
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

    @PostMapping("/updateNotice")
    public Result updateNotice(TNotice tNotice){
        try {
            iArticleService.updateNotice(tNotice);
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
