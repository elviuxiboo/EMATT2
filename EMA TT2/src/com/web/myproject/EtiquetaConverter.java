package com.web.myproject;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import com.google.appengine.api.datastore.Entity;


@FacesConverter(value="entityConverter")

public class EtiquetaConverter implements Converter {

	public EtiquetaConverter(){
		
	}
	
	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		// TODO Auto-generated method stub
		return String.valueOf(((Entity)arg2).getProperty("Nombre"));
	}

}
