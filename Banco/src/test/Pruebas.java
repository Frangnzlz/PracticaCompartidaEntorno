package test;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;
import models.*;
import util.*;

import org.junit.jupiter.api.Test;



class Pruebas {


	
	
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
