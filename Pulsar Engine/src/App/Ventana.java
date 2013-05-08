package App;
import java.awt.Canvas;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.util.Vector;


public class Ventana extends Canvas{
	private Grafico a;
	private Proyectil c;
	private Frame ventana;
	private int resolucionX = 800;
	private int resolucionY = 600;
		
	private long retardo = 0;
	private long frecuenciaFisicas = 1000;
	private long FPS = 30;
	private boolean endRequested = false;
	
	private long now = System.currentTimeMillis();
	
	public static void main(String[] args){
		new Ventana();
	}
	
	public Ventana(){
		ventana = new Frame();
		ventana.setSize(resolucionX, resolucionY);
		ventana.add(this);
		ventana.setVisible(true);
		ventana.requestFocus();
		ventana.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		
		initGraficos();
		
		gameLoop();
	}
	
	public void gameLoop() {
		while(!this.endRequested) {
			if(System.currentTimeMillis() - now > getFrecuencia()) {
				now = System.currentTimeMillis();
				updateFisicas();
				dibujarPantalla(this.getGraphics());
			}
		}
	}
	
	private long getFrecuencia(){
		return 1000/FPS;
	}
	
	public void updateFisicas(){
			c.moverObj();
	}
	
	public void initGraficos(){
		a = new Grafico(this, getWidth()/2, getHeight()/2, "back.jpg");
		c = new Proyectil(this, 0, 0, "square.jpg");
		
	}
	
	public void dibujarGraficos(Graphics grafico){
		a.dibujarGrafico(grafico);
		c.dibujarGrafico(grafico);
		

	}
	
	public void dibujarPantalla(Graphics grafico){
		BufferedImage pantalla = new BufferedImage(this.getWidth(), this.getHeight(), BufferedImage.TYPE_INT_RGB);
		dibujarGraficos(pantalla.getGraphics());
		grafico.drawImage(pantalla, 0, 0, this);
	}
}
