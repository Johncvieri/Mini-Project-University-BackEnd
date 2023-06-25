package id.co.indivara.jdt12.universit.controller;

import id.co.indivara.jdt12.universit.entity.Subject;
import id.co.indivara.jdt12.universit.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SubjectController {
    @Autowired
    SubjectService subjectService;
    @PostMapping("/matkul")
    public Subject createMatkul(@RequestBody Subject subject){
        return subjectService.createMatkul(subject);
    }
    @GetMapping("/matkul")
    public List<Subject> getAllSubject(){
        return subjectService.getAllSubject();
    }
}
