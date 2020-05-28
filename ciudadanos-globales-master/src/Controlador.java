
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Random;

import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

/**
 * 
 * @author Patitos.blogspot
 * @version 11-11-2019
 */
public class Controlador {
	private ConexionMongo base_datos;
	private Usuarios ciudadano;
	private ArrayList<Evento> eventos;
	
	public Controlador() {
		base_datos = new ConexionMongo();
		ciudadano = new Usuarios();
		eventos = new ArrayList<Evento>();
		
	}
	
	/**
	 * Da todos los eventos del historial
	 * @return historial con fechas
	 */
	public String todoHistorial() {
		String resultadoHistorial = "<html>";
		for (Evento evento : ciudadano.getHistorial()) {
			
				resultadoHistorial +="Titulo Evento: " + ((Voluntariado) evento).getTitulo()+", Fecha Planificada: " + ((Voluntariado) evento).getFechaPlanificada();
			
		}
		resultadoHistorial += "<html>";
		return resultadoHistorial;
	}
	
	/**
	 * 
	 * @param titulo del evento buscado
	 * @return Array con la informacion del evento Buscado. 0 titulo, 1 Tipo de ods, 2 descripcion, 3 forma de ayudar, 4 link de informacion del evento
	 */
	public String[] informacionEvento(String titulo) {
		Evento eventoBuscado = new Evento();
		for (Evento evento : eventos) {
			if(evento.getTitulo().equals(titulo)) {
				eventoBuscado = evento;
			}
		}
		String[] datosEvento = new String[5];
		datosEvento[0] = eventoBuscado.getTitulo();
		datosEvento[1] = eventoBuscado.getTipo();
		datosEvento[2] = eventoBuscado.getDescripcion();
		datosEvento[3] = eventoBuscado.getFormaAyuda();
		datosEvento[4] = eventoBuscado.getLinkInformacion();
		
		return datosEvento;
	}
	
	
	/**
	 * agrega un voluntariado al ciudadano mediante la busqueda del titulo del evento
	 * @param fecha de compromiso
	 * @param titulo del evento
	 */
	public void agregarVoluntariado(String fecha, String titulo) {
		Evento compromiso = new Evento();
		for (Evento evento : eventos) {
			if(evento.getTitulo().equals(titulo)) {
				compromiso = evento;
			}
		}
		ciudadano.agregarVoluntariado(compromiso.getTitulo(), compromiso.getTipo(), compromiso.getDescripcion(), compromiso.getFormaAyuda(), compromiso.getLinkInformacion(), fecha);
	}
	
	/**
	 * Agrega todos los voluntariados pasados al historial del ciudadano
	 */
	public void loginParte3() {
		if(!base_datos.obtenerTituloHistorial(ciudadano.getCorreo()).equals("")) {
		String historial = base_datos.obtenerTituloHistorial(ciudadano.getCorreo());
		String fechas = base_datos.obtenerFechasHistorial(ciudadano.getCorreo());
		String[] listaHistorial = historial.split("@@@");
		String[] listaFechas = fechas.split("@@@");
		
		for (int i = 0; i < listaFechas.length; i++) {
			agregarVoluntariado(listaFechas[i],listaHistorial[i]);
		}
		}
	}
	
	/**
	 * Busca eventos en las fechas establecidas
	 * @param fechaBuscar (La fecha de la cual se quiere saber el historial)
	 * @return historial con fechas
	 */
	public String buscadorFechaHistorial(String fechaBuscar) {
		String resultadoHistorial = "<html>";
		for (Evento evento : ciudadano.getHistorial()) {
			if(((Voluntariado) evento).getFechaPlanificada().equals(fechaBuscar)){
				resultadoHistorial +="Titulo Evento: " + ((Voluntariado) evento).getTitulo()+", Fecha Planificada: " + ((Voluntariado) evento).getFechaPlanificada()+"<br>";
			}
		}
		resultadoHistorial += "<html>";
		return resultadoHistorial;
	}
	
