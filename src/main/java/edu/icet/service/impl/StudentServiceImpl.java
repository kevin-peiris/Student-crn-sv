package edu.icet.service.impl;

import edu.icet.model.Student;
import edu.icet.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Override
    public String getStudent() {
        return "Saman";
    }

    @Override
    public List<Student> getStudents() {
        ArrayList<Student> students=new ArrayList<>();
        students.add(new Student(1,"Saman","Gampaha"));
        students.add(new Student(2,"Nimal","Horana"));
        students.add(new Student(3,"Kamal","Dehiwala"));

        return students;
    }
}
