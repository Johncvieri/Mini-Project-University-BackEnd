package id.co.indivara.jdt12.universit.repo;

import id.co.indivara.jdt12.universit.entity.Student;
import id.co.indivara.jdt12.universit.exceptions.ResourceNotFoundException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

}
