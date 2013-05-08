package App;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.AffineTransform;
import java.awt.image.ImageObserver;

import javax.swing.ImageIcon;

public class Grafico implements ImageObserver{
	
	private final String rutaImg = "/Img/";
	
	protected double posicionX;
	protected double posicionY;
	protected double velocidadX;
	protected double velocidadY;
	protected boolean visible;
	protected ImageIcon icon;
	protected Ventana ventana;
	protected double angulo; //Angulo actual
	protected double rotacion; //Velocidad de rotación
	protected double alto;
	protected double ancho; 
	protected double radioColision; 
	
	 
	public Grafico(Ventana ventana, double posicionX, double posicionY, String nombreImagen) {
		super();
		this.icon = new ImageIcon(getClass().getResource(rutaImg + nombreImagen));
		this.alto = icon.getIconHeight();
		this.ancho = icon.getIconWidth();
		this.posicionX = posicionX - ancho/2;
		this.posicionY = posicionY - alto/2;
		this.velocidadX = 0;
		this.velocidadY = 0;
		this.visible = true;
		this.ventana = ventana;
		this.angulo = 0;
		this.rotacion = 0;
		this.radioColision = (alto+ancho)/2;
	}
	
	public void dibujarGrafico(Graphics grafico){
		if(visible){			
			Graphics2D g2d = (Graphics2D) grafico;
			AffineTransform tx = AffineTransform.getTranslateInstance(posicionX, posicionY);
			tx.rotate(angulo, ancho/2, alto/2);
			tx.translate(0, 0);
	        g2d.drawImage(icon.getImage(), tx, this);
	        
		}
	}
	
	/*
	public void moverGrafico(double tiempo){
		posicionX += velocidadX * tiempo;
		posicionY += velocidadY * tiempo;
		angulo += rotacion * tiempo;
	}
	*/

	@Override
	public boolean imageUpdate(Image img, int infoflags, int x, int y, int width, int height) {
		return false;
	}
	
	public boolean isVisible(){
		return visible;
	}
	
	public double getPosicionX() {
		return posicionX;
	}

	public void setPosicionX(double posicionX) {
		this.posicionX = posicionX;
	}

	public double getPosicionY() {
		return posicionY;
	}

	public void setPosicionY(double posicionY) {
		this.posicionY = posicionY;
	}

	public double getVelocidadX() {
		return velocidadX;
	}

	public void setVelocidadX(double velocidadX) {
		this.velocidadX = velocidadX;
	}

	public double getVelocidadY() {
		return velocidadY;
	}

	public void setVelocidadY(double velocidadY) {
		this.velocidadY = velocidadY;
	}

	public ImageIcon getIcon() {
		return icon;
	}

	public void setIcon(ImageIcon icon) {
		this.icon = icon;
	}

	public Ventana getVentana() {
		return ventana;
	}

	public void setVentana(Ventana ventana) {
		this.ventana = ventana;
	}

	public double getAngulo() {
		return angulo;
	}

	public void setAngulo(double angulo) {
		this.angulo = angulo;
	}

	public double getRotacion() {
		return rotacion;
	}

	public void setRotacion(int rotacion) {
		this.rotacion = rotacion;
	}

	public double getAlto() {
		return alto;
	}

	public void setAlto(double alto) {
		this.alto = alto;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public double getRadioColision() {
		return radioColision;
	}

	public void setRadioColision(double radioColision) {
		this.radioColision = radioColision;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}
}
