//package id.co.indivara.jdt12.universit.entity;
//
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.Entity;
//import javax.persistence.Table;
//import com.fasterxml.jackson.annotation.JsonIgnore;
//import lombok.Data;
//import lombok.experimental.Accessors;
//
//import javax.persistence.*;
//import java.util.List;
//
//@Entity
//@Table(name = "classroom")
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Builder
//
//public class Classroom {
//    @Id
////    @GeneratedValue(strategy = GenerationType.AUTO)
////    @Column(name = "classroom_id")
//    private Long classroomId;
//
////    @ManyToOne(targetEntity = Lecture.class, cascade = CascadeType.REMOVE)
////    @JoinColumn(name = "lecturer_id", nullable = false)
//    @JsonIgnore
//    private Lecture lecturerId;
//
////    @ManyToOne(targetEntity = Subject.class, cascade = CascadeType.REMOVE)
////    @JoinColumn(name = "subject_id")
//    private Subject subjectId;
//
//    @Column(name = "period")
//    private String period;
//
////    @ManyToMany(mappedBy = "assignedLecturer")
////    @JsonIgnore
////    private List<Lecture> lecturers;
//}