package com.web.myproject;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet_Atributos
 */

public class Servlet_Atributos extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world");
		
	/*	DAO.INSTANCE.add(1,"abbr", "abreviatura de celda de cabecera");
		DAO.INSTANCE.add(2,"accept-charset", "abreviatura de celda de cabecera" );
		DAO.INSTANCE.add(3,"accept", "lista de tipos MIME para subir ficheros" );
		DAO.INSTANCE.add(4, "accesskey", "lista de tipos MIME para subir fichero");
		DAO.INSTANCE.add(5, "action", "procesador de formulario en servidor");
		DAO.INSTANCE.add(6,"align", "título de una tabla/alineacion" );
		DAO.INSTANCE.add(7,"alink", "color de vínculos seleccionados" );
		DAO.INSTANCE.add(8, "alt", "descripción corta" );
		DAO.INSTANCE.add(9, "archive", "lista de archivos separados por comas" );
		DAO.INSTANCE.add(10,"axis", "lista de cabeceras relacionadas separadas por comas" );
		DAO.INSTANCE.add(11,"background", "fichero de textura de fondo del documento" );
		DAO.INSTANCE.add(12,"bgcolor", "color de fondo" );
		DAO.INSTANCE.add(13,"border", "Ancho y tipo de borde" );
		DAO.INSTANCE.add(14,"cellpadding", "espacio dentro de celdas" );
		DAO.INSTANCE.add(15,"char", "carácter de alineación" );
		DAO.INSTANCE.add(16,"charoff", "offset para carácter de alineación" );
		DAO.INSTANCE.add(17,"charset", "codificación de caracteres del recurso vinculado" );
		DAO.INSTANCE.add(18,"checked", "para radiobotones y casillas de verificación" );
		DAO.INSTANCE.add(19,"cite", "para radiobotones y casillas de verificación/informacion sobre razón de cambio" );
		DAO.INSTANCE.add(20,"class", "lista de clases separadas por espacios" );
		DAO.INSTANCE.add(21,"classid", "lista de clases separadas por espacios" );
		DAO.INSTANCE.add(22,"clear", "control del flujo de texto" );
		DAO.INSTANCE.add(23,"code", "fichero de clase applet" );
		DAO.INSTANCE.add(24,"codebase", "fichero de clase applet/URI base opcional para applet" );
		DAO.INSTANCE.add(25,"codetype", "tipo de contenido para code" );
		DAO.INSTANCE.add(26,"color", "color del texto" );
		DAO.INSTANCE.add(27,"cols", "lista de longitudes, por defecto: 100% (1 col)" );
		DAO.INSTANCE.add(28, "colspan", "número de columnas abarcado por celda" );
		DAO.INSTANCE.add(29,"compact", "espacio reducido entre objetos" );
		DAO.INSTANCE.add(30,"content", "información asociada" );
		DAO.INSTANCE.add(31,"coords", "lista de longitudes separadas por coma/para usar con mapas de imágenes en el cliente" );
		DAO.INSTANCE.add(32,"data", "referencia a datos del objeto" );
		DAO.INSTANCE.add(33,"datatime", "fecha y hora del cambio" );
		DAO.INSTANCE.add(34,"declare", "declara el objeto pero no lo crea" );
		DAO.INSTANCE.add(35,"defer", "El AU puede retrasar la ejecución del script" );
		DAO.INSTANCE.add(36,"dir", "dirección de texto débil/neutral" );
		DAO.INSTANCE.add(37,"disabled", "no disponible en este contexto" );
		DAO.INSTANCE.add(38,"enctype", "no disponible en este context" );
		DAO.INSTANCE.add(39,"face", "lista de nombres de fuentes separados por coma" );
		DAO.INSTANCE.add(40,"for", "empareja según valor de campo ID" );
		DAO.INSTANCE.add(41,"frame", "qué partes del marco representar" );
		DAO.INSTANCE.add(42,"frameborder", "¿pintar bordes del marco?" );
		DAO.INSTANCE.add(43,"headers", "lista de id's de celdas de encabezado" );
		DAO.INSTANCE.add(44,"height", "altura de un elemento" );
		DAO.INSTANCE.add(45,"href", "URI del recurso vinculado" );
		DAO.INSTANCE.add(46,"hreflang", "código de idioma" );
		DAO.INSTANCE.add(47,"hspace", "espacio de relleno horizontal" );
		DAO.INSTANCE.add(48,"http-equiv", "nombre de encabezado HTTP de respuesta" );
		DAO.INSTANCE.add(49,"id", "id único en todo el documento" );
		DAO.INSTANCE.add(50,"ismp", "usar mapa de imágenes en servidor" );
		DAO.INSTANCE.add(51,"label", "para usar en menúes jerárquicos" );
		DAO.INSTANCE.add(52,"label", "para usar en menúes jerárquicos" );
		DAO.INSTANCE.add(53,"lang", "código de idioma" );
		DAO.INSTANCE.add(54,"lenguage", "nombre del lenguaje predefinido de scripts" );
		DAO.INSTANCE.add(55,"link", "color de los vínculos" );
		DAO.INSTANCE.add(56,"longdesc", "vínculo a descripción larga (complementa a alt)" );
		DAO.INSTANCE.add(57,"marginheight", "altura del margen en píxeles" );
		DAO.INSTANCE.add(58,"maxlegth", "anchura del margen en píxeles" );
		DAO.INSTANCE.add(59,"media", "diseñado para usar con estos medios" );
		DAO.INSTANCE.add(60,"method", "método HTTP usado para enviar el formulario" );
		DAO.INSTANCE.add(61,"multiple", "por defecto es selección simple" );
		DAO.INSTANCE.add(62,"name", "Nombre de un elemento/permite a los applets encontrarse entre sí" );
		DAO.INSTANCE.add(63,"nohref", "región sin acción" );
		DAO.INSTANCE.add(64,"noresize", "permitir a los usuarios redimensionar marcos" );
		DAO.INSTANCE.add(65,"noshade", "" );
		DAO.INSTANCE.add(66,"nowrap", "suprimir ajuste automático de líneas" );
		DAO.INSTANCE.add(67,"object", "fichero applet serializado" );
		DAO.INSTANCE.add(68,"onblur", "el elemento perdió el foco" );
		DAO.INSTANCE.add(69,"onchange", "el valor del elemento fue modificado" );
		DAO.INSTANCE.add(70,"onclick", "se hizo clic con un botón del apuntador" );
		DAO.INSTANCE.add(71,"ondblclick", "se hizo doble clic con un botón del apuntador" );
		DAO.INSTANCE.add(72,"onfocus", "el foco se dirigió hacia el elemento" );
		DAO.INSTANCE.add(73,"onkeydown", "se pulsó una tecla" );
		DAO.INSTANCE.add(74,"onkeypress", "una tecla fue pulsada y soltada" );
		DAO.INSTANCE.add(75,"onkeyup", "una tecla fue soltada" );
		DAO.INSTANCE.add(76,"onload", "todos los marcos fueron cargados" );
		DAO.INSTANCE.add(77,"onmousedown", "se pulsó un botón del apuntador" );
		DAO.INSTANCE.add(78,"onmousemove", "se pulsó un botón del apuntador" );
		DAO.INSTANCE.add(79,"onmouseout", "un apuntador se quitó de encima del elemento" );
		DAO.INSTANCE.add(80,"onmouseover", "un apuntador se movió encima del elemento" );
		DAO.INSTANCE.add(81,"onmouseip", "se soltó un botón de un apuntador" );
		DAO.INSTANCE.add(82,"onreset", "el formulario fue reinicializado" );
		DAO.INSTANCE.add(83,"onselect", "se seleccionó parte de un texto" );
		DAO.INSTANCE.add(84,"onsubmit", "Formulario Enviado" );
		DAO.INSTANCE.add(85,"onunload", "Se quitaron todos los marcos" );
		DAO.INSTANCE.add(86,"profile", "Diccionario con numbres de metainformacion" );
		DAO.INSTANCE.add(87,"prompt", "mensaje indicador" );
		DAO.INSTANCE.add(88,"readonly", "texto y contraseñas" );
		DAO.INSTANCE.add(89,"rel", "tipos de vinculos directos" );
		DAO.INSTANCE.add(90,"rev", "tipos de vinculos inversos" );
		DAO.INSTANCE.add(91,"rows", "lista de longitudes por defecto" );
		DAO.INSTANCE.add(92,"rowspan", "nùmero de filas abarcado por lacelda" );
		DAO.INSTANCE.add(93,"rules", "línea de división entre filas y columnas" );
		DAO.INSTANCE.add(94,"scheme", "seleccionar forma de contenido" );
		DAO.INSTANCE.add(95,"scope", "campo de aplicación de una celda de cabecera" );
		DAO.INSTANCE.add(96,"scrolling", "barra de desplazamiento o no" );
		DAO.INSTANCE.add(97,"selected", "" );
		DAO.INSTANCE.add(98,"shape", "controla la interpretación de las coordenadas" );
		DAO.INSTANCE.add(99,"size", "tamaño epefifico para un elemento" );
		DAO.INSTANCE.add(100,"span", "número de columnas por defecto en el grupo" );
		DAO.INSTANCE.add(101,"src", "URI del script externo" );
		DAO.INSTANCE.add(102,"standby", "mensaje a mostrar mientras se carga" );
		DAO.INSTANCE.add(103,"start", "número inicial de la secuencia" );
		DAO.INSTANCE.add(104,"style", "número inicial de la secuencia" );
		DAO.INSTANCE.add(105,"summary", "propósito/estructura para salida por voz" );
		DAO.INSTANCE.add(106,"tabindex", "posición en el orden de tabulación" );
		DAO.INSTANCE.add(107, "target", "representar en este marco" );
		DAO.INSTANCE.add(108, "text", "Color del texto en un documento" );
		DAO.INSTANCE.add(109, "title", "texto consultivo" );
		DAO.INSTANCE.add(110, "type", "tipo de contenido consultivo" );
		DAO.INSTANCE.add(111, "usemap", "usar mapa de imagenes del cluente" );
		DAO.INSTANCE.add(113, "valugn", "alineacion vertical en celdas" );
		DAO.INSTANCE.add(114, "value", "valor de propiedad asociada" );
		DAO.INSTANCE.add(115, "valuetype", "Interpretacion del valor " );
		DAO.INSTANCE.add(116, "version", "costante" );
		DAO.INSTANCE.add(117, "vlink", "color de los vinculos visitados" );
		DAO.INSTANCE.add(118, "vspace", "espacio vertical" );
		DAO.INSTANCE.add(119, "width", "anchura de un marco o elemento" );
		DAO.INSTANCE.add(120, "maxlength", "máximo de caracteres para campos de texto");

		
		
		
		//DAO.INSTANCE.remove();

		List<EtiquetaBase> eb = DAO.INSTANCE.listEtiquetas();
		for(EtiquetaBase ebs : eb ){
			
			System.out.println(ebs.getIdEtiqueta());
			System.out.println(ebs.getNombre());
		}*/
	}

}
