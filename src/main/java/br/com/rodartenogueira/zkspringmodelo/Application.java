package br.com.rodartenogueira.zkspringmodelo;

import javax.servlet.Filter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import br.com.rodartenogueira.zkspringmodelo.filtros.FiltroMultiTenancy;

@SpringBootApplication
@ComponentScan(basePackages = "br.com.rodartenogueira")
public class Application extends SpringBootServletInitializer {
	@Autowired
    AutowireCapableBeanFactory beanFactory;
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Application.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	
	@Bean
    public FilterRegistrationBean myFilter() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        Filter tenantFilter = new FiltroMultiTenancy();
        beanFactory.autowireBean(tenantFilter);
        registration.setFilter(tenantFilter);
        registration.addUrlPatterns("/*");
        return registration;
    }
	
	// @Bean
	// public CommandLineRunner run(UserRepositorio userRepositorio) {
	// return (String[] args) -> {
	// User user1 = new User("John", "john@domain.com");
	// User user2 = new User("Julie", "julie@domain.com");
	// userRepositorio.save(user1);
	// userRepositorio.save(user2);
	// userRepositorio.findAll().forEach(user -> System.out.println(user));
	// };
	// }

}
