package com.serux.ejemplos.poo.herencia;

public class Persona {
	
	protected String nombre;
	protected byte edad;
	protected String direccion;
	
	public Persona(String nombre, byte edad, String direccion) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.direccion = direccion;
	}
	
	public String darDescripcion() {
		return "Soy una persona. Me llamo " + nombre + " y tengo " + edad + " años";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public byte getEdad() {
		return edad;
	}

	public void setEdad(byte edad) {
		this.edad = edad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
}
