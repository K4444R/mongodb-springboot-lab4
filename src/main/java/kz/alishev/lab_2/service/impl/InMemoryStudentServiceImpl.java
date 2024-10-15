package kz.alishev.lab_2.service.impl;


import kz.alishev.lab_2.model.Student;
import kz.alishev.lab_2.repository.InMemoryStudentDAO;
import kz.alishev.lab_2.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class InMemoryStudentServiceImpl implements StudentService {

    private final InMemoryStudentDAO repository;

    @Override
    public List<Student> findAllStudents() {
        return repository.findAllStudents();
    }

    @Override
    public Student saveStudent(Student student) {
        return repository.saveStudent(student);
    }

    @Override
    public Student findStudentByEmail(String email) {
        return repository.findStudentByEmail(email);
    }

    @Override
    public Student updateStudent(Student student) {
        return repository.updateStudent(student);
    }


    @Override

    public void deleteStudent(String email) {
        repository.deleteStudent(email);
    }


}