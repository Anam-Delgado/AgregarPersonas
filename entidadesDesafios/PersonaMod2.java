package entidadesDesafios;

public class PersonaMod2 {		
	private String nombre;
	private String apellido;
	private Documento documento;
	
	public PersonaMod2(String nombre, String apellido, Documento documento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.documento = documento;
	}
	public PersonaMod2() {
	}	
	 
	@Override
	public String toString() {
		return "PersonaMod2 [nombre=" + nombre + ", apellido=" + apellido + ", documento=" + documento.getDatos() + "]";
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Documento getDocumento() {
		return documento;
	}
	public void setDocumento(Documento documento) {
		this.documento = documento;
	}
	
	 
	
	
	
}
