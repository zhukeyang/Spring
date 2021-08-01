package com.node.service.impl;

import com.node.dao.StudentDao;
import com.node.domain.Student;
import com.node.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.Assert.*;
@Service
public class StudentServiceImpl implements StudentService {
/*
* dao是引用类型，StudentDao类型的对象实在spring的配置文件中创建的对象
*
* 引用类型的自动注入
*
* */
    @Autowired
private StudentDao dao;
    @Override
    public int addStudent(Student student) {
        int rows = dao.insertStudent(student);
        return rows;
    }
    @Override
    public List<Student> queryStudents() {
        List<Student> list = dao.selectStudents();
        return list;
    }
}