	/**
	 * se guardanlos cambios al historial hechos durante la sesion, si no tiene datos el programa no hace accion alguna
	 */
	public void guardarCambiosVoluntariado() {
		if(ciudadano.getHistorial().size()>0) {
		String fechasHistorial = "";
		String titulosHistorial = "";
		for (int i = 0; i < ciudadano.getHistorial().size(); i++) {
			fechasHistorial += ciudadano.getHistorial().get(i).getFechaPlanificada();
			titulosHistorial += ciudadano.getHistorial().get(i).getTitulo();
			if(i< (ciudadano.getHistorial().size()-1)) {
				fechasHistorial +="@@@";
				titulosHistorial +="@@@";
			}
		}
		base_datos.cambiarFechasUsuario(ciudadano.getCorreo(), fechasHistorial, titulosHistorial);
		}
	}
	
	
	/**
	 * busca dentro del Array los eventos de tipo ods1 y los devuelve (los titulos)
	 * @return Array de String de los titulos de los ods 1
	 */
	public String[] getOds1() {
		ArrayList<String> eventosOds = new ArrayList<String>();  // ODS 1*********************************************
		for (Evento evento : eventos) {
			if (evento.getTipo().equals("ods1")) { 
				eventosOds.add(evento.getTitulo());
			}
		}
		
		String[] datos = new String[eventosOds.size()] ;
		
		for (int i = 0; i < eventosOds.size(); i++) {
			datos[i] = eventosOds.get(i);
		}
		return datos;
	}
	
	
	/**
	 * busca dentro del Array los eventos de tipo ods2 y los devuelve (los titulos)
	 * @return Array de String de los titulos de los ods 2
	 */
	public String[] getOds2() {
		ArrayList<String> eventosOds = new ArrayList<String>();  // ODS 2******************************************
		for (Evento evento : eventos) {
			if (evento.getTipo().equals("ods2")) {
				eventosOds.add(evento.getTitulo());
			}
		}
		
		String[] datos = new String[eventosOds.size()] ;
		
		for (int i = 0; i < eventosOds.size(); i++) {
			datos[i] = eventosOds.get(i);
		}
		return datos;
	}
	

	/**
	 * busca dentro del Array los eventos de tipo ods11 y los devuelve (los titulos)
	 * @return Array de String de los titulos de los ods 11
	 */
	public String[] getOds11() {
		ArrayList<String> eventosOds = new ArrayList<String>();  // ODS 11*******************************************
		for (Evento evento : eventos) {
			if (evento.getTipo().equals("ods11")) {
				eventosOds.add(evento.getTitulo());
			}
		}
		
		String[] datos = new String[eventosOds.size()] ;
		
		for (int i = 0; i < eventosOds.size(); i++) {
			datos[i] = eventosOds.get(i);
		}
		return datos;
	}
	
	/**
	 * busca dentro del Array los eventos de tipo ods14 y los devuelve (los titulos)
	 * @return Array de String de los titulos de los ods 14
	 */
	public String[] getOds14() {
		ArrayList<String> eventosOds = new ArrayList<String>();  // ODS 14 *********************************************
		for (Evento evento : eventos) {
			if (evento.getTipo().equals("ods14")) {
				eventosOds.add(evento.getTitulo());
			}
		}
		
		String[] datos = new String[eventosOds.size()] ;
		
		for (int i = 0; i < eventosOds.size(); i++) {
			datos[i] = eventosOds.get(i);
		}
		return datos;
	}
	
	/**
	 * busca dentro del Array los eventos de tipo ods15 y los devuelve (los titulos)
	 * @return Array de String de los titulos de los ods 15
	 */
	public String[] getOds15() {
		ArrayList<String> eventosOds = new ArrayList<String>();  // ODS 15*******************************************
		for (Evento evento : eventos) {
			if (evento.getTipo().equals("ods15")) {
				eventosOds.add(evento.getTitulo());
			}
		}
		
		String[] datos = new String[eventosOds.size()] ;
		
		for (int i = 0; i < eventosOds.size(); i++) {
			datos[i] = eventosOds.get(i);
		}
		return datos;
	}
	
