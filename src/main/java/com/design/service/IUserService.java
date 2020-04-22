package com.design.service;

import com.design.entity.TLoginuser;

/**
 * @Author: zhu
 * @Date: 2020/4/8 14:44
 */
public interface IUserService {

    TLoginuser login(TLoginuser tLoginuser);
    boolean register(TLoginuser tLoginuser);
}
