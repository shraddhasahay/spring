package com.example.classroom.models;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import org.apache.tomcat.util.buf.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }
    public Iterable<student> getAllStudents()   
    {  
        ArrayList<student> students = new ArrayList<student>();
        studentRepository.findAll().forEach(student -> students.add(student));;
        return students;
    }
    public void addStudent(student stud) {
        studentRepository.save(stud);
    }
    
        
    }  
   
 

