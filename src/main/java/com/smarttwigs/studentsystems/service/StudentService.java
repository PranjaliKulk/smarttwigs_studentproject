package com.smarttwigs.studentsystems.service;

import java.util.List;

import com.smarttwigs.studentsystems.model.Student;

public interface StudentService {

	public Student saveStudent(Student student);
	public List<Student> getAllStudents();
}
