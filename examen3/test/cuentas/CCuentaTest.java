package cuentas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import examen3refactorizado.CCuenta;

class CCuentaTest {
	/**
	 * Al extraer el método de operativa de cuenta y encapsular los atributos, ahora los test no funcionan. 
	 * Para solucionarlo abría que utilizar instance.getSaldo() porque ahora dSaldo no es visible.
	 */
	//Camino 1
	@Test
    public void testIngresar() {
        System.out.println("Ingresar camino 1");
        double cantidad = -1.0;
        CCuenta instance = new CCuenta();
        int expResult = 1;
        int result = instance.ingresar(cantidad);
        assertEquals(expResult, result,0.0);
        System.out.println("El saldo es: " + instance.dSaldo);
        System.out.println("****************************************");
    }
    
  //Camino 2
	@Test
    public void testIngresar2() {
        System.out.println("Ingresar camino 2");
        CCuenta instance2 = new CCuenta();
        instance2.dSaldo =0;
        int expResult = 0;
        int result = instance2.ingresar(3000);
        assertEquals(expResult, result,0.0);
        System.out.println("El nuevo saldo es: " + instance2.dSaldo);
        System.out.println("****************************************");
    }
    
  //Camino 3
	@Test
    public void testIngresar3() {
        System.out.println("Ingresar camino 3");
        CCuenta instance3 = new CCuenta();
        instance3.dSaldo =0;
        int expResult = 0;
        int result = instance3.ingresar(150);
        assertEquals(expResult, result,0.0);
        System.out.println("El nuevo saldo es: " + instance3.dSaldo);
        System.out.println("****************************************");
    }
}
