package impl.com.atgugui.dao.impl;

import com.alibaba.druid.util.JdbcUtils;
import com.atgugui.JDBCUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import static com.atgugui.JDBCUtils.getConnection;

public abstract class BaseDao {
    private QueryRunner  queryRunner =new QueryRunner();
    public int update(String sql,Object...args) throws SQLException, IOException, ClassNotFoundException {
        Connection connection= getConnection();
        try {
            return queryRunner.update(connection,sql,args);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return -1;
    }
    public <T> T queryForOne(Class<T> type , String sql, Object ...args) throws SQLException, IOException, ClassNotFoundException {
        Connection connection= getConnection();
        try {
            return queryRunner.query(connection,sql,new BeanHandler<T>(type),args);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        finally {
            JdbcUtils.close(connection);
        }
            return null;
    }
    public <T> List<T> queryForList(Class<T> type , String sql, Object ...args) throws SQLException, IOException, ClassNotFoundException {
        Connection connection= getConnection();
        try {
            return queryRunner.query(connection,sql,new BeanListHandler<T>(type),args);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        finally {
            JdbcUtils.close(connection);
        }
        return null;
    }
    public Object queryForSingleValue(String sql, Object ...args) throws SQLException, IOException, ClassNotFoundException {
        Connection connection= JDBCUtils.getConnection();
        try {
            return queryRunner.query(connection,sql, new ScalarHandler(),args);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        finally {
            JdbcUtils.close(connection);
        }
        return null;
    }
}

