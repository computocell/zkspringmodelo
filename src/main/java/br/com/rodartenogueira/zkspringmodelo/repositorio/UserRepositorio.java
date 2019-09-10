package br.com.rodartenogueira.zkspringmodelo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import br.com.rodartenogueira.zkspringmodelo.modelo.User;

@EnableJpaRepositories(basePackageClasses = User.class)
public interface UserRepositorio extends JpaRepository<User, Long>{}
