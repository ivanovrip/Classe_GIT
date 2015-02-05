package poligons;

public class Poligon {
	
	private String Nom;
	private int NumCostats;
	private double midaCostat;
	private double midaAltura;
	
	//Constructores

	public Poligon() {
		this.Nom="Hexagon";
		this.NumCostats=6;
		this.midaCostat=9.9;
		this.midaAltura=5.7;
	}
	
	public Poligon(String Nom, int NumCostats, double midaCostat, double midaAltura) {
		this.Nom=Nom;
		this.NumCostats=NumCostats;
		this.midaCostat=midaCostat;
		this.midaAltura=midaAltura;
	}
	
	public double getMidaCostat() {
		return midaCostat;
	}

	public void setMidaCostat(double midaCostat) {
		this.midaCostat = midaCostat;
	}

	public double getMidaAltura() {
		return midaAltura;
	}

	public void setMidaAltura(double midaAltura) {
		this.midaAltura = midaAltura;
	}

	

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public int getNumCostats() {
		return NumCostats;
	}

	public void setNumCostats(int numCostats) {
		NumCostats = numCostats;
	}
	
	public String imprimir_dades() {
		return(Nom+" "+NumCostats+" "+midaCostat+" "+midaAltura);
	}
	
	@Override
	public String toString(){
		return(Nom+" "+NumCostats);
	}

}
