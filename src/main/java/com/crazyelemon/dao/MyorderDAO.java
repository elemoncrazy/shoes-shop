package com.crazyelemon.dao;

import com.crazyelemon.entity.Myorder;

public interface MyorderDAO {
    int deleteByPrimaryKey(Integer orderId);

    int insert(Myorder record);

    int insertSelective(Myorder record);

    Myorder selectByPrimaryKey(Integer orderId);

    int updateByPrimaryKeySelective(Myorder record);

    int updateByPrimaryKey(Myorder record);
}