	/**
	 * Agregua los eventos de la base de datos en el orden del constructor
	 */
	public void colocarEventos() {
		for (String evento : base_datos.returnDatosEventos()) {
			String[] words = evento.split("@@@");
			eventos.add(new Evento(words[0],words[1],words[2],words[3],words[4]));
			
		}
		getOds1();
	}
	
	/**
	 * Da un Array de los datos del usuario
	 * @return 0 Correo, 1 Nombre, 2 Sexo, 3 Edad, 4 Telefono, 5 Oficio, 6 Lugar de oficio/estudio, 7 Direccion de casa
	 */
	public String[] obtenerDatosUsuario(){
		String [] datosUsuarios = new String[8];
		
		datosUsuarios[0] = ciudadano.getCorreo();
		datosUsuarios[1] = ciudadano.getNombre();
		datosUsuarios[2] = ciudadano.getSexo();
		datosUsuarios[3] = ciudadano.getEdad();
		datosUsuarios[4] = ciudadano.getTelefono();
		datosUsuarios[5] = ciudadano.getOficio();
		datosUsuarios[6] = ciudadano.getLugarDeOficio();
		datosUsuarios[7] = ciudadano.getDireccion();
		return datosUsuarios;
	}
	
	/**
	 * LogIn de la aplicación
	 * @param correo
	 * @param contrasena
	 * @return true si logró iniciar sesión.
	 */
	public boolean login(String correo, String contrasena) {
		boolean verificacionLogin = base_datos.verificarLogin(correo, contrasena);
		if (verificacionLogin) {
			ciudadano = loginParte2(correo);
			colocarEventos();
			loginParte3();
		}
		
		return verificacionLogin;
	
		
	}
	/**
	 * este metodo servira para hacer un Logout de nuestra aplicacion  y reiniciar los datos del usuario
	 * 
	 */
	public void logout() {
		guardarCambiosVoluntariado();
		ciudadano = new Usuarios();
		eventos = new ArrayList<Evento>();
	}
	
	/**
	 * Hace un Set de todos los atributos de Usuario con el Array de sus datos
	 * @param correo es el correo del usuario
	 */
	public Usuarios  loginParte2(String correo) {
		String[] datosUsuario = base_datos.obtenerDatosUsuario(correo);
		Usuarios ciudadanos = new Usuarios();
		ciudadanos.setCorreo(datosUsuario[0]);
		ciudadanos.setNombre(datosUsuario[1]);
		ciudadanos.setSexo(datosUsuario[2]);
		ciudadanos.setEdad(datosUsuario[3]);
		ciudadanos.setTelefono(datosUsuario[4]);
		ciudadanos.setOficio(datosUsuario[5]);
		ciudadanos.setLugarDeOficio(datosUsuario[6]);
		ciudadanos.setDireccion(datosUsuario[7]);
		 
		return ciudadanos;
		
	}
	
	/**
	 * Crea un nuevo usuario en la base de datos. PRECAUCIÓN: Envía un correo de una vez
	 * @param correo
	 * @param contrasena
	 * @param nombre
	 * @param sexo
	 * @param cumpleanios
	 * @return true si se creó exitosamente
	 */
	public boolean crearNuevoUsuario(String correo, String contrasena, String nombre, String sexo, String cumpleanios,String telefono, String oficio,String lugarOficio, String direccion) {
		boolean yaExiste = false;
		if(!base_datos.verificarCorreo(correo)) {
			base_datos.crearNuevoUsuario(correo, contrasena, nombre, sexo, cumpleanios,telefono,oficio,lugarOficio, direccion);
			EnviarCorreo("mis.proyectos.universitarios.api@gmail.com", "Hola " + nombre + ",\nte damos la bienvenida de parte del equipo de desarrolladores. ¡Esperamos que puedas ayudar a todos!", correo, "¡Bienvenido a Ciudadanos Globales!", "duilfhuspaazxfzk");
			yaExiste = true;
		}
			
		
		return yaExiste;
	}
	
