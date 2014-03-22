package com.web.myproject;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.primefaces.context.RequestContext;


@ManagedBean(name="visualizacion")
@SessionScoped
public class Visualizacion_Bean implements Serializable{
	
	public String codigo = "<!DOCTYPE html>"+ "\n" + "<html>" + "\n" + "<head>"+ "\n" + "<title>Hola Mundo</title>" + "\n"+ "<\\head>" + "\n" +"<body>" + "\n" + "<h1>Hola Mundo</h1>" +"\n" + "<\\body>" + "\n" + "<\\html>";

	HttpServletRequest request;
	HttpServletResponse response;
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) throws IOException, ServletException {
		//codigo = mandaCod();
		codigo = obtenCodigo();
		this.codigo = codigo;
	}

	/*public String mandaCod(HttpServletRequest request, HttpServletResponse response) throws IOException{
		String cod; 
		FacesContext fc = FacesContext.getCurrentInstance();
		 //request = (HttpServletRequest) fc.getExternalContext().getRequest();
		 ServletContext requested = (ServletContext)FacesContext.getCurrentInstance().getExternalContext().getContext();
		 cod= (String) requested.getAttribute("editor");
		 
		 if(cod!=null){
			 response.sendRedirect("visualizacionprevia.html");
		 }
		 return cod;
	}*/
	
/*	public String mandaCod(){
		RequestContext context = RequestContext.getCurrentInstance();
		if(codigo!= null){
			context.addCallbackParam("view", "visualizacionprevia.html");
			return codigo;
		}
		return codigo;
		
	}*/
	
	public void mandaCod( ){
	String url = "visualizacionprevia.html";
	FacesContext context = FacesContext.getCurrentInstance();
	try{
		//context.getExternalContext().setResponseContentType("text/html");
		transformaHTML(codigo);
		context.getExternalContext().redirect(url);
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		context.responseComplete();
	}
	//	return "visualizacionprevia.html";		
	}
	
	public String obtenCodigo() throws IOException{
		
	
		FacesContext context = FacesContext.getCurrentInstance();
		String obtenCod = null;
		//resp.setContentType("text/html");
	//	try {
			//context.getExternalContext().setResponseContentType("text/html");
			//try {
				obtenCod = context.getExternalContext().getRequestParameterMap().get("formtext:textcodigo");
				//PrintWriter out = (PrintWriter) context.getExternalContext().getResponseOutputWriter();
				//out.println(obtenCod);
				//out.toString();
				System.out.println(obtenCod);
			//} catch (IOException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
		//	}
			return obtenCod;
			
	}
	
	public void transformaHTML(String cod) throws IOException{
		cod = obtenCodigo();
		FacesContext context = FacesContext.getCurrentInstance();
		context.getExternalContext().setResponseContentType("text/html");
		PrintWriter out = (PrintWriter) context.getExternalContext().getResponseOutputWriter();
		out.println(cod);
		//context.responseComplete();
		
	}
		
/*	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
	        processRequest(request, response);
	    }
	  
	  protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        processRequest(request, response);
	    }
	  
	  protected void processRequest(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
		//  String accion = request.getParameter("accion");
		//  if(accion.equals("Visualizar")){
			 this.VisualizarRecurso();
	//	  }  
	  }
	  
	  public String VisualizarRecurso()throws ServletException, IOException{
		 FacesContext fc = FacesContext.getCurrentInstance();
		  HttpServletRequest request = (HttpServletRequest) fc.getExternalContext().getRequest();
		  HttpServletResponse response = null;
		  response.setContentType("text/html");
		 // ServletContext request = (ServletContext)FacesContext.getCurrentInstance().getExternalContext().getContext();
		   codigo= (String) request.getParameter("editor");
		  System.out.println("la prueba "+codigo);
		  return  codigo;
	  }*/

}
