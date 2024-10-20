package TP1_2024;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Lacteo extends Producto {
	//ATRIBUTOS
	public static ArrayList <Lacteo> ListaLacteos = new ArrayList <Lacteo>();
	private static int contadorCodigo = 1;
	
	private LocalDate fechaVto;
	private boolean requiereFrio;
	
	//METODOS CONSTRUCTORES
	public Lacteo (String nombre, double precio, int stock) {
		super(nombre,precio,stock);
		this.fechaVto = MetodosGeneral.crearFecha("Fecha de vencimiento:");
		this.requiereFrio = MetodosGeneral.crearBoolean("¿Requiere frio?:");
		this.setCodigo("LA"+contadorCodigo);
		
		contadorCodigo++;
	}
	
	//GETTER Y SETTERS
	public boolean getFrio() {
		return this.requiereFrio;
	}
	public void setFrio() {
		this.requiereFrio = MetodosGeneral.crearBoolean("¿Requiere frio?:");
	}
	
	//METODOS
	public static void crearLacteo () {
		String nombre;
		double precio;
		int stock;
		
		Scanner entradaTeclado= new Scanner(System.in);
		System.out.println("Ingrese nombre: ");
		nombre = entradaTeclado.nextLine();
		System.out.println("Ingrese precio: ");
		precio = entradaTeclado.nextDouble();
		entradaTeclado.nextLine();
		System.out.println("Ingrese stock: ");
		stock = entradaTeclado.nextInt();
		
		Lacteo nuevoLacteo = new Lacteo(nombre,precio,stock);
		ListaLacteos.add(nuevoLacteo);
		System.out.println("El producto ha sido creado con exito.");
	}
	
	public static void mostrarListaLacteo () {
		System.out.println("Listado de lacteos: ");
		
		for  (Lacteo elemento: ListaLacteos) {
			System.out.println("Codigo: "+ elemento.getCodigo());
			System.out.println("Nombre: "+ elemento.getNombre());
			System.out.println("Precio: "+ elemento.getPrecio());
			System.out.println("Stock: "+ elemento.getStock());
			
			if(elemento.getFrio()) {
				System.out.println("EL producto requiere frio.");
			}
			else {
				System.out.println("EL producto no requiere frio.");
			}
			
			System.out.println("--------------------");
		}
	}
	
	public void modificarPrecioLista () {
		
	}
	
	public void actualizarProducto() {
		super.actualizarProducto();
		this.fechaVto = MetodosGeneral.crearFecha("Fecha de vencimiento:");
		this.requiereFrio = MetodosGeneral.crearBoolean("¿Requiere frio?:");
	}
}
