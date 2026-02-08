package pe.com.capacitacion.bean;

import java.io.Serializable;

public class Persona implements Serializable{

	private int    id;
	private String nombre;
	private int    edad;
	private String rol;

	
	public Persona( int id, String nombre, int edad, String rol ){
		   this.nombre = nombre;
		   this.edad   = edad;
		   this.rol    = rol;
	}

	public int getId() {
		   return id; 
	}
	
	public String getNombre() {
		   return nombre;
	}

	public int getEdad() {
		   return edad;
	}

	public String getRol() {
		   return rol;
	}
	
}
