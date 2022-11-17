package org.iesalandalus.programacion.reinaajedrez;

import org.iesalandalus.programacion.reinaajedrez.modelo.Color;
import org.iesalandalus.programacion.reinaajedrez.modelo.Posicion;
import org.iesalandalus.programacion.reinaajedrez.modelo.Reina;
import org.iesalandalus.programacion.utilidades.Entrada;

public class MainApp {

	public static void main(String[] args) {

	}

	Reina reina;

	private static void ejecutarOpcion() {

	}
	
	private static void crearReinaDefecto (Reina reina) {
		reina = new Reina();
	}
	
	private static void crearReinaColor() {
		Reina reina;
	
		reina = new Reina(Color.BLANCO);
		reina = new Reina(Color.NEGRO);

	}
	
	
	private static void mover () {
		
		int direccion;
		int pasos;
		System.out.println("1.- Elegir norte.");
		System.out.println("2.- Elegir noreste.");
		System.out.println("3.- Elegir este.");
		System.out.println("4.- Elegir sureste.");
		System.out.println("5.- Elegir sur");
		System.out.println("6.- Elegir suroeste");
		System.out.println("7.- Elegir oeste");
		System.out.println("8.- Elegir noroeste");
		System.out.println("0.- Salir.");
		
		System.out.println("Introduce una dirección: ");
		direccion = Entrada.entero();
		System.out.println("Introduce los pasos: ");
		pasos = Entrada.entero();
	}
	
	private static void mostrarReina() {

	}
}
