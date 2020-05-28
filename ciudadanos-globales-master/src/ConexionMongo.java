import java.util.ArrayList;

import org.bson.Document;
//import org.bson.types.ObjectId;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.FindOneAndUpdateOptions;
/**
 * 
 * @author POO ciudadanos Globales
 * @version 16-10-2019
 * 
 *
 */

public class ConexionMongo {
	
	private MongoClient mongoClient;
	private MongoDatabase mongoDatabase;
	private MongoCollection<Document> usuarios;
	private MongoCollection<Document> eventos;
	
	public ConexionMongo() {
		try {
			MongoClientURI uri = new MongoClientURI("mongodb://uw5ojpaux3bf57fp6erq:fICQZnV06bs0pc2rjG5u@bfdynpjwccofkyr-mongodb.services.clever-cloud.com:27017/bfdynpjwccofkyr");
			mongoClient = new MongoClient(uri);
			mongoDatabase = mongoClient.getDatabase("bfdynpjwccofkyr");
			usuarios = mongoDatabase.getCollection("Usuarios");
			eventos = mongoDatabase.getCollection("Eventos");

			} catch (Exception e) {	
		}
	}
	
	
	
	/**
	 * busca los titulos del Historial de la persona por su correo
	 * @param correo de la persona
	 * @return lista separada por '@@@' para ser procesada en controlador
	 */
	public String obtenerTituloHistorial(String correo) {
		
		BasicDBObject searchQuery = new BasicDBObject();
		searchQuery.put("correo", correo);
		String titulos = "";
		FindIterable<Document> cursor = usuarios.find(searchQuery);
		for(Document doc : cursor) {
			titulos = doc.getString("tituloHistorial");
		}
		return titulos;		
	}
	
	
	/**
	 * busca las fechas correspondientes con del Historial de la persona por su correo
	 * @param correo de la persona
	 * @return lista separada por '@@@' para ser procesada en controlador
	 */
	public String obtenerFechasHistorial(String correo) {
		
		BasicDBObject searchQuery = new BasicDBObject();
		searchQuery.put("correo", correo);
		String fechas = "";
		FindIterable<Document> cursor = usuarios.find(searchQuery);
		for(Document doc : cursor) {
			fechas = doc.getString("fechasHistorial");
		}
		return fechas;		
	}
	
	
	/**
	 * Se inserta un nuevo Usuario en la base de datos llamada Usuario
	 * actualizacion: se agregaron nuevos parametros, edad, telefono, oficio, lugar de oficio y direccion
	 * @param correo
	 * @param contrasena
	 * @param nombre
	 * @param sexo
	 * @param cumpleanios
	 */
	public void crearNuevoUsuario(String correo, String contrasena, String nombre, String sexo, String edad, String telefono, String oficio, String lugarDeOficio, String direccion) {
		Document document = new Document();
		document.put("correo", correo);
		document.put("contrasena", contrasena);
		document.put("nombre", nombre);
		document.put("sexo", sexo);
		document.put("edad", edad);
		document.put("telefono", telefono);
		document.put("oficio", oficio);
		document.put("lugarDeOficio", lugarDeOficio);
		document.put("direccion", direccion);
		document.put("fechasHistorial", "");
		document.put("tituloHistorial", "");
		
		//document.put("_id_extra", new ObjectId("5ae350f51c525d2e4439f80f") );
		usuarios.insertOne(document);
	}
	
	public void cambiarContrasena(String correo, String nuevaContrasena) {
		
		Document filtro = new Document("correo", correo);
		Document cambiosAPoner = new Document();
		
		if(usuarios.find(filtro).first() != null) {
			cambiosAPoner.put("contrasena", nuevaContrasena);
			Document cambios = new Document("$set", cambiosAPoner);

			usuarios.findOneAndUpdate(filtro, cambios);
		}
	}
	
	/**
	 * Se busca al usuario por su correo y con esto se devuelven los datos asociados al correo
	 * @param correo con el cual se le va a buscar en la base de datos
	 * @return Array de Strings Con los datos del usuario que hizo LOGIN, en posiciones 0 correo, 1 nombre, 2 sexo, 3 edad, 4 telefono, 5 oficio, 6 lugar de oficio, 7 direccion
	 */
	public String[] obtenerDatosUsuario(String correo) {
		BasicDBObject searchQuery = new BasicDBObject();
		searchQuery.put("correo", correo);
		FindIterable<Document> cursor = usuarios.find(searchQuery);
		String correoU="";
		String nombreU="";
		String sexoU="";
		String edadU="";
		String telefonoU="";
		String oficioU="";
		String lugarDeOficioU="";
		String direccionU="";
		
		for(Document doc : cursor) {
		 correoU = doc.getString("correo");
		 nombreU = doc.getString("nombre");
		 sexoU = doc.getString("sexo");
		 edadU = doc.getString("edad");
		 telefonoU = doc.getString("telefono");
		 oficioU = doc.getString("oficio");
		 lugarDeOficioU = doc.getString("lugarDeOficio");
		 direccionU = doc.getString("direccion");
		}
		
		String [] usuario = new String[8];
		usuario[0] = correoU;
		usuario[1] = nombreU;
		usuario[2] = sexoU;
		usuario[3] = edadU;
		usuario[4] = telefonoU;
		usuario[5] = oficioU;
		usuario[6] = lugarDeOficioU;
		usuario[7] = direccionU;
		
		return usuario;
	}
	
