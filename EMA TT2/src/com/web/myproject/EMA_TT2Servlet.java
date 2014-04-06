package com.web.myproject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.servlet.http.*;

import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.EntityNotFoundException;
import com.google.appengine.api.datastore.Key;
import com.google.apphosting.api.DatastorePb.DatastoreService;

@SuppressWarnings("serial")
public class EMA_TT2Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		//resp.setContentType("text/plain");
		//resp.getWriter().println("Hello, world");
	/*	DAO.INSTANCE.remove();
		DAO.INSTANCE.removeAributos();*/
		
/*		List<Etiquetas> eb = new ArrayList<Etiquetas>();
		List<Etiquetas> etcomp = new ArrayList<Etiquetas>();
		//List<Atributos> at = new ArrayList<Atributos>();
	//	Atributos atrib = new Atributos();
		//eb = DAO.INSTANCE.listEtiquetas();
		//etcomp = DAO.INSTANCE.etiquetasTodas();
		for(Etiquetas ebs: eb){
			if(ebs.getListIdAtributos().size()== 0){
				System.out.println("Etiquetas sin atributos " +ebs.getNombre());
			}else{
				for(int i=0;i<ebs.getListIdAtributos().size();i++){
					//atrib = DAO.INSTANCE.etiquetayAtributo(ebs, i);
					//System.out.println(ebs.getNombre()+ " " + atrib.getNombre() );
					}
			}
		
			
			
		}*/
		
		DAO.INSTANCE.addUsuario("oswastark@gmail.com", "Oswaldo Castro Almazan");
		
	/*	List<Entity> res = DAO.INSTANCE.atributodeEtiqueta();
		for(int i=0; i<res.size(); i++){
			System.out.println(res.get(i));
		}*/
		
	/*	try {
			DAO.INSTANCE.nombreAtributo();
		} catch (EntityNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
/*	try {
		List<Entity> lista = DAO.INSTANCE.listaAtributosbyId();
		for(int i=0; i<lista.size(); i++){
			System.out.println(lista.get(i));
		}
	} catch (EntityNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/
/*		List<Entity> ent = new ArrayList<Entity>();
		try {
			ent = DAO.INSTANCE.listaAtributosbyId("form");
		} catch (EntityNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i =0; i<ent.size();i++){
			System.out.println(ent.get(i));
		}*/
		
