package edu.icet.controller;

import edu.icet.model.Student;
import edu.icet.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentServiceImpl service;

    @GetMapping("/get-Data")
    public List<Student> getStudent(){
        return service.getStudents();
    }
}
