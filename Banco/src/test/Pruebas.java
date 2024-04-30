package test;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;
import models.*;
import util.*;

import org.junit.jupiter.api.Test;
import models.*;
import util.Operaciones;




class Pruebas {

	@Test
	void testCuentaCancelada() {
		Cuenta per = new Cuenta("isbn" ,new Cliente("nomber","Apellido", 28), 2500);
		Operaciones.cancelarCuenta(per);
		
		String esperado ="Cancelada";
		String obtenido = per.getEstado();
		assertEquals(esperado,obtenido);
	}
	
<<<<<<< HEAD
=======
	
	@Test
	void transferencia(Cuenta cuentaOrigen, Cuenta cuentaDestino, double cantidad) {
		double esperada=50;
		Cuenta cuenta1=new Cuenta(null, null, 150);
		Cuenta cuenta2=new Cuenta(null, null, 150);
		Operaciones.transferencia(cuenta1, cuenta2, 100);
		double realizado=cuenta1.getCantidad();
		assertEquals(esperada, realizado);		
	}


>>>>>>> 0b17bf09aabd8c2a0dff571022e96bc98d7d5172

}
