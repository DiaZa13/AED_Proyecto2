/**
 * @author Patitos
 *
 */
public class Evento {
	protected String titulo;
	protected String tipo;
	protected String descripcion;
	protected String formaAyuda;
	protected String linkInformacion;
	
	/**
	 * constructor sin parametros del evento de la persona
	 */
	public Evento() {
		this.titulo = "";
		this.tipo = "";
		this.descripcion = "";
		this.formaAyuda = "";
		this.linkInformacion = "";
	}
	
	/**
	 * constructor con parametros de nueva clase de evento
	 * @param titulo
	 * @param tipo
	 * @param descripcion
	 * @param formaAyuda
	 * @param linkInformacion
	 */
	public Evento(String titulo, String tipo, String descripcion, String formaAyuda, String linkInformacion) {
		this.titulo = titulo;
		this.tipo = tipo;
		this.descripcion = descripcion;
		this.formaAyuda = formaAyuda;
		this.linkInformacion = linkInformacion;
	}
	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	/**
	 * @return the formaAyuda
	 */
	public String getFormaAyuda() {
		return formaAyuda;
	}
	/**
	 * @param formaAyuda the formaAyuda to set
	 */
	public void setFormaAyuda(String formaAyuda) {
		this.formaAyuda = formaAyuda;
	}
	/**
	 * @return the linkInformacion
	 */
	public String getLinkInformacion() {
		return linkInformacion;
	}
	/**
	 * @param linkInformacion the linkInformacion to set
	 */
	public void setLinkInformacion(String linkInformacion) {
		this.linkInformacion = linkInformacion;
	}
	
	
}
