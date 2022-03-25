package com.dong.dao;

import com.dong.pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {
    //插入数据
    int addblog(Blog blog);
    //查询博客
    List<Blog> queryBlogIf(Map map);
    //查询
    List<Blog> queryBlogChoose(Map map);
    //更新
    int updateBlogif(Map map);
    //查询foreach
    List<Blog> selectBlog(Map map);
}
