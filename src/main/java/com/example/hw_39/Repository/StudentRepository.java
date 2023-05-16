package com.example.hw_39.Repository;

import com.example.hw_39.Domain.Student;
import java.util.List;



public interface StudentRepository {

    public List<Student> findAll();

}
