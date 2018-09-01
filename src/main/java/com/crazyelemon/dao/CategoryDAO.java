package com.crazyelemon.dao;

import com.crazyelemon.entity.Category;

import java.util.List;

public interface CategoryDAO {
    int deleteByPrimaryKey(Integer categoryId);

    int insert(Category record);

    int insertSelective(Category record);

    Category selectByPrimaryKey(Integer categoryId);

    int updateByPrimaryKeySelective(Category record);

    int updateByPrimaryKey(Category record);

    List<Category> queryAll();
}