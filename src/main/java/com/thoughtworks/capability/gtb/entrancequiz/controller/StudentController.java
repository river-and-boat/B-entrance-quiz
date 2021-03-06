package com.thoughtworks.capability.gtb.entrancequiz.controller;

import com.thoughtworks.capability.gtb.entrancequiz.entity.Student;
import com.thoughtworks.capability.gtb.entrancequiz.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @Auto Jiang Yuzhou
 * @Date 2020/9/7 14:57
 * @Description ***
 **/
@RestController
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/gtb/students")
    public ResponseEntity<List<Student>> getStudents() {
        return ResponseEntity.ok(studentService.getAllStudents());
    }

    @GetMapping("/gtb/groups/random")
    public ResponseEntity<Map<String, List<Student>>> randomGroups() {
        return ResponseEntity
                .ok(studentService.groupAllStudents());
    }

    @PostMapping("/gtb/student")
    public ResponseEntity addStudent(@RequestBody String studentName) {
        Student student = studentService.addStudent(studentName);
        if (student != null) {
            return ResponseEntity.status(HttpStatus.CREATED).body(null);
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
    }

    @PutMapping("/gtb/groups/{oldName}")
    public ResponseEntity updateGroupName(@PathVariable String oldName,
                                          @RequestParam String newName) {
        String result = studentService.updateGroupName(oldName, newName);
        if (result != null) {
            return ResponseEntity.ok().body(null);
        }
        return ResponseEntity.status(409).body(null);
    }
}
