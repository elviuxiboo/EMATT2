package com.web.myproject;

import java.util.ArrayList;
import java.util.List;

import com.web.myproject.Atributos;

public class AtributosBase {
	
	Atributos at = new Atributos();
	
/*	public Atributos a�adirAtributos(){
		at.setIdAtributo(1);
		at.setNombre("abbr");
		at.setTipoAtributo("abreviatura de celda de cabecera");
		at.setIdAtributo(2);
		at.setNombre("accept-charset");
		at.setTipoAtributo("abreviatura de celda de cabecera");
		at.setIdAtributo(3);
		at.setNombre("accept");
		at.setTipoAtributo("lista de tipos MIME para subir ficheros");
		at.setIdAtributo(4);
		at.setNombre("accesskey");
		at.setTipoAtributo("lista de tipos MIME para subir fichero");
		at.setIdAtributo(5);
		at.setNombre("action");
		at.setTipoAtributo("procesador de formulario en servidor");
		at.setIdAtributo(6);
		at.setNombre("align");
		at.setTipoAtributo("t�tulo de una tabla/alineacion");
		at.setIdAtributo(7);
		at.setNombre("alink");
		at.setTipoAtributo("color de v�nculos seleccionados");
		at.setIdAtributo(8);
		at.setNombre("alt");
		at.setTipoAtributo("descripci�n corta");
		at.setIdAtributo(9);
		at.setNombre("archive");
		at.setTipoAtributo("lista de archivos separados por comas");
		at.setIdAtributo(10);
		at.setNombre("axis");
		at.setTipoAtributo("lista de cabeceras relacionadas separadas por comas");
		at.setIdAtributo(11);
		at.setNombre("background");
		at.setTipoAtributo("fichero de textura de fondo del documento");
		at.setIdAtributo(12);
		at.setNombre("bgcolor");
		at.setTipoAtributo("color de fondo");
		at.setIdAtributo(13);
		at.setNombre("border");
		at.setTipoAtributo("Ancho y tipo de borde");
		at.setIdAtributo(14);
		at.setNombre("cellpadding");
		at.setTipoAtributo("espacio dentro de celdas");
		at.setIdAtributo(15);
		at.setNombre("char");
		at.setTipoAtributo("car�cter de alineaci�n");
		at.setIdAtributo(16);
		at.setNombre("charoff");
		at.setTipoAtributo("offset para car�cter de alineaci�n");
		at.setIdAtributo(17);
		at.setNombre("charset");
		at.setTipoAtributo("codificaci�n de caracteres del recurso vinculado");
		at.setIdAtributo(18);
		at.setNombre("checked");
		at.setTipoAtributo("para radiobotones y casillas de verificaci�n");
		at.setIdAtributo(19);
		at.setNombre("cite");
		at.setTipoAtributo("para radiobotones y casillas de verificaci�n/informacion sobre raz�n de cambio");
		at.setIdAtributo(20);
		at.setNombre("class");
		at.setTipoAtributo("lista de clases separadas por espacios");
		at.setIdAtributo(21);
		at.setNombre("classid");
		at.setTipoAtributo("lista de clases separadas por espacios");
		at.setIdAtributo(22);
		at.setNombre("clear");
		at.setTipoAtributo("control del flujo de texto");
		at.setIdAtributo(23);
		at.setNombre("code");
		at.setTipoAtributo("fichero de clase applet");
		at.setIdAtributo(24);
		at.setNombre("codebase");
		at.setTipoAtributo("fichero de clase applet/URI base opcional para applet");
		at.setIdAtributo(25);
		at.setNombre("codetype");
		at.setTipoAtributo("tipo de contenido para code");
		at.setIdAtributo(26);
		at.setNombre("color");
		at.setTipoAtributo("color del texto");
		at.setIdAtributo(27);
		at.setNombre("cols");
		at.setTipoAtributo("lista de longitudes, por defecto: 100% (1 col)");
		at.setIdAtributo(28);
		at.setNombre("colspan");
		at.setTipoAtributo("n�mero de columnas abarcado por celda");
		at.setIdAtributo(29);
		at.setNombre("compact");
		at.setTipoAtributo("espacio reducido entre objetos");
		at.setIdAtributo(30);
		at.setNombre("content");
		at.setTipoAtributo("informaci�n asociada");
		at.setIdAtributo(31);
		at.setNombre("coords");
		at.setTipoAtributo("lista de longitudes separadas por coma/para usar con mapas de im�genes en el cliente");
		at.setIdAtributo(32);
		at.setNombre("data");
		at.setTipoAtributo("referencia a datos del objeto");
		at.setIdAtributo(33);
		at.setNombre("datatime");
		at.setTipoAtributo("fecha y hora del cambio");
		at.setIdAtributo(34);
		at.setNombre("declare");
		at.setTipoAtributo("declara el objeto pero no lo crea");
		at.setIdAtributo(35);
		at.setNombre("defer");
		at.setTipoAtributo("El AU puede retrasar la ejecuci�n del script");
		at.setIdAtributo(36);
		at.setNombre("dir");
		at.setTipoAtributo("direcci�n de texto d�bil/neutral");
		at.setIdAtributo(37);
		at.setNombre("disabled");
		at.setTipoAtributo("no disponible en este contexto");
		at.setIdAtributo(38);
		at.setNombre("enctype");
		at.setTipoAtributo("no disponible en este context");
		at.setIdAtributo(39);
		at.setNombre("face");
		at.setTipoAtributo("lista de nombres de fuentes separados por coma");
		at.setIdAtributo(40);
		at.setNombre("for");
		at.setTipoAtributo("empareja seg�n valor de campo ID");
		at.setIdAtributo(41);
		at.setNombre("frame");
		at.setTipoAtributo("qu� partes del marco representar");
		at.setIdAtributo(42);
		at.setNombre("frameborder");
		at.setTipoAtributo("pintar bordes del marco");
		at.setIdAtributo(43);
		at.setNombre("headers");
		at.setTipoAtributo("lista de id's de celdas de encabezado");
		at.setIdAtributo(44);
		at.setNombre("height");
		at.setTipoAtributo("altura de un elemento");
		at.setIdAtributo(45);
		at.setNombre("href");
		at.setTipoAtributo("URI del recurso vinculado");
		at.setIdAtributo(46);
		at.setNombre("hreflang");
		at.setTipoAtributo("c�digo de idioma");
		at.setIdAtributo(47);
		at.setNombre("hspace");
		at.setTipoAtributo("espacio de relleno horizontal");
		at.setIdAtributo(48);
		at.setNombre("http-equiv");
		at.setTipoAtributo("nombre de encabezado HTTP de respuesta");
		at.setIdAtributo(49);
		at.setNombre("id");
		at.setTipoAtributo("id �nico en todo el documento");
		at.setIdAtributo(50);
		at.setNombre("ismp");
		at.setTipoAtributo("usar mapa de im�genes en servidor");
		at.setIdAtributo(51);
		at.setNombre("label");
		at.setTipoAtributo("para usar en men�es jer�rquicos");
		at.setIdAtributo(52);
		at.setNombre("lang");
		at.setTipoAtributo("c�digo de idioma");
		at.setIdAtributo(53);
		at.setNombre("lenguage");
		at.setTipoAtributo("nombre del lenguaje predefinido de scripts");
		at.setIdAtributo(54);
		at.setNombre("link");
		at.setTipoAtributo("color de los v�nculos");
		at.setIdAtributo(55);
		at.setNombre("longdesc");
		at.setTipoAtributo("v�nculo a descripci�n larga (complementa a alt)");
		at.setIdAtributo(56);
		at.setNombre("marginheight");
		at.setTipoAtributo("altura del margen en p�xeles");
		at.setIdAtributo(57);
		at.setNombre("maxlegth");
		at.setTipoAtributo("anchura del margen en p�xeles");
		at.setIdAtributo(58);
		at.setNombre("media");
		at.setTipoAtributo("dise�ado para usar con estos medios");
		at.setIdAtributo(59);
		at.setNombre("method");
		at.setTipoAtributo("m�todo HTTP usado para enviar el formulario");
		at.setIdAtributo(60);
		at.setNombre("multiple");
		at.setTipoAtributo("por defecto es selecci�n simple");
		at.setIdAtributo(61);
		at.setNombre("name");
		at.setTipoAtributo("Nombre de un elemento/permite a los applets encontrarse entre s�");
		at.setIdAtributo(62);
		at.setNombre("nohref");
		at.setTipoAtributo("regi�n sin acci�n");
		at.setIdAtributo(63);
		at.setNombre("noresize");
		at.setTipoAtributo("permitir a los usuarios redimensionar marcos");
		at.setIdAtributo(64);
		at.setNombre("noshade");
		at.setTipoAtributo("Define el aspecto");
		at.setIdAtributo(65);
		at.setNombre("nowrap");
		at.setTipoAtributo("suprimir ajuste autom�tico de l�neas");
		at.setIdAtributo(66);
		at.setNombre("object");
		at.setTipoAtributo("fichero applet serializado");
		at.setIdAtributo(67);
		at.setNombre("onblur");
		at.setTipoAtributo("el elemento perdi� el foco");
		at.setIdAtributo(68);
		at.setNombre("onchange");
		at.setTipoAtributo("el valor del elemento fue modificado");
		at.setIdAtributo(69);
		at.setNombre("onclick");
		at.setTipoAtributo("se hizo clic con un bot�n del apuntador");
		at.setIdAtributo(70);
		at.setNombre("ondblclick");
		at.setTipoAtributo("se hizo doble clic con un bot�n del apuntador");
		at.setIdAtributo(71);
		at.setNombre("onfocus");
		at.setTipoAtributo("el foco se dirigi� hacia el elemento");
		at.setIdAtributo(72);
		at.setNombre("onkeydown");
		at.setTipoAtributo("se puls� una tecla");
		at.setIdAtributo(73);
		at.setNombre("onkeypress");
		at.setTipoAtributo("una tecla fue pulsada y soltada");
		at.setIdAtributo(74);
		at.setNombre("onkeyup");
		at.setTipoAtributo("una tecla fue soltada");
		at.setIdAtributo(75);
		at.setNombre("onload");
		at.setTipoAtributo("todos los marcos fueron cargados");
		at.setIdAtributo(76);
		at.setNombre("onmousedown");
		at.setTipoAtributo("se puls� un bot�n del apuntador");
		at.setIdAtributo(77);
		at.setNombre("onmousemove");
		at.setTipoAtributo("se puls� un bot�n del apuntador");
		at.setIdAtributo(78);
		at.setNombre("onmouseout");
		at.setTipoAtributo("un apuntador se quit� de encima del elemento");
		at.setIdAtributo(79);
		at.setNombre("onmouseover");
		at.setTipoAtributo("un apuntador se movi� encima del elemento");
		at.setIdAtributo(80);
		at.setNombre("onmouseip");
		at.setTipoAtributo("se solt� un bot�n de un apuntador");
		at.setIdAtributo(81);
		at.setNombre("onreset");
		at.setTipoAtributo("el formulario fue reinicializado");
		at.setIdAtributo(82);
		at.setNombre("onselect");
		at.setTipoAtributo("se seleccion� parte de un texto");
		at.setIdAtributo(83);
		at.setNombre("onsubmit");
		at.setTipoAtributo("Formulario Enviado");
		at.setIdAtributo(84);
		at.setNombre("onunload");
		at.setTipoAtributo("Se quitaron todos los marcos");
		at.setIdAtributo(85);
		at.setNombre("profile");
		at.setTipoAtributo("Diccionario con numbres de metainformacion");
		at.setIdAtributo(86);
		at.setNombre("prompt");
		at.setTipoAtributo("mensaje indicador");
		at.setIdAtributo(87);
		at.setNombre("readonly");
		at.setTipoAtributo("texto y contrase�as");
		at.setIdAtributo(88);
		at.setNombre("rel");
		at.setTipoAtributo("tipos de vinculos directos");
		at.setIdAtributo(89);
		at.setNombre("rev");
		at.setTipoAtributo("tipos de vinculos inversos");
		at.setIdAtributo(90);
		at.setNombre("rows");
		at.setTipoAtributo("lista de longitudes por defecto");
		at.setIdAtributo(91);
		at.setNombre("rowspan");
		at.setTipoAtributo("n�mero de filas abarcado por la celda");
		at.setIdAtributo(92);
		at.setNombre("rules");
		at.setTipoAtributo("l�nea de divisi�n entre filas y columnas");
		at.setIdAtributo(93);
		at.setNombre("scheme");
		at.setTipoAtributo("seleccionar forma de contenido");
		at.setIdAtributo(94);
		at.setNombre("scope");
		at.setTipoAtributo("campo de aplicaci�n de una celda de cabecera");
		at.setIdAtributo(95);
		at.setNombre("scrolling");
		at.setTipoAtributo("barra de desplazamiento o no");
		at.setIdAtributo(96);
		at.setNombre("selected");
		at.setTipoAtributo("Indica que el elemento aparecer� seleccionado.");
		at.setIdAtributo(97);
		at.setNombre("shape");
		at.setTipoAtributo("controla la interpretaci�n de las coordenadas");
		at.setIdAtributo(98);
		at.setNombre("size");
		at.setTipoAtributo("tama�o epefifico para un elemento");
		at.setIdAtributo(99);
		at.setNombre("span");
		at.setTipoAtributo("n�mero de columnas por defecto en el grupo");
		at.setIdAtributo(100);
		at.setNombre("src");
		at.setTipoAtributo("URI del script externo");
		at.setIdAtributo(101);
		at.setNombre("standby");
		at.setTipoAtributo("mensaje a mostrar mientras se carga");
		at.setIdAtributo(102);
		at.setNombre("start");
		at.setTipoAtributo("n�mero inicial de la secuencia");
		at.setIdAtributo(103);
		at.setNombre("style");
		at.setTipoAtributo("n�mero inicial de la secuencia");
		at.setIdAtributo(104);
		at.setNombre("summary");
		at.setTipoAtributo("prop�sito/estructura para salida por voz");
		at.setIdAtributo(105);
		at.setNombre("tabindex");
		at.setTipoAtributo("posici�n en el orden de tabulaci�n");
		at.setIdAtributo(106);
		at.setNombre("target");
		at.setTipoAtributo("representar en este marco");
		at.setIdAtributo(107);
		at.setNombre("text");
		at.setTipoAtributo("Color del texto en un documento");
		at.setIdAtributo(108);
		at.setNombre("title");
		at.setTipoAtributo("texto consultivo");
		at.setIdAtributo(109);
		at.setNombre("type");
		at.setTipoAtributo("tipo de contenido consultivo");
		at.setIdAtributo(110);
		at.setNombre("usemap");
		at.setTipoAtributo("usar mapa de imagenes del cluente");
		at.setIdAtributo(111);
		at.setNombre("valing");
		at.setTipoAtributo("alineacion vertical en celdas");
		at.setIdAtributo(112);
		at.setNombre("value");
		at.setTipoAtributo("valor de propiedad asociada");
		at.setIdAtributo(113);
		at.setNombre("valuetype");
		at.setTipoAtributo("Interpretacion del valor ");
		at.setIdAtributo(114);
		at.setNombre("version");
		at.setTipoAtributo("costante");
		at.setIdAtributo(115);
		at.setNombre("vlink");
		at.setTipoAtributo("color de los vinculos visitados");
		at.setIdAtributo(116);
		at.setNombre("vspace");
		at.setTipoAtributo("espacio vertical");
		at.setIdAtributo(117);
		at.setNombre("width");
		at.setTipoAtributo("anchura de un marco o elemento");
		at.setIdAtributo(118);
		at.setNombre("maxlength");
		at.setTipoAtributo("m�ximo de caracteres para campos de texto");	
	
		return at;
	}
	
	public Atributos addAtributos(int id, String nombre, String tipoEtiqueta){
		Atributos at = new Atributos(id, nombre, tipoEtiqueta);
		return at;
	}
	
	
	public List<Atributos> MuestraAtributos(){

		List<Atributos> listAt = new ArrayList<Atributos>();
		listAt.add(a�adirAtributos());
		for(Atributos atr: listAt){
			System.out.println(at.getIdAtributo());
			System.out.println(at.getNombre());
			System.out.println(listAt.size());
		}
		return listAt;
	}*/

}