package Trabajo;

import java.util.InputMismatchException;
import java.util.Scanner;

import Clases.ErrorValorException;


public class Teclado {
	private static Teclado miTeclado = null;
	private Scanner sc;
	
	private Teclado() {}
	
	public static Teclado getTeclado() {
		if (Teclado.miTeclado == null) {
			Teclado.miTeclado = new Teclado();
		}
		return Teclado.miTeclado;
	}
	
	public int elegirValor() {
		int valor;
		sc = new Scanner(System.in);
		valor = sc.nextInt();
		return valor;
	}
	
	public int elegirNumeroJugadores() {
		int jug = 0;
		do {
			try {
				sc = new Scanner(System.in);
				jug = sc.nextInt();
				if (jug < 2 || jug > 4) {
					throw new ErrorValorException();
				}
			} catch (InputMismatchException e) {
				System.out.println("Introduce un valor del 2 al 4");
			} catch (ErrorValorException e) {
				System.out.println("Introduce un valor del 2 al 4");
			}
			
		} while(jug < 2 || jug > 4);
		
		return jug;
	}
	
	public void pulsaTeclaParaContinuar() {
		sc = new Scanner(System.in);
		System.out.println("Pulsa intro para continuar...");
		sc.nextLine();
		System.out.println(" ");
	}
	
	
	
	}
	

