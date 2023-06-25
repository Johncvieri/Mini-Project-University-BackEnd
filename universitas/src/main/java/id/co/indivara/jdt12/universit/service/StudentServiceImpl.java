//package id.co.indivara.jdt12.universit.service;
//
//import id.co.indivara.jdt12.universit.entity.Student;
//import id.co.indivara.jdt12.universit.repo.StudentRepository;
//import lombok.AllArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Objects;
//@AllArgsConstructor
//@Service
//public class StudentServiceImpl implements StudentService {
//    @Autowired
//    private StudentRepository studentRepository;
//
//    @Override
//    public void save(Student student) {
//
//    }
//
//    public Student saveDepartment(Student student) {
//
//        return studentRepository.save(student);
//    }
//
//    @Override
//    public List<Student> studentList() {
//        return null;
//    }
//
//    @Override
//    public Student updateStudent(Student student, Long studentId) {
//        Student depDB= studentRepository.findById(studentId).get();
//        if (Objects.nonNull(student.getNama())&& !"".equalsIgnoreCase(student.getNama())) {
//            depDB.setNama(student.getNama());
//        }
//        if (Objects.nonNull(student.getKelamin())&& !"".equalsIgnoreCase(student.getKelamin())) {
//            depDB.setKelamin(student.getKelamin());
//        }
//        if (Objects.nonNull(student.getEmail())&& !"".equalsIgnoreCase(student.getEmail())) {
//            depDB.setEmail(student.getEmail());
//        }
//        if (Objects.nonNull(student.getAlamat())&& !"".equalsIgnoreCase(student.getAlamat())) {
//            depDB.setAlamat(student.getAlamat());
//        }
//        if (Objects.nonNull(student.getTanggal())&& !"".equalsIgnoreCase(student.getTanggal())) {
//            depDB.setTanggal(student.getTanggal());
//        }
//        if (Objects.nonNull(student.getNomor())&& !"".equalsIgnoreCase(student.getNomor())) {
//            depDB.setNomor(student.getNomor());
//        }
//        if (Objects.nonNull(student.getSubject())&& !"".equalsIgnoreCase(student.getSubject())) {
//            depDB.setSubject(student.getSubject());
//        }
//        return studentRepository.save(depDB);
//    }
//
//    @Override
//    public void deleteStudent(Long studentId) {
//
//    }
//
//}
