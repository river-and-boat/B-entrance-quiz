package com.thoughtworks.capability.gtb.entrancequiz.service;

import com.thoughtworks.capability.gtb.entrancequiz.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Auto Jiang Yuzhou
 * @Date 2020/9/7 14:56
 * @Description ***
 **/
@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<String> getAllStudents() {
        return studentRepository.getAllStudent()
                .entrySet().stream().map(s -> s.getKey() + "." + s.getValue())
                .collect(Collectors.toList());
    }
}
