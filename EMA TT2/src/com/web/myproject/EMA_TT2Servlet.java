package com.web.myproject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class EMA_TT2Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world");
	/*	DAO.INSTANCE.remove();
		DAO.INSTANCE.removeAributos();*/
		
		List<Etiquetas> eb = new ArrayList<Etiquetas>();
		eb = DAO.INSTANCE.listEtiquetas();
		for(Etiquetas ebs: eb){
			System.out.println(ebs.getNombre());
			//for(Atributos atr: ebs.g){
				
			//}
			
		}
		
		Etiquetas et = new Etiquetas();
		Atributos at = new Atributos();

	/*	at.setNombre("href");
		at.setTipoAtributo("Documento base del URL");
		DAO.INSTANCE.addAtributos(at);*/
	/*	at.setNombre("abbr");
		at.setTipoAtributo("abreviatura de celda de cabecera");
		at.setNombre("accept-charset");
		at.setTipoAtributo("abreviatura de celda de cabecera");
		at.setNombre("accept");
		at.setTipoAtributo("lista de tipos MIME para subir ficheros");
		at.setNombre("accesskey");
		at.setTipoAtributo("lista de tipos MIME para subir fichero");
		at.setNombre("action");
		at.setTipoAtributo("procesador de formulario en servidor");
		at.setNombre("align");
		at.setTipoAtributo("t�tulo de una tabla/alineacion");
		at.setNombre("alink");
		at.setTipoAtributo("color de v�nculos seleccionados");
		at.setNombre("allowfullscreen");
		at.setTipoAtributo("Si se debe permitir que el contenido de un iframe utilice requestFullscreen()");
		at.setNombre("alt");
		at.setTipoAtributo("descripci�n corta");
		at.setNombre("async");
		at.setTipoAtributo("Ejecuta un script asincrono.");
		at.setNombre("autocomplete");
		at.setTipoAtributo("Configuraci�n por default para la funci�n de relleno autom�tico en el formulario.");
		at.setNombre("autofocus");
		at.setTipoAtributo("Enfoca autom�ticamente el formulario al recargar una p�gina.");
		at.setNombre("autoplay");
		at.setTipoAtributo("Indicio de que el archivo media puede reproducirse autom�ticamente al cargar la p�gina.");
		at.setNombre("border");
		at.setTipoAtributo("Ancho y tipo de borde");
		at.setNombre("challenge");
		at.setTipoAtributo("Cadena para empaquetar la llave p�blica generada y firmada.");
		at.setNombre("charset");
		at.setTipoAtributo("codificaci�n de caracteres del recurso vinculado");
		at.setNombre("checked");
		at.setTipoAtributo("para radiobotones y casillas de verificaci�n");
		at.setNombre("cite");
		at.setTipoAtributo("Link hacia el recurso de la cita o m�s informaci�n sobre el texto.");
		at.setNombre("class");
		at.setTipoAtributo("lista de clases separadas por espacios");
		at.setNombre("cols");
		at.setTipoAtributo("lista de longitudes, por defecto: 100% (1 col)");
		at.setNombre("colspan");
		at.setTipoAtributo("n�mero de columnas abarcado por celda");
		at.setNombre("command");
		at.setTipoAtributo("Definici�n del comando");
		at.setNombre("content");
		at.setTipoAtributo("informaci�n asociada");
		at.setNombre("contenteditable");
		at.setTipoAtributo("Si el elemento es editable");
		at.setNombre("contextmenu");
		at.setTipoAtributo("El men� contextual de los elementos.");
		at.setNombre("controls");
		at.setTipoAtributo("Mostrar los controles de agente de usuario");
		at.setNombre("coords");
		at.setTipoAtributo("lista de longitudes separadas por coma/para usar con mapas de im�genes en el cliente");
		at.setNombre("crossorigin");
		at.setTipoAtributo("Como el elemento maneja las peticiones crossorigin");
		at.setNombre("data");
		at.setTipoAtributo("referencia a datos del objeto");
		at.setNombre("datetime");
		at.setTipoAtributo("fecha y hora del cambio");
		at.setNombre("default");
		at.setTipoAtributo("Marca un comando como comando por defecto.");
		at.setNombre("defer");
		at.setTipoAtributo("El AU puede retrasar la ejecuci�n del script");
		at.setNombre("dir");
		at.setTipoAtributo("direcci�n de texto d�bil/neutral");
		at.setNombre("dirname");
		at.setTipoAtributo("Nombre del campo a usar para mandar la direccionalidad de los elementos en el env�o del formulario.");
		at.setNombre("disabled");
		at.setTipoAtributo("no disponible en este contexto");
		at.setNombre("download");
		at.setTipoAtributo("Si el recurso se debe descargar en lugar de navegar en �l, y el nombre del mismo en ese caso.");
		at.setNombre("draggable");
		at.setTipoAtributo("Si el recurso se puede arrastrar.");
		at.setNombre("dropzone");
		at.setTipoAtributo("Tipos de �tems aceptados para arrastrar y soltar");
		at.setNombre("enctype");
		at.setTipoAtributo("Tipo de codificaci�n del conjunto de datos del formulario a utilizar para el env�o de formularios");
		at.setNombre("for");
		at.setTipoAtributo("Asocia la etiqueta con el control del formulario.");
		at.setNombre("form");
		at.setTipoAtributo("Asocia el control con un elemento del formulario.");
		at.setNombre("formaction");
		at.setTipoAtributo("URL a usar para el env�o del formulario.");
		at.setNombre("formenctype");
		at.setTipoAtributo("Tipo de codificaci�n del conjunto de datos del formulario a utilizar para el env�o de formularios.");
		at.setNombre("formmethod");
		at.setTipoAtributo("M�todo HTTP a usar para el env�o del formulario.");
		at.setNombre("formnovalidate");
		at.setTipoAtributo("Validaci�n de control de formulario de derivaci�n para el env�o de formularios");
		at.setNombre("formtarget");
		at.setTipoAtributo("Contexto de navegaci�n para el env�o del formulario.");
		at.setNombre("headers");
		at.setTipoAtributo("El encabezado de las celdas");
		at.setNombre("height");
		at.setTipoAtributo("Dimension vertical.");
		at.setNombre("hidden");
		at.setTipoAtributo("Si el elemento es relevante.");
		at.setNombre("high");
		at.setTipoAtributo("L�mite menor de un rango alto.");
		at.setNombre("hreflang");
		at.setTipoAtributo("Lenguaje del recurso con el link.");
		at.setNombre("http-equiv");
		at.setTipoAtributo("Directiva pragma.");
		at.setNombre("id");
		at.setTipoAtributo("El id de los elementos.");
		at.setNombre("isamp");
		at.setTipoAtributo("Si la imagen es un mapa de imagen del lado del servidor.");
		at.setNombre("keytype");
		at.setTipoAtributo("El tipo de clave criptogr�fica para generar.");
		at.setNombre("kind");
		at.setTipoAtributo("El tipo de texto de la pista.");
		at.setNombre("label");
		at.setTipoAtributo("Etiqueta visible.");
		at.setNombre("lang");
		at.setTipoAtributo("Lenguaje del elemento.");
		at.setNombre("list");
		at.setTipoAtributo("Lista de opciones de autocompletado.");
		at.setNombre("loop");
		at.setTipoAtributo("Si hay un bucle en el recurso media.");
		at.setNombre("low");
		at.setTipoAtributo("L�mite mayor de un rango alto.");
		at.setNombre("manifest");
		at.setTipoAtributo("Manifiesto de la cach� de aplicaciones.");
		at.setNombre("max");
		at.setTipoAtributo("Valor m�ximo.");
		at.setNombre("maxlength");
		at.setTipoAtributo("Valor de longitud m�xima.");
		at.setNombre("media");
		at.setTipoAtributo("Media aplicable.");
		at.setNombre("mediagroup");
		at.setTipoAtributo("Grupos de elementos multimedia con un Mediacontroller impl�cito.");
		at.setNombre("method");
		at.setTipoAtributo("M�todo HTTP para el env�o del formulario.");
		at.setNombre("min");
		at.setTipoAtributo("Valor m�nimo.");
		at.setNombre("minlength");
		at.setTipoAtributo("Valor m�nimo de longitud.");
		at.setNombre("multiple");
		at.setTipoAtributo("Si permite m�ltiples valores.");
		at.setNombre("muted");
		at.setTipoAtributo("Si el elemento multimedia va a ser silenciado por defecto.");
		at.setNombre("name");
		at.setTipoAtributo("Nombre del control del formulario a usar para el env�o del formulario  y en el API de los form.elements");
		at.setNombre("novalidate");
		at.setTipoAtributo("Validaci�n de control de formulario de derivaci�n para el env�o de formularios");
		at.setNombre("open");
		at.setTipoAtributo("Si los detalles son visibles.");
		at.setNombre("optimum");
		at.setTipoAtributo("Valor �ptimo para una medici�n.");
		at.setNombre("pattern");
		at.setTipoAtributo("Patr�n para ser igualado al valor del formulario.");
		at.setNombre("placeholder");
		at.setTipoAtributo("Etiqueta visible localizada con el formulario.");
		at.setNombre("poster");
		at.setTipoAtributo("Marco para mostrar antes de la reproducci�n del video.");
		at.setNombre("preload");
		at.setTipoAtributo("Indicio de cuanto b�fer necesitar� preferentemente el recurso multimedia.");
		at.setNombre("readonly");
		at.setTipoAtributo("Si se permitir� que el valor sea editado.");
		at.setNombre("rel");
		at.setTipoAtributo("Relaci�n entre el documento que contiene el hiperv�nculo y el recurso destino.");
		at.setNombre("required");
//		at.setTipoAtributo("Si el control es requerido por el env�o del documento.");
		at.setNombre("reversed");
		at.setTipoAtributo("N�mero de columnas hacia atr�s.");
		at.setNombre("rows");
		at.setTipoAtributo("N�mero de l�neas para mostrar.");
		at.setNombre("rowspan");
		at.setTipoAtributo("N�mero de filas que la celda va a abarcar.");
		at.setNombre("sandbox");
		at.setTipoAtributo("Caja de seguridad para contenido anidado.");
		at.setNombre("spellcheck");
		at.setTipoAtributo("Si se revisar� la gram�tica del elemento.");
		at.setNombre("scope");
		at.setTipoAtributo("Especifica a que celdas del encabezado aplica.");
		at.setNombre("scoped");
		at.setTipoAtributo("Si el estilo aplica a todo el elemento o solo a una parte.");
		at.setNombre("seamless");
		at.setTipoAtributo("Si aplica el estilo del documento al contenido anidado.");
		at.setNombre("selected");
		at.setTipoAtributo("Si la opci�n ser� seleccionada por defecto.");
		at.setNombre("shape");
		at.setTipoAtributo("El tipo de forma que se crear� en el mapa de la imagen.");
		at.setNombre("size");
		at.setTipoAtributo("Tama�o del control");
		at.setNombre("sizes");
		at.setTipoAtributo("Tama�o de los iconos");
		at.setNombre("span");
		at.setTipoAtributo("N�mero de columnas abarcadas por el elemento.");
		at.setNombre("src");
		at.setTipoAtributo("Direcci�n del recurso.");
		at.setNombre("srcdoc");
		at.setTipoAtributo("Un documento a hacer en el iframe.");
		at.setNombre("srclang");
		at.setTipoAtributo("Lenguaje del texto de la pista.");
		at.setNombre("start");
		at.setTipoAtributo("Valor ordinal del primer �tem.");
		at.setNombre("step");
		at.setTipoAtributo("Granularidad a ser igualada por el valor del formulario.");
		at.setNombre("style");
		at.setTipoAtributo("Instrucciones de presentaci�n y formato.");
		at.setNombre("tabindex");
		at.setTipoAtributo("Si el elemento es enfocable y el orden relativo del elemento para el prop�sito de enfocar la navegaci�n secuencial.");
		at.setNombre("title");
		at.setTipoAtributo("Informaci�n de aviso del elemento.");
		at.setNombre("translate");
		at.setTipoAtributo("Si el elemento debe ser traducido cuando la p�gina es localizada.");
		at.setNombre("type");
		at.setTipoAtributo("Indicio del tipo de referencia del recurso.");
		at.setNombre("typemustmatch");
		at.setTipoAtributo("Si el tipo de atributo y el  valor del tipo del contenido necesita ser igual al recurso a usar.");
		at.setNombre("usemap");
		at.setTipoAtributo("Nombre del mapa de imagen a usar.");
		at.setNombre("value");
		at.setTipoAtributo("Valor a ser usado en el control del formulario.");
		at.setNombre("width");
		at.setTipoAtributo("Dimensi�n horizontal");
		at.setNombre("wrap");
		at.setTipoAtributo("Como el valor del control del formulario va a ser empaquetado para el env�o del formulario.");
		at.setNombre("inert");
		at.setTipoAtributo("Indica que el elemento y sus descendientes ser�n inertes.");
		
		DAO.INSTANCE.addAtributos(at);*/
		
		/*	et.setNombre("!DOCTYPE");
		et.setTipoEtiqueta("");
		DAO.INSTANCE.addEtiqueta(et);
		et.setNombre("html");
		et.setTipoEtiqueta("Ra�z del documento HTML O XHTML. Todos los dem�s elementos deben estar debajo de est� elemento");
		et.setNombre("head");
		et.setTipoEtiqueta("Colecci�n de metadatos sobre el documento, enlaces, definiciones de scripts, y hojas de estilo");
		et.setNombre("title");
		et.setTipoEtiqueta("Define el t�tulo del documento, el cual se mostrar� en la barra del navegador o en las pesta�as de la p�gina.");
		et.setNombre("meta");
		et.setTipoEtiqueta("Define la metadata que no puede ser definida usando otro elemento HTML");
		et.setNombre("style");
		et.setTipoEtiqueta("Permite al usuario introducir informaci�n de estilo en sus documentos.");
		et.setNombre("body");
		et.setTipoEtiqueta("Representa el contenido principal de un documento HTML.");
		et.setNombre("article");
		et.setTipoEtiqueta("Define contenido aut�nomo que podr�a existir independientemente del resto del contenido.");
		et.setNombre("section");
		et.setTipoEtiqueta("Define una secci�n en un documento.");
		et.setNombre("nav");
		et.setTipoEtiqueta("Define una secci�n que solamente contiene enlaces de navegaci�n.");
		et.setNombre("aside");
		et.setTipoEtiqueta("Define algunos contenidos puesto aparte del resto del contenido de la p�gina. Si es removido el contenido restante seguir� teniendo sentido.");
		et.setNombre("h1");
		et.setTipoEtiqueta("Un elemento de cabecera describe brevemente el tema de la secci�n que introduce.");
		et.setNombre("h2");
		et.setTipoEtiqueta("Un elemento de cabecera describe brevemente el tema de la secci�n que introduce.");
		et.setNombre("h3");
		et.setTipoEtiqueta("Un elemento de cabecera describe brevemente el tema de la secci�n que introduce.");
		et.setNombre("h4");
		et.setTipoEtiqueta("Un elemento de cabecera describe brevemente el tema de la secci�n que introduce.");
		et.setNombre("h5");
		et.setTipoEtiqueta("Un elemento de cabecera describe brevemente el tema de la secci�n que introduce.");*/
	//	et.setNombre("h6");
	//	et.setTipoEtiqueta("Un elemento de cabecera describe brevemente el tema de la secci�n que introduce.");
		//hjdjijhfhf
