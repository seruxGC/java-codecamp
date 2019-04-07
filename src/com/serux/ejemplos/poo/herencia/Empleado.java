package com.serux.ejemplos.poo.herencia;

public class Empleado extends Persona {

	private int salario;

	public Empleado(String nombre, byte edad, String direccion, int salario) {
		super(nombre, edad, direccion);
		this.salario = salario;
	}

	public String darDescripcion() {
		return "Soy un empleado. Me llamo " + this.nombre + " y cobro " + salario + " €";
	}

}
