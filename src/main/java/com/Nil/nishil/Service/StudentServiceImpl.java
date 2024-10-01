package com.Nil.nishil.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Nil.nishil.Model.Student;
import com.Nil.nishil.Repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentServiceI {
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student SaveStudent(Student stu) {
		Student student = studentRepository.save(stu);
		return student;
	}

	@Override
	public List<Student> SaveAllstu(List<Student> lists) {
		List<Student> saveAll = (List<Student>) studentRepository.saveAll(lists);
		return saveAll;
	}

	@Override
	public List<Student> getAllStudent() {
		List<Student> all = (List<Student>) studentRepository.findAll();
		return all;
	}
}
