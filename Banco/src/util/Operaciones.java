package util;

import models.Cuenta;


public abstract class Operaciones {

	
	public static void transferencia(Cuenta cuentaOrigen, Cuenta cuentaDestino, double cantidad) {
		double cantidadOrigen = cuentaOrigen.getCantidad();
		double cantidadDestino = cuentaDestino.getCantidad();
		
		cantidadOrigen -= cantidad;
		cantidadDestino += cantidad;
		
		cuentaOrigen.setCantidad(cantidadOrigen);
		cuentaDestino.setCantidad(cantidadDestino);
		
	}
	
	
	public static void prestamo(Cuenta cuentaDestino, double cantidad) {
		double total = cuentaDestino.getCantidad();
		
		total += cantidad;
		
		cuentaDestino.setCantidad(total);
		
	}
	
	
	public static void cancelarCuenta(Cuenta cuentaDestino) {
		cuentaDestino.setEstado("Cancelada");
	}
	
}
