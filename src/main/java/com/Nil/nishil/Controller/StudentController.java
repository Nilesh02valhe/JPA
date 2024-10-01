package com.Nil.nishil.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.Nil.nishil.Model.Student;
import com.Nil.nishil.Service.StudentServiceI;

@Controller
public class StudentController {
	@Autowired
	private StudentServiceI studentServiceI;
	
	public Student SavaStu(Student stu) {
		Student student = studentServiceI.SaveStudent(stu);
		return student;
		
	}
	
	public List<Student> SaveAllstu(List<Student>lists){
		List<Student> saveAllstu = studentServiceI.SaveAllstu(lists);
		return saveAllstu;
		
	}
	
	public List<Student> getAllrecorded(){
		List<Student> allStudent = studentServiceI.getAllStudent();
		return allStudent;
			
	}
}
