package id.co.indivara.jdt12.universit.service;

import id.co.indivara.jdt12.universit.entity.Student;
import id.co.indivara.jdt12.universit.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class StudentService  {

    @Autowired
    StudentRepository studentRepository;
    public Student createStudent(Student student){
        return studentRepository.save(student);
    }
    public List<Student> findAllStudent(){
        return studentRepository.findAll();
    }
}
