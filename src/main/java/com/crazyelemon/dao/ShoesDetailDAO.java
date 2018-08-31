package com.crazyelemon.dao;

import com.crazyelemon.entity.ShoesDetail;

public interface ShoesDetailDAO {
    int deleteByPrimaryKey(Integer shoesDetailId);

    int insert(ShoesDetail record);

    int insertSelective(ShoesDetail record);

    ShoesDetail selectByPrimaryKey(Integer shoesDetailId);

    int updateByPrimaryKeySelective(ShoesDetail record);

    int updateByPrimaryKey(ShoesDetail record);
}