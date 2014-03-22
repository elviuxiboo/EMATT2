package com.web.myproject;

import java.util.ArrayList;
import java.util.List;

import com.google.appengine.api.datastore.EntityNotFoundException;
import com.google.apphosting.api.DatastorePb.GetResponse.Entity;
import com.google.gson.Gson;

public class PruebaGson {
	
	public void transformaenGson(){
	
		Gson gson = new Gson();
		com.google.appengine.api.datastore.Entity etiq = DAO.INSTANCE.existeEtiqueta("body");
		String json = gson.toJson(etiq);
		System.out.print(json);
		
	}
	
	public void transformaenGsonConsulta() throws EntityNotFoundException{
		Gson gson = new Gson();
		com.google.appengine.api.datastore.Entity etiq = DAO.INSTANCE.nombreAtributo();
		String json = gson.toJson(etiq);
		System.out.print(json);
	}
	
/*Si sirve*/	public String listaAtributosdelaEtiqueta() throws EntityNotFoundException{
		Gson gson = new Gson();
		List<com.google.appengine.api.datastore.Entity> res = DAO.INSTANCE.listaAtributosbyId("form");
		String json = gson.toJson(res);
		return json;
	}
	
	public List<String> listaString() throws EntityNotFoundException{
		Gson gson = new Gson();
		List<com.google.appengine.api.datastore.Entity> res = DAO.INSTANCE.listaAtributosbyId("form");
		List<String> json = new ArrayList<String>();
		json.add(gson.toJson(res));
		return json;
	
}

}
