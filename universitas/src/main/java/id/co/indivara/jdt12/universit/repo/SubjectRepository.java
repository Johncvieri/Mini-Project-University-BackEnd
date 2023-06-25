package id.co.indivara.jdt12.universit.repo;

import id.co.indivara.jdt12.universit.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepository extends JpaRepository<Subject,Long> {
}
