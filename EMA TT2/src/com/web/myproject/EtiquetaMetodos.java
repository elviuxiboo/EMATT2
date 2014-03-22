package com.web.myproject;
import java.util.ArrayList;
import java.util.List;

import com.web.myproject.Atributos;
import com.web.myproject.DAO;
import com.web.myproject.Etiquetas;


public class EtiquetaMetodos {
	
	
	public List<String> etiqueta = new ArrayList<String>();
	
/*	public List<String> showEtiquetas(){
	
		List<Etiquetas> eb = new ArrayList<Etiquetas>();
		List<Atributos> at = new ArrayList<Atributos>();
		Atributos atrib = new Atributos();
		eb = DAO.INSTANCE.listEtiquetas();
		for(Etiquetas ebs: eb){
			if(ebs.getListIdAtributos().size()== 0){
				//System.out.println("Etiquetas sin atributos " +ebs.getNombre());
				etiqueta.add(ebs.getNombre());
			}else{
				for(int i=0;i<ebs.getListIdAtributos().size();i++){
					atrib = DAO.INSTANCE.etiquetayAtributo(ebs, i);
					//System.out.println(ebs.getNombre()+ " " + atrib.getNombre() );
					etiqueta.add(ebs.getNombre() + " " + atrib.getNombre());
					}
			}	
		}
		return etiqueta;
	}*/

}
