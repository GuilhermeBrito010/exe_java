package exercicios;

import java.util.Scanner;

public class exe02 {

	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);

	int n1,n2,n3;
	
	
	System.out.println("digite um numero");
	n1=in.nextInt();
	
	System.out.println("digite um numero");
	n2=in.nextInt();
	
	System.out.println("digite um numero");
	n3=in.nextInt();
	
	
	if(n1>n2 && n1>n3) {
		
		System.out.println("o numero" + " "+ n1 +"" + "é o maior ");
		
	}else if(n2>n1 && n2>n3) {
		
		System.out.println("o numero" + " "+ n2 +"" + "é o maior ");
	
	
	
	
	}else if(n3>n1 && n3>n2) {
		
	System.out.println("o numero" + " "+ n3 +"" + "é o maior ");
	
	
	
	
	}


}
}
