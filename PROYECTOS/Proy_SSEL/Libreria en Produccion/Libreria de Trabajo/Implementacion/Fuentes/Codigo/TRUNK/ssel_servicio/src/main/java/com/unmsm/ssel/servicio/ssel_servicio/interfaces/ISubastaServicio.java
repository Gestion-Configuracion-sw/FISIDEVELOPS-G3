package com.unmsm.ssel.servicio.ssel_servicio.interfaces;

import java.util.List;

import com.unmsm.ssel.persistencia.seel_persistencia.modelo.Articulo;
import com.unmsm.ssel.persistencia.seel_persistencia.modelo.Puja;
import com.unmsm.ssel.persistencia.seel_persistencia.modelo.Subasta;

public interface ISubastaServicio {
	/**
	 * 
	 * @param idUsuario
	 * @param subasta
	 * @return
	 */
	int registrarSubasta(int idUsuario, Subasta subasta);
	/**
	 * 
	 * @param idSubasta
	 * @return
	 */
	Articulo obtenerArticuloSubasta(int idSubasta);
	/**
	 * 
	 * @param idUsurio
	 * @return
	 */
	List<Subasta> subastasPorUsuario(int idUsurio);
	/**
	 * 
	 * @param idCategoria
	 * @return
	 */
	List<Subasta> subastasPorCategorias(int idCategoria);
	/**
	 * 
	 * @param idSubasta
	 * @return
	 */
	List<Puja> obtenerPujasPorSubasta(int idSubasta);
}
