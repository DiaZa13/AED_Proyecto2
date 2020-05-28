import java.util.ArrayList;

/**
 * 
 * @author Patitos.blogspot
 *
 */

public class Usuarios {

	private String correo;
	private String nombre;
	private String sexo;
	private String edad;
	private String telefono;
	private String oficio;
	private String lugarDeOficio;
	private String direccion;
	private ArrayList<Voluntariado> historial;
	 
	 /**
	  * constructor de Usuarios
	  */
	public Usuarios() {
		correo ="";
		nombre="";
		sexo="";
		edad="";
		telefono="";
		oficio="";
		lugarDeOficio="";
		direccion="";
		historial = new ArrayList<Voluntariado>();
		
	}


	/**
	 * agrega un voluntariado a la lista mediante parametros
	 * @param titulo
	 * @param tipo
	 * @param descripcion
	 * @param formaAyuda
	 * @param linkInformacion
	 * @param fechaPlanificada
	 */
	public void agregarVoluntariado (String titulo, String tipo, String descripcion, String formaAyuda, String linkInformacion,
	String fechaPlanificada) {
		historial.add(new Voluntariado(titulo, tipo, descripcion, formaAyuda, linkInformacion, fechaPlanificada));
		
		
	}
	
	/**
	 * @return the historial
	 */
	public ArrayList<Voluntariado> getHistorial() {
		return historial;
	}


	/**
	 * @param historial the historial to set
	 */
	public void setHistorial(ArrayList<Voluntariado> historial) {
		this.historial = historial;
	}


	/**
	 * @return the correo
	 */
	public String getCorreo() {
		return correo;
	}


	/**
	 * @param correo the correo to set
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}


	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * @return the sexo
	 */
	public String getSexo() {
		return sexo;
	}


	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	/**
	 * @return the edad
	 */
	public String getEdad() {
		return edad;
	}


	/**
	 * @param edad the edad to set
	 */
	public void setEdad(String edad) {
		this.edad = edad;
	}


	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}


	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	/**
	 * @return the oficio
	 */
	public String getOficio() {
		return oficio;
	}


	/**
	 * @param oficio the oficio to set
	 */
	public void setOficio(String oficio) {
		this.oficio = oficio;
	}


	/**
	 * @return the lugarDeOficio
	 */
	public String getLugarDeOficio() {
		return lugarDeOficio;
	}


	/**
	 * @param lugarDeOficio the lugarDeOficio to set
	 */
	public void setLugarDeOficio(String lugarDeOficio) {
		this.lugarDeOficio = lugarDeOficio;
	}


	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}


	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	@Override
	public String toString() {
		return "Usuarios [correo=" + correo + ", nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + ", telefono="
				+ telefono + ", oficio=" + oficio + ", lugarDeOficio=" + lugarDeOficio + ", direccion=" + direccion
				+ "]";
	}
	
	

	
	
}
