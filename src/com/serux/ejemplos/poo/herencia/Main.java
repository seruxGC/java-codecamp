package com.serux.ejemplos.poo.herencia;

public class Main {

	public static void main(String[] args) {
		Persona juan = new Persona("Juan",(byte) 25,"Paseo de la castellana");
		Empleado maria = new Empleado("María", (byte) 20, "Barcelona", 44000);
	
		describe(juan);
		describe(maria);
		
	}
	
	private static void describe(Persona persona) {
		System.out.println(persona.darDescripcion());
	}

}
