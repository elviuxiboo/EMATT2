package com.web.myproject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.component.inputtext.InputText;
import org.primefaces.component.tabview.Tab;
import org.primefaces.component.tabview.TabView;

@ManagedBean
@SessionScoped

public class EtiquetaBean implements Serializable {
	private TabView tabView;
public TabView getTabView(){
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

}
