package com.web.myproject;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.primefaces.component.inputtext.InputText;
import org.primefaces.component.tabview.Tab;
import org.primefaces.component.tabview.TabView;

import com.google.appengine.api.datastore.Key;




public enum DAO {
	
	
	INSTANCE;
	

	
	
	public List<Etiquetas> listEtiquetas(){
		EntityManager em = EMFService.get().createEntityManager();
		Query q = em.createQuery("select e from Etiquetas e");
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
			
		}
	
	
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
	}

	
	
	
	

}
