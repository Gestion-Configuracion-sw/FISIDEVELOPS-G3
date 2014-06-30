package com.unmsm.ssel.servicio.ssel_servicio.interfaces;

import java.util.List;

import com.unmsm.ssel.persistencia.seel_persistencia.modelo.Usuario;


public interface IUsuarioServicio {
	public void registrarUsuario(Usuario adm);
	
	public void deleteUsuario(Usuario adm);

	public void updateUsuario(Usuario adm);

	public Usuario getUsuarioById(String idusuario, String pass);

	public List<Usuario> getUsuario();

}
