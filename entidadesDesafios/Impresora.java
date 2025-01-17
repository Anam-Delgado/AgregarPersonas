package entidadesDesafios;

import java.io.IOException;
import java.util.Arrays;

public class Impresora implements AutoCloseable{
	public static String[] IMPRESORAS_DISPONIBLES = { "Cannon", "HP", "Brother", "Samsung" };
	private String impresora;
	private String[] documento;

	public Impresora(String impresora) throws Exception {
		super();
		setImpresora(impresora);
	}

	public Impresora(String impresora, String[] documento) throws Exception {
		super();
		setImpresora(impresora);
		this.documento = documento;
	}

	
	public void imprimir() throws IOException {
		if(documento==null) {
			throw new IOException("El documento a imprimir debe contener datos.");
		} else {
			for(String linea : documento) {
				System.out.println(linea);
			}
		}
		
	}
	public void imprimir(String [] documento) throws IOException {
		if (documento == null) {
			throw new IOException("El documento a imprimir debe contener datos.");
		} else {
			for (String linea : documento) {
				System.out.println(linea);
			}
		}
	}

	@Override
	public String toString() {
		return "Impresora [impresora=" + impresora + ", documento=" + Arrays.toString(documento) + "]";
	}

	public String[] getDocumento() {
		return documento;
	}

	public void setDocumento(String[] documento) {
		this.documento = documento;
	}

	public String getImpresora() {
		return impresora;
	}

	public void setImpresora(String impresora) throws Exception {
		Boolean existeImpresora = false;

		if (impresora != null) {
			for (String impresoraDisponible : IMPRESORAS_DISPONIBLES) {
				if (impresoraDisponible.equalsIgnoreCase(impresora)) {
					existeImpresora = true;
					break;
				}
			}
		}
		if (!existeImpresora) {
			throw new IOException("Solo estan permitidas las impresoras: " + Arrays.toString(IMPRESORAS_DISPONIBLES));
		}
		this.impresora = impresora;
	}

	@Override
	public void close() throws Exception{
		System.out.println("Ha finalizado la conexion con la impresora "+ impresora);
	}
	
}
