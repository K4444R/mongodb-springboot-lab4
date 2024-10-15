package kz.alishev.lab_2.service;

import kz.alishev.lab_2.model.Student;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface StudentService {
    List<Student> findAllStudents();
    Student saveStudent(Student student);
    Student findStudentByEmail(String email);
    Student updateStudent(Student student);
    void deleteStudent(String email);

}