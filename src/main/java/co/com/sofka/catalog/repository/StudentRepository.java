package co.com.sofka.catalog.repository;

import co.com.sofka.catalog.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, String> {
    Student findByIdNum(String idNum);

    List<Student> findByNameContainingIgnoreCase(String name);
}
