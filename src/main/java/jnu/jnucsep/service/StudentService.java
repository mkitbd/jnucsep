package jnu.jnucsep.service;

import jnu.jnucsep.model.Student;

import java.util.List;


public interface StudentService {
    List<Student> getAllStudent();

    void saveStudent(Student student);

    Student getStudentById(long id);
}
