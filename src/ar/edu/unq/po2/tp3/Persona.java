package ar.edu.unq.po2.tp3;

import java.sql.Date;
import java.time.LocalDateTime;

public class Persona {
	private String nombre;
	private Date fechaDeNacimiento;
	private int edad;
	
	public Persona(String nombre_Per, Date fechaDeNacimiento_Per) {
		nombre= nombre_Per;
		fechaDeNacimiento = fechaDeNacimiento_Per;
		edad =  LocalDateTime.getYear() - fechaDeNacimiento
	}
	
	public Boolean menorQue(Persona persona) {
		return edad < persona.edad;
	}
	
}