//		DAO.INSTANCE.addEtiqueta(et);
		
		
		//DAO.INSTANCE.addEtiquetaAtributo("article", "accesskey");
		//DAO.INSTANCE.addEtiquetaAtributo("article", "class");
		//DAO.INSTANCE.addEtiquetaAtributo("article", "contenteditable");
		//DAO.INSTANCE.addEtiquetaAtributo("article", "contextmenu");
		//DAO.INSTANCE.addEtiquetaAtributo("article", "dir");
		//DAO.INSTANCE.addEtiquetaAtributo("article", "draggable");
		//DAO.INSTANCE.addEtiquetaAtributo("article", "dropzone");
		//DAO.INSTANCE.addEtiquetaAtributo("article", "hidden");
		//DAO.INSTANCE.addEtiquetaAtributo("article", "id");
		//DAO.INSTANCE.addEtiquetaAtributo("article", "inert");
		//DAO.INSTANCE.addEtiquetaAtributo("article", "lang");
		//DAO.INSTANCE.addEtiquetaAtributo("article", "spellcheck");
		//DAO.INSTANCE.addEtiquetaAtributo("article", "style");
		//DAO.INSTANCE.addEtiquetaAtributo("article", "tabindex");
		//DAO.INSTANCE.addEtiquetaAtributo("article", "title");
		//DAO.INSTANCE.addEtiquetaAtributo("article", "translate");
		
		
		//DAO.INSTANCE.addEtiquetaAtributo("section", "accesskey");
		//DAO.INSTANCE.addEtiquetaAtributo("section", "class");
		//DAO.INSTANCE.addEtiquetaAtributo("section", "contenteditable");
		//DAO.INSTANCE.addEtiquetaAtributo("section", "contextmenu");
		//DAO.INSTANCE.addEtiquetaAtributo("section", "dir");
		//DAO.INSTANCE.addEtiquetaAtributo("section", "draggable");
		//DAO.INSTANCE.addEtiquetaAtributo("section", "dropzone");
		//DAO.INSTANCE.addEtiquetaAtributo("section", "hidden");
		//DAO.INSTANCE.addEtiquetaAtributo("section", "id");
		//DAO.INSTANCE.addEtiquetaAtributo("section", "inert");
		//DAO.INSTANCE.addEtiquetaAtributo("section", "lang");
		//DAO.INSTANCE.addEtiquetaAtributo("section", "spellcheck");
		//DAO.INSTANCE.addEtiquetaAtributo("section", "style");
		//DAO.INSTANCE.addEtiquetaAtributo("section", "tabindex");
		//DAO.INSTANCE.addEtiquetaAtributo("section", "title");
		//DAO.INSTANCE.addEtiquetaAtributo("section", "translate");
		
		//DAO.INSTANCE.addEtiquetaAtributo("nav", "accesskey");
		//DAO.INSTANCE.addEtiquetaAtributo("nav", "class");
		//DAO.INSTANCE.addEtiquetaAtributo("nav", "contenteditable");
		//DAO.INSTANCE.addEtiquetaAtributo("nav", "contextmenu");
		//DAO.INSTANCE.addEtiquetaAtributo("nav", "dir");
		//DAO.INSTANCE.addEtiquetaAtributo("nav", "draggable");
		//DAO.INSTANCE.addEtiquetaAtributo("nav", "dropzone");
		//DAO.INSTANCE.addEtiquetaAtributo("nav", "hidden");
		//DAO.INSTANCE.addEtiquetaAtributo("nav", "id");
		//DAO.INSTANCE.addEtiquetaAtributo("nav", "inert");
		//DAO.INSTANCE.addEtiquetaAtributo("nav", "lang");
		//DAO.INSTANCE.addEtiquetaAtributo("nav", "spellcheck");
		//DAO.INSTANCE.addEtiquetaAtributo("nav", "style");
		//DAO.INSTANCE.addEtiquetaAtributo("nav", "tabindex");
		//DAO.INSTANCE.addEtiquetaAtributo("nav", "title");
		//DAO.INSTANCE.addEtiquetaAtributo("nav", "translate");
		
		
		
		
/*		at = DAO.INSTANCE.existeAtributo("href").get(0);
		et.setNombre("link");
		et.setTipoEtiqueta("Enlaza JavaScript y CSS externos con el actual documento HTML.");
		et.getListIdAtributos().add(at.getIdAtributo());
		DAO.INSTANCE.addEtiqueta(et);
	//	EntityManager em = EMFService.get().createEntityManager();
		
		/*et = DAO.INSTANCE.existeEtiquetas("base").get(0);
		at = DAO.INSTANCE.existeAtributo("target").get(0);
		et.getListIdAtributos().add(at.getIdAtributo());
		System.out.println(et.getNombre());
		//DAO.INSTANCE.refreshEtiqueta(et);
		 * 
		 */
	//	DAO.INSTANCE.addEtiquetaAtributo("base", "target");
		
		
	/*	at.setNombre("target");
		at.setTipoAtributo("Contenido por default de la b�squeda para navegaci�n por hipervinculo y formulario de presentaci�n");
		DAO.INSTANCE.addAtributos(at);*/
		//et.getListIdAtributos().add(at.getIdAtributo());
		//et.setAtributo(atributo);
	//	DAO.INSTANCE.addEtiqueta(et);
		
		
	}
	
}
