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


}
