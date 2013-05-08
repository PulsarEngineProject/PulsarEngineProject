package App;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Interfaz extends Grafico implements MouseListener, KeyListener{
	
	public JLabel boton;

	public Interfaz (Ventana ventana, int posicionX, int posicionY, String sprite){
		super(ventana, posicionX, posicionY, sprite);
		
	}
	
	public void mover(int x, int y){
		if()
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("aouugfdhfdos");
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("aouugfdhfdos");
		
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

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		System.out.println("aouugfdhfdos");
		
	}
	
}
