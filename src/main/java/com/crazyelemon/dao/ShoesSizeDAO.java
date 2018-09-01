package com.crazyelemon.dao;

import com.crazyelemon.entity.ShoesSize;
import com.crazyelemon.entity.ShoesSizeExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ShoesSizeDAO {
    long countByExample(ShoesSizeExample example);

    int deleteByExample(ShoesSizeExample example);

    int deleteByPrimaryKey(Integer shoesSizeId);

    int insert(ShoesSize record);

    int insertSelective(ShoesSize record);

    List<ShoesSize> selectByExample(ShoesSizeExample example);

    ShoesSize selectByPrimaryKey(Integer shoesSizeId);

    int updateByExampleSelective(@Param("record") ShoesSize record, @Param("example") ShoesSizeExample example);

    int updateByExample(@Param("record") ShoesSize record, @Param("example") ShoesSizeExample example);

    int updateByPrimaryKeySelective(ShoesSize record);

    int updateByPrimaryKey(ShoesSize record);

    /*
        查询指定款式上的所有尺码

       ```java
        /**
         @param shooesId 指定的鞋子ID
         @return 返回指定鞋子的所有尺码
         */
    List<ShoesSize> queryAllSizeByShoesId(Integer shoesId);

}