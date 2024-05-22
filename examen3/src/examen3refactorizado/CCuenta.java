package examen3refactorizado;
public class CCuenta {
    // Propiedades de la Clase Cuenta
    private double dSaldo;
	private String nombre;
	/**
	 * @author Diana Person Corzo
	 * @version 23/05/2024 día del examen de Entornos de desarrollo
	 */
	
	/**
	 * @return Devuelve el saldo de la cuenta
	 */
    public double getdSaldo() {
		return dSaldo;
	}

    /**
	 * @return Permite establecer el saldo de la cuenta
	 * Lo lógico sería usar otras herramientas, como el método ingresar. Podría decir que setSaldo está deprecated.
	 */
	public void setdSaldo(double dSaldo) {
		this.dSaldo = dSaldo;
	}
	/**
	 * @return Devuelve el nombre 
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @return Establece el nombre 
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

    public static void main(String[] args) {
    	
    	
        operativa_cuenta(0);
        
        /*miCuenta.ingresar(-100);
        System.out.println("Saldo Incial: " + miCuenta.dSaldo + " euros");
        miCuenta.ingresar(100);
        System.out.println("Saldo tras ingreso: " + miCuenta.dSaldo + " euros");
        miCuenta.ingresar(2000);
        System.out.println("Saldo tras ingreso: " + miCuenta.dSaldo + " euros");

        miCuenta.ingresar(300);
        System.out.println("Saldo tras ingreso: " + miCuenta.dSaldo + " euros");
        miCuenta.retirar(50);
        System.out.println("Saldo tras retirada: " + miCuenta.dSaldo + " euros");*/
        
        /*Acá hice un comentario para subir un commit*/
        /*Acá hice un segundo comentario para subir otro commit*/
    }

    /**
	 * Un método que registra la operativa de la cuenta, ingresar saldo e imprimir los mensajes.
	 * @param recibe una cantidad
	 */
	public static void operativa_cuenta(float cantidad) {
		CCuenta cuenta1 = new CCuenta();

        System.out.println("Prueba camino 1");
        cuenta1.ingresar(-1);
        System.out.println("Saldo Incial: " + cuenta1.dSaldo + " euros");
        System.out.println("Prueba camino 2");
        cuenta1.ingresar(3000);
        System.out.println("Saldo tras ingreso: " + cuenta1.dSaldo + " euros");
        System.out.println("Prueba camino 3");
        cuenta1.ingresar(100);
        System.out.println("Saldo tras ingreso: " + cuenta1.dSaldo + " euros");
	}

    /* Metodo para ingresar cantidades en la cuenta. Modifica el saldo. */
	/**
	 * Un método que ingresa cantidades en la cuenta, si cumplen ciertos requisitos.
	 * @param recibe una cantidad
	 * @return Si la cantidad es negativa, imprime un mensaje y devuelve un error 1.
	 * Si la cantidad es igual o superior a 3000, imprime un mensaje para notificar la necesidad de informar a Hacienda y además realiza la operación.
	 * Si la cantidad es superior a cero e inferior a 3000, ingresa el saldo en la cuenta.
	 */
    public int ingresar(double cantidad) {
        int iCodErr;
        if (cantidad < 0) {
        		System.out.println("No se puede ingresar una cantidad negativa.");
                iCodErr = 1;            
        } else if (cantidad >= 3000) {
            System.out.println(
                    "No se puede ingresar una cantidad superior a 3000€ (sin ser notificada con formulario)."
                    + "Le recordamos que estamos obligados a notificar a Hacienda dicho ingreso (superior o igual a 3000€)");
            dSaldo = dSaldo + cantidad;
            iCodErr = 0;          
        } else {
            dSaldo = dSaldo + cantidad;
            iCodErr = 0;
        }
        return iCodErr;
    }

    /*
     * Metodo para retirar cantidades en la cuenta. Modifica el saldo.
     */
    /** Un método para retirar cantidades en la cuenta, si cumplen ciertos requisitos.
	 * @param recibe una cantidad
	 * @return Si la cantidad es negativa o cero, imprime un mensaje de error.
	 * Si la cantidad es inferior al saldo, imprime un mensaje para notificar la el saldo insuficiente.
	 * En el resto de los casos, retira el saldo de la cuenta.
     */
    public void retirar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("No se puede retirar una cantidad negativa");
        } else if (dSaldo < cantidad) {
            System.out.println("No  hay suficiente saldo");
        } else {
            dSaldo = dSaldo - cantidad;
            System.out.println("Le quedan " + dSaldo + " en cuenta");
        }
    }
}
