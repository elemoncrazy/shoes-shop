package com.crazyelemon.dao;

import com.crazyelemon.entity.Shoes;
import com.crazyelemon.entity.ShoesDetail;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShoesDAO {
    int deleteByPrimaryKey(Integer shoesId);

    int insert(Shoes record);

    int insertSelective(Shoes record);

    Shoes selectByPrimaryKey(Integer shoesId);

    int updateByPrimaryKeySelective(Shoes record);

    int updateByPrimaryKey(Shoes record);

    List<Shoes> queryAll();

    List<Shoes> queryByName(String shoesName);

    List< Shoes> queryByGender(Integer gender);

    List<ShoesDetail> queryBySize(Float size);

    List<Shoes> queryByPrice(@Param("minPrice") Float minPrice,@Param("maxPrice") Float maxPrice);

    List<Shoes> queryByCategory(Integer categoryId);

}