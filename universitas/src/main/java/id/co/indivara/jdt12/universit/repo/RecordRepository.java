package id.co.indivara.jdt12.universit.repo;

import id.co.indivara.jdt12.universit.entity.Record;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface RecordRepository extends JpaRepository<Record,Long> {
}
