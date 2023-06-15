package com.smarttwigs.studentsystems.service;

import com.smarttwigs.studentsystems.model.Student;
import com.smarttwigs.studentsystems.repository.StudentRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{

@Autowired
private StudentRepository studentRepository;

@Override
public Student saveStudent(Student student) {
	return studentRepository.save(student);
}

@Override
public List<Student> getAllStudents(){
	return studentRepository.findAll();
}
}
