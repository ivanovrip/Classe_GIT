package poligons;

public class Quadrat extends Poligon{

	private double altura;
	private double base;
	
	public Quadrat(){
		altura=3;
		base=2.5;
	}
	
	public Quadrat(String Nom, int NumCostats, double altura, double base){
		this.altura = altura;
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}
	
	public double AreaQuadrat(double altura, double base){
		return (base*altura);
	}
	
	@Override
	public String toString(){
		return(super.toString()+" "+altura+" "+base);
	}
	
}
