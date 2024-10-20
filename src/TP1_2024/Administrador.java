package TP1_2024;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Administrador extends Persona{
	//ATRIBUTOS
	public static ArrayList <Administrador> ListadoAdmin = new ArrayList <Administrador>();
	
	private ArrayList <Empleado> EmpleadosCargo = new ArrayList<Empleado>();
	
	//METODOS CONSTRUCTORES
	public Administrador (String nombre, String apellido, int dni, boolean permisoAdm, String cargo) {
		super(nombre, apellido, dni, permisoAdm, cargo);
	}
	
	public Administrador (String nombre, String apellido, int dni, boolean permisoAdm, String cargo, String telefono, String direccion, double sueldo) {
		super(nombre, apellido, dni, permisoAdm, cargo,telefono,direccion, sueldo);
	}
	
	public Administrador (String nombre, String apellido, int dni, boolean permisoAdm, String cargo, String telefono) {
		super(nombre, apellido, dni, permisoAdm, cargo,telefono);
	}
	
	public Administrador (String nombre, String apellido, int dni, boolean permisoAdm, String cargo, String telefono, String direccion) {
		super(nombre, apellido, dni, permisoAdm, cargo,telefono,direccion);
	}
	
	public Administrador (String nombre, String apellido, int dni, boolean permisoAdm, String cargo, double sueldo, String direccion) {
		super(nombre, apellido, dni, permisoAdm, cargo, sueldo, direccion);
	}
	
	public Administrador (String nombre, String apellido, int dni, boolean permisoAdm, String cargo, String telefono, double sueldo) {
		super(nombre, apellido, dni, permisoAdm, cargo,telefono,sueldo);
	}
	
	public Administrador (String nombre, String apellido, int dni,String cargo, boolean permisoAdm, String direccion) {
		super(nombre, apellido, dni,cargo, permisoAdm, direccion);
	}
	
	public Administrador (String nombre, String apellido, int dni, boolean permisoAdm, String cargo, double sueldo) {
		super(nombre, apellido, dni, permisoAdm, cargo,sueldo);
	}

	//METODOS
	public void agregarEmpleado (Empleado nuevoEmpleado) {
		this.EmpleadosCargo.add(nuevoEmpleado);
	}
	
	public void mostrarDatos() {
		super.mostrarDatos();
		
		if(this.EmpleadosCargo.isEmpty()) {
			System.out.println("No tiene empleado a cargo.");
		}else {
			System.out.println("Tiene empleado a cargo.");
			for (Empleado elemento : this.EmpleadosCargo) {
				elemento.mostrarDatos();
				System.out.println("---------------------");
			}
		}
	}
	
	public static void agregarAdmin () {
		Scanner entradaTeclado = new Scanner(System.in);
		
		System.out.println("Ingrese su nombre: ");
		String nombre = entradaTeclado.nextLine();
		System.out.println("Ingrese su apellido: ");
		String apellido = entradaTeclado.nextLine();
		System.out.println("Ingrese su cargo: ");
		String cargo = entradaTeclado.nextLine();
		System.out.println("Ingrese su DNI: ");
		int dni = entradaTeclado.nextInt();
		
		boolean admin = true;
		int aux;
		
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
		
		Administrador nuevoAdmin = new Administrador(nombre, apellido, dni, admin, cargo);
		ListadoAdmin.add(nuevoAdmin);
		Persona.ListadoPersona(nuevoAdmin);
		System.out.println("El admin entro en el grupo.");
	}
	
	public void CrearEmpleado () {
		
	}
	
	public static void mostrarAdmins (){
		for(int i = 0; i < ListadoAdmin.size(); i++) {
			System.out.println("Su nombre es: "+ ListadoAdmin.get(i).getNombre());
			System.out.println("Su apellido es: "+ ListadoAdmin.get(i).getApellido());
			System.out.println("Su cargo es: "+ ListadoAdmin.get(i).getCargo());
			System.out.println("Su DNI es: "+ ListadoAdmin.get(i).getDni());
			
			if(ListadoAdmin.get(i).getPermisoAdm()) {
				System.out.println("Tienes permisos de administrador.");
			}
		}
	}
	
	
}

