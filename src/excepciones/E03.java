package excepciones;


import java.sql.SQLException;

public class E03 {
	public static void main(String[] args) {
		metodo(-5);
		
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
				throw new SQLException();
		}
		

	}

}
