package utils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.session.defaults.DefaultSqlSessionFactory;

import java.io.IOException;
import java.io.InputStream;


/*
*
* 工具类 创建sqlSession对象
* */
public class MyBatisUtil {
    private static SqlSessionFactory factory=null;
    static {
        String config="mybatis.xml";
        try {
            InputStream inputStream = Resources.getResourceAsStream(config);
            factory=new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //创建方法，创建SqlSession
    public static SqlSession getSession()
    {
        SqlSession session=null;
        if(factory!=null)
        {
           session= factory.openSession();
        }
        return session;
    }
}
