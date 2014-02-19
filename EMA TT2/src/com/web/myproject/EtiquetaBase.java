package com.web.myproject;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import com.google.appengine.api.datastore.Key;



@Entity
public class EtiquetaBase {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Key key;
	private int idEtiqueta;
	private String Nombre;
	private String tipoEtiqueta;
	public Key getKey() {
		return key;
	}
	public void setKey(Key key) {
		this.key = key;
	}
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
	public int getIdEtiqueta() {
		return idEtiqueta;
	}
	public void setIdEtiqueta(int idEtiqueta) {
		this.idEtiqueta = idEtiqueta;
	}
	
	public EtiquetaBase(int idEtiqueta, String nombre, String tipoEtiqueta){
		this.idEtiqueta = idEtiqueta;
		this.Nombre = nombre;
		this.tipoEtiqueta = tipoEtiqueta;
	}
	
	public EtiquetaBase(){
		
	}
	
	public EtiquetaBase(int id){
		this.idEtiqueta = id;
	}
	
	public EtiquetaBase(Key key){
		this.key = key;
	}

	
	
	

}
