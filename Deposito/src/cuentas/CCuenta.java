package cuentas;
/**
 * Clase que representa una cuenta bancaria.
 * Proporciona métodos para obtener y establecer el nombre, cuenta, saldo y tipo de interés.
 */
public class CCuenta {

/**
 * Atributos.
 */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
/**
 * Constructor vacío.
 */
    public CCuenta(){
    }
    /**
     * Constructor de la clase CCuenta con parámetros.
     * @param nom el nombre del titular de la cuenta.
     * @param cue el número de la cuenta.
     * @param sal el saldo inicial de la cuenta.
     * @param tipo el tipo de interés de la cuenta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    
    /**
     * Obtiene el nombre del titular de la cuenta.
     * @return el nombre del titular de la cuenta.
     */
    public String getNombre() {
		return nombre;
	}
    
    /**
     * Establece el nombre del titular de la cuenta.
     * @param nombre el nombre del titular de la cuenta.
     */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	  /**
     * Obtiene el número de la cuenta.
     * @return el número de la cuenta.
     */
	public String getCuenta() {
		return cuenta;
	}
	
    /**
     * Establece el número de la cuenta.
     * @param cuenta el número de la cuenta.
     */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

    /**
     * Obtiene el saldo de la cuenta.
     * @return el saldo de la cuenta.
     */
	public double getSaldo() {
		return saldo;
	}
	
	 /**
     * Establece el saldo de la cuenta.
     * @param saldo el saldo de la cuenta.
     */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	  /**
     * Obtiene el tipo de interés de la cuenta.
     * @return el tipo de interés de la cuenta.
     */
	public double getTipoInterés() {
		return tipoInterés;
	}
	
	  /**
     * Establece el tipo de interés de la cuenta.
     * @param tipoInterés el tipo de interés de la cuenta.
     */
	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
	
	 /**
     * Método que devuelve el estado de la cuenta (saldo).
     * @return el saldo de la cuenta.
     */
	public double estado()
    {
        return saldo;
    }
	
    /**
     * Método para ingresar una cantidad en la cuenta.
     * @param cantidad la cantidad a ingresar.
     * @throws Exception si la cantidad es negativa.
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
    
    /**
     * Método para retirar una cantidad de la cuenta.
     * @param cantidad la cantidad a retirar.
     * @throws Exception si la cantidad es negativa o si no hay suficiente saldo.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
