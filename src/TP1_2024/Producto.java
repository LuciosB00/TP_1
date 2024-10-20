package TP1_2024;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Producto {
	//ATRIBUTOS
	public static ArrayList <Producto> ListaProductos = new ArrayList <Producto>();
	
	private String nombre;
	private String codigo;
	private double precio;
	private int stock;
	
	//METODOS CONSTRUCTORES
	public Producto (String nombre, double precio, int stock) {
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
	}

	//METODOS SETTERS Y GETTERS
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	//METODOS
	public void controlarStock() {
		if (this.getStock() < 10) {
			JOptionPane.showMessageDialog(null,"El numero de Stock es menor a 10, revise el stock.");
		}
	}
	
	public void modificiarPrecio() {
		double aux;
		Scanner entradaTeclado = new Scanner(System.in);
		
		do {
			System.out.println("Ingrese el nuevo valor del producto: ");
			aux = entradaTeclado.nextDouble();
		}while (aux<0);
		
		this.setPrecio(precio);
	}
	
	public void modificarSegunPorcentaje () {
		Scanner entradaTeclado = new Scanner(System.in);
		int aux,aux1,aux2;
		System.out.println("El precio acutal del producto es: "+ this.getPrecio());	
		System.out.println("1 - Incrementar.");
		System.out.println("2 - Decrementar.");
		System.out.println("0 - Salir.");
		
		do {
			aux = entradaTeclado.nextInt();
		}while(aux<0 || aux>2);
		
		if (aux==1) {
			System.out.println("Ingrese el porcentaje a incrementar: ");
			aux1= entradaTeclado.nextInt();
			
			double nuevoPrecio = this.getPrecio()*aux1/100+this.getPrecio();
			nuevoPrecio = Math.ceil(nuevoPrecio); 
			
			System.out.println("El precio final seria: "+ nuevoPrecio);
			System.out.println("¿Esta seguro de que desea modificar el precio?");
			System.out.println("1 - Si.");
			System.out.println("2 - No.");
			aux2= entradaTeclado.nextInt();
			
			if(aux2== 1) {
				this.setPrecio(nuevoPrecio);
				JOptionPane.showMessageDialog(null,"El precio fue modificado con exito.");
			}
		}
		else if(aux==2) {
			System.out.println("Ingrese el porcentaje a decrementar: ");
			aux1= entradaTeclado.nextInt();
			
			double nuevoPrecio = this.getPrecio()-this.getPrecio()*aux1/100;
			nuevoPrecio = Math.ceil(nuevoPrecio); 
			
			System.out.println("El precio final seria: "+ nuevoPrecio);
			System.out.println("¿Esta seguro de que desea modificar el precio?");
			System.out.println("1 - Si.");
			System.out.println("2 - No.");
			aux2= entradaTeclado.nextInt();
			
			if(aux2== 1) {
				this.setPrecio(nuevoPrecio);
				JOptionPane.showMessageDialog(null,"El precio fue modificado con exito.");
			}
		}
	}
	
	public static void buscarProdCodigo (String codigo) {
		boolean flag=false;
		
		for(int i = 0; i < ListaProductos.size(); i++) {
			if(ListaProductos.get(i).getCodigo().equals(codigo)) {
					System.out.println("Codigo: "+ListaProductos.get(i).getCodigo());
					System.out.println("Nombre: "+ListaProductos.get(i).getNombre());
					System.out.println("Precio: "+ListaProductos.get(i).getPrecio());
					System.out.println("Stock: "+ListaProductos.get(i).getStock());
					flag=true;
				}
		}
		
		if(flag==false) {
			System.out.println("El producto no fue encontrado.");
		}
	}
		 
	public void mostrarProducto() {
			System.out.println("Codigo: "+ this.getCodigo());
			System.out.println("Nombre: "+ this.getNombre());
			System.out.println("Precio: "+ this.getPrecio());
			System.out.println("Stock: "+ this.getStock());
	}
	
	public void mostrarListaProd() {
		System.out.println("Listado de los productos:");
		
		for(Producto elemento: ListaProductos) {
			System.out.println("Codigo: "+ elemento.getCodigo());
			System.out.println("Nombre: "+ elemento.getNombre());
			System.out.println("Precio: "+ elemento.getPrecio());
			System.out.println("Stock: "+ elemento.getStock());
			System.out.println("--------------------");
		}
	}
	
	public void actualizarProducto() {
		System.out.println("Los datos actuales son: ");
		this.mostrarProducto();
		
		Scanner entradaTeclado= new Scanner(System.in);
		
		System.out.println("Ingrese nombre: ");
		String nombre = entradaTeclado.nextLine();
		this.setNombre(nombre);
		
		System.out.println("Ingrese precio: ");
		double precio = entradaTeclado.nextDouble();
		this.setPrecio(precio);
		entradaTeclado.nextLine();
		
		System.out.println("Ingrese stock: ");
		int stock = entradaTeclado.nextInt();
		this.setStock(stock);
	}
}
	
