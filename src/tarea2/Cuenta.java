package tarea2;
/**
 * @version 1.0
 * @author Héctor J. del Campo Rodríguez
 * @since 12/03/2020
 */
public class Cuenta {
	private String nombre;
	private String cuenta;
	private double saldo;
	public Cuenta (String nom, String cue, double sal) {
		nombre=nom;
		cuenta=cue;
		saldo=sal;
	}
	public void asignarNombre(String nom) {
		nombre=nom;
	}
	public String obtenerNombre() {
		return nombre;
	}
	public String obtenerCuenta () {
		return cuenta;
	}
	public double estado() {
		return saldo;
	}
	public void ingresar(double cantidad) {
		if (cantidad<0) {
			System.out.println("No se puede ingresar una cantidad negativa");
		}
		saldo = saldo + cantidad;
	}
	public void retirar (double cantidad) {
		if (cantidad<=0) {
			System.out.println("No se puede retirar una cantidad negativa");
		}
		else {
			if (estado() < cantidad) {
				System.out.println("No hay suficiente saldo");
			}
			else {
				saldo = saldo - cantidad;
			}
		}
	}
}