	/**
	 * 
	 * @param correo
	 * @param contrasena
	 * @return true si el correo y la contrasena coincide
	 */
	public boolean verificarLogin(String correo, String contrasena) {
		boolean resultado = false;
		BasicDBObject searchQuery = new BasicDBObject();
		searchQuery.put("correo", correo);
		String verificadorCorreo = "";
		String verificadorContrasena = "";
		FindIterable<Document> cursor = usuarios.find(searchQuery);
		for(Document doc : cursor) {
			verificadorCorreo = doc.getString("correo");
			verificadorContrasena = doc.getString("contrasena");
		}
		if (verificadorCorreo.equals(correo) && verificadorContrasena.equals(contrasena)) {
			resultado = true;
		}
		return resultado;
	}
	
	/**
	 * 
	 * verifica si el correo existe
	 * @param correo
	 * @return true si el correo existe y false si el orreo es inexistente
	 */
	public boolean verificarCorreo(String correo) {
		boolean resultado = false;
		BasicDBObject searchQuery = new BasicDBObject();
		searchQuery.put("correo", correo);
		String verificadorCorreo = "";
		FindIterable<Document> cursor = usuarios.find(searchQuery);
		for(Document doc : cursor) {
			verificadorCorreo = doc.getString("correo");
		}
		if (verificadorCorreo.equals(correo)) {
			resultado = true;
		}
		
		return resultado;
	}
	
	/**
	 * Este envia la contrasena del correo
	 * @param correo
	 * @return
	 */
	public String enviarPassword(String correo) {
		
		BasicDBObject searchQuery = new BasicDBObject();
		searchQuery.put("correo", correo);
		String contrasena = "";
		FindIterable<Document> cursor = usuarios.find(searchQuery);
		for(Document doc : cursor) {
			contrasena = doc.getString("contrasena");
		}
		
		
		return contrasena;
		
	}
			
	
	public String[] returnDatosEventos() {
		ArrayList<String> allEvents = new ArrayList<String>(); 
		FindIterable<Document> cursor = eventos.find();
		String actualDoc = new String();
		for (Document document : cursor) {
			actualDoc = document.getString("titulo");
			actualDoc += "@@@" + document.getString("tipo");
			actualDoc += "@@@" + document.getString("descripcion");
			actualDoc += "@@@" + document.getString("formaAyuda");
			actualDoc += "@@@" + document.getString("linkInformacion");
			
			allEvents.add(actualDoc);
		}
		
		String[] datos = new String[ allEvents.size() ] ;
		
		for (int i = 0; i < allEvents.size(); i++) {
			datos[i] = allEvents.get(i);
		}
		
		return datos;
	}
	
	public void cambiarFechasHistorial(String correo, String nuevasFechasHistorial) {
			
			Document filtro = new Document("correo", correo);
			Document cambiosAPoner = new Document();
			
			cambiosAPoner.put("fechasHistorial", nuevasFechasHistorial);
			Document cambios = new Document("$set", cambiosAPoner);
			
			FindOneAndUpdateOptions options = new FindOneAndUpdateOptions();
			//options.returnDocument(ReturnDocument.AFTER);
			//options.upsert(true);
			
			usuarios.findOneAndUpdate(filtro, cambios, options);
		}
	
	public void cambiarFechasUsuario(String correo, String nuevasFechasHistorial, String nuevosTitulosHistorial) {
		
		Document filtro = new Document("correo", correo);
		Document cambiosAPoner = new Document();
		
		cambiosAPoner.put("fechasHistorial", nuevasFechasHistorial);
		cambiosAPoner.put("tituloHistorial", nuevosTitulosHistorial);
		
		Document cambios = new Document("$set", cambiosAPoner);
		
		FindOneAndUpdateOptions options = new FindOneAndUpdateOptions();
		//options.returnDocument(ReturnDocument.AFTER);
		//options.upsert(true);
		
		usuarios.findOneAndUpdate(filtro, cambios, options);
	}
	
	
	
	public void cambiarTituloHistorial(String correo, String nuevosTitulosHistorial) {
			
			Document filtro = new Document("correo", correo);
			Document cambiosAPoner = new Document();
			
			cambiosAPoner.put("tituloHistorial", nuevosTitulosHistorial);
			Document cambios = new Document("$set", cambiosAPoner);
			
			FindOneAndUpdateOptions options = new FindOneAndUpdateOptions();
			//options.returnDocument(ReturnDocument.AFTER);
			//options.upsert(true);
			
			usuarios.findOneAndUpdate(filtro, cambios, options);
		}
	

}
