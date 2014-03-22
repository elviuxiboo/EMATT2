package com.web.myproject;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@ManagedBean(name="obtenRec")
@SessionScoped

public class ObtenRecurso_Bean {
	public String codObtenido;

	public String getCodObtenido() {
		return codObtenido;
	}

	public void setCodObtenido(String codObtenido) {
		this.codObtenido = codObtenido;
	}
	
	public void mandaCod(HttpServletRequest request, HttpServletResponse response){
		 FacesContext fc = FacesContext.getCurrentInstance();
		 request = (HttpServletRequest) fc.getExternalContext().getRequest();
		 // ServletContext request = (ServletContext)FacesContext.getCurrentInstance().getExternalContext().getContext();
		 
		 
		 codObtenido= (String) request.getParameter("editor");
		 
	}
	
	
}
