package com.design.dao;

import com.design.entity.TLoginuser;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: zhu
 * @Date: 2020/4/8 11:06
 */
@Repository
public interface TestDao {

    List<TLoginuser> getAllUser();
}