/*		PruebaGson pgson = new PruebaGson();
		try {
			String res = pgson.listaAtributosdelaEtiqueta();
			System.out.print(res);
		} catch (EntityNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
/*		PruebaGson pgson = new PruebaGson();
		try {
			List<String> lista= pgson.listaString();
			for(int i=0; i<lista.size(); i++){
				System.out.print("lalala " +lista.get(i));
			}
		} catch (EntityNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		Etiquetas et = new Etiquetas();
		List <Key> llaves = new ArrayList<Key>();
		//Atributos at = new Atributos();
		
/*		DAO.INSTANCE.addAtributo("href","Documento base del URL" );
		DAO.INSTANCE.addAtributo("abbr", "Abreviatura de celda de cabecera");
		DAO.INSTANCE.addAtributo("accept-charset", "lista de tipos MIME para subir ficheros");
		DAO.INSTANCE.addAtributo("class", "lista de clases separadas por espacios");
		DAO.INSTANCE.addAtributo("contenteditable", "Si el elemento es editable" );
		DAO.INSTANCE.addAtributo("dir", "dirección de texto débil/neutral");
		DAO.INSTANCE.addAtributo("draggable", "Si el recurso se puede arrastrar.");
		DAO.INSTANCE.addAtributo("dropzone", "Tipos de ítems aceptados para arrastrar y soltar");
		DAO.INSTANCE.addAtributo("hidden","Si el elemento es relevante.");
		DAO.INSTANCE.addAtributo("id", "El id de los elementos.");
		DAO.INSTANCE.addAtributo("inert", "Indica que el elemento y sus descendientes serán inertes.");
		DAO.INSTANCE.addAtributo("lang", "Lenguaje del elemento.");
		DAO.INSTANCE.addAtributo("spellcheck", "Para la gramática del documento"); 
		DAO.INSTANCE.addAtributo("style", "Instrucciones de presentación y formato.");
		DAO.INSTANCE.addAtributo("tabindex", "Si el elemento es enfocable y el orden relativo del elemento para el propósito de enfocar la navegación secuencial.");
		DAO.INSTANCE.addAtributo("title", "Información de aviso del elemento.");
		DAO.INSTANCE.addAtributo("translate", "Si el elemento debe ser traducido cuando la página es localizada.");
		DAO.INSTANCE.addAtributo("accept", "Indice del tipo de archivo esperado en los controladores para subir archivos.");
		DAO.INSTANCE.addAtributo("contextmenu", "El menú contextual de los elementos.");
		DAO.INSTANCE.addAtributo("accesskey", "Atajos de teclado para activar o centrarse elemento");
		DAO.INSTANCE.addAtributo("allowfullscreen", "Si permite al contenido del iframe usar el requestFullScreen()");
		DAO.INSTANCE.addAtributo("action", "Procesador de formulario en servidor");
		DAO.INSTANCE.addAtributo("alt", "descripción corta");
		DAO.INSTANCE.addAtributo("async", "Ejecuta un script asincrono.");
		DAO.INSTANCE.addAtributo("autocomplete", "Configuración por default para la función de relleno automático en el formulario.");
		DAO.INSTANCE.addAtributo("autofocus", "Enfoca automáticamente el formulario al recargar una página.");
		DAO.INSTANCE.addAtributo("autoplay", "Indicio de que el archivo media puede reproducirse automáticamente al cargar la página.");
		DAO.INSTANCE.addAtributo("border", "Ancho y tipo de borde.");
		DAO.INSTANCE.addAtributo("challenge", "Cadena para empaquetar la llave pública generada y firmada.");
		DAO.INSTANCE.addAtributo("charset", "codificación de caracteres del recurso vinculado");
		DAO.INSTANCE.addAtributo("checked", "para radiobotones y casillas de verificación");
		DAO.INSTANCE.addAtributo("cite", "Link hacia el recurso de la cita o más información sobre el texto.");
		DAO.INSTANCE.addAtributo("cols", "lista de longitudes, por defecto: 100% (1 col)");
		DAO.INSTANCE.addAtributo("colspan", "número de columnas abarcado por celda");
		DAO.INSTANCE.addAtributo("command", "Definición del comando");
		DAO.INSTANCE.addAtributo("content", "información asociada");
		DAO.INSTANCE.addAtributo("controls", "Mostrar los controles de agente de usuario");
		DAO.INSTANCE.addAtributo("coords", "lista de longitudes separadas por coma/para usar con mapas de imágenes en el cliente");
		DAO.INSTANCE.addAtributo("crossorigin", "Como el elemento maneja las peticiones crossorigin");
		DAO.INSTANCE.addAtributo("data", "referencia a datos del objeto");
		DAO.INSTANCE.addAtributo("datetime", "fecha y hora del cambio");
		DAO.INSTANCE.addAtributo("default", "Marca un comando como comando por defecto.");
		DAO.INSTANCE.addAtributo("defer", "El AU puede retrasar la ejecución del script");
		DAO.INSTANCE.addAtributo("dirname", "Nombre del campo a usar para mandar la direccionalidad de los elementos en el envío del formulario.");
		DAO.INSTANCE.addAtributo("disabled", "no disponible en este contexto");
		DAO.INSTANCE.addAtributo("download", "Si el recurso se debe descargar en lugar de navegar en él, y el nombre del mismo en ese caso.");
		DAO.INSTANCE.addAtributo("enctype", "Tipo de codificación del conjunto de datos del formulario a utilizar para el envío de formularios");
		DAO.INSTANCE.addAtributo("for", "Asocia la etiqueta con el control del formulario.");
		DAO.INSTANCE.addAtributo("form", "Asocia el control con un elemento del formulario.");
		DAO.INSTANCE.addAtributo("formaction", "URL a usar para el envío del formulario.");
		DAO.INSTANCE.addAtributo("formenctype", "Tipo de codificación del conjunto de datos del formulario a utilizar para el envío de formularios.");
		DAO.INSTANCE.addAtributo("formmethod", "Método HTTP a usar para el envío del formulario.");
		DAO.INSTANCE.addAtributo("formnovalidate", "Validación de control de formulario de derivación para el envío de formularios");
		DAO.INSTANCE.addAtributo("formtarget", "Contexto de navegación para el envío del formulario.");
		DAO.INSTANCE.addAtributo("headers", "El encabezado de las celdas");
		DAO.INSTANCE.addAtributo("height", "Dimension vertical.");
		DAO.INSTANCE.addAtributo("high", "Límite menor de un rango alto.");
		DAO.INSTANCE.addAtributo("hreflang", "Lenguaje del recurso con el link.");
		DAO.INSTANCE.addAtributo("http-equiv", "Directiva pragma.");
		DAO.INSTANCE.addAtributo("isamp", "Si la imagen es un mapa de imagen del lado del servidor.");
		DAO.INSTANCE.addAtributo("keytype", "El tipo de clave criptográfica para generar.");
		DAO.INSTANCE.addAtributo("kind", "El tipo de texto de la pista.");
		DAO.INSTANCE.addAtributo("label", "Etiqueta visible.");
		DAO.INSTANCE.addAtributo("list", "Lista de opciones de autocompletado.");
		DAO.INSTANCE.addAtributo("loop", "Si hay un bucle en el recurso media.");
		DAO.INSTANCE.addAtributo("low", "Límite mayor de un rango alto.");
		DAO.INSTANCE.addAtributo("manifest", "Manifiesto de la caché de aplicaciones.");
		DAO.INSTANCE.addAtributo("max", "Valor máximo.");
		DAO.INSTANCE.addAtributo("maxlength", "Valor de longitud máxima.");
		DAO.INSTANCE.addAtributo("media", "Media aplicable.");
		DAO.INSTANCE.addAtributo("mediagroup", "Grupos de elementos multimedia con un Mediacontroller implícito.");
		DAO.INSTANCE.addAtributo("method", "Método HTTP para el envío del formulario.");
		DAO.INSTANCE.addAtributo("min", "Valor mínimo.");
		DAO.INSTANCE.addAtributo("minlength", "Valor mínimo de longitud.");
		DAO.INSTANCE.addAtributo("multiple", "Si permite múltiples valores.");
		DAO.INSTANCE.addAtributo("muted", "Si el elemento multimedia va a ser silenciado por defecto.");
		DAO.INSTANCE.addAtributo("name", "Nombre del control del formulario a usar para el envío del formulario  y en el API de los form.elements");
		DAO.INSTANCE.addAtributo("novalidate", "Validación de control de formulario de derivación para el envío de formularios.");
		DAO.INSTANCE.addAtributo("open", "Si los detalles son visibles.");
		DAO.INSTANCE.addAtributo("optimum", "Valor óptimo para una medición.");
		DAO.INSTANCE.addAtributo("pattern", "Patrón para ser igualado al valor del formulario.");
		DAO.INSTANCE.addAtributo("placeholder", "Etiqueta visible localizada con el formulario.");
		DAO.INSTANCE.addAtributo("poster", "Marco para mostrar antes de la reproducción del video.");
		DAO.INSTANCE.addAtributo("preload", "Indicio de cuanto búfer necesitará preferentemente el recurso multimedia.");
		DAO.INSTANCE.addAtributo("readonly", "Si se permitirá que el valor sea editado.");
		DAO.INSTANCE.addAtributo("rel", "Relación entre el documento que contiene el hipervínculo y el recurso destino.");
		DAO.INSTANCE.addAtributo("required", "Si el control es requerido por el envío del documento.");
		DAO.INSTANCE.addAtributo("reversed", "Número de columnas hacia atrás.");
		DAO.INSTANCE.addAtributo("rows", "Número de líneas para mostrar.");
		DAO.INSTANCE.addAtributo("rowspan", "Número de filas que la celda va a abarcar.");
		DAO.INSTANCE.addAtributo("sandbox", "Caja de seguridad para contenido anidado.");
		DAO.INSTANCE.addAtributo("scope", "Especifica a que celdas del encabezado aplica.");
		DAO.INSTANCE.addAtributo("scoped", "Si el estilo aplica a todo el elemento o solo a una parte.");
		DAO.INSTANCE.addAtributo("seamless", "Si aplica el estilo del documento al contenido anidado.");
		DAO.INSTANCE.addAtributo("selected", "Si la opción será seleccionada por defecto.");
		DAO.INSTANCE.addAtributo("shape", "El tipo de forma que se creará en el mapa de la imagen.");
		DAO.INSTANCE.addAtributo("size", "Tamaño del control.");
		DAO.INSTANCE.addAtributo("sizes", "Tamaño de los iconos.");
		DAO.INSTANCE.addAtributo("span", "Número de columnas abarcadas por el elemento.");
		DAO.INSTANCE.addAtributo("src", "Dirección del recurso.");
		DAO.INSTANCE.addAtributo("srcdoc", "Un documento a hacer en el iframe.");
		DAO.INSTANCE.addAtributo("srclang", "Lenguaje del texto de la pista.");
		DAO.INSTANCE.addAtributo("start", "Valor ordinal del primer ítem.");
		DAO.INSTANCE.addAtributo("step", "Granularidad a ser igualada por el valor del formulario.");
		DAO.INSTANCE.addAtributo("type", "Indicio del tipo de referencia del recurso.");
		DAO.INSTANCE.addAtributo("typemustmatch", "Si el tipo de atributo y el  valor del tipo del contenido necesita ser igual al recurso a usar.");
		DAO.INSTANCE.addAtributo("usemap", "Nombre del mapa de imagen a usar.");
		DAO.INSTANCE.addAtributo("value", "Valor a ser usado en el control del formulario.");
		DAO.INSTANCE.addAtributo("width", "Dimensión horizontal.");
		DAO.INSTANCE.addAtributo("wrap", "Como el valor del control del formulario va a ser empaquetado para el envío del formulario.");
		DAO.INSTANCE.addAtributo("target", "Contexto de búsqueda por defecto para la navegación de los hipervínculos y el envío del formulario.");
		DAO.INSTANCE.addAtributo("onabort", "Manejador del evento abort");
		DAO.INSTANCE.addAtributo("onafterprint", "Manejador del evento afterprint para el objeto Window");
		DAO.INSTANCE.addAtributo("onbeforeprint", "Manejador del evento beforeprint para el objeto Window");
		DAO.INSTANCE.addAtributo("onbeforeunload", "Manejador del evento beforeunload para el objeto Window");
		DAO.INSTANCE.addAtributo("onblur", "Manejador para el evento blur.");
		DAO.INSTANCE.addAtributo("oncancel", "Manejador para el evento cancel.");
		DAO.INSTANCE.addAtributo("oncanplay", "Manejador para el evento canplay.");
		DAO.INSTANCE.addAtributo("oncanplaythrough", "Manejador para el evento canplaythrough.");
		DAO.INSTANCE.addAtributo("onchange", "Manejador para el evento change.");
		DAO.INSTANCE.addAtributo("onclick", "Manejador para el evento click.");
		DAO.INSTANCE.addAtributo("onclose", "Manejador para el evento close.");
		DAO.INSTANCE.addAtributo("oncontextmenu", "Manejador para el evento contextmenu.");
		DAO.INSTANCE.addAtributo("oncuechange", "Manejador para el evento cuechange.");
		DAO.INSTANCE.addAtributo("ondblclick", "Manejador para el evento dblclick.");
		DAO.INSTANCE.addAtributo("ondrag", "Manejador para el evento drag.");
		DAO.INSTANCE.addAtributo("ondragend", "Manejador para el evento dragend.");
		DAO.INSTANCE.addAtributo("ondragenter", "Manejador para el evento dragenter.");
		DAO.INSTANCE.addAtributo("ondragexit", "Manejador para el evento dragexit.");
		DAO.INSTANCE.addAtributo("ondragleave", "Manejador para el evento dragleave.");
		DAO.INSTANCE.addAtributo("ondragover", "Manejador para el evento dragover.");
		DAO.INSTANCE.addAtributo("ondragstart", "Manejador para el evento dragstart.");
		DAO.INSTANCE.addAtributo("ondrop", "Manejador para el evento drop.");
		DAO.INSTANCE.addAtributo("ondurationchange", "Manejador para el evento durationchange.");
		DAO.INSTANCE.addAtributo("onemptied", "Manejador para el evento emptied.");
		DAO.INSTANCE.addAtributo("onended", "Manejador para el evento ended.");
		DAO.INSTANCE.addAtributo("onerror", "Manejador para el evento error.");
		DAO.INSTANCE.addAtributo("onfocus", "Manejador para el evento focus.");
		DAO.INSTANCE.addAtributo("onhashchange", "Manejador para el evento hashchange.");
		DAO.INSTANCE.addAtributo("oninput", "Manejador para el evento input.");
		DAO.INSTANCE.addAtributo("oninvalid", "Manejador para el evento invalid.");
		DAO.INSTANCE.addAtributo("onkeydown", "Manejador para el evento keydown.");
		DAO.INSTANCE.addAtributo("onkeypress", "Manejador para el evento keypress.");
		DAO.INSTANCE.addAtributo("onkeyup", "Manejador para el evento keyup.");
		DAO.INSTANCE.addAtributo("onload", "Manejador para el evento load.");
		DAO.INSTANCE.addAtributo("onloadeddata", "Manejador para el evento loadeddata.");
		DAO.INSTANCE.addAtributo("onloadstart", "Manejador para el evento loadstart.");
		DAO.INSTANCE.addAtributo("onmessage", "Manejador para el evento message.");
		DAO.INSTANCE.addAtributo("onmousedown", "Manejador para el evento mousedown.");
		DAO.INSTANCE.addAtributo("onmouseenter", "Manejador para el evento mouseenter.");
		DAO.INSTANCE.addAtributo("onmouseleave", "Manejador para el evento mouseleave.");
		DAO.INSTANCE.addAtributo("onmousemove", "Manejador para el evento mousemove.");
		DAO.INSTANCE.addAtributo("onmouseout", "Manejador para el evento mouseout.");
		DAO.INSTANCE.addAtributo("onmouseover", "Manejador para el evento mouseover.");
		DAO.INSTANCE.addAtributo("onmouseup", "Manejador para el evento mouseup.");
		DAO.INSTANCE.addAtributo("onmousewheel", "Manejador para el evento mousewheel.");
		DAO.INSTANCE.addAtributo("onoffline", "Manejador para el evento offline.");
		DAO.INSTANCE.addAtributo("ononline", "Manejador para el evento online.");
		DAO.INSTANCE.addAtributo("onpagehide", "Manejador para el evento pagehide.");
		DAO.INSTANCE.addAtributo("onpageshow", "Manejador para el evento pageshow.");
		DAO.INSTANCE.addAtributo("onpause", "Manejador para el evento pause.");
		DAO.INSTANCE.addAtributo("onplay", "Manejador para el evento play.");
		DAO.INSTANCE.addAtributo("onplaying", "Manejador para el evento playing.");
		DAO.INSTANCE.addAtributo("onpopstate", "Manejador para el evento popstate.");
		DAO.INSTANCE.addAtributo("onprogress", "Manejador para el evento progress.");
		DAO.INSTANCE.addAtributo("onratechange", "Manejador para el evento ratechange.");
		DAO.INSTANCE.addAtributo("onreset", "Manejador para el evento reset.");
		DAO.INSTANCE.addAtributo("onresize", "Manejador para el evento resize.");
		DAO.INSTANCE.addAtributo("onscroll", "Manejador para el evento scroll.");
		DAO.INSTANCE.addAtributo("onseeked", "Manejador para el evento seeked.");
		DAO.INSTANCE.addAtributo("onseeking", "Manejador para el evento seeking.");
		DAO.INSTANCE.addAtributo("onselect", "Manejador para el evento select.");
		DAO.INSTANCE.addAtributo("onshow", "Manejador para el evento show.");
		DAO.INSTANCE.addAtributo("onsort", "Manejador para el evento sort.");
		DAO.INSTANCE.addAtributo("onstalled", "Manejador para el evento stalled.");
		DAO.INSTANCE.addAtributo("onstorage", "Manejador para el evento storage.");
		DAO.INSTANCE.addAtributo("onsubmit", "Manejador para el evento submit.");
		DAO.INSTANCE.addAtributo("onsuspend", "Manejador para el evento suspend.");
		DAO.INSTANCE.addAtributo("ontimeupdate", "Manejador para el evento timeupdate.");
		DAO.INSTANCE.addAtributo("ontoggle", "Manejador para el evento toggle.");
		DAO.INSTANCE.addAtributo("onunload", "Manejador para el evento unload.");
		DAO.INSTANCE.addAtributo("onvolumechange", "Manejador para el evento volumechange.");
		DAO.INSTANCE.addAtributo("onwaiting", "Manejador para el evento waiting.");
		DAO.INSTANCE.addAtributo("sortable", "Permite al usuario mezclar la tabla.");
		DAO.INSTANCE.addAtributo("sorted", "Conjunto de tokens de espacios separados que deben ser iguales al string reversed.");
		DAO.INSTANCE.addAtributo("inputmode", "Atributo enumerado que especifica que tipo de mecanismo de entrada debe ser más útil para los usuarios en el formulario.");*/
		
