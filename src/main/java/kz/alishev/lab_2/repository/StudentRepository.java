package kz.alishev.lab_2.repository;

import kz.alishev.lab_2.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, String> {
    void deleteByEmail(String email);
    Student findStudentByEmail(String email);
}