	public void enviarPassword (String correo) {
			EnviarCorreo("mis.proyectos.universitarios.api@gmail.com", "Hola tu nueva contrasena es: " + base_datos.enviarPassword(correo), correo, "Recuperacion de contrasena", "duilfhuspaazxfzk");
	}
	
	public void cambiarContrasena(String correo, String contrasena) {
		base_datos.cambiarContrasena(correo, contrasena);
		enviarPassword(correo);
	}
	
	public void nuevaContrasena(String correo) {
		String abecedario = "abcdefghijklmnopqrstuvwxyz0123456789";
		char[] letras = new char[7]; // length is bounded by 7
		Random r = new Random();
		for (int i = 0; i < letras.length; i++) {
			letras[i] = abecedario.charAt(r.nextInt(abecedario.length()));
		}
	    
		String contrasena = new String(letras);
		
		base_datos.cambiarContrasena(correo, contrasena);
		enviarPassword(correo);
	}
	
	/**
	 * @param UsuarioCorreo: correo de la institución
	 * @param mensaje: que enviara por correo
	 * @param destino: la persona (correo)
	 * @param asunto: asunto del correo
	 * @param contrasenia: Contraseña del correo de la institución
	 * @return un String mensaje que indica si se envi� correctamente el correo
	 */
	//EJEMPLO DE LOS PARAMETROS QUE RECIBE LA FUNCION
	/*
	 * 	String UsuarioCorreo = "mis.proyectos.universitarios.api@gmail.com"; //el correo de la empresa
		String mensaje = "FUNCIONA"; // el mensaje que llevara el correo
		String destino = "mar19340@uvg.edu.gt"; // a quien deseas que se envie el correo
		String asunto = "Proyecto POO"; // el asunto del correo
		String contrasenia = "kjh"; // Contrasgenia del correo 
	 */
	public String EnviarCorreo(String UsuarioCorreo, String mensaje, String destino, String asunto, String contrasenia) {

		
		try {
			
			Properties p = new Properties();
			
			p.put("mail.smtp.host", "smtp.gmail.com");  //El servidor SMTP de Google
			p.setProperty("mail.smtp.starttls.enable", "true"); //Para conectar de manera segura al servidor SMTP
			p.setProperty("mail.smtp.port", "587"); //El puerto SMTP seguro de Google
			p.setProperty("mail.smtp.user", UsuarioCorreo);
			p.setProperty("mail.smtp.auth", "true"); 
			
			Session sesion = Session.getDefaultInstance(p, null);
			BodyPart texto = new MimeBodyPart();
			texto.setText(mensaje);
			
			MimeMultipart m = new MimeMultipart();
			m.addBodyPart(texto);
			
			MimeMessage mes = new MimeMessage(sesion);
			mes.setFrom(new InternetAddress(UsuarioCorreo));
			mes.addRecipient(Message.RecipientType.TO, new InternetAddress(destino));
			mes.setSubject(asunto);
			mes.setContent(m);
			
			Transport t = sesion.getTransport("smtp");
			t.connect(UsuarioCorreo, contrasenia);
			t.sendMessage(mes, mes.getAllRecipients());
			t.close();
			return "Exitoso";
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("La verdad no sé si debería funcionar o no pero se envió");
			return "Error"+e;
			
		}
	}
	//
		/**
		 * ESTA FUNCIÓN ES PARA VALILDAR TARJETA
		 * @param numTarjeta: es el número de la tarjeta desde el texfield
		 * @return String que indica si la tarjeta es valida o no
		 */
		
