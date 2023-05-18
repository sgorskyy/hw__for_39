package com.example.hw_39.Rest;


import com.example.hw_39.Service.StudService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class studentController {

        private final StudService ss = new StudService();

        @GetMapping("/all")
        public String findAll() {
            return ss.findAll();
        }
}
