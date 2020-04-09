package com.design.dao;

import com.design.entity.TLoginuser;
import org.springframework.stereotype.Repository;

/**
 * @Author:
 * @Date: 2020/4/8 14:34
 */
@Repository
public interface UserDao {

    TLoginuser getLoginUser(TLoginuser tLoginuser);
}
