package com.design.service.impl;

import com.design.dao.ProjectDao;
import com.design.entity.TProject;
import com.design.service.IProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: guanjiajie
 * @Date: 2020/4/15 17:54
 */
@Service
@Transactional
public class ProjectServiceImpl implements IProjectService {

    @Autowired
    private ProjectDao projectDao;

    @Override
    public List<TProject> getAllProjects() {

        List<TProject> list = projectDao.getAllProjects();
        return list;
    }
}
