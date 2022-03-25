package com.dao;

import com.dong.dao.StudentMapper;
import com.dong.dao.TeacherMapper;
import com.dong.pojo.Student;
import com.dong.pojo.Teacher;
import com.dong.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class TestDemo {
    @Test
    public void testStudent(){
        SqlSession sqlSession = MyBatisUtil.getsqlsession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> stduent = mapper.getStduent();
        for (Student student : stduent) {
            System.out.println(student);
        }
    }
    @Test
    public void testTeacher(){
        SqlSession sqlSession = MyBatisUtil.getsqlsession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        List<Teacher> teacher = mapper.getTeacher();
        for (Teacher teacher1 : teacher) {
            System.out.println(teacher1);
        }
    }
    @Test
    public void testStudent2(){
        SqlSession sqlSession = MyBatisUtil.getsqlsession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> student2 = mapper.getStudent2();
        for (Student student : student2) {
            System.out.println(student);
        }
    }
}
