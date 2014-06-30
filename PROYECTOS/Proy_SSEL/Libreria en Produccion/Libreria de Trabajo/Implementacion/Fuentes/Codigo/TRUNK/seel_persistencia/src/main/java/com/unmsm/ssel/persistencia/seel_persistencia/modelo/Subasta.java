package com.unmsm.ssel.persistencia.seel_persistencia.modelo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="TSUBASTA")
public class Subasta {
	private int id;
	private Date dtInicioSubasta;
	private Date dtFinaSubasta;
	private float flPrecioBase;
	private String vcDescripcion;
	private String vcTelefonoContacto;
	private String vcLugarEntrega;
	private int estado;
	private Articulo articulo;
	private Set<Puja> pujas = new HashSet<Puja>(0);
	private Set<Usuario> usuarios = new HashSet<Usuario>(0);
	

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="IN_IDSUBASTA")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@OneToOne
	@PrimaryKeyJoinColumn
	public Articulo getArticulo() {
		return articulo;
	}
	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}
	
	@ManyToMany(mappedBy="subastas")
	public Set<Usuario> getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(Set<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	@Column(name="DT_INICIOSUBASTA")
	public Date getDtInicioSubasta() {
		return dtInicioSubasta;
	}
	public void setDtInicioSubasta(Date dtInicioSubasta) {
		this.dtInicioSubasta = dtInicioSubasta;
	}
	@Column(name="DT_FINSUBASTA")
	public Date getDtFinaSubasta() {
		return dtFinaSubasta;
	}
	public void setDtFinaSubasta(Date dtFinaSubasta) {
		this.dtFinaSubasta = dtFinaSubasta;
	}
	@Column(name="FL_PRECIOBASE")
	public float getFlPrecioBase() {
		return flPrecioBase;
	}
	public void setFlPrecioBase(float flPrecioBase) {
		this.flPrecioBase = flPrecioBase;
	}
	@Column(name="VC_DESCRIPCION")
	public String getVcDescripcion() {
		return vcDescripcion;
	}
	public void setVcDescripcion(String vcDescripcion) {
		this.vcDescripcion = vcDescripcion;
	}
	@Column(name="VC_TELEFONOCONTACTO")
	public String getVcTelefonoContacto() {
		return vcTelefonoContacto;
	}
	public void setVcTelefonoContacto(String vcTelefonoContacto) {
		this.vcTelefonoContacto = vcTelefonoContacto;
	}
	@Column(name="VC_LUGARENTREGA")
	public String getVcLugarEntrega() {
		return vcLugarEntrega;
	}
	public void setVcLugarEntrega(String vcLugarEntrega) {
		this.vcLugarEntrega = vcLugarEntrega;
	}
	@Column(name="VC_ESTADO")
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	@OneToMany
	@JoinColumn(name="subasta")
	public Set<Puja> getPujas() {
		return pujas;
	}
	public void setPujas(Set<Puja> pujas) {
		this.pujas = pujas;
	}
	
}
