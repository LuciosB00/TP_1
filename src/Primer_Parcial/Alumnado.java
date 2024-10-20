package Primer_Parcial;

import java.util.Scanner;

public class Alumnado {

	public static void main(String[] args) {
		int edad;
		int legajo;
		String nombre;
		String materias;
		
		Scanner entradaTeclado = new Scanner(System.in);
		System.out.println("Ingrese su nombre: ");
		nombre = entradaTeclado.nextLine();
		entradaTeclado.nextLine();
		System.out.println("Ingrese su edad: ");
		edad = entradaTeclado.nextInt();
		
		System.out.println("Ingrese las materias que cursa: ");
		materias = entradaTeclado.nextLine();
		entradaTeclado.nextLine();
		System.out.println("Ingrese su legajo: ");
		legajo = entradaTeclado.nextInt();
		
		Alumno nuevoAlumno = new Alumno(nombre, edad, materias, legajo);
		
		System.out.println("Esta es la información del alumno:");
		System.out.println("Nombre del alumno: " + nuevoAlumno.getNombre());
		System.out.println("Legajo del alumno: " + nuevoAlumno.getLegajo());
		
		System.out.println("Modifique su edad: ");
		edad = entradaTeclado.nextInt();
		nuevoAlumno.setEdad(edad);
		System.out.println("Su edad es: " + nuevoAlumno.getEdad());
	}

}
