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
		at.setTipoAtributo("título de una tabla/alineacion");
		at.setNombre("alink");
		at.setTipoAtributo("color de vínculos seleccionados");
		at.setNombre("allowfullscreen");
		at.setTipoAtributo("Si se debe permitir que el contenido de un iframe utilice requestFullscreen()");
		at.setNombre("alt");
		at.setTipoAtributo("descripción corta");
		at.setNombre("async");
		at.setTipoAtributo("Ejecuta un script asincrono.");
		at.setNombre("autocomplete");
		at.setTipoAtributo("Configuración por default para la función de relleno automático en el formulario.");
		at.setNombre("autofocus");
		at.setTipoAtributo("Enfoca automáticamente el formulario al recargar una página.");
		at.setNombre("autoplay");
		at.setTipoAtributo("Indicio de que el archivo media puede reproducirse automáticamente al cargar la página.");
		at.setNombre("border");
		at.setTipoAtributo("Ancho y tipo de borde");
		at.setNombre("challenge");
		at.setTipoAtributo("Cadena para empaquetar la llave pública generada y firmada.");
		at.setNombre("charset");
		at.setTipoAtributo("codificación de caracteres del recurso vinculado");
		at.setNombre("checked");
		at.setTipoAtributo("para radiobotones y casillas de verificación");
		at.setNombre("cite");
		at.setTipoAtributo("Link hacia el recurso de la cita o más información sobre el texto.");
		at.setNombre("class");
		at.setTipoAtributo("lista de clases separadas por espacios");
		at.setNombre("cols");
		at.setTipoAtributo("lista de longitudes, por defecto: 100% (1 col)");
		at.setNombre("colspan");
		at.setTipoAtributo("número de columnas abarcado por celda");
		at.setNombre("command");
		at.setTipoAtributo("Definición del comando");
		at.setNombre("content");
		at.setTipoAtributo("información asociada");
		at.setNombre("contenteditable");
		at.setTipoAtributo("Si el elemento es editable");
		at.setNombre("contextmenu");
		at.setTipoAtributo("El menú contextual de los elementos.");
		at.setNombre("controls");
		at.setTipoAtributo("Mostrar los controles de agente de usuario");
		at.setNombre("coords");
		at.setTipoAtributo("lista de longitudes separadas por coma/para usar con mapas de imágenes en el cliente");
		at.setNombre("crossorigin");
		at.setTipoAtributo("Como el elemento maneja las peticiones crossorigin");
		at.setNombre("data");
		at.setTipoAtributo("referencia a datos del objeto");
		at.setNombre("datetime");
		at.setTipoAtributo("fecha y hora del cambio");
		at.setNombre("default");
		at.setTipoAtributo("Marca un comando como comando por defecto.");
		at.setNombre("defer");
		at.setTipoAtributo("El AU puede retrasar la ejecución del script");
		at.setNombre("dir");
		at.setTipoAtributo("dirección de texto débil/neutral");
		at.setNombre("dirname");
		at.setTipoAtributo("Nombre del campo a usar para mandar la direccionalidad de los elementos en el envío del formulario.");
		at.setNombre("disabled");
		at.setTipoAtributo("no disponible en este contexto");
		at.setNombre("download");
		at.setTipoAtributo("Si el recurso se debe descargar en lugar de navegar en él, y el nombre del mismo en ese caso.");
		at.setNombre("draggable");
		at.setTipoAtributo("Si el recurso se puede arrastrar.");
		at.setNombre("dropzone");
		at.setTipoAtributo("Tipos de ítems aceptados para arrastrar y soltar");
		at.setNombre("enctype");
		at.setTipoAtributo("Tipo de codificación del conjunto de datos del formulario a utilizar para el envío de formularios");
		at.setNombre("for");
		at.setTipoAtributo("Asocia la etiqueta con el control del formulario.");
		at.setNombre("form");
		at.setTipoAtributo("Asocia el control con un elemento del formulario.");
		at.setNombre("formaction");
		at.setTipoAtributo("URL a usar para el envío del formulario.");
		at.setNombre("formenctype");
		at.setTipoAtributo("Tipo de codificación del conjunto de datos del formulario a utilizar para el envío de formularios.");
		at.setNombre("formmethod");
		at.setTipoAtributo("Método HTTP a usar para el envío del formulario.");
		at.setNombre("formnovalidate");
		at.setTipoAtributo("Validación de control de formulario de derivación para el envío de formularios");
		at.setNombre("formtarget");
		at.setTipoAtributo("Contexto de navegación para el envío del formulario.");
		at.setNombre("headers");
		at.setTipoAtributo("El encabezado de las celdas");
		at.setNombre("height");
		at.setTipoAtributo("Dimension vertical.");
		at.setNombre("hidden");
		at.setTipoAtributo("Si el elemento es relevante.");
		at.setNombre("high");
		at.setTipoAtributo("Límite menor de un rango alto.");
		at.setNombre("hreflang");
		at.setTipoAtributo("Lenguaje del recurso con el link.");
		at.setNombre("http-equiv");
		at.setTipoAtributo("Directiva pragma.");
		at.setNombre("id");
		at.setTipoAtributo("El id de los elementos.");
		at.setNombre("isamp");
		at.setTipoAtributo("Si la imagen es un mapa de imagen del lado del servidor.");
		at.setNombre("keytype");
		at.setTipoAtributo("El tipo de clave criptográfica para generar.");
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
		at.setTipoAtributo("Límite mayor de un rango alto.");
		at.setNombre("manifest");
		at.setTipoAtributo("Manifiesto de la caché de aplicaciones.");
		at.setNombre("max");
		at.setTipoAtributo("Valor máximo.");
		at.setNombre("maxlength");
		at.setTipoAtributo("Valor de longitud máxima.");
		at.setNombre("media");
		at.setTipoAtributo("Media aplicable.");
		at.setNombre("mediagroup");
		at.setTipoAtributo("Grupos de elementos multimedia con un Mediacontroller implícito.");
		at.setNombre("method");
		at.setTipoAtributo("Método HTTP para el envío del formulario.");
		at.setNombre("min");
		at.setTipoAtributo("Valor mínimo.");
		at.setNombre("minlength");
		at.setTipoAtributo("Valor mínimo de longitud.");
		at.setNombre("multiple");
		at.setTipoAtributo("Si permite múltiples valores.");
		at.setNombre("muted");
		at.setTipoAtributo("Si el elemento multimedia va a ser silenciado por defecto.");
		at.setNombre("name");
		at.setTipoAtributo("Nombre del control del formulario a usar para el envío del formulario  y en el API de los form.elements");
		at.setNombre("novalidate");
		at.setTipoAtributo("Validación de control de formulario de derivación para el envío de formularios");
		at.setNombre("open");
		at.setTipoAtributo("Si los detalles son visibles.");
		at.setNombre("optimum");
		at.setTipoAtributo("Valor óptimo para una medición.");
		at.setNombre("pattern");
		at.setTipoAtributo("Patrón para ser igualado al valor del formulario.");
		at.setNombre("placeholder");
		at.setTipoAtributo("Etiqueta visible localizada con el formulario.");
		at.setNombre("poster");
		at.setTipoAtributo("Marco para mostrar antes de la reproducción del video.");
		at.setNombre("preload");
		at.setTipoAtributo("Indicio de cuanto búfer necesitará preferentemente el recurso multimedia.");
		at.setNombre("readonly");
		at.setTipoAtributo("Si se permitirá que el valor sea editado.");
		at.setNombre("rel");
		at.setTipoAtributo("Relación entre el documento que contiene el hipervínculo y el recurso destino.");
		at.setNombre("required");
