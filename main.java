package trainee01;

import java.util.Random;
import java.util.Scanner;

public class main {
	private static Scanner nw;

	public static void main(String[]args){
		nw = new Scanner(System.in);
		System.out.println("1- Obtener el n-esimo numero de la serie fibonacci - int nfibonacci(int n)"
				+ "\n2- Obtener la suma de los n primeros numeros naturales. - int sumaNaturales(int n);"
				+ "\n3- Obtener cuantos digitos tiene un numero. int cantidadDigitos(int numero)"
				+ "\n4- Adivine el número entre 1 y 1000 pensado por un humano. ");
		String f = nw.nextLine();
		int num = Integer.parseInt(f);
		int z =1;
		do{
			if(num>0 && num<5){
				switch(num){
				case 1: task1();
					break;
				case 2: task2();
					break;
				case 3: task3();
					break;
				case 4: task4();
					break;
				}//switch
		}else{
			System.out.println("Opcion no valida");
			}
		}while(z!=1);
	}
	static void task1(){
		nw = new Scanner(System.in);
	    System.out.println("\n\n- Obtener el n-esimo numero de la serie fibonacci - int nfibonacci(int n)\nDame una posicion: ");
	    String f = nw.nextLine();
	    int num = Integer.parseInt(f);
	    int a=0, b=1, c=0;
	    int i=0;
	    do{           
	        System.out.println(i+". -"+a);
	        c= a+b;
	        a=b;
	        b=c;
	        i++;
	    }while(i<num);
	    main.main(null);
	}//task01
	
	static void task2(){
		System.out.print("\n\n- Obtener la suma de los n primeros nuemros naturales.- int sumaNaturales(int n);");
        nw = new Scanner(System.in);
        String f = nw.nextLine();
        int num = Integer.parseInt(f);
        int a=0;
        for(int i=0;i<num;i++){
            a=a+i;
            System.out.println(i+" "+a);
        }//for
        main.main(null);
	}//task2
	
	static void task3(){
		nw = new Scanner(System.in);
		System.out.println("- Obtener cuantos digitos tiene un numero. int cantidadDigitos(int numero)\nDame un numero o palabra: ");
		String f = nw.nextLine();
		System.out.println(f.length());
		main.main(null);
	}
	
	static void task4(){
		
		String t;
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
		main.main(null);
	}
}//main
