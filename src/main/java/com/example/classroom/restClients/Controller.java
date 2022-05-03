package com.example.classroom.restClients;

import com.example.classroom.models.student;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;

import com.example.classroom.models.StudentRepository;
import com.example.classroom.models.StudentService;
import com.example.classroom.models.Teacher;
import com.example.classroom.models.TeacherRepository;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


@RestController
public class Controller {
    @Autowired
    StudentRepository studentRepository;
    private StudentService studentService;
    @Autowired
    public Controller(StudentService studentService){
        this.studentService = studentService;}
    @GetMapping(value ="/test")
    public String test() {
        return "SUCCESS";
    }

    @GetMapping(value="/students")
    public @ResponseBody Iterable<student> getAllStudents() {
      StudentService studentService = new StudentService(studentRepository);
      return studentService.getAllStudents();
    }

   

    @PostMapping("/upload/db")
  public ResponseEntity uploadToDB(@RequestParam String name, @RequestParam String phone, @RequestParam String email, @RequestParam String usn) {
	student stud = new student();
  stud.setEMAIL(email);
  stud.setPHONE(phone);
  stud.setNAME(name);
  stud.setUSN(usn);
	
  studentRepository.save(stud);
	
	return new ResponseEntity<>("Hello World!", HttpStatus.OK);
}

}
