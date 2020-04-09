package com.design.dao;

import com.design.entity.TStaff;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author:
 * @Date: 2020/4/9 11:05
 */
@Repository
public interface StaffDao {

    List<TStaff> getAllStaff(TStaff tStaff);
}
