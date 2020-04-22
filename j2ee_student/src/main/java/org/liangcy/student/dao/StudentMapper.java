package org.liangcy.student.dao;

import org.apache.ibatis.annotations.Mapper;
import org.liangcy.student.pojo.Student;

import java.util.List;
@Mapper
public interface StudentMapper {
    List<Student> selectStudent();
    void deleteStudent(int id);
    void addStudent(Student student);
    Student getStudentById(int id);
    void updateStudent(Student student);
}
