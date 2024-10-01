package com.Nil.nishil.Service;

import java.util.List;

import com.Nil.nishil.Model.Student;



public interface StudentServiceI {
	
	public Student SaveStudent (Student stu);
	
	public List<Student> SaveAllstu(List<Student>lists);
	
	public List<Student> getAllStudent();
		
	
}
