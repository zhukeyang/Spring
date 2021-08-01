package com.node.dao;
import java.util.List;
import com.node.domain.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

@Mapper
public interface StudentDao {
    int insertStudent(Student student);
    List<Student> selectStudents();
}
