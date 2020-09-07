package com.thoughtworks.capability.gtb.entrancequiz.repository;

import com.thoughtworks.capability.gtb.entrancequiz.entity.Student;
import org.springframework.stereotype.Repository;

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

    private static Map<Integer, Student> students = new HashMap<Integer, Student>() {
        {
            put(1, new Student("廖浚斌"));
            put(2, new Student("沈乐棋"));
            put(3, new Student("徐慧慧"));
            put(4, new Student("陈思聪"));
            put(5, new Student("王江林"));
            put(6, new Student("王登宇"));
            put(7, new Student("杨思雨"));
            put(8, new Student("江雨舟"));
            put(9, new Student("廖篸"));
            put(10, new Student("胡晓"));
            put(11, new Student("但杰"));
            put(12, new Student("盖迈达"));
            put(13, new Student("肖美琦"));
            put(14, new Student("黄云洁"));
            put(15, new Student("齐瑾浩"));
            put(16, new Student("刘亮亮"));
            put(17, new Student("肖逸凡"));
            put(18, new Student("王作文"));
            put(19, new Student("郭瑞凌"));
            put(20, new Student("李明豪"));
            put(21, new Student("党泽"));
            put(22, new Student("肖伊佐"));
            put(23, new Student("允晨曦"));
            put(24, new Student("李康宁"));
            put(25, new Student("童世祁"));
            put(26, new Student("马庆"));
            put(27, new Student("商婕"));
            put(28, new Student("余榕"));
            put(29, new Student("湛哲"));
            put(30, new Student("董翔锐"));
            put(31, new Student("陈泰宇"));
            put(32, new Student("赵允齐"));
            put(33, new Student("张柯"));
            put(34, new Student("廖文强"));
            put(35, new Student("何力"));
            put(36, new Student("岳港"));
            put(37, new Student("凌风仪"));
        }
    };

    public Map<Integer, Student> getAllStudent() {
        return students;
    }
}
