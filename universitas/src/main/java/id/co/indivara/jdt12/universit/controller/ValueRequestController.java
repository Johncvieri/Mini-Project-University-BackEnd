//package id.co.indivara.jdt12.universit.controller;
//
//import id.co.indivara.jdt12.universit.entity.Student;
//import id.co.indivara.jdt12.universit.entity.ValueRequest;
//import id.co.indivara.jdt12.universit.exceptions.ResourceNotFoundException;
//import id.co.indivara.jdt12.universit.repo.StudentRepository;
//import id.co.indivara.jdt12.universit.repo.ValueRequestRep;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.validation.annotation.Validated;
//import org.springframework.web.bind.annotation.*;
//
//@RequestMapping(value = "/report")
//@RestController
//@Validated
//public class ValueRequestController {
//
////    @Autowired
////    private
//    @Autowired
//    private ValueRequestRep valueRequestRep;
//
//    @Autowired
//    StudentRepository studentRepository;
//
//    @PostMapping("/input")
//    public ResponseEntity<ValueRequest> inputnilai( @RequestBody ValueRequest val)throws ResourceNotFoundException{
//        return new ResponseEntity<>(valueRequestRep.inputachivment(val), HttpStatus.OK);
//    }
//
//
//}
