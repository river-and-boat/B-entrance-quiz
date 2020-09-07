package com.thoughtworks.capability.gtb.entrancequiz.service;

import com.thoughtworks.capability.gtb.entrancequiz.entity.Student;
import com.thoughtworks.capability.gtb.entrancequiz.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * @Auto Jiang Yuzhou
 * @Date 2020/9/7 14:56
 * @Description ***
 **/
@Service
public class StudentService {

    private final StudentRepository studentRepository;

    private final static Integer GROUP_NUMBER = 6;

    private final static String GROUP_NAME_PREFIX = "Team";

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        return studentRepository.getAllStudent();
    }

    public Map<String, List<Student>> groupAllStudents() {
        studentRepository.clearGroups();
        List<Student> students = new ArrayList<>(studentRepository.getAllStudent());
        Integer totalStudents = students.size();
        int overflowStudents = totalStudents % GROUP_NUMBER;
        for (int groupId = 1; groupId <= GROUP_NUMBER; groupId++) {
            int groupStudentNum = totalStudents / GROUP_NUMBER;
            if (overflowStudents > 0) {
                groupStudentNum += 1;
                overflowStudents -= 1;
            }
            // 随机分配
            randomGroupStudents(students, groupStudentNum, GROUP_NAME_PREFIX + " " + groupId);
        }
        Map<String, List<Student>> groups = studentRepository.getGroups();
        return studentRepository.getGroups();
    }

    public Student addStudent(String studentName) {
        int studentCount = studentRepository.getStudentCount();
        Student student = new Student(studentCount + 1, studentName);
        return studentRepository.saveStudent(student);
    }

    private void randomGroupStudents(List<Student> students,
                                     Integer number, String groupName) {
        Random random = new Random();
        for (int n = 0; n < number;) {
            int maxNumber = students.size();
            int randomIndex = random.nextInt(maxNumber);
            Student randomStudent = students.get(randomIndex);
            Student student = studentRepository.addToTeam(groupName, randomStudent);
            if (student != null) {
                n++;
                students.remove(randomIndex);
            }
        }
    }
}
