package com.web.myproject;

import java.util.ArrayList;

import javax.el.MethodExpression;
import javax.faces.model.SelectItem;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.component.UIOutput;
import javax.faces.context.FacesContext;
import javax.faces.event.AjaxBehaviorEvent;
import javax.faces.event.ValueChangeEvent;

import org.primefaces.component.inputtextarea.InputTextarea;
import org.primefaces.event.SelectEvent;

import com.google.appengine.api.datastore.Entity;


@ManagedBean(name="completado")
@SessionScoped

public class AutocompleteBean {
	
	List<String> etiquetas = new ArrayList<String>();
	List<String> etiqcom = new ArrayList<String>();
	String seleccionado = null;
	Entity et = null;
	

	

	public Entity getEt() {
		return et;
	}

	public void setEt(Entity et) {
		this.et = et;
	}

	public List<String> obtenEtiquetas(String query){
		ValueChangeEvent ev;
		String resultados = null;
		List<Entity> lista = new ArrayList<Entity>();
		//List<Entity> atrib = new ArrayList<Entity>();
		lista = DAO.INSTANCE.listaEtiquetas();
		//atrib = DAO.INSTANCE.atributodeEtiqueta();
		String espacio = " ";
		for(Entity res : lista){
			if(res.getProperty("Nombre").toString().startsWith(query)){
			
				/*	resultados = res.getProperty("Nombre").toString() + " " + res.getProperty("idAtributos");
					etiquetas.add(resultados);
					//System.out.println("ah?? " +FacesContext.getCurrentInstance().getApplication().evaluateExpressionGet(FacesContext.getCurrentInstance(), "#{str}", String.class));
				//	resultados = res.getProperty("Nombre").toString() + " " + atrib.get(i);*/
					etiquetas.add(res.getProperty("Nombre").toString());
				
				/*seleccionado = (String)UIComponent.getCurrentComponent(FacesContext.getCurrentInstance()).getAttributes().get("prueba");
				System.out.println(seleccionado);*/
			}
			
		}
		
		return etiquetas;
	}
	
	public void updateEntity(AjaxBehaviorEvent e){
		String res = (String) ((UIOutput) e.getSource()).getValue();
		System.out.println("evento ajax "+ res);
		//((UIOutput) e.getSource()).resetValue();
		if(DAO.INSTANCE.existeEtiqueta(res)!=null){
			System.out.println("yei ");
		}
		
		
		
	}

}
