package com.web.myproject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.component.inputtext.InputText;
import org.primefaces.component.tabview.Tab;
import org.primefaces.component.tabview.TabView;

import com.google.appengine.api.datastore.Entity;

@ManagedBean(name="etiqueta")
@RequestScoped

public class EtiquetaBean{
	
	private TabView tabView;
	@ManagedProperty(value="#{lista}")
	
	//public String etiqueta = "<!DOCTYPE html>"+ "\n" + "<html>" + "\n" + "<head>"+ "\n" + "<title>Hola Mundo</title>" + "\n"+ "<\\head>" + "\n" +"<body>" + "\n" + "<h1>Hola Mundo</h1>" +"\n" + "<\\body>" + "\n" + "<\\html>";
	
	public List<Entity> entity = new ArrayList<Entity>();
	

	public List<Entity> getEntity() {
		entity = list();
		return entity;
	}

	public void setEntity(List<Entity> entity) {
		this.entity = entity;
	}
	
	public List<Entity> list(){
		entity = DAO.INSTANCE.listaEtiquetas();
		return entity;
	}
	

	
	
	/*public List<String> todasEtiquetas = new ArrayList<String>();
	
	public List<Etiquetas> lista = new ArrayList<Etiquetas>();
	public Etiquetas etiquetilla = new Etiquetas();
	
	

public Etiquetas getEtiquetilla() {
		return etiquetilla;
	}

	public void setEtiquetilla(Etiquetas etiquetilla) {
		this.etiquetilla = etiquetilla;
	}

/*public List<Etiquetas> getLista() {
		lista = lista();
		return lista;
	}

	public void setLista(List<Etiquetas> lista) {
		this.lista = lista;
	}

public List<String> getTodasEtiquetas() {
		return todasEtiquetas;
	}

	public void setTodasEtiquetas(List<String> todasEtiquetas) {
		this.todasEtiquetas = todasEtiquetas;
	}

public String getEtiqueta() {
		return etiqueta;
	}

	public void setEtiqueta(String etiqueta) {
		this.etiqueta = etiqueta;
	}

/*public TabView getTabView(){
		String name = null;
		FacesContext fc = FacesContext.getCurrentInstance();
        tabView = (TabView) fc.getApplication().createComponent("org.primefaces.component.TabView");
        List<Etiquetas> etiquetas = new ArrayList<Etiquetas>();
        etiquetas = DAO.INSTANCE.listEtiquetas();
        for(Etiquetas eb : etiquetas){
        	name = eb.getNombre();
        	Tab tab = new Tab();
        	
        	InputText it = new InputText();
        	//it.setLabel(eb.getNombre());
        	it.setValue(eb.getNombre());
        	it.setValue(eb.getTipoEtiqueta());
        	//it.setValue(eb.getTipoEtiqueta());
        	tab.getChildren().add(it);
        	
        	tabView.getChildren().add(tab);
        }
        return tabView;
	}
	
	public List<Etiquetas> lista (){
		lista = DAO.INSTANCE.listEtiquetas();
		return lista;
	}*/
}
