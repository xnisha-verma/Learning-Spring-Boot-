//package com.taskTracker.quickstart;
//import com.taskTracker.quickstart.Student;
//import com.taskTracker.quickstart.StudentRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/students")
//public class StudentController {
//
//    @Autowired
//    private StudentRepository repo;
//
//    @PostMapping
//    public Student addStudent(@RequestBody Student s) {
//        return repo.save(s);
//    }
//
//    @GetMapping
//    public List<Student> getAllStudents() {
//        return repo.findAll();
//    }
//}
