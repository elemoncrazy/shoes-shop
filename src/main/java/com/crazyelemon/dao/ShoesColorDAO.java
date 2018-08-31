package com.crazyelemon.dao;

import com.crazyelemon.entity.ShoesColor;

public interface ShoesColorDAO {
    int deleteByPrimaryKey(Integer shoesColorId);

    int insert(ShoesColor record);

    int insertSelective(ShoesColor record);

    ShoesColor selectByPrimaryKey(Integer shoesColorId);

    int updateByPrimaryKeySelective(ShoesColor record);

    int updateByPrimaryKey(ShoesColor record);
}