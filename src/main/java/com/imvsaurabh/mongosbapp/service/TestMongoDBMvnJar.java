package com.imvsaurabh.mongosbapp.service;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.github.imvsaurabh.model.Student;
import com.github.imvsaurabh.repo.StudentRepo;
import com.github.imvsaurabh.service.StudentService;

@Component
public class TestMongoDBMvnJar implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		
		StudentService service = new StudentService();
		
//		List<Student> findAllStudent = StudentRepo.findAllStudent();
		List<Student> findAllStudent = service.findAllStudent();
		System.out.println(findAllStudent);
	}

}
