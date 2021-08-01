package org.example;

import com.Student;
import dao.StudentDao;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import utils.MyBatisUtil;

import java.util.ArrayList;
import java.util.List;
//1.获取SqlSession对象
//2.指定sqlId
//3.执行SqlSession的方法，表示执行SQL语句
//4.关闭SqlSession对象
public class MyTest {
    @Test
    public void testSelectById()
    {
        SqlSession session= MyBatisUtil.getSession();
        //获取dao代理
        StudentDao dao = session.getMapper(StudentDao.class);
        Student student = dao.selectById(4);
        System.out.println("studnet"+student);
        session.close();
    }
    @Test
    public void testSelectStudents()
    {
        SqlSession session=MyBatisUtil.getSession();
        StudentDao dao = session.getMapper(StudentDao.class);
        System.out.println("dao=="+dao.getClass().getName());
        List<Student> students=dao.selectStudents();
        students.forEach(student -> System.out.println("student"+student));
        session.close();
    }
}
