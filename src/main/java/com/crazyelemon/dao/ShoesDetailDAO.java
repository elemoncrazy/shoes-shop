package com.crazyelemon.dao;

import com.crazyelemon.entity.ShoesDetail;
import com.crazyelemon.entity.ShoesDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShoesDetailDAO {
    long countByExample(ShoesDetailExample example);

    int deleteByExample(ShoesDetailExample example);

    int deleteByPrimaryKey(Integer shoesDetailId);

    int insert(ShoesDetail record);

    int insertSelective(ShoesDetail record);

    List<ShoesDetail> selectByExample(ShoesDetailExample example);

    ShoesDetail selectByPrimaryKey(Integer shoesDetailId);

    int updateByExampleSelective(@Param("record") ShoesDetail record, @Param("example") ShoesDetailExample example);

    int updateByExample(@Param("record") ShoesDetail record, @Param("example") ShoesDetailExample example);

    int updateByPrimaryKeySelective(ShoesDetail record);

    int updateByPrimaryKey(ShoesDetail record);
}