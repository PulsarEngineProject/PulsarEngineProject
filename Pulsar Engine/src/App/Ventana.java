package App;
import java.awt.Canvas;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.util.Vector;


public class Ventana extends Canvas implements MouseListener{//es la ventana principal
	private Proyectil p;
	private Interfaz interfaz;
	
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
		initInterfaz();
		
		this.addMouseListener(this);
		
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
		
	}
	
	public void initInterfaz(){
		interfaz = new Interfaz(this, 0, 0, "/Img/startButton.png");
	}
	
	public void dibujarInterfaz(Graphics grafico){
		interfaz.dibujarGrafico(grafico);
	}
	
	public void initGraficos(){
		p = new Proyectil(this, 0, 0, "/Projectile/Rocket1.png");

	}
	
	public void dibujarGraficos(Graphics grafico){
		p.dibujarGrafico(grafico);
	}
	
	public void dibujarPantalla(Graphics grafico){
		BufferedImage pantalla = new BufferedImage(this.getWidth(), this.getHeight(), BufferedImage.TYPE_INT_RGB);
		dibujarGraficos(pantalla.getGraphics());
		dibujarInterfaz(pantalla.getGraphics());
		grafico.drawImage(pantalla, 0, 0, this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		interfaz.mover(e.getX(), e.getY());		
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
