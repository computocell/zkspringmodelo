package br.com.rodartenogueira.zkspringmodelo.viewmodel;

import org.zkoss.bind.annotation.Init;
import org.zkoss.zul.ListModel;

import br.com.rodartenogueira.zkspringmodelo.modelo.User;
import lombok.Getter;

public class VmIndex {
//	@WireVariable
//    RestTemplate restTemplate;
	@Getter private ListModel<User> lmlUsuarios;
	
	@Init
	public void init() {
//		 Executions.getCurrent().addResponseHeader("X-TenantID", Executions.getCurrent().getParameter("cod_entidade"));
//		 
//	 Tenant tenant = new Tenant();
//        tenant.setSchemaName("0017");
//        tenant.setTenantName("testTenantCreation");
//        ResponseEntity<Tenant> response = restTemplate.postForEntity("/tenants",tenant,Tenant.class);
//        System.out.println(response.getStatusCode());
	}
}
