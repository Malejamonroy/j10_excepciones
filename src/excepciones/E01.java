package excepciones;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class E01 {

	public static void main(String[] args) {
		//para leer un fichero se utiliza una calse de libreria llamada FileReader
//		try {
//			FileReader r = new FileReader("datos/misdatos.dat");
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		String[] palabras = new String[4];
		try {
		System.out.println(palabras[789]);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("se te fue");
		}
		
		String algo = null;
		System.out.println(algo.toLowerCase());

	}

}
