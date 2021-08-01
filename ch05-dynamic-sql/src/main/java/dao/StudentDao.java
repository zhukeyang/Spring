package dao;

import com.Student;
import org.apache.ibatis.annotations.Param;
import vo.QueryParam;

import java.util.List;

public interface StudentDao {
    //if
    List<Student> selectIf(Student student);
    List<Student> selectWhere(Student student);
//    foreach-1
    List<Student> selectForeachOne(List<Integer> idlist);
    List<Student> selectForeachTwo(List<Student> studentList);
    List<Student> selectAllStudents();
}
