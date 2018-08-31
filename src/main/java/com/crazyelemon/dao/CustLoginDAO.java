package com.crazyelemon.dao;

import com.crazyelemon.entity.CustLogin;

public interface CustLoginDAO {
    int deleteByPrimaryKey(Integer loginId);

    int insert(CustLogin record);

    int insertSelective(CustLogin record);

    CustLogin selectByPrimaryKey(Integer loginId);

    int updateByPrimaryKeySelective(CustLogin record);

    int updateByPrimaryKey(CustLogin record);
}