package com.clockworkjava.kursspring;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
//@ComponentScan(basePackageClasses ={KnightRepository.class})
@EnableScheduling
public class KursspringApplication {

	public static void main(String[] args) {
		        SpringApplication.run(KursspringApplication.class, args);
		        System.out.println("Arek i Patryk");
		        System.out.println("Factory beauty");
		        System.out.println("hejjj");


	} 
}   
