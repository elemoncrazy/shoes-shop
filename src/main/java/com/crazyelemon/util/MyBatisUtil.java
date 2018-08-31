package com.crazyelemon.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisUtil {
    private static SqlSessionFactory sqlSessionFactory = null;
    private static SqlSession sqlSession = null;
    static {
        InputStream in = null;
        try {
            in = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
    }

    public static SqlSession getSession(){
        sqlSession = sqlSessionFactory.openSession();
        return sqlSession;
    }

    public static void closeSession(){
        if(null!=sqlSession){
            sqlSession.close();
        }
    }

//    public static void main(String[] args) {
//        try {
//            MyBatisUtil.getSession().getConfiguration().getEnvironment().getDataSource().getConnection();
//            System.out.println(MyBatisUtil.getSession().getConfiguration().getEnvironment().getDataSource().getConnection());
//
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
}
