package com.web.myproject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
//import javax.persistence.Query;












import org.primefaces.component.inputtext.InputText;
import org.primefaces.component.tabview.Tab;
import org.primefaces.component.tabview.TabView;

import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.EmbeddedEntity;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.EntityNotFoundException;
import com.google.appengine.api.datastore.FetchOptions;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;
import com.google.appengine.api.datastore.Query.Filter;
import com.google.appengine.api.datastore.Query.FilterOperator;
import com.google.appengine.api.datastore.Query.FilterPredicate;
import com.google.appengine.api.datastore.Transaction;




public enum DAO {
	
	
	INSTANCE;
	

	
	
/*	public List<Etiquetas> listEtiquetas(){
		EntityManager em = EMFService.get().createEntityManager();
		Query q = em.createQuery("select e from Etiquetas e");
		return q.getResultList();
		
	}
	
	public List<Etiquetas> listEtiquetasyAtributos(){
		EntityManager em = EMFService.get().createEntityManager();
		Query q = em.createQuery("select e, a FROM Etiquetas e INNER JOIN e.listIdAtributos a");
		return q.getResultList();
		
	}
	
	public List<Atributos> listAtributos(){
		EntityManager em = EMFService.get().createEntityManager();
		Query q = em.createQuery("select e from Atributos e");
		List<Atributos> eb = q.getResultList();
		return eb;
	}

	
	public void add(int idEtiqueta, String nombre, String tipoEtiqueta){
		synchronized(this){
			EntityManager em = EMFService.get().createEntityManager();
			EtiquetaBase eb = new EtiquetaBase(idEtiqueta,nombre, tipoEtiqueta);
			//eb = new EtiquetaBase(2,"<abbr>", "Define un link");
			em.merge(eb);
			em.close();
			
		}
	}

	
	public List<Etiquetas> getEtiquetas(String idEtiq){
		EntityManager em = EMFService.get().createEntityManager();
		Query q = em.createQuery("select e from Etiquetas e where e.idEtiqueta = :idEtiq");
		q.setParameter("idEtiq", idEtiq);
		List<Etiquetas> todo = q.getResultList();
		return todo;
	}
	
	public void remove(){
		EntityManager em = EMFService.get().createEntityManager();
		Query q = em.createQuery("DELETE FROM Etiquetas e");
		q.executeUpdate();
		
	}
	public void removeAributos(){
		EntityManager em = EMFService.get().createEntityManager();
		Query q = em.createQuery("DELETE FROM Atributos a");
		q.executeUpdate();
		
	}
	
	
	public void addEtiqueta(Etiquetas e){
		synchronized(this){
			EntityManager em = EMFService.get().createEntityManager();
			EntityTransaction tx = em.getTransaction();
			tx.begin();
			em.merge(e);
			tx.commit();
			em.close();
			
		}
	}
	
	public void refreshEtiqueta(Etiquetas e){
		synchronized(this){
			EntityManager em = EMFService.get().createEntityManager();
			EntityTransaction tx = em.getTransaction();
			tx.begin();
			em.refresh(e);
			tx.commit();
			em.close();
			
		}
	}
	
	public void addAtributos(Atributos a){	
		EntityManager em = EMFService.get().createEntityManager();
			EntityTransaction tx = em.getTransaction();
			tx.begin();
			em.merge(a);
			tx.commit();
			em.close();
			
		}*/
	
	public void addAtributo(String nombre, String tipoAtributo){
		Key idAtributo = null;
		com.google.appengine.api.datastore.DatastoreService ds = DatastoreServiceFactory.getDatastoreService();
	
		Entity atributo = new Entity("AtributosAbajo", idAtributo);
		atributo.setProperty("Nombre", nombre);
		atributo.setProperty("TipoAtributo", tipoAtributo);
		ds.put(atributo);
	
	}
	
	public Entity addEtiqueta(String nombre, String tipoEtiqueta){
		Key idEtiqueta = null;
		List<Key> idAtributo = new ArrayList<Key>();
		com.google.appengine.api.datastore.DatastoreService ds = DatastoreServiceFactory.getDatastoreService();
		Entity etiqueta = new Entity("EtiquetasAbajo", idEtiqueta);
		etiqueta.setProperty("Nombre", nombre);
		etiqueta.setProperty("TipoEtiqueta", tipoEtiqueta);
		//etiqueta.setProperty("Llave Atributo", idAtributo);
		ds.put(etiqueta);
		return etiqueta;
	}
	
