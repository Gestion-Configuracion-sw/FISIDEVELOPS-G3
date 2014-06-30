package test.app;


import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import com.unmsm.ssel.persistencia.seel_persistencia.modelo.Usuario;
import com.unmsm.ssel.servicio.ssel_servicio.interfaces.IUsuarioServicio;

@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/applicationContext.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class AppTest {
	@Autowired
	IUsuarioServicio usuarioService;

	@Before
	public void init() throws Exception {
		System.out.println("Setting up ...");

	}

	@After
	public void destroy() throws Exception {
		System.out.println("Tearing down ...");

	}

	@Test
	public void testObtenerAdministrador() {
		float saldo = (float) 234.34;
		Usuario u = new Usuario();
		u.setBoEstado(true);
		u.setContrasena("12345678");
		u.setDtFNacimiento(new Date());
		u.setFlSaldo(saldo);
		u.setVcCorreoe("leo@pepe.com");
		u.setVcDni("12345678");
		u.setVcNombrea("Leonidas Munoz");
		u.setVctelefono("992523548");
		
		usuarioService.registrarUsuario(u);

//		System.out.println("********* testObtenerAdministrador *********");
//		Administrador u = admService.getAdministratorById("superadm", "abc123");
//		
//		Assert.notNull(u, "Objeto Nulo");
//		System.out.println("Nombre: "+u.getNombre());
//		// Assert.assertNotNull(tournament);
//		//
//		// Team team = tournament.getBestTeam();
//		// Assert.assertNotNull(team);
//		// Assert.assertEquals(team.getName(), "Test1");
//	}
	}	
}