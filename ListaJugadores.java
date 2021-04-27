package Trabajo;

import java.util.ArrayList;

import Clases.Jugador;
import Clases.Tablero;

public class ListaJugadores {
	//Atributos
	private ArrayList <Jugador> lista;
	private static ListaJugadores miListaJugadores;
	private int minimoJugador = 2;
	private int maximoJugador = 4;	
	
	//Constructora
	private ListaJugadores() {
		this.lista = new ArrayList <Jugador>();
		
	}	
	//Otros Metodos
	public static ListaJugadores getListaJugadores() {
		if (ListaJugadores.miListaJugadores == null) {
			ListaJugadores.miListaJugadores= new ListaJugadores();
		}
		
		return ListaJugadores.miListaJugadores;
	}
	


}
