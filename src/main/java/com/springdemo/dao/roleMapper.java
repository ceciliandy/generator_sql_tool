package com.springdemo.dao;

import com.springdemo.model.role;
import java.util.List;

public interface roleMapper {
    int deleteByPrimaryKey(String roleId);

    int insert(role record);

    role selectByPrimaryKey(String roleId);

    List<role> selectAll();

    int updateByPrimaryKey(role record);
}