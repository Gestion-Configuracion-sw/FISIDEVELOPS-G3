package com.unmsm.ssel.persistencia.seel_persistencia.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TCATEGORIA")
public class Categoria {
	private int id;
	private String vcNombre;
	private String vcDescripcion;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="IN_IDCATEGORIA" )
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name="VC_NOMBRE")
	public String getVcNombre() {
		return vcNombre;
	}
	public void setVcNombre(String vcNombre) {
		this.vcNombre = vcNombre;
	}
	@Column(name="VC_DESCRIPCION")
	public String getVcDescripcion() {
		return vcDescripcion;
	}
	public void setVcDescripcion(String vcDescripcion) {
		this.vcDescripcion = vcDescripcion;
	}
	
	
}
