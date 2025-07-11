package excepciones;


import java.sql.SQLException;

public class E03 {
	public static void main(String[] args) {
		try {
			metodo(-5);
		} catch (SQLException e) {
			System.out.println("Esto arregla el problema");
			e.printStackTrace();
		}
		System.err.println("Continua el programa..."); //err lo pone en rojoo 
		
		otroMetodo(66);
	}

	
		public static void otroMetodo(int num) {
			try {
				problematico(num);
			} catch (SQLException e) {
				//esto es el arreglo del problema, el codigo que pongo en el catch
				e.printStackTrace();//este srve solo para el desarolldor se puede quitar
			}
		}
		
		public static void metodo(int num) throws SQLException { //throws SQLException es lo que tira la bomba hacia arriba 
			problematico(num);
			System.out.println("todo fenomenal");
		}
		
		
		
		
		public static void problematico(int valor) throws SQLException, IllegalArgumentException{
			if (valor == 0)
				throw new IllegalArgumentException();
			if(valor <0) {
				throw new SQLException("Esto ha explotado!!!....");//las excepciones pueden tener mensajes 
		}
		
			
			//Esta es la pila de llamadas que hemos hecho 
//			Esto arregla el problema
//			java.sql.SQLException: Esto ha explotado!!!....
//				at excepciones.E03.problematico(E03.java:39)
//				at excepciones.E03.metodo(E03.java:28)
//				at excepciones.E03.main(E03.java:9)
//			Continua el programa...
	}

}
