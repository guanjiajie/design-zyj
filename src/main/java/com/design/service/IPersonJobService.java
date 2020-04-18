package com.design.service;

import com.design.common.Page;
import com.design.entity.TPersonJob;

/**
 * @Author: guanjiajie
 * @Date: 2020/4/18 14:54
 */
public interface IPersonJobService {

    Page<TPersonJob> getPersonJobList(TPersonJob tPersonJob);

    boolean addPersonJob(TPersonJob tPersonJob);
    boolean deletePersonJob(TPersonJob tPersonJob);
}
