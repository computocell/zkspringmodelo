package br.com.rodartenogueira.zkspringmodelo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import br.com.rodartenogueira.zkspringmodelo.modelo.Plano;
@EnableJpaRepositories(basePackageClasses = Plano.class)
public interface PlanoRepositorio extends JpaRepository<Plano, Integer>{

}