//		at.setTipoAtributo("Si el control es requerido por el envío del documento.");
		at.setNombre("reversed");
		at.setTipoAtributo("Número de columnas hacia atrás.");
		at.setNombre("rows");
		at.setTipoAtributo("Número de líneas para mostrar.");
		at.setNombre("rowspan");
		at.setTipoAtributo("Número de filas que la celda va a abarcar.");
		at.setNombre("sandbox");
		at.setTipoAtributo("Caja de seguridad para contenido anidado.");
		at.setNombre("spellcheck");
		at.setTipoAtributo("Si se revisará la gramática del elemento.");
		at.setNombre("scope");
		at.setTipoAtributo("Especifica a que celdas del encabezado aplica.");
		at.setNombre("scoped");
		at.setTipoAtributo("Si el estilo aplica a todo el elemento o solo a una parte.");
		at.setNombre("seamless");
		at.setTipoAtributo("Si aplica el estilo del documento al contenido anidado.");
		at.setNombre("selected");
		at.setTipoAtributo("Si la opción será seleccionada por defecto.");
		at.setNombre("shape");
		at.setTipoAtributo("El tipo de forma que se creará en el mapa de la imagen.");
		at.setNombre("size");
		at.setTipoAtributo("Tamaño del control");
		at.setNombre("sizes");
		at.setTipoAtributo("Tamaño de los iconos");
		at.setNombre("span");
		at.setTipoAtributo("Número de columnas abarcadas por el elemento.");
		at.setNombre("src");
		at.setTipoAtributo("Dirección del recurso.");
		at.setNombre("srcdoc");
		at.setTipoAtributo("Un documento a hacer en el iframe.");
		at.setNombre("srclang");
		at.setTipoAtributo("Lenguaje del texto de la pista.");
		at.setNombre("start");
		at.setTipoAtributo("Valor ordinal del primer ítem.");
		at.setNombre("step");
		at.setTipoAtributo("Granularidad a ser igualada por el valor del formulario.");
		at.setNombre("style");
		at.setTipoAtributo("Instrucciones de presentación y formato.");
		at.setNombre("tabindex");
		at.setTipoAtributo("Si el elemento es enfocable y el orden relativo del elemento para el propósito de enfocar la navegación secuencial.");
		at.setNombre("title");
		at.setTipoAtributo("Información de aviso del elemento.");
		at.setNombre("translate");
		at.setTipoAtributo("Si el elemento debe ser traducido cuando la página es localizada.");
		at.setNombre("type");
		at.setTipoAtributo("Indicio del tipo de referencia del recurso.");
		at.setNombre("typemustmatch");
		at.setTipoAtributo("Si el tipo de atributo y el  valor del tipo del contenido necesita ser igual al recurso a usar.");
		at.setNombre("usemap");
		at.setTipoAtributo("Nombre del mapa de imagen a usar.");
		at.setNombre("value");
		at.setTipoAtributo("Valor a ser usado en el control del formulario.");
		at.setNombre("width");
		at.setTipoAtributo("Dimensión horizontal");
		at.setNombre("wrap");
		at.setTipoAtributo("Como el valor del control del formulario va a ser empaquetado para el envío del formulario.");*/
		
