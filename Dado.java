package Trabajo;

import java.util.Random;



public class Dado {
	//Atributos
	private static Dado miDado;
	Random nAle;
	
	//Constructora
	private Dado() {
		nAle = new Random();
	}
	
	//Otros Metodos
	public static Dado getDado() {
		if (Dado.miDado == null) {
			Dado.miDado = new Dado();
		}
		return Dado.miDado;
	}
	
	public int lanzarDado() {
		int n = nAle.nextInt(6) + 1;
		return n;
	}
}