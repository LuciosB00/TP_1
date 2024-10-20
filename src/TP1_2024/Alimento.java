package TP1_2024;

import java.util.ArrayList;
import java.util.Scanner;

public class Alimento extends Producto {
	//ATRIBUTOS
	public static ArrayList <Alimento> ListaAlimentos = new ArrayList <Alimento>();
	private static int contadorCodigo = 1;
	
	private boolean contieneTAC;
	
	//METODOS CONSTRUCTORES
	public Alimento (String nombre, double precio, int stock) {
		super(nombre,precio,stock);
		this.contieneTAC = MetodosGeneral.crearBoolean("¿Contiene TACC?:");
		this.setCodigo("AL"+contadorCodigo);
		
		contadorCodigo++;
	}
	
	//GETTERS Y SETTERS
	public boolean getTACC() {
		return this.contieneTAC;
	}
	public void setTACC() {
		this.contieneTAC = MetodosGeneral.crearBoolean("¿Contiene TACC?:");
	}
	
	//METODOS
	public static void crearAlimento() {
		String nombre;
		double precio;
		int stock;
		
		Scanner entradaTeclado= new Scanner(System.in);
		System.out.print("Ingrese nombre: ");
		nombre = entradaTeclado.nextLine();
		System.out.print("Ingrese precio: ");
		precio = entradaTeclado.nextDouble();
		entradaTeclado.nextLine();
		System.out.print("Ingrese stock: ");
		stock = entradaTeclado.nextInt();
		
		Alimento nuevoAlimento = new Alimento(nombre,precio,stock);
		ListaAlimentos.add(nuevoAlimento);
		System.out.println("El producto ha sido creado con exito.");
	}
	
	public static void mostrarListaAlimentos () {
		System.out.println("Listado de alimentos: ");
		
		for  (Alimento elemento: ListaAlimentos) {
			System.out.println("Codigo: "+ elemento.getCodigo());
			System.out.println("Nombre: "+ elemento.getNombre());
			System.out.println("Precio: "+ elemento.getPrecio());
			System.out.println("Stock: "+ elemento.getStock());
			
			if(elemento.getTACC()) {
				System.out.println("El producto contiene TACC.");
			}
			else {
				System.out.println("El producto no contiene TACC.");
			}
			
			System.out.println("--------------------");
		}
	}
}
