package org.example;
import domain.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class Mytest {
    //
    @Test
    public void testSelectStudentById() throws IOException {
        //要调用mybatis某个对象的方法，执行mapper文件中的sql语句
        //mybatis核心类：SqlSessionFactory


        //1.定义mybatis配置文件的位置
        String config="mybatis.xml";
        //2.读取配置文件
        InputStream inputStream = Resources.getResourceAsStream(config);
        //3.创建SQLSessionFactory对象，使用SqlSessionFactoryBuilder类
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(inputStream);
        //4.获取SQLSession对象
        SqlSession sqlSession= factory.openSession();
        //5.指定要执行的SQL语句标识（id）
        //sql语句的id等于namespace+“.”+<select>...标签的id的属性值
        String sqlId="dao.StudentDao.selectStudentById";
        //6.通过SQLSession的方法，执行SQL语句
        Student student = sqlSession.selectOne(sqlId,1);
        System.out.println("使用mybatis查询一个学生"+student);
        //7.关闭SqlSession的对象
        sqlSession.close();
    }
    @Test
    public void testSelectStudentById2() throws IOException {
        //要调用mybatis某个对象的方法，执行mapper文件中的sql语句
        //mybatis核心类：SqlSessionFactory


        //1.定义mybatis配置文件的位置
        String config="mybatis.xml";
        //2.读取配置文件
        InputStream inputStream = Resources.getResourceAsStream(config);
        //3.创建SQLSessionFactory对象，使用SqlSessionFactoryBuilder类
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(inputStream);
        //4.获取SQLSession对象
        SqlSession sqlSession= factory.openSession();
        //5.指定要执行的SQL语句标识（id）
        //sql语句的id等于namespace+“.”+<select>...标签的id的属性值
        String sqlId="dao.StudentDao"+"."+"selectStudentById";
        //6.通过SQLSession的方法，执行SQL语句,selectOne查询一条数据
        Student student = sqlSession.selectOne(sqlId,2);
        System.out.println("使用mybatis查询一个学生"+student);
        //7.关闭SqlSession的对象
        sqlSession.close();
    }
    @Test
    public void testInsertStudent() throws IOException
    {
        String config="mybatis.xml";
        InputStream inputStream=Resources.getResourceAsStream(config);
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession=factory.openSession();
        String sqlId="dao.StudentDao"+"."+"insertStudent";
        Student student=new Student();
        student.setId(5);
        student.setName("朱柯阳");
        student.setEmail("zhukeyang@");
        student.setAge(9);
        int rows=sqlSession.insert(sqlId,student);
        System.out.println("使用mybatis添加一个学生,rows:"+rows);
        //没有数据的原因，mybatis默认执行sql语句，手工提交事务模式，在做insert,update,delete后，需要提交事务
        sqlSession.commit();
        sqlSession.close();
    }
}
