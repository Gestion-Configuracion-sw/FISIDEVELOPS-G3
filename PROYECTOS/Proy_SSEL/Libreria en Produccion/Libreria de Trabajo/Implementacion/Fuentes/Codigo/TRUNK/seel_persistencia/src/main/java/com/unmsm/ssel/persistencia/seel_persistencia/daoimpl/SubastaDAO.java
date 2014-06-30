package com.unmsm.ssel.persistencia.seel_persistencia.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;

import com.unmsm.ssel.persistencia.seel_persistencia.dao.ISubastaDAO;
import com.unmsm.ssel.persistencia.seel_persistencia.modelo.Subasta;

public class SubastaDAO implements ISubastaDAO{
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
	
	public Subasta obtener(int idSubasta)throws Exception {
		List list = getSessionFactory().getCurrentSession().createQuery("from Usuario where tsubasta=?").setParameter(0, idSubasta).list();
		if(list==null || list.isEmpty()){
			return null;
		}

		return (Subasta) list.get(0);
	}

	public boolean ingresar(Subasta su) throws Exception{
		try{
			getSessionFactory().getCurrentSession().save(su);
		}catch(Exception e){
			throw new Exception("No se pudo insertar");
		}
		
		return true;
	}

	public boolean actualizar(Subasta su) throws Exception{
		try{
			getSessionFactory().getCurrentSession().update(su);
		}catch(Exception e){
			throw new Exception("No se pudo Actualizar");
		}
		
		return true;
	}

}
