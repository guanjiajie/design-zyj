package com.design.dao;

import com.design.entity.TProject;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: guanjiajie
 * @Date: 2020/4/15 17:52
 */
@Repository
public interface ProjectDao {

    List<TProject> getAllProjects();
}
