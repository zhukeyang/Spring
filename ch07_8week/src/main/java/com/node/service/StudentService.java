package com.node.service;

import com.node.domain.Student;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public interface StudentService {
    int addStudent(Student student);
    List<Student> queryStudents();
}
