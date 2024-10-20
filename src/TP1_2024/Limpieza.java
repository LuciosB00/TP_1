package TP1_2024;

import java.util.ArrayList;
import java.util.Scanner;

public class Limpieza extends Producto {
	//ATRIBUTOS
	public static ArrayList <Limpieza> ListaLimpieza = new ArrayList <Limpieza> ();
	private static int contadorCodigo = 1;
	
	private boolean isToxic;
	
	//METODOS CONSTRUCTORES
	public Limpieza (String nombre, double precio, int stock) {
		super(nombre, precio, stock);
		this.isToxic= MetodosGeneral.crearBoolean("¿Es tóxico?:");
		this.setCodigo("LI"+contadorCodigo);
		
		contadorCodigo++;
	}
	
	//GETTERS Y SETTERS
	public boolean getIsToxic() {
		return this.isToxic;
	}
	public void setIsToxic() {
		this.isToxic = MetodosGeneral.crearBoolean("¿Es tóxico?:");
	}
	
	//METODOS
	public static void crearLimpieza () {
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
		
		Limpieza nuevoLimpieza = new Limpieza(nombre,precio,stock);
		ListaLimpieza.add(nuevoLimpieza);
		Producto.ListaProductos.add(nuevoLimpieza);
		
		System.out.println("El producto ha sido creado con exito.");
	}
	
	public static void mostrarListaLimipieza () {
		System.out.println("Listado de limpieza: ");
		
		for  (Limpieza elemento: ListaLimpieza) {
			System.out.println("Codigo: "+ elemento.getCodigo());
			System.out.println("Nombre: "+ elemento.getNombre());
			System.out.println("Precio: "+ elemento.getPrecio());
			System.out.println("Stock: "+ elemento.getStock());
			System.out.println("--------------------");
		}
	}
	
	public static void buscarLimpCodigo (String codigo) {
		boolean flag = false;
		
		for(int i = 0; i < ListaLimpieza.size(); i++) {
			if(ListaLimpieza.get(i).getCodigo().equals(codigo)) {
					System.out.println("Codigo: " + ListaLimpieza.get(i).getCodigo());
					System.out.println("Nombre: " + ListaLimpieza.get(i).getNombre());
					System.out.println("Precio: " + ListaLimpieza.get(i).getPrecio());
					System.out.println("Stock: " + ListaLimpieza.get(i).getStock());
					
					if(ListaLimpieza.get(i).getIsToxic()) {
						System.out.println("EL producto es tóxico.");
					}
					else {
						System.out.println("EL producto no es tóxico.");
					}
					
					flag=true;
				}
		}
		
		if(flag==false) {
			System.out.println("El producto limpieza no fue encontrado.");
		}
	}
	
	public void actualizarProducto() {
		super.actualizarProducto();
		this.isToxic = MetodosGeneral.crearBoolean("¿Es tóxico?:");
	}
}
