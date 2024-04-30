package test;

import static org.junit.jupiter.api.Assertions.*;

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
	

}
