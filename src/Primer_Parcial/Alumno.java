package Primer_Parcial;

public class Alumno extends Persona{
	//ATRIBUTOS
	private String materias;
	private int legajo;
	
	//CONSTRUCTOR
	public Alumno(String nombre, int edad, String materias, int legajo) {
		super(nombre, edad);
		this.legajo = legajo;
		this.materias = materias;
	}

	//GETTERS Y SETTERS
	public String getMaterias() {
		return materias;
	}
	public void setMaterias(String materias) {
		this.materias = materias;
	}

	public int getLegajo() {
		return legajo;
	}
	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}
}
