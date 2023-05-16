package com.example.hw_39.Domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
public class Student {
    private long group_id;
    private String  fName;
    private String  lName;

    @Override
    public String toString() {
        return "Student";
    }
}
