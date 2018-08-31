package com.crazyelemon.dao;

import com.crazyelemon.entity.ReceiveAddress;

public interface ReceiveAddressDAO {
    int deleteByPrimaryKey(Integer addressId);

    int insert(ReceiveAddress record);

    int insertSelective(ReceiveAddress record);

    ReceiveAddress selectByPrimaryKey(Integer addressId);

    int updateByPrimaryKeySelective(ReceiveAddress record);

    int updateByPrimaryKey(ReceiveAddress record);
}