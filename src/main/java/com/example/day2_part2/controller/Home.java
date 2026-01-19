package com.example.day2_part2.controller;


import com.example.day2_part2.models.StudentModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Home {
    @GetMapping("/")
    public ArrayList<StudentModel> getStudent() {//return the object of StudentModel
        StudentModel student1 = new StudentModel(1,"Harshit","harshit@gmail.com");
        StudentModel student2 = new StudentModel(2,"Student2","Student2@gmail.com");
        StudentModel student3 = new StudentModel(3,"Student3","Student3@gmail.com");
        StudentModel student4 = new StudentModel(4,"Student4","Student4@gmail.com");
        StudentModel student5 = new StudentModel(5,"Student5","Student5@gmail.com");

        ArrayList<StudentModel> students = new ArrayList<StudentModel>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        return students;

    }

}
