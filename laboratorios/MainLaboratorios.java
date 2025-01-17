package laboratorios;

import java.util.Date;
import java.util.Scanner;

import entidadesLab.Administrativo;
import entidadesLab.Alumno;
import entidadesLab.Director;
import entidadesLab.Documento;
import entidadesLab.Persona;
import entidadesLab.Profesor;
import excepcionesLab.ExcepcionPersona;
import interfacesLab.Constantes;

public class MainLaboratorios {

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		Persona[] personas;

		System.out.println("***Ingreso de datos de Personas Laboratorio ***");
		System.out.print("\n");
		System.out.println("Ingrese la cantidad de personas a cargar en el sistema:");
		int cantidadPersonas = teclado.nextInt();
		personas = new Persona[cantidadPersonas];

		for (int i = 0; i < personas.length; i++) {
			String nombre;
			String apellido;
			String tipo;
			Integer numero;
			Date fechaNacimiento;
			Date fechaCargo;
			int cantidadCursos;
			String carrera;
			Float sueldo;

			System.out.println("Indique el tipo de persona");
			System.out.println("1 - Alumno.");
			System.out.println("2 - Director.");
			System.out.println("3 - Profesor.");
			System.out.println("4 - Administrativo.");
			System.out.println();
			int tipoPersona = teclado.nextInt();

			// objeto auxiliar
			Persona persona = null;

			System.out.println("Indique el nombre de la persona " + (i + 1) + ":");
			nombre = teclado.next();
			System.out.println("Indique el apellido de la persona " + (i + 1) + " :");
			apellido = teclado.next();

			while (true) {
				System.out.println("Ingrese el tipo de documento de la persona " + (i + 1) + ":");
				tipo = teclado.next();
				try {
					boolean documentoCorrecto = false;

					for (int j = 0; j < Constantes.tipoDocumento.length; j++) {
						if (tipo.equalsIgnoreCase(Constantes.tipoDocumento[j])) {
							documentoCorrecto = true;
							break;
						}
					}
					
					if (!documentoCorrecto) {
						throw new ExcepcionPersona(1);
					}else {
						break;
					}
					

				} catch (Exception e) {
					System.out.println(e.getMessage());
				}

			}

			System.out.println("Ingrese el número de documento de la persona " + (i + 1) + ":");
			numero = teclado.nextInt();
			System.out.println("Ingrese la fecha de nacimiento de la persona " + (i + 1) + ":");
			fechaNacimiento = obtenerFecha();

			switch (tipoPersona) {
			case 1: // Alumno
				System.out.print("Ingrese la cantidad de cursos de la Persona " + (i + 1) + ":");
				cantidadCursos = teclado.nextInt();
				persona = new Alumno(nombre, apellido, new Documento(tipo, numero), fechaNacimiento,
						agregarCursos(cantidadCursos));
				break;
			case 2: // Director
				System.out.println("Ingrese la Fecha de inicio del cargo de la Persona [" + (i + 1) + "]: ");
				fechaCargo = obtenerFecha();

				System.out.println("Ingrese la carrera encargada de la Persona [" + (i + 1) + "]: ");
				carrera = teclado.next();

				System.out.print("Ingrese el Sueldo de la Persona " + (i + 1) + ": ");
				sueldo = teclado.nextFloat();

				persona = new Director(nombre, apellido, new Documento(tipo, numero), fechaNacimiento, fechaCargo,
						sueldo, carrera);
				break;

			case 3: // Profesor
				System.out.println("Ingrese la fecha de inicio del cargo de la Persona " + (i + 1) + ": ");
				fechaCargo = obtenerFecha();

				System.out.print("Ingrese el sueldo de la Persona " + (i + 1) + ": ");
				sueldo = teclado.nextFloat();

				System.out.print("Ingrese la cantidad de cursos de la Persona " + (i + 1) + ": ");
				cantidadCursos = teclado.nextInt();

				persona = new Profesor(nombre, apellido, new Documento(tipo, numero), fechaNacimiento, fechaCargo,
						sueldo, agregarCursos(cantidadCursos));
				break;

			case 4: // Administrativo
				System.out.println("Ingrese la Fecha de inicio del Cargo de la Persona " + (i + 1) + ": ");
				fechaCargo = obtenerFecha();

				System.out.print("Ingrese el Sueldo de la Persona " + (i + 1) + ": ");
				sueldo = teclado.nextFloat();

				persona = new Administrativo(nombre, apellido, new Documento(tipo, numero), fechaNacimiento, fechaCargo,
						sueldo);
				break;
			}

			personas[i] = persona;
		}
		// mostrar el tipo de persona
		for (Persona persona : personas) {
			System.out.println(persona);
			System.out.println(persona.mostrarTipoPersona());
		}

		teclado.close();
	}

	// M E T O D O S

	// Método simple y provisional para obtener fecha
	private static Date obtenerFecha() {
		int anio = 0;
		int mes = 0;
		int dia = 0;

		while (true) {
			try {
				System.out.println("Ingrese el año: ");
				anio = teclado.nextInt();
				if (anio < 1900 || anio > 2024) {
					throw new Exception("El año debe estar comprendido entre 1900 y 2024");
				}
				break;
			} catch (Exception e) {
				System.err.println("Debe ingresar un valor válido: " + e.getMessage());
			}
		}
		while (true) {
			try {
				System.out.println("Ingrese el mes en número. Ej: 1 para Enero, 12 para Diciembre...");
				mes = teclado.nextInt();

				if (mes < 1 || mes > 12) {
					throw new Exception("Los meses deben estar comprendidos entre el 1 y 12");
				}
				break;
			} catch (Exception e) {
				System.err.println("Debe ingresar un dato válido. " + e.getMessage());
			}
		}

		while (true) {
			try {
				System.out.println("Ingrese el día:");
				dia = teclado.nextInt();

				if (dia < 1) {
					throw new Exception("los dias deben ser un numero positivo");
				} else {
					if (mes == 2) {
						if (dia > 28) {
							throw new Exception("el mes 2 posee un maximo de 28 dias");
						}
					} else if ((dia > 30) && (mes == 4 || mes == 6 || mes == 9 || mes == 11)) {
						throw new Exception("los dias para estos meses debe estar comprendidos entre 1 y 30");
					} else if ((dia > 31)) {
						throw new Exception("los dias para estos meses debe estar comprendidos entre 1 y 31");
					}
				}
				break;
			} catch (Exception e) {
				System.err.println("debe ingresar un dato valido: " + e.getMessage());
			}
		}

		return new Date(anio - 1900, mes - 1, dia);
	} // fín del método

	private static String[] agregarCursos(int cantidad) {
		String[] cursos = new String[cantidad];

		for (int i = 0; i < cantidad; i++) {
			System.out.println("Ingrese el curso" + (i + 1) + " : ");
			cursos[i] = teclado.next();
		}
		return cursos;
	}

}
