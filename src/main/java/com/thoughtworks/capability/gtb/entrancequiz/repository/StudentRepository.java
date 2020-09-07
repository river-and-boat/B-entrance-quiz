package com.thoughtworks.capability.gtb.entrancequiz.repository;

import com.thoughtworks.capability.gtb.entrancequiz.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auto Jiang Yuzhou
 * @Date 2020/9/7 14:36
 * @Description ***
 **/
@Repository
public class StudentRepository {

    private final static String GROUP_NAME_PREFIX = "Team";

    private static List<Student> students = new ArrayList<Student>()
    {
        {
            add(new Student(1, "廖浚斌"));
            add(new Student(2, "沈乐棋"));
            add(new Student(3, "徐慧慧"));
            add(new Student(4, "陈思聪"));
            add(new Student(5, "王江林"));
            add(new Student(6, "王登宇"));
            add(new Student(7, "杨思雨"));
            add(new Student(8, "江雨舟"));
            add(new Student(9, "廖篸"));
            add(new Student(10, "胡晓"));
            add(new Student(11, "但杰"));
            add(new Student(12, "盖迈达"));
            add(new Student(13, "肖美琦"));
            add(new Student(14, "黄云洁"));
            add(new Student(15, "齐瑾浩"));
            add(new Student(16, "刘亮亮"));
            add(new Student(17, "肖逸凡"));
            add(new Student(18, "王作文"));
            add(new Student(19, "郭瑞凌"));
            add(new Student(20, "李明豪"));
            add(new Student(21, "党泽"));
            add(new Student(22, "肖伊佐"));
            add(new Student(23, "允晨曦"));
            add(new Student(24, "李康宁"));
            add(new Student(25, "童世祁"));
            add(new Student(26, "马庆"));
            add(new Student(27, "商婕"));
            add(new Student(28, "余榕"));
            add(new Student(29, "湛哲"));
            add(new Student(30, "董翔锐"));
            add(new Student(31, "陈泰宇"));
            add(new Student(32, "赵允齐"));
            add(new Student(33, "张柯"));
            add(new Student(34, "廖文强"));
            add(new Student(35, "何力"));
            add(new Student(36, "岳港"));
            add(new Student(37, "凌风仪"));
        }
    };

    private static Map<String, List<Student>> groups = new HashMap<String, List<Student>>()
    {
        {
            put(GROUP_NAME_PREFIX + " 1", new ArrayList<>());
            put(GROUP_NAME_PREFIX + " 2", new ArrayList<>());
            put(GROUP_NAME_PREFIX + " 3", new ArrayList<>());
            put(GROUP_NAME_PREFIX + " 4", new ArrayList<>());
            put(GROUP_NAME_PREFIX + " 5", new ArrayList<>());
            put(GROUP_NAME_PREFIX + " 6", new ArrayList<>());
        }
    };

    public List<Student> getAllStudent() {
        return students;
    }

    public Map<String, List<Student>> getGroups() {
        return groups;
    }

    public void clearGroups() {
        groups.values().forEach(list -> {
            list.clear();
        });
    }

    public Student addToTeam(String teamName, Student student) {
        if (groups.containsKey(teamName)) {
            groups.get(teamName).add(student);
            return student;
        }
        return null;
    }

    public int getStudentCount() {
        return students.size();
    }

    public Student saveStudent(Student student) {
        try {
            students.add(student);
            return student;
        } catch (Exception ex) {
            return null;
        }
    }

    public String updateGroupName(String oldName, String newName) {
        if (groups.containsKey(newName)) {
            return null;
        }
        List<Student> students = groups.get(oldName);
        groups.put(newName, students);
        groups.remove(oldName);
        return newName;
    }
}
