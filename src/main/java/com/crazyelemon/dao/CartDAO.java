package com.crazyelemon.dao;

import com.crazyelemon.entity.Cart;
import com.crazyelemon.entity.CartExample;
import java.util.List;

import com.crazyelemon.entity.ShoesDetail;
import org.apache.ibatis.annotations.Param;

public interface CartDAO {
    long countByExample(CartExample example);

    int deleteByExample(CartExample example);

    int deleteByPrimaryKey(Integer cartId);
    //添加商品至购物车
    int insert(Cart record);

    int insertSelective(Cart record);

    List<Cart> selectByExample(CartExample example);

    Cart selectByPrimaryKey(Integer cartId);

    int updateByExampleSelective(@Param("record") Cart record, @Param("example") CartExample example);

    int updateByExample(@Param("record") Cart record, @Param("example") CartExample example);

    int updateByPrimaryKeySelective(Cart record);

    int updateByPrimaryKey(Cart record);

    //删除购物车中的商品
    int deleteByShoesDetailId(Integer shoesDetailId);
    //修改购物车中的商品数量
    int updateCount(@Param("shoesDetailId") Integer shoesDetailId,@Param("custId") Integer custId,@Param("quality") String quality);
    //查看某用户购物车中所有商品
    List<Cart> queryAll(Integer custId);
}