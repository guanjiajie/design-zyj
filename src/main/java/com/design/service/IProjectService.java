package com.design.service;

import com.design.entity.TProject;

import java.util.List;

/**
 * @Author: guanjiajie
 * @Date: 2020/4/15 17:54
 */
public interface IProjectService {

    List<TProject> getAllProjects();

    boolean addProject(TProject tProject);
    boolean deleteProject(TProject tProject);
    boolean updateProject(TProject tProject);
}
