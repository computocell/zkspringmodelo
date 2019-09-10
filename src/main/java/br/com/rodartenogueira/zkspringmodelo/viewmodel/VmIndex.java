package br.com.rodartenogueira.zkspringmodelo.viewmodel;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.zkoss.bind.annotation.Init;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.select.annotation.WireVariable;
import org.zkoss.zkplus.spring.DelegatingVariableResolver;
import org.zkoss.zul.ListModel;

import br.com.rodartenogueira.zkspringmodelo.database.repository.TenantRepository;
import br.com.rodartenogueira.zkspringmodelo.modelo.Plano;
import br.com.rodartenogueira.zkspringmodelo.modelo.User;
import br.com.rodartenogueira.zkspringmodelo.repositorio.PlanoRepositorio;
import lombok.Getter;

@Controller("/")
@VariableResolver(DelegatingVariableResolver.class)
public class VmIndex implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@WireVariable
	private PlanoRepositorio planoRepositorio;
	@WireVariable
	private TenantRepository repository;

	final String URL = "http://localhost:8080/zkspringmodelo/tenants";

	@Getter
	private ListModel<User> lmlUsuarios;
	@Getter
	private List<Plano> lsPlanos;

	@Init
	public void init(@RequestParam(value = "id", required = false) String id) {
		System.out.println("Oi " + id);

		List<Plano> lsPlanos = (List<Plano>) planoRepositorio.findAll();
		// lsPlanos.size();

	}

	@RequestMapping("/q")
	public String teste(@RequestParam(value = "id", required = false) String idplano) {
		System.out.println("Oi " + idplano);
		System.out.println(URL);
		// TenantContext.
		//
		// planoRepositorio.findAll();

		return "index";
	}

}
