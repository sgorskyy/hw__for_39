package com.example.hw_39.Repository;


import com.example.hw_39.Domain.Student;

import java.util.List;


public class StudentRepositoryDB implements StudentRepository {

    @Override
    public List<Student> findAll() {
        List<Student> students = List.of(
                new Student(1, "Serge", "Ivanov 1"),
                new Student(2, "Serge", "Ivanov 2"),
                new Student(3, "Serge", "Ivanov 3")
        );
        return students;
    }

    @Override
    public String toString() {
        return "StudentRepositoryDB{}";
    }
}