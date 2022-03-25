package com.dong.dao;

import com.dong.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {
    //增加一本书
    int addBook(Books books);
    //删除一本书
    int deleteBook(@Param("bookID") int id);
    //修改一本书
    int updateBook(Books books);
    //查询一本书
    Books queryBook(@Param("bookID") int id);
    //查询全部的书
    List<Books> queryAllBook();
}
