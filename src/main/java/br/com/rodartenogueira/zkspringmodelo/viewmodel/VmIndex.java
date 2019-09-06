package br.com.rodartenogueira.zkspringmodelo.viewmodel;

import org.zkoss.bind.annotation.Init;
import org.zkoss.zul.ListModel;

import br.com.rodartenogueira.zkspringmodelo.modelo.User;
import lombok.Getter;

public class VmIndex {

	@Getter private ListModel<User> lmlUsuarios;
	
	@Init
	public void init() {
		
	}
}
