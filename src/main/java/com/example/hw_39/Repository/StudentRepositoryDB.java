package com.example.hw_39.Repository;


import com.example.hw_39.Domain.Student;
import java.util.List;


public class StudentRepositoryDB implements StudentRepository {

    private List<Student> students;
    @Override
    public List<Student> findAll() {
        students = List.of(
                new Student(1, "Serge", "Semeniv"),
                new Student(2, "Anna", "Drok"),
                new Student(2, "Bohdan", "Chemik")
        );
        return students;
    }
}