package com.design.service.impl;

import com.design.dao.DepartmentDao;
import com.design.entity.TDepartment;
import com.design.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: guanjiajie
 * @Date: 2020/4/9 14:07
 */
@Service
@Transactional
public class DepartmentServiceImpl implements IDepartmentService {

    @Autowired
    private DepartmentDao departmentDao;

    @Override
    public List<TDepartment> getAllDepartment(TDepartment tDepartment) {
        List<TDepartment> list = departmentDao.getAllDepartment(tDepartment);
        return list;
    }
}
