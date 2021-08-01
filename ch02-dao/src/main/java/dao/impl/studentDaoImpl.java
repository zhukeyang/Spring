package dao.impl;

import com.Student;
import dao.StudentDao;
import org.apache.ibatis.session.SqlSession;
import utils.MyBatisUtil;

import java.util.List;

public class studentDaoImpl implements StudentDao {
    @Override
    public Student selectById(Integer id) {
        SqlSession session= MyBatisUtil.getSession();
        String sqlId="dao.StudentDao.selectById";
        Student student = session.selectOne(sqlId, 1);
        return student;
    }

    @Override
    public List<Student> selectStudent() {
        SqlSession session=MyBatisUtil.getSession();
        String sqlId="dao.StudentDao.selectStudents";
        List<Student> students = session.selectList(sqlId);
        session.close();
        return students;
    }

    @Override
    public int insertStudent(Student student) {
        SqlSession session=MyBatisUtil.getSession();
        String sqlId="dao.StudentDao.insertStudent";
        int i = session.insert(sqlId, student);
        session.commit();
        System.out.println("影响的行数"+i);
        session.close();
        return i;
    }
}
