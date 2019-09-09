package br.com.rodartenogueira.zkspringmodelo.controller;

import javax.sql.DataSource;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.rodartenogueira.zkspringmodelo.database.entities.Tenant;
import br.com.rodartenogueira.zkspringmodelo.database.repository.TenantRepository;

@RestController
@RequestMapping(value = "/tenants")
public class TenantController {

    private TenantRepository repository;

    private DataSource dataSource;

    public TenantController(TenantRepository repository, DataSource dataSource) {
        this.repository = repository;
        this.dataSource = dataSource;
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    @Transactional
    public Tenant createTenant(@RequestBody Tenant tenant){
        tenant = repository.save(tenant);
        String schema = tenant.getSchemaName();
        if(schema==null) throw new RuntimeException("schema is null");
//        Flyway flyway = new Flyway();
//        flyway.setLocations("db/migration/tenants");
//        flyway.setDataSource(dataSource);
//        flyway.setSchemas(schema);
//        flyway.migrate();
        return tenant;
    }

    @DeleteMapping("/{uuid}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteTenant(@RequestParam String uuid){
        repository.deleteById(uuid);
    }

    @GetMapping
    public Page<Tenant> getTenants(Pageable pageable){
        return repository.findAll(pageable);
    }

}
