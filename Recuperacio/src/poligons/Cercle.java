package poligons;

public class Cercle extends Poligon {
	
	private static final double pi = 3.1416;
	private double radi;
	
	public Cercle() {
		radi=5.5;
	}
	
	public Cercle(String Nom, int NumCostats, double radi) {
		this.radi=radi;
	}

	public double getRadi() {
		return radi;
	}

	public void setRadi(double radi) {
		this.radi = radi;
	}
	
	public double AreaCercle (double radi){
		return (pi*(radi*radi));
	}
	
	@Override
	public String toString(){
		return(super.toString()+" "+radi+" "+pi);
	}

}
