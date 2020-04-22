package org.liangcy.student.service;

import org.liangcy.student.dao.StudentMapper;
import org.liangcy.student.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentMapper studentMapper;
    @Override
    public List<Student> selectStudent(Student student) {
        return studentMapper.selectStudent();
    }

    @Override
    public void deleteStudent(int id) {

    }

    @Override
    public void addStudent(Student student) {

    }

    @Override
    public Student getStudentById(int id) {
        return null;
    }

    @Override
    public void updateStudent(Student student) {

    }

    @Override
    public void deleteBatchStudent(String ids) {

    }

    @Override
    public int getCount(Student student) {
        return 0;
    }


}
