package TP1_2024;

import java.util.ArrayList;
import java.util.Scanner;

public class Persona {
	//ATRIBUTOS
	public static ArrayList <Persona> ListadoPersona = new ArrayList <Persona>();
	
	private String nombre;
	private String apellido;
	private int dni;
	private String cargo;
	private double sueldo;
	private boolean permisoAdm;
	private String telefono;
	private String direccion;
	
	//METODOS CONSTRUCTORES	
	public Persona (String nombre, String apellido, int dni, boolean permisoAdm, String cargo) {
		this.nombre= nombre;
		this.apellido= apellido;
		this.dni= dni; 
		this.permisoAdm= permisoAdm;
		this.cargo= cargo;
	}
	
	public Persona (String nombre, String apellido, int dni, boolean permisoAdm, String cargo,String telefono, String direccion, double sueldo) {
		this.nombre= nombre;
		this.apellido= apellido;
		this.dni= dni;
		this.permisoAdm= permisoAdm;
		this.cargo= cargo;
		this.direccion= direccion;
		this.sueldo=sueldo;
		this.telefono= telefono;
	}
	
	public Persona (String nombre, String apellido, int dni, boolean permisoAdm, String cargo, String telefono) {
		this.nombre= nombre;
		this.apellido= apellido;
		this.dni= dni;
		this.permisoAdm= permisoAdm;
		this.cargo= cargo;
		this.telefono= telefono;
	}
	
	public Persona (String nombre, String apellido, int dni, boolean permisoAdm, String cargo, String telefono, String direccion) {
		this.nombre= nombre;
		this.apellido= apellido;
		this.dni= dni;
		this.permisoAdm= permisoAdm;
		this.cargo= cargo;
		this.direccion= direccion;
		this.telefono= telefono;
	}
	
	public Persona (String nombre, String apellido, int dni, boolean permisoAdm, String cargo, double sueldo, String direccion) {
		this.nombre= nombre;
		this.apellido= apellido;
		this.dni= dni;
		this.permisoAdm= permisoAdm;
		this.cargo= cargo;
		this.direccion= direccion;
		this.sueldo=sueldo;
		
	}
	
	public Persona (String nombre, String apellido, int dni, boolean permisoAdm, String cargo, String telefono, double sueldo) {
		this.nombre= nombre;
		this.apellido= apellido;
		this.dni= dni;
		this.permisoAdm= permisoAdm;
		this.cargo= cargo;
		this.sueldo=sueldo;
		this.telefono= telefono;
	}
	
	public Persona (String nombre, String apellido, int dni,String cargo, boolean permisoAdm, String direccion) {
		this.nombre= nombre;
		this.apellido= apellido;
		this.dni= dni;
		this.permisoAdm= permisoAdm;
		this.cargo= cargo;
		this.direccion= direccion;
	}
	
	public Persona (String nombre, String apellido, int dni, boolean permisoAdm, String cargo, double sueldo) {
		this.nombre= nombre;
		this.apellido= apellido;
		this.dni= dni;
		this.permisoAdm= permisoAdm;
		this.cargo= cargo;
		this.sueldo=sueldo;
	}
	
	//METODOS SETTERS Y GETTERS
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre= nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	public boolean getPermisoAdm() {
		return permisoAdm;
	}
	public void setPermisoAdm(boolean permisoAdm) {
		this.permisoAdm = permisoAdm;
	}
	
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	//METODOS
	public void mostrarDatos() {
		System.out.println("Nombre: " + this.getNombre());
		System.out.println("Apellido: " + this.getApellido());
		System.out.println("DNI: " + this.getDni());
		System.out.println("Direccion: " + this.getDireccion());
		System.out.println("Telefono: " + this.getTelefono());
		System.out.println("Cargo: " + this.getCargo());
		System.out.println("Sueldo: " + this.getSueldo());
		
		if(this.getPermisoAdm()) {
			System.out.println("Es administrador.");
		}
		else {
			System.out.println("No es administrador.");
		}
	}
	
	public void actualizarDatos() {
		System.out.println("Los datos actuales son: ");
		this.mostrarDatos();
		
		Scanner entradaTeclado = new Scanner(System.in);
		System.out.println("Ingrese nombre: ");
		String nombre = entradaTeclado.nextLine();
		this.setNombre(nombre);
		
		System.out.println("Ingrese apellido: ");
		String apellido = entradaTeclado.nextLine();
		this.setApellido(apellido);
		
		System.out.println("Ingrese dirección: ");
		String direccion = entradaTeclado.nextLine();
		this.setDireccion(direccion);
		
		System.out.println("Ingrese telefono: ");
		String telefono = entradaTeclado.nextLine();
		this.setTelefono(telefono);
		
		System.out.println("Ingrese cargo: ");
		String cargo = entradaTeclado.nextLine();
		this.setCargo(cargo);
		
		System.out.println("Ingrese sueldo: ");
		double sueldo = entradaTeclado.nextDouble();
		this.setSueldo(sueldo);
		
		System.out.println("Ingrese DNI: ");
		int documento = entradaTeclado.nextInt();
		this.setDni(documento);
	}

	public static void ListadoPersona(Administrador nuevoAdmin) {
		// TODO Auto-generated method stub
	}

	public static void ListadoPersona(Empleado nuevoEmpleado) {
		// TODO Auto-generated method stub
	}
}

	 
