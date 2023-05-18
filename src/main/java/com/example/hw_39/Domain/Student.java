package com.example.hw_39.Domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    private long group_id;
    private String  fName;
    private String  lName;
}
