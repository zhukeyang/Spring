import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class test {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1.加载数据库的驱动
        //参数时驱动类的路径
        Class.forName("oracle.jdbc.OracleDriver"); //反射

        //2.获得连接对象
        Connection c= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");//驱动管理类
        if (c!=null)
        {
            System.out.println("连接成功");
        }
        //3.定义sql语句
        //4.获取执行sql的对象
        //5.处理结果
        //6.释放资源
        c.close();

    }
}