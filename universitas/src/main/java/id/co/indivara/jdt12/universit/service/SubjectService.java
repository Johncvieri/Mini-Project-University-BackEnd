package id.co.indivara.jdt12.universit.service;

import id.co.indivara.jdt12.universit.entity.Subject;
import id.co.indivara.jdt12.universit.repo.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService {
    @Autowired
    SubjectRepository subjectRepository;
    public Subject createMatkul(Subject subject){
        return subjectRepository.save(subject);
    }
    public List<Subject> getAllSubject(){
        return subjectRepository.findAll();
    }
}