	public List<Key> relacion(String etiq, String atrib){
		com.google.appengine.api.datastore.DatastoreService ds = DatastoreServiceFactory.getDatastoreService();
		Transaction txn = ds.beginTransaction();
		Entity etiqueta = existeEtiqueta(etiq);
		Entity atributo = existeAtributo(atrib);
		atributo.getKey();
		List<Key> llaveatributo = Arrays.asList(atributo.getKey());
		etiqueta.setProperty("Llave Atributo", llaveatributo);
		ds.put(etiqueta);
		txn.commit();
		return llaveatributo;
	}
	
	public Entity addRelacion(String etiq, String atrib, List<Key> idAtributos){
		Entity etiqueta = existeEtiqueta(etiq);
		idAtributos = relacion(etiq, atrib);
		etiqueta.setProperty("idAtributos", idAtributos);
		return etiqueta;
	}
	
	
	public Entity existeEtiqueta(String etiq){
		com.google.appengine.api.datastore.DatastoreService ds = DatastoreServiceFactory.getDatastoreService();
		Filter nombreEtiq = new FilterPredicate("Nombre", FilterOperator.EQUAL, etiq);
		Query etiqueta = new Query("EtiquetasAbajo").setFilter(nombreEtiq);
		PreparedQuery pqe = ds.prepare(etiqueta);
		return pqe.asList(FetchOptions.Builder.withDefaults()).get(0);
	}
	
	public Entity existeAtributo(String atrib){
		com.google.appengine.api.datastore.DatastoreService ds = DatastoreServiceFactory.getDatastoreService();
		Filter nombreAtrib = new FilterPredicate("Nombre", FilterOperator.EQUAL, atrib);
		Query atributo = new Query("AtributosAbajo").setFilter(nombreAtrib);
		PreparedQuery pqe = ds.prepare(atributo);
		return pqe.asList(FetchOptions.Builder.withDefaults()).get(0);
	}
	
	public List<Entity> listaEtiquetas(){
		com.google.appengine.api.datastore.DatastoreService ds = DatastoreServiceFactory.getDatastoreService();
		List<Entity> entidad = new ArrayList<Entity>();
		Query etiqueta = new Query("EtiquetasAbajo");
		PreparedQuery pqe = ds.prepare(etiqueta);
		return pqe.asList(FetchOptions.Builder.withDefaults());
	}
	public List<Entity> listaAtributos(){
		com.google.appengine.api.datastore.DatastoreService ds = DatastoreServiceFactory.getDatastoreService();
		List<Entity> entidad = new ArrayList<Entity>();
		Query etiqueta = new Query("AtributosAbajo");
		PreparedQuery pqe = ds.prepare(etiqueta);
		return pqe.asList(FetchOptions.Builder.withDefaults());
	}
	
	public Entity etiquetayAtributo(){
	
		com.google.appengine.api.datastore.DatastoreService ds = DatastoreServiceFactory.getDatastoreService();
		List<Entity> listaEtiq = listaEtiquetas();
		List<Entity> listaAtr = listaAtributos();
		List<Object> keyA = new ArrayList<Object>();
		Entity atr = null;
		Entity resA = null;
		for(int i =0; i<listaEtiq.size();i++){
			atr = listaEtiq.get(i);
			//resA = (Entity) atr.getProperty("idAtributo");
			//resA = (Entity)atr.getProperty("idAtributo");
		/*	Filter idAtrib = new FilterPredicate("idAtributo", FilterOperator.IN, etiq.getProperty("idAtributo"));
			Query etiqueta = new Query("Etiquetas").setFilter(idAtrib);
			PreparedQuery pqe = ds.prepare(etiqueta);
			List<Entity> ids = pqe.asList(FetchOptions.Builder.withDefaults());
			for(int h =0; h<listaAtr.size();h++){
				for(int j=0; j<ids.size();j++){
					//Entity result =;
				//	Filter obtenAt = new FilterPredicate(Entity.KEY_RESERVED_PROPERTY, FilterOperator.EQUAL, ids.get(j));
					//Query atributo = new Query("Atributos").addFilter(Entity.KEY_RESERVED_PROPERTY, Query.FilterOperator.EQUAL,  ids.get(j));
						/*Query atributo = new Query("Atributos");
						PreparedQuery pqa = ds.prepare(atributo);
						atr = pqa.asSingleEntity();*/
				/*		if(ids.get(j)==listaAtr.get(h)){
							return listaAtr.get(j);
						}
				
			}
			
				
			}*/
		}
		return atr;
		
		/*
		Entity atributos = new Entity("Atributos");
		Entity etiquetas = new Entity("Etiquetas");
		List<Entity> lista = new ArrayList<Entity>();
		Key llaveat = atributos.getKey();
		Filter idAtrib = new FilterPredicate("idAtributo", FilterOperator.EQUAL, etiq.getProperty("idAtributos"));
		//Filter nombreAtrib = new FilterPredicate("Nombre", FilterOperator.EQUAL, atrib);
 		Query etiqueta = new Query("Etiquetas").setFilter(idAtrib);
 		// = ds.prepare(etiqueta).asList(FetchOptions.Builder.withDefaults());
 		//etiquetas = ids.get(i);
 		PreparedQuery pqe = ds.prepare(etiqueta);
 		List<Entity> ids = pqe.asList(FetchOptions.Builder.withDefaults());
 		Query atributo = new Query("Atributos").addFilter(Entity.KEY_RESERVED_PROPERTY, Query.FilterOperator.EQUAL, ids.get(i));
 		//PreparedQuery pqe = ds.prepare(etiqueta);
 		PreparedQuery pqa = ds.prepare(atributo);
 		
	//	return pqe.asSingleEntity();
		return pqa.asSingleEntity();*/
	}
	
