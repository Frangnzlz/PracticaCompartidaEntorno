package models;

public class Cuenta {
	private String iban;
	private Cliente cliente;
	private double cantidad;
	private String estado;
	
	/**
	 * 
	 * @param iban
	 * @param cliente
	 * @param cantidad
	 */
	public Cuenta(String iban, Cliente cliente, double cantidad) {
		this.iban = iban;
		this.cliente = cliente;
		this.cantidad = cantidad;
		estado = "Activa";
	}
	
	/**
	 * 
	 * @param cantidad
	 */
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	/**
	 * 
	 * @return
	 */
	public double getCantidad() {
		return cantidad;
	}
	/**
	 * 
	 * @param estado
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
}
