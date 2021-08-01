package org.example;
import com.Student;
import com.github.pagehelper.PageHelper;
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
    public void testPageHelper()
    {
        SqlSession session=MyBatisUtil.getSession();
        StudentDao dao = session.getMapper(StudentDao.class);
        PageHelper.startPage(2,3);
        List<Student> students=dao.selectAllStudents();
        for (Student student : students) {
            System.out.println("student==="+student);
        }
        session.close();
    }













    @Test
    public void testSelectById()
    {
        SqlSession session= MyBatisUtil.getSession();
        //获取dao代理
        StudentDao dao = session.getMapper(StudentDao.class);
        Student student=new Student();
        student.setName("李信信");
        student.setAge(8);
        List<Student> students=dao.selectIf(student);
        for (Student student1 : students) {
            System.out.println(student1);
        }
        session.close();
    }
    @Test
    public void selectWhere()
    {
        SqlSession session= MyBatisUtil.getSession();
        //获取dao代理
        StudentDao dao = session.getMapper(StudentDao.class);
        Student student=new Student();
        student.setName("李信信");
        student.setAge(8);
        List<Student> students=dao.selectIf(student);
        for (Student student1 : students) {
            System.out.println(student1);
        }
        session.close();
    }
}
