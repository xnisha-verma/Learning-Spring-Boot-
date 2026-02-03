package com.example.jpa;

import com.example.jpa.models.Author;
import com.example.jpa.models.Video;
import com.example.jpa.repositories.AuthorRepository;
import com.example.jpa.repositories.VideoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(
			AuthorRepository repository,
			 VideoRepository videoRepository
			) {
		return args -> {
//			Author author = Author.builder()
//					.fname("nisha")
//					.lname("verma")
//					.age(20)
//					.email("heiii@")
//					.build();
//			repository.save(author);
			var video = Video.builder()
					.name("csjbc")
					.length(3)
					.build();
			videoRepository.save(video);
		};

	}
}
