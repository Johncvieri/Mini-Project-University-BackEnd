package id.co.indivara.jdt12.universit.controller;

import id.co.indivara.jdt12.universit.entity.Student;
import id.co.indivara.jdt12.universit.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;


    @PostMapping("/add")
    public Student addStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }

    @GetMapping("/all")
    public List<Student> findAllStudent(){
        return studentService.findAllStudent();
    }



}
