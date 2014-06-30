package com.unmsm.ssel.persistencia.seel_persistencia.dao;

import com.unmsm.ssel.persistencia.seel_persistencia.modelo.Subasta;

public interface ISubastaDAO {
	/**
	 * 
	 * @param idSubasta
	 * @return
	 */
	Subasta obtener(int idSubasta)throws Exception;
	/**
	 * 
	 * @param su
	 * @return
	 */
	boolean ingresar(Subasta su)throws Exception;
	/**
	 * 
	 * @param su
	 * @return
	 */
	boolean actualizar(Subasta su)throws Exception;
	
}
