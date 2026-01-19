package com.example.day2_part2.controller;


import com.example.day2_part2.models.StudentModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
    @GetMapping("/")
    public StudentModel getStudent() {//return the object of StudentModel
        StudentModel studet = new StudentModel(1,"Harshit","harshit@gmail.com");
        return studet;
    }

}
