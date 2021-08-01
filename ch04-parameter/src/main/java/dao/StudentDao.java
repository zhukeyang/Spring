package dao;

import com.Student;
import org.apache.ibatis.annotations.Param;
import vo.QueryParam;

import java.util.List;

public interface StudentDao {
    //查询
    Student selectById(Integer id);
    //dao接口的方法形参是一个简单类型的
    //简单类型：java基本数据类型和String
    Student selectByEmail(String email);
    /*
    *多个简单类型的参数
    *使用@Param命名参数，这个注解是mybatis提供的
    * 位置：在形参定义的前面
    * 属性 value 自定义的参数名称
    *
    * 方法的形参是一个java对象
    * */
    List<Student> selectByNameOrAge(@Param("myname") String name,
                                    @Param("myage") Integer age);
    /*
    *
    * 一个java对象作为参数
    *           对象有属性，每个属性有set，get方法
    *
    * */
    List<Student> selectByObject(Student student);

    List<Student> selectByQueryParam(QueryParam param);
    List<Student> selectLikeOne(String name);

}
