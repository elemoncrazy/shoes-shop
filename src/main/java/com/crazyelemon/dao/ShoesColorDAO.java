package com.crazyelemon.dao;

import com.crazyelemon.entity.ShoesColor;
import com.crazyelemon.entity.ShoesColorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShoesColorDAO {
    long countByExample(ShoesColorExample example);

    int deleteByExample(ShoesColorExample example);

    int deleteByPrimaryKey(Integer shoesColorId);

    int insert(ShoesColor record);

    int insertSelective(ShoesColor record);

    List<ShoesColor> selectByExample(ShoesColorExample example);

    ShoesColor selectByPrimaryKey(Integer shoesColorId);

    int updateByExampleSelective(@Param("record") ShoesColor record, @Param("example") ShoesColorExample example);

    int updateByExample(@Param("record") ShoesColor record, @Param("example") ShoesColorExample example);

    int updateByPrimaryKeySelective(ShoesColor record);

    int updateByPrimaryKey(ShoesColor record);
}