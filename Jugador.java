package Trabajo;

public class Jugador {
	//Atributos
	private int turnoParado;
	private String color;
	
	//Constructora
	public  Jugador(int pTurnoParado,String pColor ) {
		this.color=pColor;
		this.turnoParado=pTurnoParado;
	}
	//Otros Metodos
	public int getTurnoParado() {
		int turno=0;
		turno=this.turnoParado;
		return turno;
	}
	public void setTurnosParados(int pTurnos) {
		this.turnoParado=pTurnos;
	}
	
	public String getColor() {
		String color;
		color=this.color;
		return color;
	}
	


}
