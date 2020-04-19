package com.design.dao;

import com.design.entity.TDepartment;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: zhu
 * @Date: 2020/4/9 13:58
 */
@Repository
public interface DepartmentDao {

    List<TDepartment> getAllDepartment(TDepartment tDepartment);
}
