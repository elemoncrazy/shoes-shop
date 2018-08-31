package com.crazyelemon.dao;

import com.crazyelemon.entity.Shoes;
import com.crazyelemon.entity.ShoesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShoesDAO {
    long countByExample(ShoesExample example);

    int deleteByExample(ShoesExample example);

    int deleteByPrimaryKey(Integer shoesId);

    int insert(Shoes record);

    int insertSelective(Shoes record);

    List<Shoes> selectByExample(ShoesExample example);

    Shoes selectByPrimaryKey(Integer shoesId);

    int updateByExampleSelective(@Param("record") Shoes record, @Param("example") ShoesExample example);

    int updateByExample(@Param("record") Shoes record, @Param("example") ShoesExample example);

    int updateByPrimaryKeySelective(Shoes record);

    int updateByPrimaryKey(Shoes record);
}