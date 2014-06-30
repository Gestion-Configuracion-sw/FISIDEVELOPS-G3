package com.unmsm.ssel.persistencia.seel_persistencia.modelo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="TARTICULO")
public class Articulo {
	private int id;
	private int idArticulo;
	private String vcNombre;
	private String vcDescripcion;
	private Subasta subasta;
	private int idCategoria;
	private Set<Imagen> imagenes = new HashSet<Imagen>(0);
	

	@Id
	@Column(name="TSUBASTA_IN_IDSUBASTA")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name="IN_IDARTICULO")
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getIdArticulo() {
		return idArticulo;
	}
	public void setIdArticulo(int idArticulo) {
		this.idArticulo = idArticulo;
	}
	@Column(name="TCATEGORIA_IN_IDCATEGORIA")
	public int getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}
	
	@OneToMany(mappedBy = "articulo")
	public Set<Imagen> getImagenes() {
		return imagenes;
	}
	public void setImagenes(Set<Imagen> imagenes) {
		this.imagenes = imagenes;
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
	
	@OneToOne
	@PrimaryKeyJoinColumn
	public Subasta getSubasta() {
		return subasta;
	}
	public void setSubasta(Subasta subasta) {
		this.subasta = subasta;
	}
	
	
}
