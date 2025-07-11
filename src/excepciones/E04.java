package excepciones;

import java.io.FileNotFoundException;
import java.io.IOException;

public class E04 {

	public static void main(String[] args) throws Exception { //pero tirarndo la pelota 
		//otroProblematico(0); //asi no da error 
		//pero si le pones nuero al 0 lo tienes qque meter en un try para que lo ejecute antes de tirar la pelota 
		//para que algo se ejecute siempre tenga o no error hay que meterlo en un bloque try finally :
		try {
			otroProblematico(33);
			System.out.println("esto cuando se ejecuta???");
			return;
		} finally { //esto se ejecuta siempre aunque tengas el error 
			System.out.println("Esto si o si se tiene que ejecutar");
		} 
		
	}
	
	//arreglar problem,a de file notfound pero no sabe como arreglar ioxception 
	//ni caso a las runtime
	public static void metodo1() throws IOException{
		try{
			otroProblematico(0);
		}catch (FileNotFoundException e) {
			//areglo dilenot found;
		}
	}
	
	//este metodo lo arregla todo
	public static void  metodo2() {
		try {
			otroProblematico(0);
		} catch ( FileNotFoundException e) {
			// arregla filenotfound
		}catch (IOException e) {
			// arregla ioe
		}catch (ArrayIndexOutOfBoundsException e) {
			// arregla arrayindex
		}catch (RuntimeException e) {
			// arregla runtimeException
		}
		
	}
	
	//este es peligroso arregala cualquier 
	//POLIMORFISMO
	public static void metodo3() {
		try {
			otroProblematico(0);
		} catch (Exception e) {
			// arregla cualquier exception CUIDADOOOOOO!!!!!
		}
		
	}
	
	//si sucede un arrayindex o un filenotfoun hay se arregla cualquiera de los dos; teniendo el cuenta el polimorfismo 
	public static void metodo4() {
		try {
			otroProblematico(0);
		} catch (ArrayIndexOutOfBoundsException | FileNotFoundException e) {
			// arregla array o fileno
		}catch (RuntimeException | IOException e) {
			// arregla runtime o ioe
		}
		
	}
	
	public static void otroProblematico(int num) throws FileNotFoundException,IOException { //se manda hacia arriba con :throws FileNotFoundException,IOException poniendolo en el mein
		switch (num) {
		case 1:
			throw new ArrayIndexOutOfBoundsException();
		case 2:
			throw new RuntimeException();
		case 3:
			throw new FileNotFoundException(); //muestran error a porque hayq ue mandarlas hacia rriba
		case 4:
			throw new IOException();///muestran error a porque hayq ue mandarlas hacia rriba
		}
	}

}
