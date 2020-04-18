package com.design.dao;

import com.design.entity.TPersonJob;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;

/**
 * @Author: guanjiajie
 * @Date: 2020/4/18 14:20
 */
@Repository
public interface PersonJobDao {

    List<TPersonJob> getPersonJobList(TPersonJob tPersonJob);
    BigInteger getPersonJobListCount(TPersonJob tPersonJob);
}
