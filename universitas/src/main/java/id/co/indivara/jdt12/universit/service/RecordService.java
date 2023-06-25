package id.co.indivara.jdt12.universit.service;

import id.co.indivara.jdt12.universit.entity.Record;
import id.co.indivara.jdt12.universit.entity.Student;
import id.co.indivara.jdt12.universit.entity.Subject;
import id.co.indivara.jdt12.universit.repo.RecordRepository;
import id.co.indivara.jdt12.universit.repo.StudentRepository;
import id.co.indivara.jdt12.universit.repo.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecordService {
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    SubjectRepository subjectRepository;
    @Autowired
    RecordRepository recordRepository;
    public Record createRecord(Record record) throws Exception{
        Student student = studentRepository.findById(record.getStudentId()).orElseThrow(()-> new Exception("Student Not Found"));
        Subject subject = subjectRepository.findById(record.getSubjectId()).orElseThrow(()-> new Exception("Matkul Not Found"));
        Double nilai = (record.getQuis() + record.getMidTest() + record.getFinalTest()) / 3;
        String grade;
        if (nilai >= 90) {
            grade = "A";
        } else if (nilai >= 80) {
            grade = "B";
        } else if (nilai >= 70) {
            grade = "C";
        } else if (nilai >= 60) {
            grade = "D";
        } else {
            grade = "E";
        }
        record.setStudent(student);
        record.setSubject(subject);
        record.setQuis(record.getQuis());
        record.setMidTest(record.getMidTest());
        record.setFinalTest(record.getFinalTest());
        record.setGrade(grade);
        return recordRepository.save(record);
    }
}
