package com.crazyelemon.dao;

import com.crazyelemon.entity.Shoes;

public interface ShoesDAO {
    int deleteByPrimaryKey(Integer shoesId);

    int insert(Shoes record);

    int insertSelective(Shoes record);

    Shoes selectByPrimaryKey(Integer shoesId);

    int updateByPrimaryKeySelective(Shoes record);

    int updateByPrimaryKey(Shoes record);
}