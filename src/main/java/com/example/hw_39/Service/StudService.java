package com.example.hw_39.Service;

import com.example.hw_39.Domain.Student;
import com.example.hw_39.Repository.StudentRepository;
import com.example.hw_39.Repository.StudentRepositoryDB;

import java.util.List;

public class StudService{

    StudentRepository sr = new StudentRepositoryDB();


    public String findAll() {

        String studentView = "";
        List<Student> students = sr.findAll();

        for (Student student : students) {
            studentView += student.getFName() + "<BR>";
            studentView += student.getLName() + "<BR>";
            studentView += student.getGroup_id() + "<BR>";
            studentView += "-----------------" + "<BR>";
        }

        return studentView;
    }
}
