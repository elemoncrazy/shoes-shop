package com.crazyelemon.dao;

import com.crazyelemon.entity.Myorder;
import com.crazyelemon.entity.MyorderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MyorderDAO {
    long countByExample(MyorderExample example);

    int deleteByExample(MyorderExample example);

    int deleteByPrimaryKey(Integer orderId);

    int insert(Myorder record);

    int insertSelective(Myorder record);

    List<Myorder> selectByExample(MyorderExample example);

    Myorder selectByPrimaryKey(Integer orderId);

    int updateByExampleSelective(@Param("record") Myorder record, @Param("example") MyorderExample example);

    int updateByExample(@Param("record") Myorder record, @Param("example") MyorderExample example);

    int updateByPrimaryKeySelective(Myorder record);

    int updateByPrimaryKey(Myorder record);
}