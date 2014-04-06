package com.web.myproject;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;


@ManagedBean(name="registro")
@RequestScoped


public class Usuarios {
	UsuariosRegistro ur = new UsuariosRegistro();
	
	
	
	public void callServletIngreso(){
		String url = "UsuariosRegistro";
		FacesContext context = FacesContext.getCurrentInstance();
		try{
			context.getExternalContext().dispatch(url);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			context.responseComplete();
		}
	}

}
