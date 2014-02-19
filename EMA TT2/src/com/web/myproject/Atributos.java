package com.web.myproject;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.PersistenceContext;

import com.google.appengine.api.datastore.Key;


@Entity

@PersistenceContext
public class Atributos implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Key idAtributo;
	private String Nombre;
	private String tipoAtributo;

	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getTipoAtributo() {
		return tipoAtributo;
	}
	public void setTipoAtributo(String tipoAtributo) {
		this.tipoAtributo = tipoAtributo;
	}
	public Key getIdAtributo() {
		return idAtributo;
	}
	public void setIdAtributo(Key i) {
		this.idAtributo = i;
	}
	
	public Atributos(Key i, String nombre, String tipoAtributo){
		this.idAtributo = i;
		this.Nombre = nombre;
		this.tipoAtributo = tipoAtributo;
	}
	
	public Atributos(){
		
	}
	
	public Atributos(Key id){
		this.idAtributo = id;
	}
	
	public Atributos( String nombre, String tipoAtributo){
		
		this.Nombre = nombre;
		this.tipoAtributo = tipoAtributo;
	}
	
	


}
