
package tarea2;

/**
 * @version 1.0
 * @author H�ctor J. del Campo Rodr�guez
 * @since 12/03/2020
 */
public class Main {
	public static void main(String[] args) {
		Cuenta miCuenta;
		miCuenta = new Cuenta("Mercedes L�pez", "1111-2345-77-123456789", 2500);
		System.out.println("\nTitular: " + miCuenta.obtenerNombre());
		System.out.println("N� Cuenta: " + miCuenta.obtenerCuenta());
		System.out.println("El saldo actual es " + miCuenta.estado() + "�");
		System.out.println("Reintegro en cuenta 2300");
		miCuenta.retirar(2300);
		System.out.println("El saldo actual es " + miCuenta.estado() + "�");
		System.out.println("Ingreso en cuenta 600");
		miCuenta.ingresar(600);
		System.out.println("El saldo actual es " + miCuenta.estado() + "�");
	}
}
