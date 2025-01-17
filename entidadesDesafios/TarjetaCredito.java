package entidadesDesafios;

import utilidadesDesa.Formatos;

public class TarjetaCredito extends Producto {
	private Integer codigoSeguridad;
	
	public TarjetaCredito() {
		setNumero(getNumeroGenerado());
}
	
	public TarjetaCredito(Integer banco, Integer sucursal, Integer codigoSeguridad) {
		super(banco, sucursal);
		this.codigoSeguridad = codigoSeguridad;
		setNumero(getNumeroGenerado());
	}

	
	@Override
	public String toString() {
		return "TarjetaCredito [Banco=" + Formatos.getFormato(getBanco(), "BANCO") 
		+ ", sucursal=" + Formatos.getFormato(getSucursal(), "BANCO") + ", numero=" + Formatos.getFormato(getNumero(), "TC")
		+ ", codigoSeguridad= " + Formatos.getFormato(getCodigoSeguridad(), "CS") + "]";
	}
 
	public Integer getCodigoSeguridad() { 
		return codigoSeguridad;
	}

	public void setCodigoSeguridad(Integer codigoSeguridad) {
		this.codigoSeguridad = codigoSeguridad;
	}
	
	
	

}
