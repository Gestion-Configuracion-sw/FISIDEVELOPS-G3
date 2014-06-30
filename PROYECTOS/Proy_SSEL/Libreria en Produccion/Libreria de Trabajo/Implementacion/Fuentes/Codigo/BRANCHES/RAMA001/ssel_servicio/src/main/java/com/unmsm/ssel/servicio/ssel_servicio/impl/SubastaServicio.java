package com.unmsm.ssel.servicio.ssel_servicio.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.unmsm.ssel.persistencia.seel_persistencia.modelo.Articulo;
import com.unmsm.ssel.persistencia.seel_persistencia.modelo.Puja;
import com.unmsm.ssel.persistencia.seel_persistencia.modelo.Subasta;
import com.unmsm.ssel.servicio.ssel_servicio.interfaces.ISubastaServicio;

@Transactional(readOnly=false)
@Service(value="subastaServicio")
public class SubastaServicio implements ISubastaServicio{

	public int registrarSubasta(int idUsuario, Subasta subasta) {
		
		return 0;
	}

	public Articulo obtenerArticuloSubasta(int idSubasta) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Subasta> subastasPorUsuario(int idUsurio) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Subasta> subastasPorCategorias(int idCategoria) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Puja> obtenerPujasPorSubasta(int idSubasta) {
		// TODO Auto-generated method stub
		return null;
	}

}
