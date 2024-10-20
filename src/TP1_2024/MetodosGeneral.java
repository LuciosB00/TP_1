package TP1_2024;

import java.time.LocalDate;
import java.util.Scanner;

public class MetodosGeneral {
	
	//METODOS
	public static boolean crearBoolean (String mensaje) {
		int aux;
		
		Scanner entradaTeclado= new Scanner(System.in);
		
		do {
			System.out.print(mensaje);
			System.out.print("1 - Si.");
			System.out.print("2 - No.");
			aux= entradaTeclado.nextInt();
		}while(aux<1 || aux>2);
		
		if(aux==1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static LocalDate crearFecha (String mensaje) {
		System.out.println(mensaje);
		int dia,mes,año;
		
		Scanner entradaTeclado= new Scanner(System.in);
		System.out.println("Ingrese dia: ");
		dia = entradaTeclado.nextInt();
		System.out.println("Ingrese mes: ");
		mes = entradaTeclado.nextInt();
		System.out.println("Ingrese año: ");
		año = entradaTeclado.nextInt();
		LocalDate aux = LocalDate.of(año, mes,dia);
		
		return aux;
	}
	
	
	
}
