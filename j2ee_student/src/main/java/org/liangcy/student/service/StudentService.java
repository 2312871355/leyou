package org.liangcy.student.service;

import org.liangcy.student.pojo.Student;

import java.util.List;

public interface StudentService {
    List<Student> selectStudent(Student student);
    void deleteStudent(int id);
    void addStudent(Student student);
    Student getStudentById(int id);
    void updateStudent(Student student);
    void deleteBatchStudent(String ids);
    int getCount(Student student);
}
