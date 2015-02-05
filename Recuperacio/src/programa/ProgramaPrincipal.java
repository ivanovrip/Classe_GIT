package programa;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

import poligons.*;

public class ProgramaPrincipal {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner llegir = new Scanner(System.in);
		
		int opcio = 0;
		
		do{
			escriure("TRIA QUE VOLS FER:"
					+ "\n-1: INTRODUIR UN POLIGON AL FITXER."
					+ "\n-2: INTRODUIR UN QUADRAT AL FITXER."
					+ "\n-3: INTRODUIR UNA CIRCUMFERÈNCIA AL FITXER."
					+ "\n-4: INTRODUIR UN TRIANGLE AL FITXER."
					+ "\n-5: INDICAR QUANTS POLIGONS TENIM GUARDATS EN EL FITXER."
					+ "\n-6: LLISTAR LA INFORMACIÓ DE TOTS ELS POLÍGONS DEL FITXER."
					+ "\n-7: COMPTAR POLIGONS PEL NOM."
					+ "\n-8: COMPTAR POLIGONS PEL NUMERO DE COSTATS."
					+ "\n-9: CALCULAR I MOSTRAR PER PANTALLA L'AREA DELS POLIGONS."
					+ "\n-10: MODIFICAR UN POLIGON EN EL FITXER."
					+ "\n-11: SORTIR!!!!");
			opcio = llegir.nextInt();
			switch(opcio){
				case 1: System.out.println("1: INTRODUIR UN POLIGON AL FITXER.");
					escriu("dic_poligons.txt",dades_poligon());
					break;
				case 2: System.out.println("2: INTRODUIR UN QUADRAT AL FITXER.");
					escriu("dic_poligons.txt",dades_quadrat());
					break;
				case 3: System.out.println("3: INTRODUIR UNA CIRCUMFERÈNCIA AL FITXER.");
					escriu("dic_poligons.txt",dades_cercle());
					break;
				case 4: System.out.println("4: INTRODUIR UN TRIANGLE AL FITXER.");
					escriu("dic_poligons.txt",dades_triangle());
					break;		
					
				case 5: System.out.println("5: INDICAR QUANTS POLIGONS TENIM GUARDATS EN EL FITXER.");
					llegeix1("dic_poligons.txt");
					break;	
				case 6: System.out.println("6: LLISTAR LA INFORMACIÓ DE TOTS ELS POLÍGONS DEL FITXER.");
					llegeix2("dic_poligons.txt");
					break;		
				case 7: System.out.println("7: COMPTAR POLIGONS PEL NOM.");
					llegeix3("dic_poligons.txt");
					break;	
				case 8: System.out.println("8: COMPTAR POLIGONS PEL NUMERO DE COSTATS.");
					llegeix4("dic_poligons.txt");
					break;	
				case 9: System.out.println("9: CALCULAR I MOSTRAR PER PANTALLA L'AREA DELS POLIGONS.");
					break;	
				case 10: System.out.println("10: MODIFICAR UN POLIGON EN EL FITXER.");
					break;	
					
				case 11:
					System.exit(1);			
			}
			
		}while(opcio <1 || opcio >10);

	}
	
	private static String dades_poligon() {
		// TODO Auto-generated method stub
		Scanner llegir = new Scanner(System.in);
		Poligon poligon1 = new Poligon();
		escriure("Quin nom te el poligon");
		String Nom = llegir.next();
		poligon1.setNom(Nom);
		escriure("Quants costats té el poligon?");
		int numCostats = llegir.nextInt();
		poligon1.setNumCostats(numCostats);
		escriure("Indica la altura del poligon?");
		double midaAltura = llegir.nextDouble();
		poligon1.setMidaAltura(midaAltura);
		escriure("Indica la mida del costat del poligon?");
		double midaCostat = llegir.nextDouble();
		poligon1.setMidaCostat(midaCostat);
		escriure("S'han introduït les dades al fitxer: "+poligon1.imprimir_dades());
		return poligon1.imprimir_dades();
	}

	private static String dades_quadrat() {
		// TODO Auto-generated method stub
		Scanner llegir = new Scanner(System.in);
		Quadrat quadrat1 = new Quadrat();
		quadrat1.setNom("quadrat");
		quadrat1.setNumCostats(4);
		escriure("Quina mida te la base del quadrat?");
		double base = llegir.nextDouble();
		quadrat1.setBase(base);
		escriure("Quina mida te l'altura del quadrat?");
		double altura = llegir.nextDouble();
		quadrat1.setAltura(altura);
		escriure("S'han introduït les dades al fitxer: "+quadrat1.toString());
		return quadrat1.toString();
	}

	private static String dades_cercle() {
		// TODO Auto-generated method stub
		Scanner llegir = new Scanner(System.in);
		Cercle cercle1 = new Cercle();
		cercle1.setNom("cercle");
		cercle1.setNumCostats(0);
		escriure("Quina és el radi del cercle?");
		double radi = llegir.nextDouble();
		cercle1.setRadi(radi);
		escriure("S'han introduït les dades al fitxer: "+cercle1.toString());
		return cercle1.toString();
	}

	private static String dades_triangle() {
		// TODO Auto-generated method stub
		Scanner llegir = new Scanner(System.in);
		Triangle triangle1 = new Triangle();
		triangle1.setNom("triangle");
		triangle1.setNumCostats(3);
		escriure("Quina mida te la base del triangle?");
		double base = llegir.nextDouble();
		triangle1.setBase(base);
		escriure("Quina mida te l'altura del triangle?");
		double altura = llegir.nextDouble();
		triangle1.setAltura(altura);
		escriure("S'han introduït les dades al fitxer: "+triangle1.toString());
		return triangle1.toString();
	}
		
	//Escriure al fitxer
	public static void escriu(String fitxer, String dades) throws IOException {
		FileWriter fw = null;
		BufferedWriter bw = null;
		Scanner llegir = new Scanner(System.in);
		
		try{
			fitxer = "dic_poligons.txt";
			fw = new FileWriter(fitxer,true); //per escriure. afegim el true per poder anar afegint text al darrere, sense esborrar el que teniem
			bw = new BufferedWriter(fw); //li donem memoria
					
			//Amb el bucle llegim linia a linia
				
				while(dades.length()>0){
					bw.write(dades); //la linia es guarda dins la memoria (el buffer)
					bw.newLine();
					dades=llegir.nextLine();
				}
				}catch(Exception e1){
					System.out.println(e1.getMessage());
				}finally{
						//Entrarà al finally tant si falla com si no, per tal de tancar el fitxer.
					try{
						if(fw!=null){
					     	bw.close(); //per tancar l'espai de memòria.Fins que no es tanca
					   		fw.close(); //aquesta memòria no es guarda el que escrivim
						}
					}catch(Exception e2){
						System.out.println(e2.getMessage());
				}
			}
		}
	
	private static void llegeix1(String fitxer) throws IOException {
		// TODO Auto-generated method stub
		try {
            BufferedReader in = new BufferedReader(new FileReader( fitxer ));
            String linia;
            int comptador_linia = 0;
            while ((linia = in.readLine()) != null) {
            	int i = 0;
    	    	String [] cadena = linia.split(" "); 
    	    	comptador_linia ++;
            }   
            System.out.println("En el fitxer hi ha "+comptador_linia+" poligons");
            
           
            in.close();
        } catch (IOException e) {   	
        	System.out.println("Error! No s'ha pogut obrir el fitxer!");
        }
    }

	 public static void llegeix2(String fitxer) throws IOException {
		 escriure ("Contingut del fitxer:");
	     	try {
	            BufferedReader in = new BufferedReader(new FileReader( fitxer ));
	            String linia;
	            int comptador_linia = 0;
	            while ((linia = in.readLine()) != null) {
	            	int i = 0;
	    	    	String [] cadena = linia.split(" "); 
	    	    	
	    	    	
	    	    	if(cadena[0].equals("cercle")){
	    	    		escriure("Nom poligon: "+cadena[0]+", numero costats: "+cadena[1]+", mida radi: "+cadena[2]);
	    	    	}else{
	    	    		if(cadena[0].equals("quadrat")){
		    	    		escriure("Nom poligon: "+cadena[0]+", numero costats: "+cadena[1]+", mida base: "+cadena[2]+", mida altura: "+cadena[3]);
		    	    	}else{
		    	    		if(cadena[0].equals("triangle")){
			    	    		escriure("Nom poligon: "+cadena[0]+", numero costats: "+cadena[1]+", mida base: "+cadena[2]+", mida altura: "+cadena[3]);
			    		    }else{
			    		    	escriure("Nom poligon: "+cadena[0]+", numero costats: "+cadena[1]+", mida costat: "+cadena[2]+", mida altura: "+cadena[3]);
			    		    }
		    	    	}
	    	    	}	
	    	  }   
	           
	            
	           
	            in.close();
	        } catch (IOException e) {   	
	        	System.out.println("Error! No s'ha pogut obrir el fitxer!");
	        }
	    }
	   
	 private static void llegeix3 (String fitxer) throws IOException {
			// TODO Auto-generated method stub
		 escriure ("Contingut del fitxer:");
	     	try {
	            BufferedReader in = new BufferedReader(new FileReader( fitxer ));
	            String linia;
	            int comptador_linia = 0;
	            while ((linia = in.readLine()) != null) {
	            	int i = 0;
	    	    	String [] cadena = linia.split(" "); 
	    	    	
	    	    	
	    	    	if(cadena[0].equals("cercle")){
	    	    		comptador_linia ++;
	    	    	}else{
	    	    		if(cadena[0].equals("quadrat")){
	    	    			comptador_linia ++;
		    	    	}else{
		    	    		if(cadena[0].equals("triangle")){
		    	    			comptador_linia ++;
			    		    }else{
			    		    	comptador_linia ++;
			    		    }
		    	    	}
	    	    	}	
	    	  }   
	           
	            System.out.println("En el fitxer hi ha "+comptador_linia+" poligons");
	           
	            in.close();
	        } catch (IOException e) {   	
	        	System.out.println("Error! No s'ha pogut obrir el fitxer!");
	        }
		}
	 
		private static void llegeix4 (String fitxer) throws IOException{
			// TODO Auto-generated method stub
			escriure ("Contingut del fitxer:");
	     	try {
	            BufferedReader in = new BufferedReader(new FileReader( fitxer ));
	            String linia;
	            int comptador_linia = 0;
	            while ((linia = in.readLine()) != null) {
	            	int i = 0;
	    	    	String [] cadena = linia.split(" "); 
	    	    	
	    	    	
	    	    	if(cadena[1].equals("0")){
	    	    		comptador_linia ++;
	    	    	}else{
	    	    		if(cadena[1].equals("4")){
	    	    			comptador_linia ++;
		    	    	}else{
		    	    		if(cadena[1].equals("3")){
		    	    			comptador_linia ++;
			    		    }else{
			    		    	comptador_linia ++;
			    		    }
		    	    	}
	    	    	}	
	    	  }   
	           
	            System.out.println("En el fitxer hi ha "+comptador_linia+" poligons");
	           
	            in.close();
	        } catch (IOException e) {   	
	        	System.out.println("Error! No s'ha pogut obrir el fitxer!");
	        }
		}
		

	 
	private static void escriure(String cadena){
		System.out.println(cadena);
	}

}
