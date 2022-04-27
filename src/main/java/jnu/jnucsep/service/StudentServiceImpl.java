package jnu.jnucsep.service;

import jnu.jnucsep.model.Student;
import jnu.jnucsep.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public void saveStudent(Student student){
        this.studentRepository.save(student);
    }


    @Override
    public Student getStudentById(long id) {
        return null;
    }

}