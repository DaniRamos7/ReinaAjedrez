package org.iesalandalus.programacion.reinaajedrez;

import org.iesalandalus.programacion.reinaajedrez.modelo.Color;
import org.iesalandalus.programacion.utilidades.Entrada;

public final class Consola {

	private Consola() {

	}

	public void mostrarMenu() {

		System.out.println("1.- Crear reina por defecto");
		System.out.println("2.- Crear reina eligiendo color");
		System.out.println("3.- Mover");
		System.out.println("0.- Salir.");

	}

	public void elegirOpcionMenu() {
		int opcion;
		do {
			System.out.print("Elija una opción valida: ");
			opcion = Entrada.entero();
		} while (opcion < 0 || opcion > 3);
		switch (opcion) {
		case 0:
			System.out.println("Has elegido salir.");
			break;
		case 1:
			System.out.println("Has elegido crear reina por defecto.");
			break;
		case 2:
			System.out.println("Has elegido crear reina eligiendo color.");
			break;
		case 3:
			System.out.println("Has elegido la opción mover.");
			break;

		}
	}

	public void elegirColor(Color color) {

		int opcion;
		do {
			System.out.print("Elige un color: ");
			System.out.println("1.- Blanco" + Color.BLANCO);
			System.out.println("2.- Negro" + Color.NEGRO);
			System.out.println("0.- Salir.");
			opcion = Entrada.entero();
		} while (color != Color.BLANCO || color != Color.NEGRO);
		switch (opcion) {
		case 0:
			System.out.println("Has elegido salir.");
			break;
		case 1:
			System.out.println("Has elegido el color blanco." + Color.BLANCO);
			break;
		case 2:
			System.out.println("Has elegido el color negro." + Color.NEGRO);
			break;

		}

	}

}