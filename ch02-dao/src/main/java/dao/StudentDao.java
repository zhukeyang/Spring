package dao;

import com.Student;

import java.util.List;

public interface StudentDao {
    //查询
    Student selectById(Integer id);
    List<Student> selectStudent();
    int insertStudent(Student student);
}
