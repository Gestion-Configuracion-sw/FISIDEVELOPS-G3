package test.app;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.unmsm.ssel.persistencia.seel_persistencia.modelo.Usuario;
import com.unmsm.ssel.servicio.ssel_servicio.interfaces.IUsuarioServicio;

@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/applicationContext.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class Test01 {
	
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
	
	public IUsuarioServicio getUsuarioService() {
		return usuarioService;
	}

	public void setUsuarioService(IUsuarioServicio usuarioService) {
		this.usuarioService = usuarioService;
	}

	@Test
	public void test01() {
		System.out.println("########################");
		float saldo = (float) 200.00;
		Usuario u = new Usuario();
		u.setBoEstado(true);
		u.setContrasena("12345678");
		u.setDtFNacimiento(new Date());
		u.setFlSaldo(saldo);
		u.setVcCorreoe("leo@unmsm.com");
		u.setVcDni("12345678");
		u.setVcNombreUsuario("lmunoz");
		u.setVcDomicilio("Carmen Saco");
		u.setVcNombrea("Leonidas Munoz");
		u.setVctelefono("987654321");
		
		usuarioService.registrarUsuario(u);
	}
	
}
