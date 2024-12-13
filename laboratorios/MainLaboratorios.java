package laboratorios;

import java.util.Date;
import java.util.Scanner;

import entidadesLab.Alumno;
import entidadesLab.Documento;
import entidadesLab.Profesor;

public class MainLaboratorios {

	private static Scanner teclado=new Scanner(System.in);
	
	public static void main(String[] args) {
/*1Se requiere un sistema que agregue a una lista y muestre la información de:
     - Empleados: Director, Profesor, Administrativo, Alumnos.
     - Atributos de Director: nombre, apellido, tipo y número de documento, fecha de nacimiento, fecha del cargo, carrera y sueldo. 
     - Atributos de Profesor: nombre, apellido, tipo y número de documento, fecha de nacimiento, fecha del cargo, sueldo, lista de cursos.
     - At. de Administrativo: nombre, apellido, tipo y número de documento, fecha de nacimiento, fecha del cargo, sueldo.
     - Atributos de Alumno:   nombre, apellido, tipo y número de documento, fecha de nacimiento, fecha de ingreso, lista de cursos.
 2. Mostrar todos los atributos a través del método toString.
 3. Debe existir un método en todas las clases que indique qué tipo de persona es y que muestre solo su nombre y apellido.
 4. Ingresar una lista de Alumnos y una lista de Profesores en dos vectores distintos.
 */				
		Scanner teclado=new Scanner(System.in);
		Alumno alumnos[];
		Profesor profesores[];
		
		System.out.println("***Ingreso de datos de Personas Laboratorio 3 ***");
		System.out.print("\n");
		System.out.println("Ingrese la cantidad de personas a cargar en el sistema:");
		int cantidadPersonas=teclado.nextInt();
		alumnos= new Alumno [cantidadPersonas];
		profesores= new Profesor[cantidadPersonas];
			
	
		for(int i=0; i<cantidadPersonas; i++) {
			System.out.println("Indique 1 si la persona es alumno y 2 si es profesor");
			int tipoPersona = teclado.nextInt();
			if (tipoPersona == 1) {
				alumnos[i] = agregarAlumno(i);
				System.out.println(alumnos[i].mostrarTipoPersona());
			}else {
				profesores[i]= agregarProfesor(i);
				System.out.println(profesores[i].mostrarTipoPersona());
			}
		}
			 
			teclado.close();	
	}
	
	     // M E T O D O S
	
	private static Alumno agregarAlumno(int indice) {

		System.out.println("Indique el nombre del alumno "+(indice+1)+":");
		String nombre= teclado.next();
		System.out.println("Indique apellido del alumno " +(indice+1)+":");
		String apellido= teclado.next();
		System.out.println("Indique el tipo de documento del alumno "+(indice+1)+":");
		String tipo= teclado.next();
		System.out.println("Indique el número de documento del alumno "+(indice+1)+":");
		Integer numero= teclado.nextInt();	
		System.out.println("Fecha de nacimiento del alumno:");
		Date fechaNacimiento= obtenerFecha();
		System.out.println("Indique la cantidad de cursos del alumno");
		int cantidadCursos= teclado.nextInt();
		String []cursos= agregarCursos(cantidadCursos);
				
		Alumno alumnoAuxiliar= new Alumno(nombre, apellido, new Documento(tipo, numero),fechaNacimiento,cursos);		
		return alumnoAuxiliar;
	}
	
	private static Profesor agregarProfesor(int indice) {
		System.out.println("Indique el nombre del profesor "+(indice+1)+":");
		String nombre= teclado.next();
		System.out.println("Indique apellido del profesor " +(indice+1)+":");
		String apellido= teclado.next();
		System.out.println("Indique el tipo de documento del profesor "+(indice+1)+":");
		String tipo= teclado.next();
		System.out.println("Indique el número de documento del profesor "+(indice+1)+":");
		Integer numero= teclado.nextInt();	
		System.out.println("Indique fecha de nacimiento del profesor"+(indice+1)+":");
		Date fechaNacimiento= obtenerFecha();
		System.out.println("Indique la fecha de cargo del profesor"+(indice+1)+":");
		Date fechaCargo = obtenerFecha();
		System.out.println("Indique el sueldo del profesor:"+(indice+1)+":");
		float sueldo = teclado.nextFloat();
		System.out.println("Indique la cantidad de curso del profesor:"+(indice+1)+":");
		int cantidadCursos= teclado.nextInt();
		String[] cursos = agregarCursos(cantidadCursos);
		
		Profesor profesorAuxiliar= new Profesor(nombre, apellido, new Documento(tipo, numero), fechaNacimiento, fechaCargo, sueldo, cursos);
		 
		return profesorAuxiliar;
	}
	
	 // Método simple y provisional para obtener fecha (deprecado)
	private static Date obtenerFecha() {
		System.out.println("Ingrese el año: ");
		int anio= teclado.nextInt();
		System.out.println("Ingrese el mes en número. Ej: 1 para Enero, 12 para Diciembre...");
		int mes= teclado.nextInt();
		System.out.println("Ingrese el día:"); 
		int dia= teclado.nextInt();
		
		return new Date(anio - 1900, mes - 1, dia);
		
	}
	private static String[] agregarCursos(int cantidad) {
		String[] cursos= new String[cantidad];
		
		for(int i=0; i<cantidad; i++) {
		System.out.println("Ingrese el curso"+ (i + 1) + " : ");
		cursos[i]= teclado.next(); 
		}
		return cursos;
	}
	
	
	
	
	
	
}
