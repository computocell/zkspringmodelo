package br.com.rodartenogueira.zkspringmodelo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Application extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Application.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	
	
	
//	@Bean
//	public CommandLineRunner run(UserRepositorio userRepositorio) {
//		return (String[] args) -> {
//			User user1 = new User("John", "john@domain.com");
//			User user2 = new User("Julie", "julie@domain.com");
//			userRepositorio.save(user1);
//			userRepositorio.save(user2);
//			userRepositorio.findAll().forEach(user -> System.out.println(user));
//		};
//	}

}
