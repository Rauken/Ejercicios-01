package trainee01;

import java.util.Scanner;
public class task001 {
	    
private static Scanner nw;

public static void main (String[]args){
    nw = new Scanner(System.in);
    System.out.println("- Obtener el n-esimo numero de la serie fibonacci - int nfibonacci(int n)\nDame una posicion: ");
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
    
    }//main
}
