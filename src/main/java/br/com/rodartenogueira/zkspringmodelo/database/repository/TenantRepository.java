package br.com.rodartenogueira.zkspringmodelo.database.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.rodartenogueira.zkspringmodelo.database.entities.Tenant;

public interface TenantRepository extends PagingAndSortingRepository<Tenant,String>{

}
