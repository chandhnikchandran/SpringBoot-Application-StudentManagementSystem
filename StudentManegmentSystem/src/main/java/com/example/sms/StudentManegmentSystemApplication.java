package com.example.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.sms.entity.Student;
import com.example.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManegmentSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManegmentSystemApplication.class, args);
	}
@Autowired
private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
		/*Student student1=new  Student("akhil","k","akhil@gmail.com");
		studentRepository.save(student1);
		
		Student student2=new Student("abin","s","abinc@gmail.com");
		studentRepository.save(student2);
		
		Student student3=new Student("ajith","b","ajith@gmail.com");
		studentRepository.save(student3);*/
		
	}

}
