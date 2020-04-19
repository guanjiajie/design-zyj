package com.design.service.impl;

import com.design.common.MyException;
import com.design.common.ResultEnum;
import com.design.dao.UserDao;
import com.design.entity.TLoginuser;
import com.design.service.IUserService;
import com.design.utils.EmptyUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: zhu
 * @Date: 2020/4/8 14:45
 */
@Service
@Transactional
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserDao userDao;

    @Override
    public TLoginuser login(TLoginuser tLoginuser) {
        TLoginuser loginuser = userDao.getLoginUser(tLoginuser);
        if (EmptyUtil.isEmpty(loginuser)){
            throw new MyException(ResultEnum.ERROR.getCode(),"用户不存在");
        }
        if (tLoginuser.getUsername().equals(loginuser.getUsername()) && tLoginuser.getPassword().equals(loginuser.getPassword())){
            return loginuser;
        }else
            throw new MyException(ResultEnum.ERROR.getCode(),"用户名或密码错误");

    }
}
