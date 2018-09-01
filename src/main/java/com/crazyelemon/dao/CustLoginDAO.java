package com.crazyelemon.dao;

import com.crazyelemon.entity.CustLogin;
import com.crazyelemon.entity.Customer;
import org.apache.ibatis.annotations.Param;

public interface CustLoginDAO {
    int deleteByPrimaryKey(Integer loginId);

    int insert(CustLogin record);

    int insertSelective(CustLogin record);

    CustLogin selectByPrimaryKey(Integer loginId);

    int updateByPrimaryKeySelective(CustLogin record);

    int updateByPrimaryKey(CustLogin record);


    Customer checkTelnoAndPwd(@Param("telno") Long telno, @Param("password") String password);

    Customer  checkEmailAndPwd (@Param("email") String email,@Param("password") String password );

    int save(CustLogin custLogin);

}