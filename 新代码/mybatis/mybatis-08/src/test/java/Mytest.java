import com.dong.dao.UserMapper;
import com.dong.pojo.User;
import com.dong.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class Mytest {
    @Test
    public void test(){
        SqlSession session = MyBatisUtil.getsqlsession();
        SqlSession session1= MyBatisUtil.getsqlsession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        UserMapper mapper1 = session1.getMapper(UserMapper.class);
        User userById = mapper.getUserById(2);
        System.out.println(userById);
        session.close();
        User userById1 = mapper1.getUserById(2);
        System.out.println(userById1);
        System.out.println(userById==userById1);
        session1.close();
    }
}
