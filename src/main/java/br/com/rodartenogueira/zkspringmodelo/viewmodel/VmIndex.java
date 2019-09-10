package br.com.rodartenogueira.zkspringmodelo.viewmodel;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.zkoss.bind.annotation.Init;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.select.annotation.WireVariable;
import org.zkoss.zkplus.spring.DelegatingVariableResolver;
import org.zkoss.zul.ListModel;

import br.com.rodartenogueira.zkspringmodelo.database.TenantContext;
import br.com.rodartenogueira.zkspringmodelo.modelo.User;
import br.com.rodartenogueira.zkspringmodelo.modelo.plano;
import br.com.rodartenogueira.zkspringmodelo.repositorio.PlanoRepositorio;
import lombok.Getter;

@Controller("/")
@VariableResolver(DelegatingVariableResolver.class)
public class VmIndex implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Autowired
	@WireVariable
	private PlanoRepositorio planoRepositorio;
	final String URL ="http://localhost:8080/zkspringmodelo/tenants";
	// @Autowired @WireVariable
	// private RestTemplate restTemplate;

	@Getter
	private ListModel<User> lmlUsuarios;

	@Init
	public void init(@RequestParam(value = "id", required = false) String id) {
		System.out.println("Oi " + id);
		TenantContext.setCurrentTenant("0018");
//		TenantContext.setTenantSchema("0018");
		
		List<plano> lsPlanos = (List<plano>) planoRepositorio.findAll();
//		lsPlanos.size();
		// Executions.getCurrent().addResponseHeader("X-TenantID",
		// Executions.getCurrent().getParameter("cod_entidade"));
		//
		// Tenant tenant = new Tenant();
		// tenant.setSchemaName("0017");
		// tenant.setTenantName("testTenantCreation");
		// ResponseEntity<Tenant> response =
		// restTemplate.postForEntity("/tenants",tenant,Tenant.class);
		// System.out.println(response.getStatusCode());

	}

	@RequestMapping("/q")
	public String teste(@RequestParam(value = "id", required = false) String idplano) {
		System.out.println("Oi " + idplano);
		System.out.println(URL);
//		TenantContext.
//	
//		planoRepositorio.findAll();
	
		return "index";
	}

}
