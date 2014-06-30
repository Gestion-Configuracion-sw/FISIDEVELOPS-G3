package com.unmsm.ssel.servicio.ssel_servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.unmsm.ssel.persistencia.seel_persistencia.dao.IUsuarioDAO;
import com.unmsm.ssel.persistencia.seel_persistencia.modelo.Usuario;
import com.unmsm.ssel.servicio.ssel_servicio.interfaces.IUsuarioServicio;


@Transactional(readOnly=false)
@Service(value="usuarioService")
public class UsuarioServicio implements IUsuarioServicio{

	@Autowired
	IUsuarioDAO usuarioDAO;
	            

	public Usuario getUsuarioById(String idusuario, String pass) {

//		Usuario u = usuarioDAO.getUsuarioById(idusuario);
//		
//		if(u!=null){
//			 if(u.getPassword().equals(pass)){
//				 
//		        	//u.setPassword(null);
//		        	return u;
//		     }else{
//		 
//		    	 return null;
//		     }
//		}
		return null;
	}

	public IUsuarioDAO getUsuarioDAO() {
		return usuarioDAO;
	}

	public void setUsuarioDAO(IUsuarioDAO usuarioDAO) {
		this.usuarioDAO = usuarioDAO;
	}

	public List<Usuario> getUsuario() {
		// TODO Auto-generated method stub
		return null;
	}

	public void registrarUsuario(Usuario adm) {
		System.out.println("Service-registrarUsuario");
		try {
			usuarioDAO.ingresar(adm);
		} catch (Exception e) {
			System.out.println("Error");
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		
	}

	public void deleteUsuario(Usuario adm) {
		// TODO Auto-generated method stub
		
	}

	public void updateUsuario(Usuario adm) {
		// TODO Auto-generated method stub
		
	}

}
