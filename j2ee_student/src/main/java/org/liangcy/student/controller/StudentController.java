package org.liangcy.student.controller;

import org.liangcy.student.pojo.Student;
import org.liangcy.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;
    @RequestMapping("/selectStudent")
    public String selectStudent(Model model, Student student) {
        List<Student> studentList = studentService.selectStudent(student);
        model.addAttribute("studentList",studentList);
        System.out.println();
        return "student";
    }
    public void test(){
        System.out.println("添加了一行代码");
    }
}
