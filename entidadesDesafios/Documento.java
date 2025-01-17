package entidadesDesafios;

public class Documento {
	private String tipoDocumento;
	private String numDocumento;
	
	public Documento(String tipoDocumento, String numDocumento) {
		super();
		this.tipoDocumento = tipoDocumento;
		this.numDocumento = numDocumento;
	}
	public Documento () {
	}
	
	public String getDatos() {
		return tipoDocumento +": "+ numDocumento;
	}
	
	    //getters y setters
	public String getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public String getNumDocumento() {
		return numDocumento;
	}
	public void setNumDocumento(String numDocumento) {
		this.numDocumento = numDocumento;
	}
	
	
	
}
