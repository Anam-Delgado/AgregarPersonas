package entidadesLab;

import java.util.Arrays;
import java.util.Date;

public class Alumno extends Persona {
	private String[]cursos;
	
 //CONSTRUCTORES
	public Alumno() {
		super();
	}	
	public Alumno(String nombre, String apellido, Documento documento, Date fechaNacimiento, String[]cursos) {
		super(nombre, apellido,documento, fechaNacimiento);
		this.cursos = cursos;
	}

	
	@Override
	public String toString() {
		return "Alumno [toString()=" + super.toString() + ", cursos=" + Arrays.toString(cursos) + "]";
	}
	@Override
	public String mostrarTipoPersona() {
		return getNombre() +" "+ getApellido() + " es Alumno.";
	}
	
	
	// GETTERS Y SETTERS
	public String[] getCursos() {
		return cursos;
	}
	public void setCursos(String[] cursos) {
		this.cursos = cursos;
	}
	
	
	@Override
	public void guardar() {
		System.out.println("Se ha guardado correctamente el Alumno");	
	}
	@Override
	public void eliminar() {
		System.out.println("Se ha eliminado correctamente el Alumno");		
	}
	@Override
	public void modificar() {
		System.out.println("Se ha modificado correctamente el Alumno");
		
	}
	
	
}
