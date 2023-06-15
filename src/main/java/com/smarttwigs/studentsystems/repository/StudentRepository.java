package com.smarttwigs.studentsystems.repository;

import com.smarttwigs.studentsystems.model.Student;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

@Repository

public interface StudentRepository extends JpaRepository<Student,Integer>{
	

}
