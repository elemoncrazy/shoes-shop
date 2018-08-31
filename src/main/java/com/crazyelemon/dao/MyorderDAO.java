package com.crazyelemon.dao;

import com.crazyelemon.entity.Myorder;
import com.crazyelemon.entity.OrderDetail;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MyorderDAO {
    int deleteByPrimaryKey(Integer orderId);

    int insert(Myorder record);

    int insertSelective(Myorder record);

    Myorder selectByPrimaryKey(Integer orderId);

    int updateByPrimaryKeySelective(Myorder record);

    int updateByPrimaryKey(Myorder record);

    /**
     @param order 添加的新订单对象
     @return 返回受影响行数
     */
    public  int save(Myorder order);

    /**
     @param custId 当前用户的ID
     @return 返回当前账户的所有订单列表
     */
    public List<Myorder> queryAll(Integer custId);

    /**
     @param shoesName 要查询的鞋的名称（模糊查询）
     @param custId 当前用户的ID
     @return 返回当前用户的要查询的订单列表
     */
    public  List<Myorder> queryByShooesName(@Param(value = "shoesName") String shoesName, @Param(value = "custId") Integer custId);


    /**
     @param orderNumber 要查询的订单编号（模糊查询）
     @param custId 当前用户的ID
     @return 返回当前用户的要查询指定的订单详情
     */
    public  List<Myorder> queryById(@Param(value = "orderNumber") String orderNumber,@Param(value = "custId") Integer custId);

    /**
     @param status  修改订单状态
     @param orderId  指定的要修改的订单ID
     @return  返回受影响行数
     */
    public  int updateStatus(@Param(value = "status") Integer status,@Param(value = "orderId") Integer orderId);
}