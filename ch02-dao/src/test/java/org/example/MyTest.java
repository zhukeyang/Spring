package org.example;

import com.Student;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import utils.MyBatisUtil;

import java.util.ArrayList;
import java.util.List;

public class MyTest {
    @Test
    public void testSelectById()
    {
        //1.获取SqlSession对象
        SqlSession session= MyBatisUtil.getSession();
        //2.指定sqlId
        String sqlId="dao.StudentDao.selectById";
        //3.执行SqlSession的方法，表示执行SQL语句
        Student student = session.selectOne(sqlId, 1);
        System.out.println("查询结果"+student);
        //4.关闭SqlSession对象
        session.close();
    }
    @Test
    public void testSelectStudents()
    {
        SqlSession session=MyBatisUtil.getSession();
        String sqlId="dao.StudentDao.selectStudents";
        List<Student> students=session.selectList(sqlId);
        for (Student student : students) {
            System.out.println("student"+student);
        }
        session.close();
    }
    @Test
    public void testinsertStudent()
    {
        SqlSession session=MyBatisUtil.getSession();
        String sqlId="dao.StudentDao.insertStudent";
        Student student=new Student();
        student.setId(5);
        student.setName("李信信信");
        student.setAge(8);
        student.setEmail("123");
        int insert = session.insert(sqlId, student);
        System.out.println("影响的行数"+insert);
        session.close();
    }
}
