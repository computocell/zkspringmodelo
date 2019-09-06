package br.com.rodartenogueira.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.rodartenogueira.modelo.User;

@Repository
public interface UserRepositorio extends CrudRepository<User, Long>{}
