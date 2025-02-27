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

	public void mostarMenuDirecciones() {

		System.out.println("1.- Elegir norte.");
		System.out.println("2.- Elegir noreste.");
		System.out.println("3.- Elegir este.");
		System.out.println("4.- Elegir sureste.");
		System.out.println("5.- Elegir sur");
		System.out.println("6.- Elegir suroeste");
		System.out.println("7.- Elegir oeste");
		System.out.println("8.- Elegir noroeste");
		System.out.println("0.- Salir.");

	}

	public void elegirDireccion() {
		int opcion;
		do {
			System.out.print("Elija una dirección valida: ");
			opcion = Entrada.entero();
		} while (opcion < 0 || opcion > 8);
		switch (opcion) {
		case 0:
			System.out.println("Has elegido salir.");
			break;
		case 1:
			System.out.println("Has elegido norte.");
			break;
		case 2:
			System.out.println("Has elegido noreste.");
			break;
		case 3:
			System.out.println("Has elegido este.");
			break;
		case 4:
			System.out.println("Has elegido sureste.");
			break;
		case 5:
			System.out.println("Has elegido sur.");
			break;
		case 6:
			System.out.println("Has elegido suroeste.");
			break;
		case 7:
			System.out.println("Has elegido oeste.");
			break;
		case 8:
			System.out.println("Has elegido noroeste.");
			break;
		}
	}

	public void elegirPasos() {
		int pasos;
		System.out.println("Elige el número de pasos a mover");
		pasos = Entrada.entero();
		System.out.println("El número de pasos que has elegido es: " + pasos);
	}

	public void despedirse() {
		System.out.println("Hasta luego!");
	}

}
