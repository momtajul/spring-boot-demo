package com.momtajul.spring.data.student;

import jakarta.inject.Inject;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {


    private final StudentRepository studentRepository;

    @Inject
    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    public Iterable<Student> findAll() {
        return studentRepository.findAll();
    }

    public Optional<Student> findById(String id) {
        return studentRepository.findById(id);
    }

    public Student save(Student customer) {
        return studentRepository.save(customer);
    }

    public void deleteById(String id) {
        studentRepository.deleteById(id);
    }
}
