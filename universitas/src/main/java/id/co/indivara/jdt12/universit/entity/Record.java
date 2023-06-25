package id.co.indivara.jdt12.universit.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name = "reports")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Record {
    @Id
    @Column(name = "report_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long reportId;

    @Column(name = "subject_id")
    private Long subjectId;

    @Column(name = "student_id")
    private Long studentId;

    @Column(name = "quis")
    private Double quis;

    @Column(name = "mid_test")
    private Double midTest;

    @Column(name = "final_test")
    private Double finalTest;

    @Column(name = "grade")
    private String grade;

    @JoinColumn(name = "student_id",insertable = false,updatable = false)
    @OneToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Student student;

    @JoinColumn(name = "subject_id",insertable = false,updatable = false)
    @OneToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Subject subject;
}
