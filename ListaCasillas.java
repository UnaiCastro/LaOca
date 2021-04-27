package Trabajo;

import java.util.ArrayList;

import Clases.Jugador;

public class ListaCasillas {
	//Atributos
	private ArrayList <Jugador> lista;
	private static ListaCasillas miListaCasillas;
	//Constructora
	private ListaCasillas() {
		this.lista = new ArrayList <Jugador>();
		
	}	
	//Otros Metodos
	public static ListaCasillas getListaCasillas() {
		if (ListaCasillas.miListaCasillas == null) {
			ListaCasillas.miListaCasillas= new ListaCasillas();
		}
		
		return ListaCasillas.miListaCasillas;
	}

}
