/**
 * 
 */
package app;

import models.Cliente;
import models.Cuenta;
import util.*;

/**
 * @author FacundoBenitez FranciscoGonzales
 */
public class main {


	public static void main(String[] args) {
		Cliente cliente1=new Cliente("Facundo", "Benitez", 22);
		Cliente cliente2=new Cliente("David", "Gonzales", 21);
		Cuenta cuentaCliente1=new Cuenta("ESBN022-124", cliente1, 150);
		Cuenta cuentaCliente2=new Cuenta("ESBN022-125", cliente2, 150);
		util.Operaciones.transferencia(cuentaCliente1,cuentaCliente2,100);

	}

}
