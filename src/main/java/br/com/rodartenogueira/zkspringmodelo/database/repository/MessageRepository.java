package br.com.rodartenogueira.zkspringmodelo.database.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.rodartenogueira.zkspringmodelo.database.entities.Message;

public interface MessageRepository extends PagingAndSortingRepository<Message,String>{

}
