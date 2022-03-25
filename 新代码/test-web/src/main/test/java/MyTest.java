import com.kuang.service.Service;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void Test01(){
        ApplicationContext context=new ClassPathXmlApplicationContext("springf.xml");
        Service bean = context.getBean(Service.class);
        bean.getUser();
    }
}
