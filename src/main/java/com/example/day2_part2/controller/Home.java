package com.example.day2_part2.controller;


import com.example.day2_part2.models.StudentModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Home {
    @GetMapping("/")
    public ArrayList<StudentModel> getStudent(){
        StudentModel student1= new StudentModel(1,"Ashutosh","ashutosh02@gmail.com");
        StudentModel student2=new StudentModel(2,"Ram","ram01@gmail.com");
        StudentModel student3=new StudentModel(3,"Rohan","roham023@gmail.com");
        StudentModel student4=new StudentModel(4,"Ravi","ravi03@gmail.com");
        StudentModel student5=new StudentModel(5,"sham","sham34@gmail.com");
        ArrayList<StudentModel> list=new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
        return list;
    }
}