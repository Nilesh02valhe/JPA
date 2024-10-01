package com.Nil.nishil;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.Nil.nishil.Controller.StudentController;
import com.Nil.nishil.Model.Student;

@SpringBootApplication
public class NishilApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext Context = SpringApplication.run(NishilApplication.class, args);
		StudentController controller = Context.getBean(StudentController.class);
		
//		Student stu= new Student();
//		stu.setSid(1);
//		stu.setSname("vinit");
//		stu.setSadd("denmark");
//		stu.setSrank(1);
//		stu.setJobRoll("Civil Engineering");
		
		
//		Student Stu= new Student();
//		
//		Stu.setSid(1);
//		Stu.setSname("Nilesh");
//		Stu.setSadd("Pune");
//		Stu.setSrank(1);
//		Stu.setJobRoll("Java Developer");
//		
//		Student Stu1= new Student();
//		
//		Stu1.setSid(2);
//		Stu1.setSname("pranil");
//		Stu1.setSadd("Mumbai");
//		Stu1.setSrank(2);
//		Stu1.setJobRoll("front End Developer");
//		
//		Student Stu2= new Student();
//		
//		Stu2.setSid(3);
//		Stu2.setSname("pratik");
//		Stu2.setSadd("Chennai");
//		Stu2.setSrank(3);
//		Stu2.setJobRoll("Back end Developer");
//		
//		Student Stu3= new Student();
//		
//		Stu3.setSid(4);
//		Stu3.setSname("suma");
//		Stu3.setSadd("khanak");
//		Stu3.setSrank(4);
//		Stu3.setJobRoll("Devops Developer");
//		
//		List st= new ArrayList();
//		st.add(Stu);
//		st.add(Stu1);
//		st.add(Stu2);
//		st.add(Stu3);
//		
//		List <Student> stus=controller.SaveAllstu(st);
//		System.out.println(stus);	
		
		List<Student> allrecorded = controller.getAllrecorded();
		System.out.println(allrecorded);
	}

}