/*		DAO.INSTANCE.addEtiqueta("html", "Raíz del documento HTML O XHTML. Todos los demás elementos deben estar debajo de esté elemento");
		DAO.INSTANCE.addEtiqueta("head", "Colección de metadatos sobre el documento, enlaces, definiciones de scripts, y hojas de estilo.");
		DAO.INSTANCE.addEtiqueta("title", "Define el título del documento, el cual se mostrará en la barra del navegador o en las pestañas de la página.");
		DAO.INSTANCE.addEtiqueta("base", "Permite especificar el URL del documento base para el propósito de resolver las URL relativas y el nombre del contexto de la búsqueda para los hipervínculos.");
		DAO.INSTANCE.addEtiqueta("link", "Permite vincular el documento a otros recursos.");
		DAO.INSTANCE.addEtiqueta("meta", "Define la metadata que no puede ser definida usando otro elemento HTML.");
		DAO.INSTANCE.addEtiqueta("style", "Permite al usuario introducir información de estilo en sus documentos.");
		DAO.INSTANCE.addEtiqueta("body", "Representa el contenido principal de un documento HTML.");
		DAO.INSTANCE.addEtiqueta("section", "Define una sección en un documento.");
		DAO.INSTANCE.addEtiqueta("nav", "Define una sección que solamente contiene enlaces de navegación.");
		DAO.INSTANCE.addEtiqueta("aside", "Define algunos contenidos puesto aparte del resto del contenido de la página. Si es removido el contenido restante seguirá teniendo sentido.");
		DAO.INSTANCE.addEtiqueta("h1", "Un elemento de cabecera describe brevemente el tema de la sección que introduce.");
		DAO.INSTANCE.addEtiqueta("h2", "Un elemento de cabecera describe brevemente el tema de la sección que introduce.");
		DAO.INSTANCE.addEtiqueta("h3", "Un elemento de cabecera describe brevemente el tema de la sección que introduce.");
		DAO.INSTANCE.addEtiqueta("h4", "Un elemento de cabecera describe brevemente el tema de la sección que introduce.");
		DAO.INSTANCE.addEtiqueta("h5", "Un elemento de cabecera describe brevemente el tema de la sección que introduce.");
		DAO.INSTANCE.addEtiqueta("h6", "Un elemento de cabecera describe brevemente el tema de la sección que introduce.");
		DAO.INSTANCE.addEtiqueta("header", "Define la cabecera de la página o sección. Usualmente contiene un logo, el titulo de la Sitio Web y una tabla de contenidos navegable.");
		DAO.INSTANCE.addEtiqueta("footer", "Define el pie de una página o sección. Por ejemplo de derechos de autor, algunos enlaces hacia información legal o direcciones para dar información de retroalimentación.");
		DAO.INSTANCE.addEtiqueta("address", "Define una sección que contiene información de contacto.");
		DAO.INSTANCE.addEtiqueta("p", "Párrafo.");
		DAO.INSTANCE.addEtiqueta("hr", "Representa la transición de un párrafo a otro. Cambio de tema.");
		DAO.INSTANCE.addEtiqueta("pre", "Bloque de texto preformateado, en el cual su estructura es representada por tipografía convencional en lugar de elementos.");
		DAO.INSTANCE.addEtiqueta("blockquote", "Representa contenido que es citado de otra fuente, opcionalmente con una cita que debe estar en un elemento <footer> o <cite>.");
		DAO.INSTANCE.addEtiqueta("ol", "Lista de elementos que han sido intencionalmente ordenados de tal forma que si se cambia su orden, cambiaría el sentido del documento.");
		DAO.INSTANCE.addEtiqueta("ul", "Lista de elementos en la cual el orden no es tan importante.");
		DAO.INSTANCE.addEtiqueta("li", "Elemento de una lista.");
		DAO.INSTANCE.addEtiqueta("dl", "Lista de asociación que consiste en cero o más elementos o grupos de tipo nombre-valor (lista de descripción).");
		DAO.INSTANCE.addEtiqueta("dt", "Representa el término, nombre en la descripción de una lista.");
		DAO.INSTANCE.addEtiqueta("dd", "Descripción, definición o valor en la descipción de una lista.");
		DAO.INSTANCE.addEtiqueta("figure", "Contenido dinámico, opcionalmente con un subtítulo que es autocontenido y normalmente hace referencia como una sola unidad desde el flujo principal del elemento.");
		DAO.INSTANCE.addEtiqueta("figcaption", "Representa el subtítulo para una figura.");
		DAO.INSTANCE.addEtiqueta("div", "Representa a sus hijos.");
		DAO.INSTANCE.addEtiqueta("main", "Representa el contenido principal del <body>, documento o aplicación.");
		DAO.INSTANCE.addEtiqueta("a", "Representa un hipervínculo.");
		DAO.INSTANCE.addEtiqueta("em", "Representa énfasis en el documento.");
		DAO.INSTANCE.addEtiqueta("strong", "Representa importancia, seriedad o urgencia en el contenido.");
		DAO.INSTANCE.addEtiqueta("small", "Representa comentarios adversos como letra pequeña.");
		DAO.INSTANCE.addEtiqueta("s", "Representa contenido que no es tan relevante.");
		DAO.INSTANCE.addEtiqueta("cite", "Representa una referencia a un trabajo de otra persona.");
		DAO.INSTANCE.addEtiqueta("q", "Representa cierto contenido estático citado por otro recurso.");
		DAO.INSTANCE.addEtiqueta("dfn", "Representa la definición de un término");
		DAO.INSTANCE.addEtiqueta("abbr", "Representa una abreviación o acrónimo.");
		DAO.INSTANCE.addEtiqueta("data", "Representa el contenido de lectura automática.");
		DAO.INSTANCE.addEtiqueta("time", "Representa la forma de lectura automática de los contenidos en el atributo datetime.");
		DAO.INSTANCE.addEtiqueta("code", "Representa un fragmento de código de computadora.");
		DAO.INSTANCE.addEtiqueta("var", "Representa una variable en términos matemáticos o en contexto de programación.");
		DAO.INSTANCE.addEtiqueta("samp", "Representa una salida citada de otro programa o sistema de computadora.");
		DAO.INSTANCE.addEtiqueta("kbd", "Representa una entrada de usuario, típicamente de un teclado aunque puede también ser por voz.");
		DAO.INSTANCE.addEtiqueta("sub", "Representa un subscript.");
		DAO.INSTANCE.addEtiqueta("sup", "Representa un superscript.");
		DAO.INSTANCE.addEtiqueta("i", "Representa un fragmento de texto con voz alternativa o con estado de ánimo, indicando diferente calidad del texto.");
		DAO.INSTANCE.addEtiqueta("b", "Representa un fragmento de texto  en el cual se le da mayor atención por la importancia.");
		DAO.INSTANCE.addEtiqueta("u", "Representa un fragmento de texto inarticulado.");
		DAO.INSTANCE.addEtiqueta("mark", "Representa una extensión de texto en un documento de marcado o resaltado con fines de referencia debido a su relevancia en otro contexto.");
		DAO.INSTANCE.addEtiqueta("ruby", "Permite uno o más fragmentos de contenido estático para ser marcado con notación de ruby.");
		DAO.INSTANCE.addEtiqueta("rb", "Marca el componente del texto base  de una anotación en ruby.");
		DAO.INSTANCE.addEtiqueta("rt", "Marca el componente de texto ruby en la anotación de ruby.");
		DAO.INSTANCE.addEtiqueta("rtc", "Marca un contenedor de texto ruby para contenido ruby.");
		DAO.INSTANCE.addEtiqueta("rp", "Es usado para proveer texto de despliegue a ser mostrado a agentes de usuario que no soportan la anotación ruby.");
		DAO.INSTANCE.addEtiqueta("bdi", "Representa un fragmento de texto que está aislado para propósito del formato de texto bidireccional.");
		DAO.INSTANCE.addEtiqueta("bdo", "Representa explícita direccionalidad de formato de texto de control para sus hijos.");
		DAO.INSTANCE.addEtiqueta("span", "No significa nada por sí mismo, pero puede ser de gran uso con los atributos class, lang o dir.");
		DAO.INSTANCE.addEtiqueta("wbr", "Representa la oportunidad de un salto de línea.");
		DAO.INSTANCE.addEtiqueta("br", "Representa la un salto de línea.");
		DAO.INSTANCE.addEtiqueta("ins", "Representa una adición al documento.");
		DAO.INSTANCE.addEtiqueta("del", "Representa remover algo del documento.");
		DAO.INSTANCE.addEtiqueta("img", "Representa una imagen.");
		DAO.INSTANCE.addEtiqueta("iframe", "Representa una anidación en el contexto de navegación.");
		DAO.INSTANCE.addEtiqueta("embed", "Provee un punto de integración para una aplicación externa o contenido interactivo.");
		DAO.INSTANCE.addEtiqueta("object", "Puede representar un recurso externo, en el cual, dependiendo del recurso puede ser tratado como imagen, como anidación en el contexto de navegación o como un recurso externo tratado por un plugin.");
		DAO.INSTANCE.addEtiqueta("param", "Define los parámetros para plugins invocados por elementos object.");
		DAO.INSTANCE.addEtiqueta("video", "Es usado para reproducir videos o películas y archivos de audio con imagenes.");
		DAO.INSTANCE.addEtiqueta("audio", "Representa sonido o reproducción de audio.");
		DAO.INSTANCE.addEtiqueta("source", "Permite al autor especificar múltiples alternativas de recursos multimedia para elementos multimedia.");
		DAO.INSTANCE.addEtiqueta("track", "Permite al autor especificar pistas externas de texto temporizado explícitas para recursos multimedia.");
		DAO.INSTANCE.addEtiqueta("map", "Define el área de la imagen en conjunto con img y area.");
		DAO.INSTANCE.addEtiqueta("area", "Representa un hipervínculo con algún texto y el área correspondiente o un área de imagen .");
		DAO.INSTANCE.addEtiqueta("table", "Representa datos con más de una dimensión en forma de tabla.");
		DAO.INSTANCE.addEtiqueta("caption", "Representa el título de la tabla.");
		DAO.INSTANCE.addEtiqueta("colgroup", "Representa un grupo de una o más columnas en la tabla.");
		DAO.INSTANCE.addEtiqueta("col", "Representa una o más columnas en un grupo de columnas representado por colgroup.");
		DAO.INSTANCE.addEtiqueta("tbody", "Representa un bloque de filas que consiste en el cuerpo de la tabla.");
		DAO.INSTANCE.addEtiqueta("thead", "Representa un bloque de filas que consiste en las cabeceras de las columnas.");
		DAO.INSTANCE.addEtiqueta("tfoot", "Representa un bloque de filas que consiste en el pie de las columnas.");
		DAO.INSTANCE.addEtiqueta("tr", "Representa una fila de celdas en la tabla.");
		DAO.INSTANCE.addEtiqueta("td", "Representa una celda en la tabla.");
		DAO.INSTANCE.addEtiqueta("th", "Representa la cabecera de una celda.");
		DAO.INSTANCE.addEtiqueta("form", "Representa una colección de elementos form asociados que pueden representar valores editables que pueden ser enviados para ser procesados por un servidor.");
		DAO.INSTANCE.addEtiqueta("label", "Representa un título en la interfaz de usuario.");
		DAO.INSTANCE.addEtiqueta("input", "Representa un campo de tipo de dato de entrada, normalmente con un controlador form que permite al usuario introducir datos.");
		DAO.INSTANCE.addEtiqueta("button", "Representa un botón.");
		DAO.INSTANCE.addEtiqueta("select", "Representa un controlador de selección a través de un conjunto de opciones.");
		DAO.INSTANCE.addEtiqueta("datalist", "Representa un conjunto de elementos option que representan opciones predefinidas por otros controladores.");
		DAO.INSTANCE.addEtiqueta("optgroup", "Representa un grupo de opciones con un título en común.");
		DAO.INSTANCE.addEtiqueta("option", "Representa una opción en un elemento select o como parte de una lista de sugerencias en un elemento datalist.");
		DAO.INSTANCE.addEtiqueta("textarea", "Representa un controlador para la edición de texto plano multilínea.");
		DAO.INSTANCE.addEtiqueta("keygen", "Representa un controlador de un generador de pares de llaves. Cuando el formulario es enviado, la llave privada se guarda en el keystore local y la llave pública es empacada y enviada al servidor.");
		DAO.INSTANCE.addEtiqueta("output", "Representa el resultado de un cálculo realizado por la aplicación, o el resultado de una acción del usuario.");
		DAO.INSTANCE.addEtiqueta("progress", "Representa el progreso de finalización de un proceso.");
		DAO.INSTANCE.addEtiqueta("meter", "Representa una medida escalar con un rango conocido o un valor fraccional.");
		DAO.INSTANCE.addEtiqueta("fieldset", "Representa un conjunto de controladores de formulario opcionales agrupados bajo un mismo nombre.");
		DAO.INSTANCE.addEtiqueta("legend", "Representa el subtítulo.");
		DAO.INSTANCE.addEtiqueta("details", "Representa un un widget del cual el usuario puede obtener informaciòn o controles adicionales.");
		DAO.INSTANCE.addEtiqueta("summary", "Representa un resumen, subtítulo, o leyenda del resto del contenido.");
		DAO.INSTANCE.addEtiqueta("menu", "Representa una lista de comandos.");
		DAO.INSTANCE.addEtiqueta("menuitem", "Representa un comando que el usuario invoca de un menu popup.");
		DAO.INSTANCE.addEtiqueta("dialog", "Representa una parte de una aplicación con la que el usuario interactua para realizar una petición.");
		DAO.INSTANCE.addEtiqueta("script", "Permite al autor incluir script dinámico y bloques de datos en el documento.");
		DAO.INSTANCE.addEtiqueta("noscript", "No representa si el script está habilitado y representa su hijo si el script está deshabilitado");
		DAO.INSTANCE.addEtiqueta("template", "Es usado para declarar fragmentos de HTML que pueden ser clonados e insertados en el documento por medio de un script.");
		DAO.INSTANCE.addEtiqueta("canvas", "Provee scripts con una resolución dependiente del canvas bitmap, el cual puede ser usado para renderizar gráficos, gráficos de juegos, arte u otras imágenes al vuelo.");*/
		
		
		
		
		
	
		com.google.appengine.api.datastore.DatastoreService ds = DatastoreServiceFactory.getDatastoreService();
		Entity etiq1 = DAO.INSTANCE.existeEtiqueta("video");
		Entity atrib1= DAO.INSTANCE.existeAtributo("accesskey");
		Entity atrib2= DAO.INSTANCE.existeAtributo("class");
		Entity atrib3= DAO.INSTANCE.existeAtributo("contenteditable");
		Entity atrib4= DAO.INSTANCE.existeAtributo("contextmenu");
		Entity atrib5= DAO.INSTANCE.existeAtributo("dir");
		Entity atrib6= DAO.INSTANCE.existeAtributo("draggable");
		Entity atrib7= DAO.INSTANCE.existeAtributo("dropzone");
		Entity atrib8= DAO.INSTANCE.existeAtributo("hidden");
		Entity atrib9= DAO.INSTANCE.existeAtributo("id");
		Entity atrib10= DAO.INSTANCE.existeAtributo("inert");
		Entity atrib11= DAO.INSTANCE.existeAtributo("lang");
		Entity atrib12= DAO.INSTANCE.existeAtributo("spellcheck");
		Entity atrib13= DAO.INSTANCE.existeAtributo("style");
		Entity atrib14= DAO.INSTANCE.existeAtributo("tabindex");
		Entity atrib15= DAO.INSTANCE.existeAtributo("title");
		Entity atrib16= DAO.INSTANCE.existeAtributo("translate");
	
