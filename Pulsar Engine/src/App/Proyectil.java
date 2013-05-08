package App;

public class Proyectil extends Grafico{
	protected double origenX;
	protected double origenY;
	protected double destinoX;
	protected double destinoY;
	//protected Arma arma;

	public Proyectil(Ventana ventana, double posicionX, double posicionY, String nombreImagen) {
		super(ventana, posicionX, posicionY, nombreImagen);
		
		this.origenX = this.posicionX; //posarma
		this.origenY = this.posicionY; //posarma
		this.destinoX = 800 - ancho/2; //objetivo
		this.destinoY = 600 - alto/2; //objetivo
		
		//this.angulo = calcularAngulo();
		
		this.velocidadY = 1;
		this.velocidadX = (this.posicionX - this.destinoX) / (this.posicionY - this.destinoY);
	}

	public boolean hasArrived(){
		if(super.posicionX == destinoX && super.posicionY == destinoY){
			return true;
		}else{
			return false;
		}
	}

	public double calcularAngulo(){
		double a = + origenY - destinoY;
		double b = + origenX - destinoX;
		double ab = a/b;
		return Math.atan(ab)+Math.PI/2;
	}
	
	public void destruirObj(){
		if(hasArrived()){
			//impactado
		}
	}
	
	public void moverObj(){
		System.out.println(posicionX+ancho/2);
		System.out.println(posicionY+alto/2);
		System.out.println("-----------");
		posicionX += velocidadX;
		posicionY += velocidadY;
		
	}
}
