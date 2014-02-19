package com.web.myproject;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PersistenceContext;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.datanucleus.annotations.Unowned;


@Entity
@PersistenceContext
//@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Etiquetas {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Long idEtiqueta;
	private String Nombre;
	private String tipoEtiqueta;
	
	private List<Key> listIdAtributos = new ArrayList<Key>();
	
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getTipoEtiqueta() {
		return tipoEtiqueta;
	}
	public void setTipoEtiqueta(String tipoEtiqueta) {
		this.tipoEtiqueta = tipoEtiqueta;
	}
	public long getIdEtiqueta() {
		return idEtiqueta;
	}
	public void setIdEtiqueta(long idEtiqueta) {
		this.idEtiqueta = idEtiqueta;
	}
	

	
	public Etiquetas(long idEtiqueta, String nombre, String tipoEtiqueta){
		this.idEtiqueta = idEtiqueta;
		this.Nombre = nombre;
		this.tipoEtiqueta = tipoEtiqueta;
	
	}
	
	public Etiquetas(){
		
	}
	
	public Etiquetas(long id){
		this.idEtiqueta = id;
	}
	public List<Key> getListIdAtributos() {
		return listIdAtributos;
	}
	public void setListIdAtributos(List<Key> listIdAtributos) {
		this.listIdAtributos = listIdAtributos;
	}
	public void setIdEtiqueta(Long idEtiqueta) {
		this.idEtiqueta = idEtiqueta;
	}
	


	
	
	
	
}
