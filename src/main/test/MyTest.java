import com.itdr.pojo.User;
import com.itdr.utils.JdbcUtils;

import java.util.List;

public class MyTest {
    public static void main(String[] args) {
        //��ɾ���÷�
        //Object[]param={"Rookie","1234","15733334444","0","1"};
        //int i=JdbcUtils.executeUpdate("insert into user(username,password,phone,role,status) values(?,?,?,?,?)",param);
        //���÷�
        List<User> list= JdbcUtils.executeQuery("select user_id,username,password,phone,role from user",User.class);
        System.out.println(list);
    }
}
