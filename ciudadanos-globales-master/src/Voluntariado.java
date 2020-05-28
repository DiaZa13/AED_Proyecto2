/**
 * 
 * @author Patitos
 *
 */


public class Voluntariado extends Evento{
	
	private String fechaPlanificada;
	 
	/**
	 * Constructor que contiene al constructor defaut del padre con el parametro de la fecha de la hija
	 * @param fechaPlanificada para la cual se compromete el usuario a colaborar
	 */
	public Voluntariado(String fechaPlanificada) {
		super();
		this.fechaPlanificada = fechaPlanificada;
	}

	/**
	 * @return the fechaPlanificada
	 */
	public String getFechaPlanificada() {
		return fechaPlanificada;
	}

	
	
	/**
	 * constructor con parametros
	 * @param titulo
	 * @param tipo
	 * @param descripcion
	 * @param formaAyuda
	 * @param linkInformacion
	 * @param fechaPlanificada
	 */
	
	public Voluntariado(String titulo, String tipo, String descripcion, String formaAyuda, String linkInformacion,
			String fechaPlanificada) {
		super(titulo, tipo, descripcion, formaAyuda, linkInformacion);
		this.fechaPlanificada = fechaPlanificada;
	}

	
	
	/**
	 * @param fechaPlanificada the fechaPlanificada to set
	 */
	public void setFechaPlanificada(String fechaPlanificada) {
		this.fechaPlanificada = fechaPlanificada;
	}
	 
	
}