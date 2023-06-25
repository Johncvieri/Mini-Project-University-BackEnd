//package id.co.indivara.jdt12.universit.controller;
//
//import id.co.indivara.jdt12.universit.entity.Lecture;
//import id.co.indivara.jdt12.universit.entity.Student;
//import id.co.indivara.jdt12.universit.exceptions.ResourceNotFoundException;
//import id.co.indivara.jdt12.universit.repo.LectureRepository;
//import id.co.indivara.jdt12.universit.repo.ResponMessage;
//import id.co.indivara.jdt12.universit.repo.StudentRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.Optional;
//
//@RestController
//
//public class LectureController {
//    @Autowired
//    private LectureRepository lectureRepository;
//    @Autowired
//    private StudentRepository studentRepository;
//
//        @GetMapping("/findlecture/{nip}")
//    public Lecture findLecture(@PathVariable Long nip) throws Exception{
//        Optional<Lecture> lecture = lectureRepository.findById(nip);
//        Lecture lect = lecture.orElseThrow(() -> new RuntimeException("Lecture not found"));
//        return lect;
//    }
//    @GetMapping("/findstudent/{studentId}")
//    public Student findStudent(@PathVariable Long studentId){
//        Optional<Student> lecture = studentRepository.findById(studentId);
//        Student student = lecture.orElseThrow(() -> new RuntimeException("Student not found"));
//        return student;
//    }
//
//    @PostMapping("/add/lecture")
//    public ResponMessage add(@RequestBody Lecture lecture){
//        lectureRepository.save(lecture);
//        return new ResponMessage("Data updated successfully."+  lecture+ " ", 200);
//    }
//    @GetMapping("/all/lecture")
//    public ArrayList<Lecture> findAllStudent() {
//        ArrayList<Lecture> lectures = (ArrayList<Lecture>) lectureRepository.findAll();
//        return lectures;
//
//    }
//
//}
