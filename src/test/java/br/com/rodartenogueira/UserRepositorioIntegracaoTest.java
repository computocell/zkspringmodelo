package br.com.rodartenogueira;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.rodartenogueira.zkspringmodelo.modelo.User;
import br.com.rodartenogueira.zkspringmodelo.repositorio.UserRepositorio;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class UserRepositorioIntegracaoTest {

	@Autowired
	private UserRepositorio userRepositorio;

	@Test
	public void quandoSalvarVerificaOnumeroCorretoDeUsuarios() {
		userRepositorio.save(new User("Bob", "bob@domain.com"));
		List<User> users = (List<User>) userRepositorio.findAll();

		assertThat(users.size()).isEqualTo(1);
		userRepositorio.deleteAll();
	}

}