		public String ComprobarTarjeta(String numTarjeta){
			
			
			long num = 0;
			String x = "";
			
			//Por si el usuario no ingresa numeros
			
			try{
				//convertir de String (texfield) a long
				num = Long.parseLong(numTarjeta);
			}catch (Exception e){
				x = "Porfavor ingrese unicamente numeros";
			}
			
			//long x = 4908254912939483L;
			
			long numeroTarjeta = num;
			
			String cadena = Long.toString(num);
			int g = 0;
			char [] cadena_div = numTarjeta.toCharArray();
			String n = "";
			for (int i = 0; i < cadena_div.length; i++){
				if (Character.isDigit(cadena_div[i])){
					g++;
				}
			}
			
			
			if (g > 16) {
				x =  "Por favor ingrese un numero de 16 digitos";
			}else {
				
				
				long suma = 0;
				
				int b = 0;
				
				//Crear un array con la cantida de digitos de la tarjeta
				long[] digitosTarjeta = new long[16];
				//Crear un array con la cantida de digitos del 0 al 9
				long[] buscarD = new long[10];
				//Definir mi primer elemento
				buscarD[0] = 0;
				long c = 9;		
				
				
				//Asignar cada digito de la tarjeta ingresada a una casilla del array	
				int i = 15;
				while (numeroTarjeta > 0) {
					digitosTarjeta[i] = numeroTarjeta%10;
					numeroTarjeta = numeroTarjeta / 10;
					i--;
					b ++;
				}
				
				//Solo si el usuario ingresa la cantidad de numeros adecuados
				if (b == 16){
					
					//suma los numeros mayores a 4 que están en las casillas 0, 2, 4... (menos la ultima posicion)
					for (int k = 0; k < 15; k = k+2){
						if (digitosTarjeta[k] > 4){
							suma += 1;
							
						}
					}
					
					//Multiplica por 2 los numeros que estan en las casillas 0, 2, 4... (menos la ultima posicion)
					for (int h = 0; h < 15; h = h+2){
						digitosTarjeta[h] = digitosTarjeta[h]*2;
					}
					
					//suma los digitos de los numeros del nuevo array
					for(int j=0; j < 15; j++){
						suma = suma + digitosTarjeta[j];
					}
					
					// determina el ultimo digito del total de la suma
					while (suma > 9) {
					suma = suma%10;
					}
					

					
					
					//Crea un array list {0,9,8....1}
					for (int l = 1; l < buscarD.length; l++){
						buscarD[l] = c;
						c --;
						
						//System.out.println(buscarD[9]);
					}
					
					//convertir de long a int
					int sumaF =(int)suma;  
					System.out.println(suma);
					//System.out.println(buscarD[sumaF]);		
					
					// identifica 
					if (buscarD[sumaF] == digitosTarjeta[15]){
						x = "Su tarjeta es valida";
					}else{
						x = "Porfavor ingrese un numero de tarjeta valido";
					}
					//System.out.println(x);
					//return x			
						
				}
				
				
				
				
				// Si el usuario ingresa mas o menos digitos de los requeridos
				if (b < 16 || g > 16){
					x = "Por favor ingrese un numero de 16 digitos";
				}
				//Si el usuario no ingresa numeros
				if (b == 0){
					x = "Por favor ingrese unicamente numeros";
				}
				
				//System.out.println(x);
		
				
			}
			
			return x;
			
		}
		

		 
		/*
		--------ISTRUCCIONES
		DONDE APARECEN NUESTROS 5 ODS (contiene info de los todos los ODS), https://www.un.org/sustainabledevelopment/es/objetivos-de-desarrollo-sostenible/
		Tambien cuando seleccione el boton mostrar: https://youtu.be/ohLKueD1iaM
		
		1 Pobreza: https://www.un.org/sustainabledevelopment/es/poverty/
		2 Hambre: https://www.un.org/sustainabledevelopment/es/hunger/
		11 Sostenible: https://www.un.org/sustainabledevelopment/es/cities/
		14 Submarina: https://www.un.org/sustainabledevelopment/es/oceans/
		15 Econsistemas: https://www.un.org/sustainabledevelopment/es/biodiversity/
		*/
		 /**
		 * Con una URL, se abre una p�gina web
		 * @param URL: el link de la p�gina web 
		 * 
		 */
		public void MostrarPaginaWeb(String URL){
		           if (java.awt.Desktop.isDesktopSupported()) {
		            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();

		            if (desktop.isSupported(java.awt.Desktop.Action.BROWSE)) {
		                try {
		                    java.net.URI uri = new java.net.URI(URL);
		                    desktop.browse(uri);
		                } catch (URISyntaxException | IOException ex) {
		                }
		            }
		        }
		    }
	

}



