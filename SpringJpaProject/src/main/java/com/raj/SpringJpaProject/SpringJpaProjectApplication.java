package com.raj.SpringJpaProject;

import java.time.LocalDateTime;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.raj.SpringJpaProject.models.Author;
import com.raj.SpringJpaProject.repository.AuthorRepository;

import lombok.experimental.var;

@SpringBootApplication
public class SpringJpaProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaProjectApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner commandLineRunner(
			AuthorRepository authorRepository
			) {
		return args -> {
			Author author = Author.builder()
					.firstName("Aryan")
					.lastName("Behera")
					.age(23)
					.email("rajaryanbehera29@gmail.com")
					.createDateTime(LocalDateTime.now())
					.build();
			authorRepository.save(author);
			
		};
	}
}
