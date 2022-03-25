package com.dong.service;

import com.dong.pojo.Books;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface BookService {
    //增加一本书
    int addBook(Books books);
    //删除一本书
    int deleteBook(int id);
    //修改一本书
    int updateBook(Books books);
    //查询一本书
    Books queryBook(int id);
    //查询全部的书
    List<Books> queryAllBook();
}
