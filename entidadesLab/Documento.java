package entidadesLab;

public final class Documento {

	private String tipo;
	private Integer numero;

// CONSTRUTORES
	public Documento() {
		super();
	}
	public Documento(String tipo, Integer numero) {
		super();
		this.tipo = tipo;
		this.numero = numero;
	}
 
	
 @Override
	public String toString() {
		return "Documento [tipo=" + tipo + ", numero=" + numero + "]";
	}
 
	//getters y setters
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumeroDocumento(Integer numero) {
		this.numero = numero;
	}
	
	
}
