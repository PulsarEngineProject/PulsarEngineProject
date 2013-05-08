package App;

import java.awt.Graphics;


public class Nave extends Grafico{
	private Room array[][];
	private int columnas;
	private int filas;

	public Nave(Ventana ventana, int posicionX, int posicionY, String nombreImagen, int columnas, int filas) {
		super(ventana, posicionX, posicionY, nombreImagen);
		this.columnas = columnas;
		this.filas = filas;
		array = new Nave[columnas+1][filas];
	}
	
	public void generarHabitaciones(){
		
	}
	
	public void getHabitacion(int x, int y){
		return Room[x][y];
	}
	
	public void dibujarGrafico(Graphics grafico){
		for(int i = 0; i < Room.length; i++){
			
		}
	}
}