/*		Entity atrib23= DAO.INSTANCE.existeAtributo("form");
		Entity atrib24= DAO.INSTANCE.existeAtributo("minlength");		
		Entity atrib25= DAO.INSTANCE.existeAtributo("placeholder");
		Entity atrib26= DAO.INSTANCE.existeAtributo("readonly");
		Entity atrib27= DAO.INSTANCE.existeAtributo("required");
		Entity atrib28= DAO.INSTANCE.existeAtributo("rows");
		Entity atrib29= DAO.INSTANCE.existeAtributo("name");
		Entity atrib30= DAO.INSTANCE.existeAtributo("wrap");
/*		Entity atrib31= DAO.INSTANCE.existeAtributo("value");
		Entity atrib32= DAO.INSTANCE.existeAtributo("max");
		Entity atrib33= DAO.INSTANCE.existeAtributo("maxlength");
		Entity atrib34= DAO.INSTANCE.existeAtributo("min");
		Entity atrib35= DAO.INSTANCE.existeAtributo("minlength");
		Entity atrib36= DAO.INSTANCE.existeAtributo("multiple");
		Entity atrib37= DAO.INSTANCE.existeAtributo("name");
		Entity atrib38= DAO.INSTANCE.existeAtributo("pattern");
		Entity atrib39= DAO.INSTANCE.existeAtributo("placeholder");
		Entity atrib40= DAO.INSTANCE.existeAtributo("readonly");
		Entity atrib41= DAO.INSTANCE.existeAtributo("required");
		Entity atrib42= DAO.INSTANCE.existeAtributo("size");
		Entity atrib43= DAO.INSTANCE.existeAtributo("src");
		Entity atrib44= DAO.INSTANCE.existeAtributo("step");
		Entity atrib45= DAO.INSTANCE.existeAtributo("type");
		Entity atrib46= DAO.INSTANCE.existeAtributo("value");
		Entity atrib47= DAO.INSTANCE.existeAtributo("width");*/
		List<String> lista = Arrays.asList(atrib1.getProperty("Nombre").toString());
		etiq1.setProperty("idAtributo", lista);
		ds.put(etiq1);
		//DAO.INSTANCE.addRelacion("article","contenteditable", llaves);
