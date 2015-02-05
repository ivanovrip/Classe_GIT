package poligons;

public class Triangle extends Poligon {
	
	private double base;
	private double altura;
	
	public Triangle() {
		base=4;
		altura=8.8;
	}
	
	public Triangle(String Nom, int NumCostats, double base, double altura) {
		this.base=base;
		this.altura=altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double AreaTriangle (double base, double altura){
		return ((base*altura)/2);
	}
	
	@Override
	public String toString(){
		return(super.toString()+" "+base+" "+altura);
	}

}
