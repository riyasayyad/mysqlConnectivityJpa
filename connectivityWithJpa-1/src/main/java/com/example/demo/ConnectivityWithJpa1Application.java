package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class ConnectivityWithJpa1Application implements CommandLineRunner {
	
	@Autowired
	private Repository repo;

	public static void main(String[] args) {
		SpringApplication.run(ConnectivityWithJpa1Application.class, args);
	}
    
	@Override
	public void run (String... args)throws Exception{
		// TODO Auto-generated method stub
		
		List<Car>student=repo.findAll();
		
		student.forEach(System.out::println);
		
	
		
	}
}
