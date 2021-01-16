import com.cheng.mybatis.TestService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author create by Niancheng On 2021/1/16 9:27
 */
public class TestMain {

    @Autowired
    TestService testService;

    ClassPathXmlApplicationContext applicationContext;
    Connection connection;

    @Before
    public void before() throws SQLException {
        applicationContext = new ClassPathXmlApplicationContext("classpath:spring-mvc.xml");
        DataSource dataSource = (DataSource) applicationContext.getBean("dataSource");
        connection = dataSource.getConnection();
        System.out.println("数据库已连接");
    }

    @After
    public void after() throws SQLException {
        if(connection != null){
            connection.close();
            System.out.println("数据库链接已关闭！");
        }
    }

    @Test
    public void test() throws SQLException {
        applicationContext.getBean(TestService.class).test();
    }

}
