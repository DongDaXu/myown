import com.dong.dao.BlogMapper;
import com.dong.pojo.Blog;
import com.dong.utils.Idutil;
import com.dong.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.*;

public class MyTest {
    @Test
    public void test(){
        SqlSession sqlSession = MyBatisUtil.getsqlsession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Blog blog = new Blog();
        blog.setId(Idutil.getId());
        blog.setTitle("Mybatis如此简单");
        blog.setAuthor("狂神说");
        blog.setCreateTime(new Date());
        blog.setViews(9999);
        mapper.addblog(blog);
        blog.setId(Idutil.getId());
        blog.setTitle("Java");
        mapper.addblog(blog);

        blog.setId(Idutil.getId());
        blog.setTitle("Spring");
        mapper.addblog(blog);

        blog.setId(Idutil.getId());
        blog.setTitle("微服务");
        mapper.addblog(blog);
    }
    @Test
    public void test02(){
        SqlSession session = MyBatisUtil.getsqlsession();
        BlogMapper mapper = session.getMapper(BlogMapper.class);
        HashMap map=new HashMap();
        map.put("title","Java");
        List<Blog> blogs = mapper.queryBlogIf(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        session.close();
    }
    @Test
    public void test03(){
        SqlSession session = MyBatisUtil.getsqlsession();
        BlogMapper mapper = session.getMapper(BlogMapper.class);
        HashMap map=new HashMap();
        map.put("title","Java");
        List<Blog> blogs = mapper.queryBlogChoose(map);
        for (Blog blog : blogs) {
            System.out.println(blog+" ");
        }
        System.out.println(blogs.size());
        session.close();
    }
    @Test
    public void test04(){
        SqlSession sqlSession = MyBatisUtil.getsqlsession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap map=new HashMap();
        map.put("author","李白");
        map.put("title","Java");
        int i = mapper.updateBlogif(map);
        System.out.println(i);
        sqlSession.close();
    }
    @Test
    public void test05(){
        SqlSession sqlSession = MyBatisUtil.getsqlsession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap map=new HashMap();
        ArrayList<Integer> ids=new ArrayList<Integer>();
        ids.add(1);
        ids.add(3);
        map.put("ids",ids);
        List<Blog> blogs = mapper.selectBlog(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        sqlSession.close();
    }
}
