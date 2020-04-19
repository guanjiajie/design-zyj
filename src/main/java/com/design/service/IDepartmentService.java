package com.design.service;

import com.design.entity.TDepartment;

import java.util.List;

/**
 * @Author: zhu
 * @Date: 2020/4/9 14:06
 */
public interface IDepartmentService {
    List<TDepartment> getAllDepartment(TDepartment tDepartment);
}
