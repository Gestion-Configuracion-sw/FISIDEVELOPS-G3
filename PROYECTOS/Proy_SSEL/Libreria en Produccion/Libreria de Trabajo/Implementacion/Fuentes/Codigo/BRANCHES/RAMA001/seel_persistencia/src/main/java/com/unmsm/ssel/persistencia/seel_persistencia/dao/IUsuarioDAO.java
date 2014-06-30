package com.unmsm.ssel.persistencia.seel_persistencia.dao;

import com.unmsm.ssel.persistencia.seel_persistencia.modelo.Usuario;

public interface IUsuarioDAO {
	/**
	 * Obtiene un usuario cuyo id se pasa como parametro
	 * idUsuario: si no existe se retorna nulla
	 * idUsuario: es nulo se lanza un Exception
	 * @param idUsuario
	 * @return
	 */
	Usuario obtener(int idUsuario) throws Exception;
	/**
	 * Inserta un usuario
	 * usuario: Si es null retorna se retorna una Exception
	 * @param usuario
	 * @return
	 */
	boolean ingresar(Usuario usuario)throws Exception;
	/**
	 * Actualiza un usuario
	 * @param usuario
	 * @return
	 */
	boolean actualizar(Usuario usuario)throws Exception;
}
