package com.web.myproject;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.EntityNotFoundException;
import com.google.appengine.api.datastore.Key;


@ManagedBean(name="atributo")
@RequestScoped
public class AtributoBean {
	
	
	public Entity atributillo = new Entity("Atributos");
	public List<Entity> listaAt = new ArrayList<Entity>();
	public Entity resultadoNom = null;
	public List<Key> llave = new ArrayList<Key>();
	public List<String> kstr = new ArrayList<String>();
	public Entity nombres = null;
	public Long k = null;
	public Long key = null;
	public List<Long> ids = new ArrayList<Long>();
	public String idsitos = null;
	public List<Entity> listaNombres = new ArrayList<Entity>();
	
	public Entity getAtributillo() {
		atributillo = unSoloAtributillo();
		return atributillo;
	}

	public void setAtributillo(Entity atributillo) {
		this.atributillo = atributillo;
	}

	
	
	public Entity atributo (){
		Entity atUsados = DAO.INSTANCE.etiquetayAtributo();
		return atUsados;
		
	}

	public List<Entity> getListaAt() {
		listaAt = listaAtr();
		return listaAt;
	}

	public void setListaAt(List<Entity> listaAt) {
		this.listaAt = listaAt;
	}
	
	public List<Entity> listaAtr(){
		listaAt = DAO.INSTANCE.atributodeEtiqueta();
		return listaAt;
	}


		
	public Entity unSoloAtributillo(){
		List<Entity> ent = DAO.INSTANCE.atributodeEtiqueta();
		for(int i=0; i<ent.size(); i++){
			atributillo = ent.get(i);
		}
		return atributillo;
	}

	public Entity getResultadoNom() {
		resultadoNom = regresaName();
		return resultadoNom;
	}

	public void setResultadoNom(Entity resultadoNom) {
		this.resultadoNom = resultadoNom;
	}
		
		
	public Entity regresaName(){
//		Entity res = DAO.INSTANCE.nombreAtributo();
		return resultadoNom;
	}

	public List<Key> getLlave() {
		llave = obtenLlaves();
		return llave;
	}

	public void setLlave(List<Key> llave) {
		this.llave = llave;
	}
	
	public List<Key> obtenLlaves(){
		List<Key> kllave = DAO.INSTANCE.llaveAtributodeEtiqueta();
		return kllave;
	}

	public List<String> getKstr() {
		kstr = obtenSt();
		return kstr;
	}

	public void setKstr(List<String> kstr) {
		this.kstr = kstr;
	}
	
	public List<String> obtenSt(){
		List<String> kley = DAO.INSTANCE.keyAtributodeEtiqueta();
		return kley;
	}

	public Entity getNombres() throws EntityNotFoundException {
		nombres = obtenNm();
		return nombres;
	}

	public void setNombres(Entity nombres) {
		this.nombres = nombres;
	}
	
	public Entity obtenNm() throws EntityNotFoundException{
		Entity nm = DAO.INSTANCE.nombreAtributo();
		return nm;
	}

	public List<Long> getIds() {
		ids = obtenId();
		return ids;
	}

	public void setIds(List<Long> ids) {
		this.ids = ids;
	}

	public List<Long> obtenId(){
		List<Long> lst = DAO.INSTANCE.agregaAListaID();
		return lst;
	}
	


	public List<Entity> getListaNombres() throws EntityNotFoundException {
		listaNombres = namesAt();
		return listaNombres;
	}

	public void setListaNombres(List<Entity> listaNombres) {
		this.listaNombres = listaNombres;
	}


	public List<Entity> namesAt() throws EntityNotFoundException{
		List<Entity> ent = DAO.INSTANCE.listaAtributosbyId("option");
		return ent;
	}

	
	
	
		//Entity atributo = DAO.INSTANCE.etiquetayAtributo( i, j);
		
		
		/*List<Entity> entity = new ArrayList<Entity>();
		EtiquetaBean eb = new EtiquetaBean();
		entity = eb.list();
		Entity etiquetas = new Entity("Etiquetas");
		Entity atri = new Entity("Atributos");
		for(Entity etiqueta :entity){
			for(int i=0; i<entity.size(); i++){
				atri = DAO.INSTANCE.etiquetayAtributo(entity.get(i), i);
				atri.getProperty("Nombre");
			}
			
		}
			
		return atri;*/
		
	
}
