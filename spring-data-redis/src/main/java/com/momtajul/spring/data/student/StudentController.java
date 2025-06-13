package com.momtajul.spring.data.student;

import jakarta.inject.Inject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("students")
public class StudentController {

    private final StudentService studentService;

    @Inject
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public ResponseEntity<Iterable<Student>> findAll() {
        Iterable<Student> customers = studentService.findAll();
        return ResponseEntity.ok(customers);
    }

    @GetMapping("/{id}")
    public Optional<Student> findById(@PathVariable("id") String id) {
        return studentService.findById(id);
    }

    // create a book
    @PostMapping
    public ResponseEntity<Student> create(@RequestBody Student student) {
        Student c = studentService.save(student);
        return ResponseEntity.status(HttpStatus.CREATED).body(c);
    }

    // update a student
    @PutMapping
    public ResponseEntity<Student> update(@RequestBody Student student) {
        Student c = studentService.save(student);
        return ResponseEntity.status(HttpStatus.CREATED).body(student);
    }

    // delete a customer
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable String id) {
        studentService.deleteById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
