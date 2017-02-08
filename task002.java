package trainee01;

import java.util.Scanner;

public class task002 {
	private static Scanner nw;

	public static void main (String[]args){
		System.out.print("- Obtener la suma de los n primeros nuemros naturales.- int sumaNaturales(int n);");
        nw = new Scanner(System.in);
        String f = nw.nextLine();
        int num = Integer.parseInt(f);
        int a=0;
        for(int i=0;i<num;i++){
            a=a+i;
            System.out.println(a+" "+i);
        }//for
		
	}//main
}
