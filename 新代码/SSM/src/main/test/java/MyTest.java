import com.dong.pojo.Books;
import com.dong.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test(){
       ApplicationContext context = new ClassPathXmlApplicationContext("appliactionContext.xml");
        BookService bookServiceImpl = context.getBean("BookServiceImpl", BookService.class);
        for (Books books : bookServiceImpl.queryAllBook()) {
            System.out.println(books);
        }
    }
}
