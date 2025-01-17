package entidadesLab;

import java.util.Arrays;
import java.util.Date;

public class Profesor extends Empleado{
	private String[] cursos;
	
	//CONSTRUCTORES
	public Profesor() {
		super();
	}
	public Profesor(String nombre, String apellido, Documento documento, Date fechaNacimiento, 
			Date fechaCargo, Float sueldo, String[] cursos) {
		super(nombre, apellido, documento, fechaNacimiento, fechaCargo, sueldo);
		this.cursos = cursos;
	}

	@Override
	public String toString() {
		return "Profesor [toString() =" + super.toString()+ " cursos=" + Arrays.toString(cursos) + "]";
	}
	@Override
	public String mostrarTipoPersona() {		
		return getNombre() + " " + getApellido() + " es profesor.";
		
		
	// GETTERS Y SETTERS
	}
	public String[] getCursos() {
		return cursos;
	}
	public void setCursos(String[] cursos) {
		this.cursos = cursos;
	}
	
	
	     // MÉTODOS IMPLEMENTADOS (INTERFACE-->PERSONA-->PROFESOR)
	@Override
	public void guardar() {
		System.out.println("Se ha guardado correctamente el Profesor");	
	}
	@Override
	public void eliminar() {
		System.out.println("Se ha eliminado correctamente el Profesor");	
	}
	@Override
	public void modificar() {
		System.out.println("Se ha modificado correctamente el Profesor");
		
	}
	
	
}
