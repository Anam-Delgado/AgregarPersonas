package entidadesLab;

import java.util.Date;

public class Administrativo extends Empleado {
	
	public Administrativo() {
		super();
	}
	/**
	 * @param nombre
	 * @param apellido
	 * @param documento
	 * @param fechaNacimiento
	 * @param fechaCargo
	 * @param sueldo
	 */
	public Administrativo(String nombre, String apellido, Documento documento, Date fechaNacimiento, Date fechaCargo,
			Float sueldo) {
		super(nombre, apellido, documento, fechaNacimiento, fechaCargo, sueldo);
		
	}

   //  M O S C A  -  en el alumni es mas corto --> return "Administrativo [toString()=" + super.toString() + "]";
	@Override
	public String toString() {
		return "Administrativo [mostrarTipoPersona()=" + mostrarTipoPersona() + ", toString()=" + super.toString()
				+ ", getFechaCargo()=" + getFechaCargo() + ", getSueldo()=" + getSueldo() + ", getNombre()="
				+ getNombre() + ", getApellido()=" + getApellido() + ", getDocumento()=" + getDocumento()
				+ ", getFechaNacimiento()=" + getFechaNacimiento() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	@Override
	public String mostrarTipoPersona() {
		return getNombre() + " "+ getApellido() + "es Administrativo.";
	}
	
	@Override
	public void guardar() {
		System.out.println("Se ha guardado correctamente el Personal Administrativo");
	}
	@Override
	public void eliminar() {
		System.out.println("Se ha eliminado correctamente el Personal Administrativo");
	}
	@Override
	public void modificar() {
		System.out.println("Se ha modificado correctamente el Personal Administrativo");
	}

	
	
}
