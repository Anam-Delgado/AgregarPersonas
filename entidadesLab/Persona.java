package entidadesLab;

import java.util.Date;

import interfacesLab.Persistencia;

public abstract class Persona implements Persistencia {
	private String nombre;
	private String apellido;
	private Documento documento;
	private Date fechaNacimiento;	
//CONSTRUCTORES
	public Persona(){
		super();
	}	
	public Persona(String nombre, String apellido, Documento documento, Date fechaNacimiento){
		super();
	this.nombre = nombre;
	this.apellido = apellido;
	this.documento= documento;	
	this.fechaNacimiento= fechaNacimiento;
	}
		
	public abstract String mostrarTipoPersona();

	@Override
	public String toString() {
		return "Persona [nombre= " + nombre + ", apellido=" + apellido + ", documento=" + documento
				+ ", fecha de nacimiento=" + fechaNacimiento + "]";
	}
	
	// GETTERS Y SETTERS
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
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	
	
}
