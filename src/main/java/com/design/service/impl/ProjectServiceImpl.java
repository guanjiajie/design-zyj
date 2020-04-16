package com.design.service.impl;

import com.design.common.MyException;
import com.design.common.ResultEnum;
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

    @Override
    public boolean addProject(TProject tProject) {
        int ret = projectDao.addProject(tProject);
        if (ret < 1){
            throw new MyException(ResultEnum.ERROR.getCode(),"添加失败");
        }
        return true;
    }

    @Override
    public boolean deleteProject(TProject tProject) {
        int ret = projectDao.deleteProject(tProject);
        if (ret < 1){
            throw new MyException(ResultEnum.ERROR.getCode(),"删除失败");
        }
        return false;
    }
}
