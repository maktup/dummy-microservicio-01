package pe.com.capacitacion.bean;

import java.io.Serializable;

public class Persona implements Serializable{

	private long   id;
	private String nombre;
	private int    edad;
	private String rol;

	
	public Persona( long id, String nombre, int edad, String rol ){
		   this.id     = id;
		   this.nombre = nombre;
		   this.edad   = edad;
		   this.rol    = rol;
	}
  
	public void setId(long id) {
		   this.id = id;
	}

	public void setNombre(String nombre) {
		   this.nombre = nombre;
	}

	public void setEdad(int edad) {
		   this.edad = edad;
	}

	public void setRol(String rol) {
		   this.rol = rol;
	}

	public long getId() {
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

