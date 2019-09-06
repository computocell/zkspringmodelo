package br.com.rodartenogueira.zkspringmodelo.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.rodartenogueira.zkspringmodelo.modelo.User;

@Repository
public interface UserRepositorio extends CrudRepository<User, Long>{}