//		DAO.INSTANCE.addAtributos(at);
		
		/*	et.setNombre("!DOCTYPE");
		et.setTipoEtiqueta("");
		DAO.INSTANCE.addEtiqueta(et);
		et.setNombre("html");
		et.setTipoEtiqueta("Raíz del documento HTML O XHTML. Todos los demás elementos deben estar debajo de esté elemento");
		et.setNombre("head");
		et.setTipoEtiqueta("Colección de metadatos sobre el documento, enlaces, definiciones de scripts, y hojas de estilo");
		et.setNombre("title");
		et.setTipoEtiqueta("Define el título del documento, el cual se mostrará en la barra del navegador o en las pestañas de la página.");
		et.setNombre("meta");
		et.setTipoEtiqueta("Define la metadata que no puede ser definida usando otro elemento HTML");
		et.setNombre("style");
		et.setTipoEtiqueta("Permite al usuario introducir información de estilo en sus documentos.");
		et.setNombre("body");
		et.setTipoEtiqueta("Representa el contenido principal de un documento HTML.");
		et.setNombre("article");
		et.setTipoEtiqueta("Define contenido autónomo que podría existir independientemente del resto del contenido.");
		et.setNombre("section");
		et.setTipoEtiqueta("Define una sección en un documento.");
		et.setNombre("nav");
		et.setTipoEtiqueta("Define una sección que solamente contiene enlaces de navegación.");
		et.setNombre("aside");
		et.setTipoEtiqueta("Define algunos contenidos puesto aparte del resto del contenido de la página. Si es removido el contenido restante seguirá teniendo sentido.");
		et.setNombre("h1");
		et.setTipoEtiqueta("Un elemento de cabecera describe brevemente el tema de la sección que introduce.");
		et.setNombre("h2");
		et.setTipoEtiqueta("Un elemento de cabecera describe brevemente el tema de la sección que introduce.");
		et.setNombre("h3");
		et.setTipoEtiqueta("Un elemento de cabecera describe brevemente el tema de la sección que introduce.");
		et.setNombre("h4");
		et.setTipoEtiqueta("Un elemento de cabecera describe brevemente el tema de la sección que introduce.");
		et.setNombre("h5");
		et.setTipoEtiqueta("Un elemento de cabecera describe brevemente el tema de la sección que introduce.");*/
		et.setNombre("h6");
		et.setTipoEtiqueta("Un elemento de cabecera describe brevemente el tema de la sección que introduce.");
		DAO.INSTANCE.addEtiqueta(et);
		
		
		
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
