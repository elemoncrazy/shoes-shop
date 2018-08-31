package com.crazyelemon.dao;

import com.crazyelemon.entity.CustLogin;
import com.crazyelemon.entity.CustLoginExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustLoginDAO {
    long countByExample(CustLoginExample example);

    int deleteByExample(CustLoginExample example);

    int deleteByPrimaryKey(Integer loginId);

    int insert(CustLogin record);

    int insertSelective(CustLogin record);

    List<CustLogin> selectByExample(CustLoginExample example);

    CustLogin selectByPrimaryKey(Integer loginId);

    int updateByExampleSelective(@Param("record") CustLogin record, @Param("example") CustLoginExample example);

    int updateByExample(@Param("record") CustLogin record, @Param("example") CustLoginExample example);

    int updateByPrimaryKeySelective(CustLogin record);

    int updateByPrimaryKey(CustLogin record);
}