	public List<Entity> atributodeEtiqueta(){
		
		com.google.appengine.api.datastore.DatastoreService ds = DatastoreServiceFactory.getDatastoreService();
		List<Entity> listaEtiq = listaEtiquetas();
		List<Entity> ids = new ArrayList<Entity>();
		List<Object> keyA = new ArrayList<Object>();
		Entity atr = null;
		Entity etiq = null;
		for(int i =0; i<listaEtiq.size();i++){
			etiq = listaEtiq.get(i);
			ids = (List<Entity>) etiq.getProperty("idAtributo");
		}
		return ids;
		
	}
	
	public List<Key> listaAtdeEtiqueta(String nombre){
		Entity ent = DAO.INSTANCE.existeEtiqueta(nombre);
		List<Key> lista = (List<Key>) ent.getProperty("idAtributo");
		return lista;
	}
	
	
	
	public List<Key> llaveAtributodeEtiqueta(){
		
		com.google.appengine.api.datastore.DatastoreService ds = DatastoreServiceFactory.getDatastoreService();
		List<Entity> listaEtiq = listaEtiquetas();
		List<Key> ids = new ArrayList<Key>();
		List<Object> keyA = new ArrayList<Object>();
		Entity atr = null;
		Entity etiq = null;
		for(int i =0; i<listaEtiq.size();i++){
			etiq = listaEtiq.get(i);
			ids = (List<Key>) etiq.getProperty("idAtributo");
		}
		return ids;
		
	}
	
	public List<String> keyAtributodeEtiqueta(){
		
		com.google.appengine.api.datastore.DatastoreService ds = DatastoreServiceFactory.getDatastoreService();
		List<Entity> listaEtiq = listaEtiquetas();
		List<String> ids = new ArrayList<String>();
		List<Object> keyA = new ArrayList<Object>();
		Entity atr = null;
		Entity etiq = null;
		for(int i =0; i<listaEtiq.size();i++){
			etiq = listaEtiq.get(i);
			ids = (List<String>) etiq.getProperty("idAtributo");
		}
		return ids;
		
	}
	
	public Entity nombreAtributo() throws EntityNotFoundException{
		com.google.appengine.api.datastore.DatastoreService ds = DatastoreServiceFactory.getDatastoreService();
		//List <String> ids = keyAtributodeEtiqueta();
	//	List<Entity> ids = atributodeEtiqueta();
		List<Key> ids = llaveAtributodeEtiqueta();
		List<Long> idsA = agregaAListaID();
		//List<Entity> listaAtr = listaAtributos();
		Entity res = null;
		Entity at = null;
		Key key = null;
		for(int j=0; j<ids.size(); j++ ){
			for(int k =0; k<idsA.size();k++){
				if(ids.get(j).getId() == idsA.get(k)){
					System.out.println(idsA.get(k).toString() + " " + ids.get(j).getId());
					key = KeyFactory.createKey("AtributosAbajo", idsA.get(k));
					at = ds.get(key);
					System.out.println(at.toString());
				}
			}
	}
		return at;
	}
	
	public List<Long> agregaAListaID(){
		List<Entity> listaAtr = listaAtributos();
		Entity res = null;
		List<Long> ids = new ArrayList<Long>();
		for(int k =0; k<listaAtr.size();k++){
				res = (Entity)listaAtr.get(k);
				ids.add(res.getKey().getId());
 	}	
		return ids;
	}
	
