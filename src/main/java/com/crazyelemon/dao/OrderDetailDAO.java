package com.crazyelemon.dao;

import com.crazyelemon.entity.OrderDetail;
import com.crazyelemon.entity.OrderDetailKey;

public interface OrderDetailDAO {
    int deleteByPrimaryKey(OrderDetailKey key);

    int insert(OrderDetail record);

    int insertSelective(OrderDetail record);

    OrderDetail selectByPrimaryKey(OrderDetailKey key);

    int updateByPrimaryKeySelective(OrderDetail record);

    int updateByPrimaryKey(OrderDetail record);

    /**
     @param orderDetail 添加的新订单详情对象
     @return 返回受影响行数
     */
    public  int saveDetails(OrderDetail orderDetail);
}