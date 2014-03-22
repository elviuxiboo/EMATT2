package com.web.myproject;

import java.io.IOException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@ManagedBean(name="servlet_visualizacion")
@SessionScoped
public class Servlet_Visualizacion  extends HttpServlet {
	
	@ManagedProperty(value="#{editor}")
	String editor;
	
	
	
	
	
	 public String getEditor() {
		return editor;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}

	@Override  
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
	        processRequest(request, response);
	    }
	  
	  @Override
	    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        processRequest(request, response);
	    }
	  
	  protected void processRequest(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
		  String accion = request.getParameter("accion");
		  if(accion.equals("Visualizar")){
			 this.VisualizarRecurso();
		  }  
	  }
	  
	  public void VisualizarRecurso()throws ServletException, IOException{
		 FacesContext fc = FacesContext.getCurrentInstance();
		  HttpServletRequest request = (HttpServletRequest) fc.getExternalContext().getRequest();
		 // ServletContext request = (ServletContext)FacesContext.getCurrentInstance().getExternalContext().getContext();
		   editor= (String) request.getParameter("editor");
		  System.out.println("la prueba "+editor);
	  }

}
