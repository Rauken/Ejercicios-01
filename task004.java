package trainee01;

import java.util.Scanner;
import java.util.Random;

public class task004 {

	private static Scanner nw;

	public static void main (String[] args){
		String t;
		System.out.println("- Bonus (Para los adelantados): Hacer un programa que adivine el número entre 1 y 1000 pensado por un humano. El programa debe ir diciendo números y el humano responderá con los símbolos '<', '>' o '=', según el número pensado sea menor, mayor o igual que. Cuando lo adivine deberá poner un mensaje especificando cuantas preguntas ha necesitado y finalizar.");
		Random rw = new Random();
		nw = new Scanner(System.in);
		
		System.out.println("\n\nPiensa en un numero entre 1 y 1000");
		int a = rw.nextInt(1000)+1;
		int may=1000, min=1, count=0;
		do{
			System.out.println("Tu numero es menor <, mayor > o = a "+ a + "?");
			t = nw.nextLine();
			if(t.equals("=")){
				System.out.println("Encontre tu numero!");
				break;}
			if(t.equals(">")){
				min=a;}
			else if(t.equals("<")){
				may= may - (may - a);}
			else{
				System.out.println("Por favor solo responda con <, > o =");}
			count++;
			a = rw.nextInt(may-min)+min;
		}while(t!="=");
		System.out.println("Me tarde "+count+" intentos");
	}
}
