package com.example.hw_39.Rest;


import com.example.hw_39.Domain.Student;
import com.example.hw_39.Repository.StudentRepository;
import com.example.hw_39.Service.StudService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class studentController {

        private final StudService ss = new StudService();

        @GetMapping("/all")
        public String findAll() {
            return ss.findAll();
        }
}
