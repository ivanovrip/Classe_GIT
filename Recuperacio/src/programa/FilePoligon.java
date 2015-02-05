package programa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FilePoligon {

	Scanner llegir = new Scanner(System.in);
	
    public void llegeix(String fitxer) throws IOException {
     	try {
            BufferedReader in = new BufferedReader(new FileReader( fitxer ));
            String linia;
            int comptador_linia = 0;
            while ((linia = in.readLine()) != null) {
            	int i = 0;
            }   

            in.close();
        } catch (IOException e) {   	
        	System.out.println("Error! No s'ha pogut obrir el fitxer!");
        }
    }
   
	private static void escriure(String cadena){
		System.out.println(cadena);
	}
}
