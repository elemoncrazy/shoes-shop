package com.crazyelemon.dao;

import com.crazyelemon.entity.ReceiveAddress;
import com.crazyelemon.entity.ReceiveAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReceiveAddressDAO {
    long countByExample(ReceiveAddressExample example);

    int deleteByExample(ReceiveAddressExample example);
    //删除收件地址
    int deleteByPrimaryKey(Integer addressId);
    //添加新收件地址
    int insert(ReceiveAddress record);

    int insertSelective(ReceiveAddress record);

    List<ReceiveAddress> selectByExample(ReceiveAddressExample example);

    ReceiveAddress selectByPrimaryKey(Integer addressId);

    int updateByExampleSelective(@Param("record") ReceiveAddress record, @Param("example") ReceiveAddressExample example);

    int updateByExample(@Param("record") ReceiveAddress record, @Param("example") ReceiveAddressExample example);

    int updateByPrimaryKeySelective(ReceiveAddress record);

    int updateByPrimaryKey(ReceiveAddress record);
    //设置某一个收件地址为默认地址（只有一个）
    int updateDefaultAddress(@Param("addressId") Integer addressId,@Param("custId") Integer custId);
    //修改当前用户收件地址的信息
    int updateByCustId(@Param("address")ReceiveAddress address,@Param("custId")Integer custId);
    //查看当前用户所有收件地址列表
    List<ReceiveAddress> queryAll(Integer custId);

}