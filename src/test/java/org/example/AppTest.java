package org.example;

import static org.junit.Assert.assertTrue;

import org.apache.ibatis.session.SqlSession;
import org.example.dao.Country;
import org.example.dao.Minister;
import org.example.utils.MybatisUtils;
import org.junit.Test;

import java.util.Iterator;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest{


    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        Minister mapper = sqlSession.getMapper(Minister.class);
        List<Minister> ministers = mapper.MinViewCou();
        System.out.println(ministers);
    }


    @Test
    public void test2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        Country mapper = sqlSession.getMapper(Country.class);
        List<Country> countries = mapper.CouViewMin();
        System.out.println(countries);
    }




}
