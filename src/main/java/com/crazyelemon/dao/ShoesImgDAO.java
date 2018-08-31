package com.crazyelemon.dao;

import com.crazyelemon.entity.ShoesImg;
import com.crazyelemon.entity.ShoesImgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShoesImgDAO {
    long countByExample(ShoesImgExample example);

    int deleteByExample(ShoesImgExample example);

    int deleteByPrimaryKey(Integer imgId);

    int insert(ShoesImg record);

    int insertSelective(ShoesImg record);

    List<ShoesImg> selectByExample(ShoesImgExample example);

    ShoesImg selectByPrimaryKey(Integer imgId);

    int updateByExampleSelective(@Param("record") ShoesImg record, @Param("example") ShoesImgExample example);

    int updateByExample(@Param("record") ShoesImg record, @Param("example") ShoesImgExample example);

    int updateByPrimaryKeySelective(ShoesImg record);

    int updateByPrimaryKey(ShoesImg record);
}