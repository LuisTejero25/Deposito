package cuentas;

/**
 * Clase principal que contiene el método main y las operaciones de la cuenta.
 */
public class Main {
	
    /**
     * Método principal que inicia la ejecución del programa.
     * @param args Los argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        operativa_cuenta(2500);
    }
    /**
     * Método que realiza operaciones en una cuenta bancaria.
     * @param cantidad La cantidad inicial en la cuenta.
     */
	private static void operativa_cuenta(float cantidad) {
		CCuenta cuenta1;
        double saldoActual;
        
     // Crear una nueva cuenta con los detalles proporcionados.
        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",cantidad,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
        	 // Intentar retirar una cantidad de la cuenta.
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            // Intentar ingresar una cantidad en la cuenta.
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
	}
}
