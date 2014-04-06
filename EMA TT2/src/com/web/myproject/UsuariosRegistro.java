package com.web.myproject;

import java.io.IOException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.KeyFactory;
import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;


public class UsuariosRegistro extends HttpServlet {

	String email = null;
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		//FacesContext context = FacesContext.getCurrentInstance();
		UserService userService = UserServiceFactory.getUserService();
		User user = userService.getCurrentUser();
		String loginURL = request.getContextPath() + "/faces/index2.xhtml";
		String registroURL = request.getContextPath() + "/faces/Registro.xhtml";
		//String mail = null;
		Entity mail = null; 
		if(user != null) {
		//	mail = user.getEmail();
		//	response.getWriter().println("hola " + mail);
			mail = DAO.INSTANCE.existeUsuario(user.getEmail());
			if(mail != null){
				response.sendRedirect(loginURL);
			}else{
				response.sendRedirect(registroURL);
			}
			
		}else {
			response.sendRedirect(userService.createLoginURL(request.getRequestURI()));
		
		}
	}

		
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		
	
	}
/*	
	
//Método para el registro sin saber que tipo de correo usa	
	public void registrar(HttpServletRequest request, HttpServletResponse response) throws IOException{
		String url = "faces/PerfilPrincipal.xhtml";
		UserService userService = UserServiceFactory.getUserService();
		User user = userService.getCurrentUser();
		obtenMail = context.getExternalContext().getRequestParameterMap().get("formRegistro:mail");
		obtenNombre = context.getExternalContext().getRequestParameterMap().get("formRegistro:nombre");
		obtenPsw = context.getExternalContext().getRequestParameterMap().get("formRegistro:psw");
		//Key usuarioKey = KeyFactory.createKey(kind, id)
		Entity usuario = new Entity("Usuario");
		usuario.setProperty("Correo", obtenMail);
		usuario.setProperty("Nombre", obtenNombre);
		usuario.setProperty("Password", obtenPsw);
		com.google.appengine.api.datastore.DatastoreService ds = DatastoreServiceFactory.getDatastoreService();
		ds.put(usuario);
		context.getExternalContext().redirect(url);

	}
//Método que usa los usuarios de google	
	public void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		String accion = request.getParameter("accion");
		if(accion.equals("ingresar")){
			this.ingresa(request, response);
		}
		
	}
	
	
	public void ingresa(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		FacesContext context = FacesContext.getCurrentInstance();
		UserService userService = UserServiceFactory.getUserService();
		User user = userService.getCurrentUser();
		
		if(user != null) {
			context.getExternalContext().redirect("faces/index2.xhtml");
			//response.sendRedirect("faces/index2.xhtml");
		}else {
			try{
				userService.createLoginURL(request.getRequestURI());
				context.getExternalContext().redirect("faces/index2.xhtml");
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				context.responseComplete();
			}
			
			//Entity usuario = new Entity("Usuario");
		/*	if(DAO.INSTANCE.existeUsuario(correo)){
				//response.sendRedirect("faces/index2.xhtml");
				context.getExternalContext().redirect("faces/index2.xhtml");
			}else{
				Entity usuario = new Entity("Usuario");
				usuario.setProperty("Correo", correo);
				com.google.appengine.api.datastore.DatastoreService ds = DatastoreServiceFactory.getDatastoreService();
				ds.put(usuario);
				//response.sendRedirect("faces/index2.xhtml");
				context.getExternalContext().redirect("faces/index2.xhtml");
			}
			
		}
	
	}*/

	

}
