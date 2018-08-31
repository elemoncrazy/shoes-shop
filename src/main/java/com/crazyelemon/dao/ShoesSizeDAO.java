package com.crazyelemon.dao;

import com.crazyelemon.entity.ShoesSize;

public interface ShoesSizeDAO {
    int deleteByPrimaryKey(Integer shoesSizeId);

    int insert(ShoesSize record);

    int insertSelective(ShoesSize record);

    ShoesSize selectByPrimaryKey(Integer shoesSizeId);

    int updateByPrimaryKeySelective(ShoesSize record);

    int updateByPrimaryKey(ShoesSize record);
}