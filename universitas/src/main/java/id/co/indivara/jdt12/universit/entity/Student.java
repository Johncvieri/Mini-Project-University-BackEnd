package id.co.indivara.jdt12.universit.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "student")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {
    @Id
    @Column(name = "student_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long studentId;
    @Column(name = "nama")
    private String nama;
    @Column(name = "tanggal_lahir")
    private String tanggal;
    @Column(name = "jenis_kelamin")
    private String kelamin;
    @Column(name = "alamat")
    private String alamat;
    @Column(name = "email")
    private String email;
    @Column(name = "nomor_telepon")
    private String nomor;

}
