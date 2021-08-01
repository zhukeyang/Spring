import org.junit.jupiter.api.Test;

import java.sql.Connection;

/**
 * 测试通过德鲁伊连接池连接oracle数据库
 * 测试成功
 */
public class JdbcUtilTest {
    public void test(){
        Connection connection = JdbcUtils.getConnection();
        System.out.println(connection);
        JdbcUtils.close(connection);
    }
}
