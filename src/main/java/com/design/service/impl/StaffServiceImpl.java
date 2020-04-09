package com.design.service.impl;

import com.design.dao.StaffDao;
import com.design.entity.TStaff;
import com.design.service.IStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: guanjiajie
 * @Date: 2020/4/9 11:10
 */
@Service
@Transactional
public class StaffServiceImpl implements IStaffService {

    @Autowired
    private StaffDao staffDao;

    @Override
    public List<TStaff> getAllStaff(TStaff tStaff) {
        List<TStaff> list = staffDao.getAllStaff(tStaff);
        return list;
    }
}
