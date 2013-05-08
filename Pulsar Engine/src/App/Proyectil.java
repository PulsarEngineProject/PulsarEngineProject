package App;

public class Proyectil extends Grafico{
	protected int origenX;
	protected int origenY;
	protected int destinoX;
	protected int destinoY;
	//protected Arma arma;

	public Proyectil(Ventana ventana, int posicionX, int posicionY, String sprite) {
		super(ventana, posicionX, posicionY, sprite);
		//this.origenX = posicionX; //posarma
		//this.origenY = posicionY; //posarma
		//this.destinoX = destinoX; //objetivo
		//this.destinoY = destinoY; //objetivo
		//como obtengo el origen del arma y objetivo de esta

		//test

		this.origenX = posicionX; //posarma
		this.origenY = posicionY; //posarma
		this.destinoX = 800; //objetivo
		this.destinoY = 600; //objetivo
		
		float a = + origenY - destinoY;
		float b = + origenX - destinoX;
		float ab = a/b;
	
		this.angulo = Math.atan(ab)+Math.PI/2;
		//this.setPosicionX(400);
		//this.setPosicionY(400);

		this.velocidadX = 0;
		this.velocidadY = 0;
		
		//test
	}

	public boolean hasArrived(){
		if(super.posicionX == destinoX && super.posicionY == destinoY){
			return true;
		}else{
			return false;
		}
	}

	public int calcularAngulo(){
		return 0;
	}
	
	public void destruirObj(){
		if(hasArrived()){
			//impactado
		}
	}
}
