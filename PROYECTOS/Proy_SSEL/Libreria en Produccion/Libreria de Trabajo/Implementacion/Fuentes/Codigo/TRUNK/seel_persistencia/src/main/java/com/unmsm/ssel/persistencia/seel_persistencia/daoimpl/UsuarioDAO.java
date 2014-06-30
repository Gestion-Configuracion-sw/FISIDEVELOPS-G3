package com.unmsm.ssel.persistencia.seel_persistencia.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;

import com.unmsm.ssel.persistencia.seel_persistencia.dao.IUsuarioDAO;
import com.unmsm.ssel.persistencia.seel_persistencia.modelo.Usuario;

public class UsuarioDAO implements IUsuarioDAO{
	private SessionFactory sessionFactory;

	/**
	 * Get Hibernate Session Factory
	 * 
	 * @return SessionFactory - Hibernate Session Factory
	 */
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	/**
	 * Set Hibernate Session Factory
	 * 
	 * @param SessionFactory
	 *            - Hibernate Session Factory
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public Usuario obtener(int idUsuario) throws Exception {
		
		List list = getSessionFactory().getCurrentSession().createQuery("from Usuario where tusuario=?").setParameter(0, idUsuario).list();
		if(list==null || list.isEmpty()){
			return null;
		}

		return (Usuario) list.get(0);
	}

	public boolean ingresar(Usuario usuario) throws Exception {
		try{
			getSessionFactory().getCurrentSession().save(usuario);
		}catch(Exception e){
			throw new Exception("No se pudo insertar");
		}
		
		return true;
	}

	public boolean actualizar(Usuario usuario) throws Exception{
		try{
			getSessionFactory().getCurrentSession().update(usuario);
		}catch(Exception e){
			throw new Exception("No se pudo Actualizar");
		}
		
		return true;
	}

}
