package org.example;

import com.Student;
import dao.StudentDao;
import dao.impl.studentDaoImpl;
import org.junit.Test;

import java.util.List;

public class MyTest2 {
    @Test
    public void testSelectOne()
    {
        //使用Dao的方法
        StudentDao dao =new studentDaoImpl();
        Student student = dao.selectById(1);
        System.out.println("通过Dao方法得到的对象"+student);
    }
    @Test
    public void testSelectStudents()
    {
        StudentDao dao=new studentDaoImpl();
        List<Student> students= dao.selectStudent();
        students.forEach(stu-> System.out.println("stu"+stu));
    }
    @Test
    public void testInsertStudent()
    {
        StudentDao dao=new studentDaoImpl();
        Student student=new Student();
        student.setId(6);
        student.setName("李信信信");
        student.setAge(8);
        student.setEmail("123");
        int i = dao.insertStudent(student);
        System.out.println("影响的行数"+i);
    }
}
