package entidadesLab;

import java.util.Date;

public abstract class Empleado extends Persona{
	private Date fechaCargo;
	private Float Sueldo;
	//CONSTRUCTORES
	public Empleado() {
		super();
	}
	public Empleado(String nombre, String apellido, Documento documento, Date fechaNacimiento, 
			Date fechaCargo, Float sueldo) {
		super(nombre, apellido, documento, fechaNacimiento);
		this.fechaCargo= fechaCargo;
		this.Sueldo= sueldo;	
	}
	@Override
	public String toString() {
		return "Empleado [ toString() = " + super.toString()+ ", fechaCargo=" + fechaCargo + ", Sueldo=" + Sueldo + "]";
	}
	
	// GETTERS Y SETTERS
	public Date getFechaCargo() {
		return fechaCargo;
	}
	public void setFechaCargo(Date fechaCargo) {
		this.fechaCargo = fechaCargo;
	}
	public Float getSueldo() {
		return Sueldo;
	}
	public void setSueldo(Float sueldo) {
		Sueldo = sueldo;
	}
	
	
	
		
		
		
	}


