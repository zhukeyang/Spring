package org.example;
import com.Student;
import dao.StudentDao;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import utils.MyBatisUtil;
import vo.QueryParam;

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
        System.out.println("student"+student);
        session.close();
    }
    @Test
    public void testOneParameter()
    {
        SqlSession session=MyBatisUtil.getSession();
        StudentDao dao = session.getMapper(StudentDao.class);
        Student student = dao.selectByEmail("a");
        System.out.println("email==="+student);
        session.close();
    }
    @Test
    public void testselectByNameOrAge()
    {
        SqlSession session=MyBatisUtil.getSession();
        StudentDao dao = session.getMapper(StudentDao.class);
        List<Student> students=dao.selectByNameOrAge("a",12);
        for (Student student : students) {
            System.out.println(student);
        }
        session.close();
    }
    @Test
    public void TestSelectObject()
    {
        SqlSession session=MyBatisUtil.getSession();
        StudentDao dao = session.getMapper(StudentDao.class);
        Student student=new Student();
        student.setName("a");
        student.setAge(12);
        List<Student> students=dao.selectByObject(student);
        for (Student student1 : students) {
            System.out.println(student1);
        }
        session.close();
    }
    @Test
    public void  TestselectByQueryParam()
    {
        SqlSession session=MyBatisUtil.getSession();
        StudentDao dao = session.getMapper(StudentDao.class);
        QueryParam param=new QueryParam();
        param.setP1("a");
        param.setP2("12");
        List<Student> students = dao.selectByQueryParam(param);
        for (Student student : students) {
            System.out.println("student==="+student);
        }
        session.close();
    }
    @Test
    public void testLikeOne()
    {
        SqlSession session=MyBatisUtil.getSession();
        StudentDao dao = session.getMapper(StudentDao.class);
        String name="%李%";
        List<Student> students= dao.selectLikeOne(name);
        session.close();
        for (Student student : students) {
            System.out.println("student==="+student);
        }
    }
}