	public List<Entity> listaAtributosbyId(String nombre) throws EntityNotFoundException{
		com.google.appengine.api.datastore.DatastoreService ds = DatastoreServiceFactory.getDatastoreService();
		//List<Key> ids = llaveAtributodeEtiqueta();
		List<Key> ids = DAO.INSTANCE.listaAtdeEtiqueta(nombre);
		List<Long> idsA = agregaAListaID();
		List<Entity> listaAtr = new ArrayList<Entity>();
		Entity res = null;
		Entity at = null;
		Key key = null;
		for(int j=0; j<ids.size(); j++ ){
			for(int k =0; k<idsA.size();k++){
				if(ids.get(j).getId() == idsA.get(k)){
					System.out.println(idsA.get(k).toString() + " " + ids.get(j).getId());
					key = KeyFactory.createKey("AtributosAbajo", idsA.get(k));
					at = ds.get(key);
					listaAtr.add(at);
					System.out.println(at.toString());
				}
			}
	}
		return listaAtr;
	}
	
	public List<Key> atributodeEtiquetaKey(){
		
		com.google.appengine.api.datastore.DatastoreService ds = DatastoreServiceFactory.getDatastoreService();
		List<Entity> listaEtiq = listaEtiquetas();
		List<Entity> listaAtr = listaAtributos();
		List<Entity> ids = new ArrayList<Entity>();
		List<Key> keyA = new ArrayList<Key>();
		Entity atr = null;
		Entity etiq = null;
		for(int i =0; i<listaEtiq.size();i++){
			etiq = listaEtiq.get(i);
			keyA = (List<Key>)etiq.getProperty("idAtributo");	
		}
		return keyA;
		
	}
	
	
/*	
 * 	public Atributos etiquetayAtributo(Etiquetas et, int i){
		
		EntityManager em = EMFService.get().createEntityManager();
		Atributos at = new Atributos();
		Key llaveet = et.getListIdAtributos().get(i);
		Key llaveat = at.getIdAtributo();
		Query q = em.createQuery("select a from Atributos a where a.idAtributo = :llaveet");
		q.setParameter("llaveet", llaveet);
		Atributos eb = (Atributos)q.getSingleResult();
		em.close();
		return eb;

		
	}
 * 
 * 
 * 
	public void addAtributoAEtiqueta(Etiquetas et, String nombre){
		Atributos at = new Atributos();
		EntityManager em = EMFService.get().createEntityManager();
		Query q = em.createQuery("SELECT a FROM Atributos a where a.Nombre = :nombre"); 
		q.setParameter("nombre", nombre);
		//Etiquetas et = new Etiquetas();
		if(at.getNombre() == nombre){
			List <Atributos> lista = q.getResultList();
			//et.setAtributo(lista);
			em.merge(et);
			em.close();
		}else 
			addEtiqueta(et);
		
		//return et;
	}
	
	public void addEtiquetaAtributo(String nombreEt, String nombreAt){
		
		EntityManager em = EMFService.get().createEntityManager();
		Etiquetas et = existeEtiquetas(nombreEt).get(0);
		Atributos at = existeAtributo(nombreAt).get(0);
		et.getListIdAtributos().add(at.getIdAtributo());
		em.persist(et);
		em.close();
		
		
	}
	
	public Atributos etiquetayAtributo(Etiquetas et, int i){
		
		EntityManager em = EMFService.get().createEntityManager();
		Atributos at = new Atributos();
		Key llaveet = et.getListIdAtributos().get(i);
		Key llaveat = at.getIdAtributo();
		Query q = em.createQuery("select a from Atributos a where a.idAtributo = :llaveet");
		q.setParameter("llaveet", llaveet);
		Atributos eb = (Atributos)q.getSingleResult();
		em.close();
		return eb;

		
	}
	
	
	public List<Atributos> existeAtributo(String nombre){
		EntityManager em = EMFService.get().createEntityManager();
		Query q = em.createQuery("SELECT a FROM Atributos a where a.Nombre = :nombre");
		q.setParameter("nombre", nombre);
		List<Atributos> atr =q.getResultList();
		em.close();
		return atr;
	}
	
	public List<Etiquetas> existeEtiquetas(String nombre){
		EntityManager em = EMFService.get().createEntityManager();
		Query q = em.createQuery("SELECT e FROM Etiquetas e where e.Nombre = :nombre");
		q.setParameter("nombre", nombre);
		List<Etiquetas> etiq =q.getResultList();
		em.close();
		return etiq;
	}
	
	
	
	public Atributos existeAtributoSolo(String nombre){
		EntityManager em = EMFService.get().createEntityManager();
		Query q = em.createQuery("SELECT a FROM Atributos a where a.Nombre = :nombre");
		q.setParameter("nombre", nombre);
		Atributos atr = (Atributos) q.getSingleResult();
		em.close();
		return atr;
	}*/

	
	
	
	

}
