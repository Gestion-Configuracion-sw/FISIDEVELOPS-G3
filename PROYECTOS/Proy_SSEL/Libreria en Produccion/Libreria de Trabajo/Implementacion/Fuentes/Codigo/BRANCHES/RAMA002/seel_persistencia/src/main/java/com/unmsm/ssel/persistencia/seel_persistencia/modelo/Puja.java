package com.unmsm.ssel.persistencia.seel_persistencia.modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
/**
 * @Entity: Se aplica a la clase e indica que esta clase Java es una entidad a persistir. Es una anotaci�n est�ndar de JPA. 
 * @author LEO
 *
 */
@Entity
@Table(name="TPUJA")
public class Puja {
	private int id;
	private Date dtFechaPuja;
	private float flMontoPuja;
	private Usuario usuario;
	private Subasta subasta;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="IN_IDPUJA")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name="DT_FECHAPUJA")
	public Date getDtFechaPuja() {
		return dtFechaPuja;
	}
	public void setDtFechaPuja(Date dtFechaPuja) {
		this.dtFechaPuja = dtFechaPuja;
	}
	
	@Column(name="FL_MONTOPUJA")
	public float getFlMontoPuja() {
		return flMontoPuja;
	}
	public void setFlMontoPuja(float flMontoPuja) {
		this.flMontoPuja = flMontoPuja;
	}

	@ManyToOne
	@JoinColumn(name = "TUSUARIO_IN_IDUSUARIO")
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	@ManyToOne
	@JoinColumn(name="TSUBASTA_IN_IDSUBASTA")
	public Subasta getSubasta() {
		return subasta;
	}
	public void setSubasta(Subasta subasta) {
		this.subasta = subasta;
	}
}
