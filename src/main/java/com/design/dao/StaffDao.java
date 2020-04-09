package com.design.dao;

import com.design.entity.TStaff;

import java.util.List;

/**
 * @Author:
 * @Date: 2020/4/9 11:05
 */
public interface StaffDao {

    List<TStaff> getAllStaff(TStaff tStaff);
}
