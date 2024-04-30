package test;

import static org.junit.jupiter.api.Assertions.*;
import models.*;
import util.*;

import org.junit.jupiter.api.Test;




class Pruebas {



	
	
	@Test
	void testCuentaCancelada() {
		Cuenta per = new Cuenta("isbn" ,new Cliente("nomber","Apellido", 28), 2500);
		Operaciones.cancelarCuenta(per);
		
		String esperado ="Cancelada";
		String obtenido = per.getEstado();
		assertEquals(esperado,obtenido);
	}

	
	
	
	@Test
	void transferencia() {
		double esperada=50;
		Cuenta cuenta1=new Cuenta(null, null, 150);
		Cuenta cuenta2=new Cuenta(null, null, 150);
		Operaciones.transferencia(cuenta1, cuenta2, 100);
		double realizado=cuenta1.getCantidad();
		assertEquals(esperada, realizado);		
	}
	




}
