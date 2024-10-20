package TP1_2024;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Empleado extends Persona{
	//ATRIBUTOS
	public static ArrayList <Empleado> ListadoPersonal = new ArrayList <Empleado>();
	
	private String horarios;
	private LocalDate fechaIngreso;
	
	//METODOS CONSTRUCTORES
	public Empleado (String nombre, String apellido, int dni, boolean permisoAdm, String cargo, String telefono, String direccion, double sueldo) {
		super(nombre, apellido, dni, permisoAdm, cargo,telefono,direccion, sueldo);
	}
	
	public Empleado (String nombre, String apellido, int dni, boolean permisoAdm, String cargo,String horarios, LocalDate fechaIngreso ) {
		super(nombre, apellido, dni, permisoAdm, cargo);
		this.horarios=horarios;
		this.fechaIngreso= fechaIngreso;
	}
	
	public Empleado (String nombre, String apellido, int dni, boolean permisoAdm, String cargo, String telefono, String horarios, LocalDate fechaIngreso) {
		super(nombre, apellido, dni, permisoAdm, cargo,telefono);
		this.horarios=horarios;
		this.fechaIngreso= fechaIngreso;
	}
	
	public Empleado (String nombre, String apellido, int dni, boolean permisoAdm, String cargo, String telefono, String direccion,String horarios, LocalDate fechaIngreso) {
		super(nombre, apellido, dni, permisoAdm, cargo,telefono,direccion);
		this.horarios=horarios;
		this.fechaIngreso= fechaIngreso;
	}
	
	public Empleado (String nombre, String apellido, int dni, boolean permisoAdm, String cargo,double sueldo, String direccion, String horarios, LocalDate fechaIngreso) {
		super(nombre, apellido, dni, permisoAdm, cargo,sueldo, direccion);
		this.horarios=horarios;
		this.fechaIngreso= fechaIngreso;
	}
	
	public Empleado (String nombre, String apellido, int dni, boolean permisoAdm, String cargo,String telefono, double sueldo,String horarios, LocalDate fechaIngreso) {
		super(nombre, apellido, dni, permisoAdm, cargo,telefono,sueldo);
		this.horarios=horarios;
		this.fechaIngreso= fechaIngreso;
	}
	
	public Empleado (String nombre, String apellido, int dni, String cargo, boolean permisoAdm, String direccion,String horarios, LocalDate fechaIngreso ) {
		super(nombre, apellido, dni, cargo, permisoAdm,direccion);
		this.horarios=horarios;
		this.fechaIngreso= fechaIngreso;
	}
	
	public Empleado (String nombre, String apellido, int dni, boolean permisoAdm, String cargo, double sueldo,String horarios, LocalDate fechaIngreso) {
		super(nombre, apellido, dni, permisoAdm, cargo,sueldo);
		this.horarios=horarios;
		this.fechaIngreso= fechaIngreso;	
	}
	
	//METODOS GETTERS Y SETTERS
	public String getHorarios() {
		return horarios;
	}
	public void setHorarios(String horarios) {
		this.horarios = horarios;
	}
	
	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	
	//METODOS
	public static void CrearEmpleado () {
		Scanner entradaTeclado = new Scanner(System.in);
		
		System.out.println("Ingrese su nombre: ");
		String nombre = entradaTeclado.nextLine();
		System.out.println("Ingrese su apellido: ");
		String apellido = entradaTeclado.nextLine();
		System.out.println("Ingrese su horario: ");
		String horario = entradaTeclado.nextLine();
		System.out.println("Ingrese su cargo: ");
		String cargo = entradaTeclado.nextLine();
		System.out.println("Ingrese su dni: ");
		int dni = entradaTeclado.nextInt();
		
		int aux;
		boolean admin;
		
		do {
			System.out.println("Es admin: ");
			System.out.println("1 - Si.");
			System.out.println("2 - No.");
			aux= entradaTeclado.nextInt();
		}while(aux<1 || aux>2);
		
		if(aux==1) {
			admin=true;
		}
		else {
			admin=false;
		}
		
		LocalDate fecha = LocalDate.now();
		
		Empleado nuevoEmpleado = new Empleado(nombre, apellido, dni, admin, cargo, horario, fecha);
		ListadoPersonal.add(nuevoEmpleado);
		Persona.ListadoPersona(nuevoEmpleado);
		
		System.out.println("El esclavo ha sido cargado.");
	}
	
	public static void mostrarEmpleados (){
		for(int i = 0; i < ListadoPersonal.size(); i++) {
			System.out.println("Su nombre es: "+ ListadoPersonal.get(i).getNombre());
			System.out.println("Su apellido es: "+ ListadoPersonal.get(i).getApellido());
			System.out.println("Su horario es: "+ ListadoPersonal.get(i).getHorarios());
			System.out.println("Su cargo es: "+ ListadoPersonal.get(i).getCargo());
			System.out.println("Su DNI es: "+ ListadoPersonal.get(i).getDni());
			
			if(ListadoPersonal.get(i).getPermisoAdm()) {
				System.out.println("Tienes permisos de administrador.");
			}
		}
	}
	
	public static Empleado extraerEmpleado () {
		int aux = -1;
		int aux1 = 0;
		Scanner entradaTeclado = new Scanner(System.in);
		
		System.out.println("Lista de empleados:");
		for(int i = 0; i < ListadoPersonal.size(); i++) {
			System.out.println(i+1 + " - " + ListadoPersonal.get(0).getNombre());
			aux++;
		}
		
		do {
			System.out.println(aux + " - Para salir.");
			System.out.println("Seleccione algún empleado: ");
			aux1 = entradaTeclado.nextInt();
		}while(aux1 < aux || aux1 > aux);
		
		return ListadoPersonal.get(aux1);
	}
	
	public void mostrarDatos() {
		super.mostrarDatos();
		
		System.out.println("Horarios: " + this.getHorarios());
		System.out.println("Fecha de ingreso: " + this.getFechaIngreso());
	}
	
	public void actualizarDatos() {
		super.actualizarDatos();
		
		Scanner entradaTeclado = new Scanner(System.in);
		System.out.println("Ingrese horario: ");
		String horario = entradaTeclado.nextLine();
		
		this.setHorarios(horario);
		this.setFechaIngreso(MetodosGeneral.crearFecha("Crear fecha de ingreso:"));
	}
}

	
