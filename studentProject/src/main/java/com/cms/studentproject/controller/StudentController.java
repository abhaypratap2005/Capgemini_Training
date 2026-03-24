package com.cms.studentproject.controller;

import com.cms.studentproject.model.Student;
import com.cms.studentproject.repository.StudentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
@CrossOrigin(origins = "http://localhost:5173")

public class StudentController {

    private final StudentRepository repo;


    public StudentController(StudentRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Student> getStudents() {

        return repo.findAll();
    }

    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return repo.save(student);
    }


    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student student) {
        Student existing = repo.findById(id).orElseThrow();

        existing.setName(student.getName());
        existing.setCourse(student.getCourse());

        return repo.save(existing);
    
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id){

        repo.deleteById(id);
    }
//
//    public ResponseEntity<Student> updateUser (@RequestBody Student student){
//        if(!getStudents().containsKey(student.getId())){
//            return ResponseEntity.status(HttpStatus.NOT_FOUND);
//        } else {
    // ResponseEntity .status(HTTPstatus.NOT_FOUND).build();
    //return reponseEntity.ok(updated);
//    }
}
