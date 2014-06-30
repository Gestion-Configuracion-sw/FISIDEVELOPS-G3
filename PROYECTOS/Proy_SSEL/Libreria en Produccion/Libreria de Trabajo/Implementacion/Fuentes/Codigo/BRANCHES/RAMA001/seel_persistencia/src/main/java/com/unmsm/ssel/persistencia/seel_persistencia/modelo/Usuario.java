package com.unmsm.ssel.persistencia.seel_persistencia.modelo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;

@Entity
@Table(name="TUSUARIO")
public class Usuario {
	private int id;
	private String vcNombreUsuario;
	private String vcNombrea;
	private String vcDni;
	private String vcCorreoe;
	private String vctelefono;
	private String vcDomicilio;
	private Date dtFNacimiento; 
	private float flSaldo;
	private String contrasena;
	private boolean boEstado;
	private Set<Puja> pujas = new HashSet<Puja>(0);
	private Set<Subasta> subastas= new HashSet<Subasta>(0);
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="IN_IDUSUARIO")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	@OneToMany(mappedBy="usuario")
	public Set<Puja> getPujas() {
		return pujas;
	}
	public void setPujas(Set<Puja> pujas) {
		this.pujas = pujas;
	}
	
	@ManyToMany
	@JoinTable(name="TREGISTROSUBASTA",joinColumns={@JoinColumn(name="TUSUARIO_IN_IDUSUARIO")}, 
								   inverseJoinColumns={@JoinColumn(name="TSUBASTA_IN_IDSUBASTA")})
	public Set<Subasta> getSubastas() {
		return subastas;
	}
	public void setSubastas(Set<Subasta> subastas) {
		this.subastas = subastas;
	}
	
	@Column(name="VC_NOMBREUSUARIO")
	public String getVcNombreUsuario() {
		return vcNombreUsuario;
	}
	public void setVcNombreUsuario(String vcNombreUsuario) {
		this.vcNombreUsuario = vcNombreUsuario;
	}
	
	@Column(name="VC_NOMBRES")
	public String getVcNombrea() {
		return vcNombrea;
	}
	public void setVcNombrea(String vcNombrea) {
		this.vcNombrea = vcNombrea;
	}
	
	@Column(name="VC_DNI")
	public String getVcDni() {
		return vcDni;
	}
	public void setVcDni(String vcDni) {
		this.vcDni = vcDni;
	}
	
	@Column(name="VC_CORREOE")
	public String getVcCorreoe() {
		return vcCorreoe;
	}
	public void setVcCorreoe(String vcCorreoe) {
		this.vcCorreoe = vcCorreoe;
	}
	
	@Column(name="VC_TELEFONO")
	public String getVctelefono() {
		return vctelefono;
	}
	public void setVctelefono(String vctelefono) {
		this.vctelefono = vctelefono;
	}
	
	@Column(name="VC_DOMICILIO")
	public String getVcDomicilio() {
		return vcDomicilio;
	}
	public void setVcDomicilio(String vcDomicilio) {
		this.vcDomicilio = vcDomicilio;
	}
	
	@Column(name="DT_FNACIMIENTO")
	public Date getDtFNacimiento() {
		return dtFNacimiento;
	}
	public void setDtFNacimiento(Date dtFNacimiento) {
		this.dtFNacimiento = dtFNacimiento;
	}
	
	@Column(name="FL_SALDO")
	public float getFlSaldo() {
		return flSaldo;
	}
	public void setFlSaldo(float flSaldo) {
		this.flSaldo = flSaldo;
	}
	
	@Column(name="CONTRASENA")
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
	@Column(name="BO_ESTADO")
	public boolean isBoEstado() {
		return boEstado;
	}
	public void setBoEstado(boolean boEstado) {
		this.boEstado = boEstado;
	}
	
}
