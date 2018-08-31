package com.crazyelemon.dao;

import com.crazyelemon.entity.ShoesImg;

public interface ShoesImgDAO {
    int deleteByPrimaryKey(Integer imgId);

    int insert(ShoesImg record);

    int insertSelective(ShoesImg record);

    ShoesImg selectByPrimaryKey(Integer imgId);

    int updateByPrimaryKeySelective(ShoesImg record);

    int updateByPrimaryKey(ShoesImg record);
}