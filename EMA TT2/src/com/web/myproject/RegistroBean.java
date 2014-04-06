package com.web.myproject;

import java.io.IOException;
import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;

@ManagedBean(name="correo")
@SessionScoped

public class RegistroBean implements Serializable{
	
	String mail = null;
	String nombre = null;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) throws IOException {
		Entity name = registraUsuarios();
		nombre = name.toString();
		this.nombre = nombre;
	}

	public String getMail() {
		mail = obtenMail();
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
	
	public String obtenMail(){
		UserService userService = UserServiceFactory.getUserService();
		User user = userService.getCurrentUser();
		mail =user.getEmail();
		return mail;
	}
	
	public Entity registraUsuarios() throws IOException{
		String url = "/faces/index2.xhtml";
		FacesContext context = FacesContext.getCurrentInstance();
		mail = context.getExternalContext().getRequestParameterMap().get("formRegistro:mail");
		nombre = context.getExternalContext().getRequestParameterMap().get("formRegistro:nombre");
		Entity usuario = DAO.INSTANCE.addUsuario(mail, nombre);
		context.getExternalContext().redirect(url);
		return usuario;
	}

}