/*		llaves = DAO.INSTANCE.relacion("article", "contextmenu");
		DAO.INSTANCE.addRelacion("article","contextmenu", llaves);
/*		DAO.INSTANCE.relacion("article", "dir");
		DAO.INSTANCE.relacion("article", "draggable");
		DAO.INSTANCE.relacion("article", "hidden");
		DAO.INSTANCE.relacion("article", "id");
		DAO.INSTANCE.relacion("article", "inert");
		DAO.INSTANCE.relacion("article", "lang");
		DAO.INSTANCE.relacion("article", "spellcheck");
		DAO.INSTANCE.relacion("article", "style");
		DAO.INSTANCE.relacion("article", "tabindex");
		DAO.INSTANCE.relacion("article", "title");
		DAO.INSTANCE.relacion("article", "translate");
		DAO.INSTANCE.relacion("article", "class");
		
	/*	
	
		





		

	
	


		
		DAO.INSTANCE.addAtributos(at);*/
		
		/*
		

		
		
		
		
		
		

		
	//	DAO.INSTANCE.addEtiqueta(et);
		
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
		
		//DAO.INSTANCE.addEtiquetaAtributo("aside", "accesskey");
		//DAO.INSTANCE.addEtiquetaAtributo("aside", "class");
		//DAO.INSTANCE.addEtiquetaAtributo("aside", "contenteditable");
		//DAO.INSTANCE.addEtiquetaAtributo("aside", "contextmenu");
		//DAO.INSTANCE.addEtiquetaAtributo("aside", "dir");
		//DAO.INSTANCE.addEtiquetaAtributo("aside", "draggable");
		//DAO.INSTANCE.addEtiquetaAtributo("aside", "dropzone");
		//DAO.INSTANCE.addEtiquetaAtributo("aside", "hidden");
		//DAO.INSTANCE.addEtiquetaAtributo("aside", "id");
		//DAO.INSTANCE.addEtiquetaAtributo("aside", "inert");
		//DAO.INSTANCE.addEtiquetaAtributo("aside", "lang");
		//DAO.INSTANCE.addEtiquetaAtributo("aside", "spellcheck");
		//DAO.INSTANCE.addEtiquetaAtributo("aside", "style");
		//DAO.INSTANCE.addEtiquetaAtributo("aside", "tabindex");
		//DAO.INSTANCE.addEtiquetaAtributo("aside", "title");
		//DAO.INSTANCE.addEtiquetaAtributo("aside", "translate");
		
		//DAO.INSTANCE.addEtiquetaAtributo("h1", "accesskey");
		//DAO.INSTANCE.addEtiquetaAtributo("h1", "class");
		//DAO.INSTANCE.addEtiquetaAtributo("h1", "contenteditable");
		//DAO.INSTANCE.addEtiquetaAtributo("h1", "contextmenu");
		//DAO.INSTANCE.addEtiquetaAtributo("h1", "dir");
		//DAO.INSTANCE.addEtiquetaAtributo("h1", "draggable");
		//DAO.INSTANCE.addEtiquetaAtributo("h1", "dropzone");
		//DAO.INSTANCE.addEtiquetaAtributo("h1", "hidden");
		//DAO.INSTANCE.addEtiquetaAtributo("h1", "id");
		//DAO.INSTANCE.addEtiquetaAtributo("h1", "inert");
		//DAO.INSTANCE.addEtiquetaAtributo("h1", "lang");
		//DAO.INSTANCE.addEtiquetaAtributo("h1", "spellcheck");
		//DAO.INSTANCE.addEtiquetaAtributo("h1", "style");
		//DAO.INSTANCE.addEtiquetaAtributo("h1", "tabindex");
		//DAO.INSTANCE.addEtiquetaAtributo("h1", "title");
		//DAO.INSTANCE.addEtiquetaAtributo("h1", "translate");
		
		//DAO.INSTANCE.addEtiquetaAtributo("h2", "accesskey");
		//DAO.INSTANCE.addEtiquetaAtributo("h2", "class");
		//DAO.INSTANCE.addEtiquetaAtributo("h2", "contenteditable");
		//DAO.INSTANCE.addEtiquetaAtributo("h2", "contextmenu");
		//DAO.INSTANCE.addEtiquetaAtributo("h2", "dir");
		//DAO.INSTANCE.addEtiquetaAtributo("h2", "draggable");
		//DAO.INSTANCE.addEtiquetaAtributo("h2", "dropzone");
		//DAO.INSTANCE.addEtiquetaAtributo("h2", "hidden");
		//DAO.INSTANCE.addEtiquetaAtributo("h2", "id");
		//DAO.INSTANCE.addEtiquetaAtributo("h2", "inert");
		//DAO.INSTANCE.addEtiquetaAtributo("h2", "lang");
		//DAO.INSTANCE.addEtiquetaAtributo("h2", "spellcheck");
		//DAO.INSTANCE.addEtiquetaAtributo("h2", "style");
		//DAO.INSTANCE.addEtiquetaAtributo("h2", "tabindex");
		//DAO.INSTANCE.addEtiquetaAtributo("h2", "title");
		//DAO.INSTANCE.addEtiquetaAtributo("h2", "translate");
		
		//DAO.INSTANCE.addEtiquetaAtributo("h3", "accesskey");
		//DAO.INSTANCE.addEtiquetaAtributo("h3", "class");
		//DAO.INSTANCE.addEtiquetaAtributo("h3", "contenteditable");
		//DAO.INSTANCE.addEtiquetaAtributo("h3", "contextmenu");
		//DAO.INSTANCE.addEtiquetaAtributo("h3", "dir");
		//DAO.INSTANCE.addEtiquetaAtributo("h3", "draggable");
		//DAO.INSTANCE.addEtiquetaAtributo("h3", "dropzone");
		//DAO.INSTANCE.addEtiquetaAtributo("h3", "hidden");
		//DAO.INSTANCE.addEtiquetaAtributo("h3", "id");
		//DAO.INSTANCE.addEtiquetaAtributo("h3", "inert");
		//DAO.INSTANCE.addEtiquetaAtributo("h3", "lang");
		//DAO.INSTANCE.addEtiquetaAtributo("h3", "spellcheck");
		//DAO.INSTANCE.addEtiquetaAtributo("h3", "style");
		//DAO.INSTANCE.addEtiquetaAtributo("h3", "tabindex");
		//DAO.INSTANCE.addEtiquetaAtributo("h3", "title");
		//DAO.INSTANCE.addEtiquetaAtributo("h3", "translate");
		
		//DAO.INSTANCE.addEtiquetaAtributo("h4", "accesskey");
		//DAO.INSTANCE.addEtiquetaAtributo("h4", "class");
		//DAO.INSTANCE.addEtiquetaAtributo("h4", "contenteditable");
		//DAO.INSTANCE.addEtiquetaAtributo("h4", "contextmenu");
		//DAO.INSTANCE.addEtiquetaAtributo("h4", "dir");
		//DAO.INSTANCE.addEtiquetaAtributo("h4", "draggable");
		//DAO.INSTANCE.addEtiquetaAtributo("h4", "dropzone");
		//DAO.INSTANCE.addEtiquetaAtributo("h4", "hidden");
		//DAO.INSTANCE.addEtiquetaAtributo("h4", "id");
		//DAO.INSTANCE.addEtiquetaAtributo("h4", "inert");
		//DAO.INSTANCE.addEtiquetaAtributo("h4", "lang");
		//DAO.INSTANCE.addEtiquetaAtributo("h4", "spellcheck");
		//DAO.INSTANCE.addEtiquetaAtributo("h4", "style");
		//DAO.INSTANCE.addEtiquetaAtributo("h4", "tabindex");
		//DAO.INSTANCE.addEtiquetaAtributo("h4", "title");
		//DAO.INSTANCE.addEtiquetaAtributo("h4", "translate");
		
		//DAO.INSTANCE.addEtiquetaAtributo("h5", "accesskey");
		//DAO.INSTANCE.addEtiquetaAtributo("h5", "class");
		//DAO.INSTANCE.addEtiquetaAtributo("h5", "contenteditable");
		//DAO.INSTANCE.addEtiquetaAtributo("h5", "contextmenu");
		//DAO.INSTANCE.addEtiquetaAtributo("h5", "dir");
		//DAO.INSTANCE.addEtiquetaAtributo("h5", "draggable");
		//DAO.INSTANCE.addEtiquetaAtributo("h5", "dropzone");
		//DAO.INSTANCE.addEtiquetaAtributo("h5", "hidden");
		//DAO.INSTANCE.addEtiquetaAtributo("h5", "id");
		//DAO.INSTANCE.addEtiquetaAtributo("h5", "inert");
		//DAO.INSTANCE.addEtiquetaAtributo("h5", "lang");
		//DAO.INSTANCE.addEtiquetaAtributo("h5", "spellcheck");
		//DAO.INSTANCE.addEtiquetaAtributo("h5", "style");
		//DAO.INSTANCE.addEtiquetaAtributo("h5", "tabindex");
		//DAO.INSTANCE.addEtiquetaAtributo("h5", "title");
		//DAO.INSTANCE.addEtiquetaAtributo("h5", "translate");
		
		//DAO.INSTANCE.addEtiquetaAtributo("h6", "accesskey");
		//DAO.INSTANCE.addEtiquetaAtributo("h6", "class");
		//DAO.INSTANCE.addEtiquetaAtributo("h6", "contenteditable");
		//DAO.INSTANCE.addEtiquetaAtributo("h6", "contextmenu");
		//DAO.INSTANCE.addEtiquetaAtributo("h6", "dir");
		//DAO.INSTANCE.addEtiquetaAtributo("h6", "draggable");
		//DAO.INSTANCE.addEtiquetaAtributo("h6", "dropzone");
		//DAO.INSTANCE.addEtiquetaAtributo("h6", "hidden");
		//DAO.INSTANCE.addEtiquetaAtributo("h6", "id");
		//DAO.INSTANCE.addEtiquetaAtributo("h6", "inert");
		//DAO.INSTANCE.addEtiquetaAtributo("h6", "lang");
		//DAO.INSTANCE.addEtiquetaAtributo("h6", "spellcheck");
		//DAO.INSTANCE.addEtiquetaAtributo("h6", "style");
		//DAO.INSTANCE.addEtiquetaAtributo("h6", "tabindex");
		//DAO.INSTANCE.addEtiquetaAtributo("h6", "title");
		//DAO.INSTANCE.addEtiquetaAtributo("h6", "translate");
		
		//DAO.INSTANCE.addEtiquetaAtributo("header", "accesskey");
		//DAO.INSTANCE.addEtiquetaAtributo("header", "class");
		//DAO.INSTANCE.addEtiquetaAtributo("header", "contenteditable");
		//DAO.INSTANCE.addEtiquetaAtributo("header", "contextmenu");
		//DAO.INSTANCE.addEtiquetaAtributo("header", "dir");
		//DAO.INSTANCE.addEtiquetaAtributo("header", "draggable");
		//DAO.INSTANCE.addEtiquetaAtributo("header", "dropzone");
		//DAO.INSTANCE.addEtiquetaAtributo("header", "hidden");
		//DAO.INSTANCE.addEtiquetaAtributo("header", "id");
		//DAO.INSTANCE.addEtiquetaAtributo("header", "inert");
		//DAO.INSTANCE.addEtiquetaAtributo("header", "lang");
		//DAO.INSTANCE.addEtiquetaAtributo("header", "spellcheck");
		//DAO.INSTANCE.addEtiquetaAtributo("header", "style");
		//DAO.INSTANCE.addEtiquetaAtributo("header", "tabindex");
		//DAO.INSTANCE.addEtiquetaAtributo("header", "title");
		//DAO.INSTANCE.addEtiquetaAtributo("header", "translate");
		
		//DAO.INSTANCE.addEtiquetaAtributo("footer", "accesskey");
		//DAO.INSTANCE.addEtiquetaAtributo("footer", "class");
		//DAO.INSTANCE.addEtiquetaAtributo("footer", "contenteditable");
		//DAO.INSTANCE.addEtiquetaAtributo("footer", "contextmenu");
		//DAO.INSTANCE.addEtiquetaAtributo("footer", "dir");
		//DAO.INSTANCE.addEtiquetaAtributo("footer", "draggable");
		//DAO.INSTANCE.addEtiquetaAtributo("footer", "dropzone");
		//DAO.INSTANCE.addEtiquetaAtributo("footer", "hidden");
		//DAO.INSTANCE.addEtiquetaAtributo("footer", "id");
		//DAO.INSTANCE.addEtiquetaAtributo("footer", "inert");
		//DAO.INSTANCE.addEtiquetaAtributo("footer", "lang");
		//DAO.INSTANCE.addEtiquetaAtributo("footer", "spellcheck");
		//DAO.INSTANCE.addEtiquetaAtributo("footer", "style");
		//DAO.INSTANCE.addEtiquetaAtributo("footer", "tabindex");
		//DAO.INSTANCE.addEtiquetaAtributo("footer", "title");
		//DAO.INSTANCE.addEtiquetaAtributo("footer", "translate");
		
		//DAO.INSTANCE.addEtiquetaAtributo("address", "accesskey");
		//DAO.INSTANCE.addEtiquetaAtributo("address", "class");
		//DAO.INSTANCE.addEtiquetaAtributo("address", "contenteditable");
		//DAO.INSTANCE.addEtiquetaAtributo("address", "contextmenu");
		//DAO.INSTANCE.addEtiquetaAtributo("address", "dir");
		//DAO.INSTANCE.addEtiquetaAtributo("address", "draggable");
		//DAO.INSTANCE.addEtiquetaAtributo("address", "dropzone");
		//DAO.INSTANCE.addEtiquetaAtributo("address", "hidden");
		//DAO.INSTANCE.addEtiquetaAtributo("address", "id");
		//DAO.INSTANCE.addEtiquetaAtributo("address", "inert");
		//DAO.INSTANCE.addEtiquetaAtributo("address", "lang");
		//DAO.INSTANCE.addEtiquetaAtributo("address", "spellcheck");
		//DAO.INSTANCE.addEtiquetaAtributo("address", "style");
		//DAO.INSTANCE.addEtiquetaAtributo("address", "tabindex");
		//DAO.INSTANCE.addEtiquetaAtributo("address", "title");
		//DAO.INSTANCE.addEtiquetaAtributo("address", "translate");
		
		
		//DAO.INSTANCE.addEtiquetaAtributo("p", "accesskey");
		//DAO.INSTANCE.addEtiquetaAtributo("p", "class");
		//DAO.INSTANCE.addEtiquetaAtributo("p", "contenteditable");
		//DAO.INSTANCE.addEtiquetaAtributo("p", "contextmenu");
		//DAO.INSTANCE.addEtiquetaAtributo("p", "dir");
		//DAO.INSTANCE.addEtiquetaAtributo("p", "draggable");
		//DAO.INSTANCE.addEtiquetaAtributo("p", "dropzone");
		//DAO.INSTANCE.addEtiquetaAtributo("p", "hidden");
		//DAO.INSTANCE.addEtiquetaAtributo("p", "id");
		//DAO.INSTANCE.addEtiquetaAtributo("p", "inert");
		//DAO.INSTANCE.addEtiquetaAtributo("p", "lang");
		//DAO.INSTANCE.addEtiquetaAtributo("p", "spellcheck");
		//DAO.INSTANCE.addEtiquetaAtributo("p", "style");
		//DAO.INSTANCE.addEtiquetaAtributo("p", "tabindex");
		//DAO.INSTANCE.addEtiquetaAtributo("p", "title");
		//DAO.INSTANCE.addEtiquetaAtributo("p", "translate");
		
		
		//DAO.INSTANCE.addEtiquetaAtributo("hr", "accesskey");
		//DAO.INSTANCE.addEtiquetaAtributo("hr", "class");
		//DAO.INSTANCE.addEtiquetaAtributo("hr", "contenteditable");
		//DAO.INSTANCE.addEtiquetaAtributo("hr", "contextmenu");
		//DAO.INSTANCE.addEtiquetaAtributo("hr", "dir");
		//DAO.INSTANCE.addEtiquetaAtributo("hr", "draggable");
		//DAO.INSTANCE.addEtiquetaAtributo("hr", "dropzone");
		//DAO.INSTANCE.addEtiquetaAtributo("hr", "hidden");
		//DAO.INSTANCE.addEtiquetaAtributo("hr", "id");
		//DAO.INSTANCE.addEtiquetaAtributo("hr", "inert");
		//DAO.INSTANCE.addEtiquetaAtributo("hr", "lang");
		//DAO.INSTANCE.addEtiquetaAtributo("hr", "spellcheck");
		//DAO.INSTANCE.addEtiquetaAtributo("hr", "style");
		//DAO.INSTANCE.addEtiquetaAtributo("hr", "tabindex");
		//DAO.INSTANCE.addEtiquetaAtributo("hr", "title");
		//DAO.INSTANCE.addEtiquetaAtributo("hr", "translate");
		
		
		//DAO.INSTANCE.addEtiquetaAtributo("pre", "accesskey");
		//DAO.INSTANCE.addEtiquetaAtributo("pre", "class");
		//DAO.INSTANCE.addEtiquetaAtributo("pre", "contenteditable");
		//DAO.INSTANCE.addEtiquetaAtributo("pre", "contextmenu");
		//DAO.INSTANCE.addEtiquetaAtributo("pre", "dir");
		//DAO.INSTANCE.addEtiquetaAtributo("pre", "draggable");
		//DAO.INSTANCE.addEtiquetaAtributo("pre", "dropzone");
		//DAO.INSTANCE.addEtiquetaAtributo("pre", "hidden");
		//DAO.INSTANCE.addEtiquetaAtributo("pre", "id");
		//DAO.INSTANCE.addEtiquetaAtributo("pre", "inert");
		//DAO.INSTANCE.addEtiquetaAtributo("pre", "lang");
		//DAO.INSTANCE.addEtiquetaAtributo("pre", "spellcheck");
		//DAO.INSTANCE.addEtiquetaAtributo("pre", "style");
		//DAO.INSTANCE.addEtiquetaAtributo("pre", "tabindex");
		//DAO.INSTANCE.addEtiquetaAtributo("pre", "title");
		//DAO.INSTANCE.addEtiquetaAtributo("pre", "translate");	
		
		//DAO.INSTANCE.addEtiquetaAtributo("blockquote", "accesskey");
		//DAO.INSTANCE.addEtiquetaAtributo("blockquote", "class");
		//DAO.INSTANCE.addEtiquetaAtributo("blockquote", "contenteditable");
		//DAO.INSTANCE.addEtiquetaAtributo("blockquote", "contextmenu");
		//DAO.INSTANCE.addEtiquetaAtributo("blockquote", "dir");
		//DAO.INSTANCE.addEtiquetaAtributo("blockquote", "draggable");
		//DAO.INSTANCE.addEtiquetaAtributo("blockquote", "dropzone");
		//DAO.INSTANCE.addEtiquetaAtributo("blockquote", "hidden");
		//DAO.INSTANCE.addEtiquetaAtributo("blockquote", "id");
		//DAO.INSTANCE.addEtiquetaAtributo("blockquote", "inert");
		//DAO.INSTANCE.addEtiquetaAtributo("blockquote", "lang");
		//DAO.INSTANCE.addEtiquetaAtributo("blockquote", "spellcheck");
		//DAO.INSTANCE.addEtiquetaAtributo("blockquote", "style");
		//DAO.INSTANCE.addEtiquetaAtributo("blockquote", "tabindex");
		//DAO.INSTANCE.addEtiquetaAtributo("blockquote", "title");
		//DAO.INSTANCE.addEtiquetaAtributo("blockquote", "translate");
		//DAO.INSTANCE.addEtiquetaAtributo("blockquote", "cite");
		
		//DAO.INSTANCE.addEtiquetaAtributo("ol", "accesskey");
		//DAO.INSTANCE.addEtiquetaAtributo("ol", "class");
		//DAO.INSTANCE.addEtiquetaAtributo("ol", "contenteditable");
		//DAO.INSTANCE.addEtiquetaAtributo("ol", "contextmenu");
		//DAO.INSTANCE.addEtiquetaAtributo("ol", "dir");
		//DAO.INSTANCE.addEtiquetaAtributo("ol", "draggable");
		//DAO.INSTANCE.addEtiquetaAtributo("ol", "dropzone");
		//DAO.INSTANCE.addEtiquetaAtributo("ol", "hidden");
		//DAO.INSTANCE.addEtiquetaAtributo("ol", "id");
		//DAO.INSTANCE.addEtiquetaAtributo("ol", "inert");
		//DAO.INSTANCE.addEtiquetaAtributo("ol", "lang");
		//DAO.INSTANCE.addEtiquetaAtributo("ol", "spellcheck");
		//DAO.INSTANCE.addEtiquetaAtributo("ol", "style");
		//DAO.INSTANCE.addEtiquetaAtributo("ol", "tabindex");
		//DAO.INSTANCE.addEtiquetaAtributo("ol", "title");
		//DAO.INSTANCE.addEtiquetaAtributo("ol", "translate");
		//DAO.INSTANCE.addEtiquetaAtributo("ol", "reversed");	
		//DAO.INSTANCE.addEtiquetaAtributo("ol", "start");
		//DAO.INSTANCE.addEtiquetaAtributo("ol", "type");
		
		//DAO.INSTANCE.addEtiquetaAtributo("ul", "accesskey");
		//DAO.INSTANCE.addEtiquetaAtributo("ul", "class");
		//DAO.INSTANCE.addEtiquetaAtributo("ul", "contenteditable");
		//DAO.INSTANCE.addEtiquetaAtributo("ul", "contextmenu");
		//DAO.INSTANCE.addEtiquetaAtributo("ul", "dir");
		//DAO.INSTANCE.addEtiquetaAtributo("ul", "draggable");
		//DAO.INSTANCE.addEtiquetaAtributo("ul", "dropzone");
		//DAO.INSTANCE.addEtiquetaAtributo("ul", "hidden");
		//DAO.INSTANCE.addEtiquetaAtributo("ul", "id");
		//DAO.INSTANCE.addEtiquetaAtributo("ul", "inert");
		//DAO.INSTANCE.addEtiquetaAtributo("ul", "lang");
		//DAO.INSTANCE.addEtiquetaAtributo("ul", "spellcheck");
		//DAO.INSTANCE.addEtiquetaAtributo("ul", "style");
		//DAO.INSTANCE.addEtiquetaAtributo("ul", "tabindex");
		//DAO.INSTANCE.addEtiquetaAtributo("ul", "title");
		//DAO.INSTANCE.addEtiquetaAtributo("ul", "translate");
		
		//DAO.INSTANCE.addEtiquetaAtributo("li", "accesskey");
		//DAO.INSTANCE.addEtiquetaAtributo("li", "class");
		//DAO.INSTANCE.addEtiquetaAtributo("li", "contenteditable");
		//DAO.INSTANCE.addEtiquetaAtributo("li", "contextmenu");
		//DAO.INSTANCE.addEtiquetaAtributo("li", "dir");
		//DAO.INSTANCE.addEtiquetaAtributo("li", "draggable");
		//DAO.INSTANCE.addEtiquetaAtributo("li", "dropzone");
		//DAO.INSTANCE.addEtiquetaAtributo("li", "hidden");
		//DAO.INSTANCE.addEtiquetaAtributo("li", "id");
		//DAO.INSTANCE.addEtiquetaAtributo("li", "inert");
		//DAO.INSTANCE.addEtiquetaAtributo("li", "lang");
		//DAO.INSTANCE.addEtiquetaAtributo("li", "spellcheck");
		//DAO.INSTANCE.addEtiquetaAtributo("li", "style");
		//DAO.INSTANCE.addEtiquetaAtributo("li", "tabindex");
		//DAO.INSTANCE.addEtiquetaAtributo("li", "title");
		//DAO.INSTANCE.addEtiquetaAtributo("li", "translate");
		
		//DAO.INSTANCE.addEtiquetaAtributo("dl", "accesskey");
		//DAO.INSTANCE.addEtiquetaAtributo("dl", "class");
		//DAO.INSTANCE.addEtiquetaAtributo("dl", "contenteditable");
		//DAO.INSTANCE.addEtiquetaAtributo("dl", "contextmenu");
		//DAO.INSTANCE.addEtiquetaAtributo("dl", "dir");
		//DAO.INSTANCE.addEtiquetaAtributo("dl", "draggable");
		//DAO.INSTANCE.addEtiquetaAtributo("dl", "dropzone");
		//DAO.INSTANCE.addEtiquetaAtributo("dl", "hidden");
		//DAO.INSTANCE.addEtiquetaAtributo("dl", "id");
		//DAO.INSTANCE.addEtiquetaAtributo("dl", "inert");
//		DAO.INSTANCE.addEtiquetaAtributo("dl", "lang");
		//DAO.INSTANCE.addEtiquetaAtributo("dl", "spellcheck");
		//DAO.INSTANCE.addEtiquetaAtributo("dl", "style");
		//DAO.INSTANCE.addEtiquetaAtributo("dl", "tabindex");
		//DAO.INSTANCE.addEtiquetaAtributo("dl", "title");
		//DAO.INSTANCE.addEtiquetaAtributo("dl", "translate");
		
		//DAO.INSTANCE.addEtiquetaAtributo("dt", "accesskey");
		//DAO.INSTANCE.addEtiquetaAtributo("dt", "class");
		//DAO.INSTANCE.addEtiquetaAtributo("dt", "contenteditable");
		//DAO.INSTANCE.addEtiquetaAtributo("dt", "contextmenu");
		//DAO.INSTANCE.addEtiquetaAtributo("dt", "dir");
		//DAO.INSTANCE.addEtiquetaAtributo("dt", "draggable");
		//DAO.INSTANCE.addEtiquetaAtributo("dt", "dropzone");
		//DAO.INSTANCE.addEtiquetaAtributo("dt", "hidden");
		//DAO.INSTANCE.addEtiquetaAtributo("dt", "id");
		//DAO.INSTANCE.addEtiquetaAtributo("dt", "inert");
		//DAO.INSTANCE.addEtiquetaAtributo("dt", "lang");
		//DAO.INSTANCE.addEtiquetaAtributo("dt", "spellcheck");
		//DAO.INSTANCE.addEtiquetaAtributo("dt", "style");
		//DAO.INSTANCE.addEtiquetaAtributo("dt", "tabindex");
		//DAO.INSTANCE.addEtiquetaAtributo("dt", "title");
		//DAO.INSTANCE.addEtiquetaAtributo("dt", "translate");
		
		//DAO.INSTANCE.addEtiquetaAtributo("dd", "accesskey");
		//DAO.INSTANCE.addEtiquetaAtributo("dd", "class");
		//DAO.INSTANCE.addEtiquetaAtributo("dd", "contenteditable");
		//DAO.INSTANCE.addEtiquetaAtributo("dd", "contextmenu");
		//DAO.INSTANCE.addEtiquetaAtributo("dd", "dir");
		//DAO.INSTANCE.addEtiquetaAtributo("dd", "draggable");
		//DAO.INSTANCE.addEtiquetaAtributo("dd", "dropzone");
		//DAO.INSTANCE.addEtiquetaAtributo("dd", "hidden");
		//DAO.INSTANCE.addEtiquetaAtributo("dd", "id");
		//DAO.INSTANCE.addEtiquetaAtributo("dd", "inert");
		//DAO.INSTANCE.addEtiquetaAtributo("dd", "lang");
		//DAO.INSTANCE.addEtiquetaAtributo("dd", "spellcheck");
		//DAO.INSTANCE.addEtiquetaAtributo("dd", "style");
		//DAO.INSTANCE.addEtiquetaAtributo("dd", "tabindex");
		//DAO.INSTANCE.addEtiquetaAtributo("dd", "title");
		//DAO.INSTANCE.addEtiquetaAtributo("dd", "translate");

		//DAO.INSTANCE.addEtiquetaAtributo("figure", "accesskey");
		//DAO.INSTANCE.addEtiquetaAtributo("figure", "class");
		//DAO.INSTANCE.addEtiquetaAtributo("figure", "contenteditable");
		//DAO.INSTANCE.addEtiquetaAtributo("figure", "contextmenu");
		//DAO.INSTANCE.addEtiquetaAtributo("figure", "dir");
		//DAO.INSTANCE.addEtiquetaAtributo("figure", "draggable");
		//DAO.INSTANCE.addEtiquetaAtributo("figure", "dropzone");
		//DAO.INSTANCE.addEtiquetaAtributo("figure", "hidden");
		//DAO.INSTANCE.addEtiquetaAtributo("figure", "id");
		//DAO.INSTANCE.addEtiquetaAtributo("figure", "inert");
		//DAO.INSTANCE.addEtiquetaAtributo("figure", "lang");
		//DAO.INSTANCE.addEtiquetaAtributo("figure", "spellcheck");
		//DAO.INSTANCE.addEtiquetaAtributo("figure", "style");
		//DAO.INSTANCE.addEtiquetaAtributo("figure", "tabindex");
		//DAO.INSTANCE.addEtiquetaAtributo("figure", "title");
		//DAO.INSTANCE.addEtiquetaAtributo("figure", "translate");
		 
		
		//DAO.INSTANCE.addEtiquetaAtributo("figcaption", "accesskey");
		//DAO.INSTANCE.addEtiquetaAtributo("figcaption", "class");
		//DAO.INSTANCE.addEtiquetaAtributo("figcaption", "contenteditable");
		//DAO.INSTANCE.addEtiquetaAtributo("figcaption", "contextmenu");
		//DAO.INSTANCE.addEtiquetaAtributo("figcaption", "dir");
		//DAO.INSTANCE.addEtiquetaAtributo("figcaption", "draggable");
		//DAO.INSTANCE.addEtiquetaAtributo("figcaption", "dropzone");
		//DAO.INSTANCE.addEtiquetaAtributo("figcaption", "hidden");
		//DAO.INSTANCE.addEtiquetaAtributo("figcaption", "id");
		//DAO.INSTANCE.addEtiquetaAtributo("figcaption", "inert");
		//DAO.INSTANCE.addEtiquetaAtributo("figcaption", "lang");
		//DAO.INSTANCE.addEtiquetaAtributo("figcaption", "spellcheck");
		//DAO.INSTANCE.addEtiquetaAtributo("figcaption", "style");
		//DAO.INSTANCE.addEtiquetaAtributo("figcaption", "tabindex");
		//DAO.INSTANCE.addEtiquetaAtributo("figcaption", "title");
		//DAO.INSTANCE.addEtiquetaAtributo("figcaption", "translate");
		
		//DAO.INSTANCE.addEtiquetaAtributo("div", "accesskey");
		//DAO.INSTANCE.addEtiquetaAtributo("div", "class");
		//DAO.INSTANCE.addEtiquetaAtributo("div", "contenteditable");
		//DAO.INSTANCE.addEtiquetaAtributo("div", "contextmenu");
		//DAO.INSTANCE.addEtiquetaAtributo("div", "dir");
		//DAO.INSTANCE.addEtiquetaAtributo("div", "draggable");
		//DAO.INSTANCE.addEtiquetaAtributo("div", "dropzone");
		//DAO.INSTANCE.addEtiquetaAtributo("div", "hidden");
		//DAO.INSTANCE.addEtiquetaAtributo("div", "id");
		//DAO.INSTANCE.addEtiquetaAtributo("div", "inert");
		//DAO.INSTANCE.addEtiquetaAtributo("div", "lang");
		//DAO.INSTANCE.addEtiquetaAtributo("div", "spellcheck");
		//DAO.INSTANCE.addEtiquetaAtributo("div", "style");
		//DAO.INSTANCE.addEtiquetaAtributo("div", "tabindex");
		//DAO.INSTANCE.addEtiquetaAtributo("div", "title");
		//DAO.INSTANCE.addEtiquetaAtributo("div", "translate");
		
		
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
		at.setTipoAtributo("Contenido por default de la búsqueda para navegación por hipervinculo y formulario de presentación");
		DAO.INSTANCE.addAtributos(at);*/
		//et.getListIdAtributos().add(at.getIdAtributo());
		//et.setAtributo(atributo);
	//	DAO.INSTANCE.addEtiqueta(et);
		
		
	}
	
}
