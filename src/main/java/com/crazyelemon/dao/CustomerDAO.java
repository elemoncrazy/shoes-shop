package com.crazyelemon.dao;

import com.crazyelemon.entity.Customer;

public interface CustomerDAO {
    int deleteByPrimaryKey(Integer custId);

    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(Integer custId);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);

    Long isValidTelno(Long telno);

    String isValidEmail(String email);

    int updatePwd(Customer customer);

}