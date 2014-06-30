package com.unmsm.ssel.persistencia.seel_persistencia.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="TIMAGEN")
public class Imagen {
	private int id;
	private byte[] lbImagen;
	private Articulo articulo;
	private String vcDetalle;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="IN_IDIMAGEN" )
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name="VC_DETALLE")
	public String getVcDetalle() {
		return vcDetalle;
	}

	public void setVcDetalle(String vcDetalle) {
		this.vcDetalle = vcDetalle;
	}
	
	@Column(name="LB_IMAGEN")
	public byte[] getLbImagen() {
		return lbImagen;
	}
	public void setLbImagen(byte[] lbImagen) {
		this.lbImagen = lbImagen;
	}

	@ManyToOne
	@JoinColumn(name = "TARTICULO_TSUBASTA_IN_IDSUBASTA")
	public Articulo getArticulo() {
		return articulo;
	}
	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}
}
