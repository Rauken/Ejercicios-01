package trainee01;

import java.util.Scanner;

public class task003 {
	private static Scanner nw;

	public static void main(String[] args){
		nw = new Scanner(System.in);
		System.out.println("- Obtener cuantos digitos tiene un numero. int cantidadDigitos(int numero)\nDame un numero o palabra: ");
		String f = nw.nextLine();
		System.out.println(f.length());
		
	}
}
