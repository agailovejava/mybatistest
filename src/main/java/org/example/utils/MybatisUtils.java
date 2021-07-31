package org.example.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MybatisUtils {

    private static SqlSessionFactory factory = null;
    static {

        try {
            String sql = "mybatis.xml";
            InputStream resourceAsStream = Resources.getResourceAsStream(sql);
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            factory = sqlSessionFactoryBuilder.build(resourceAsStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static SqlSession getSqlSession(){
        SqlSession sqlSession = null;
        if (factory != null){
            sqlSession = factory.openSession();

        }

        return sqlSession;
    }
}
