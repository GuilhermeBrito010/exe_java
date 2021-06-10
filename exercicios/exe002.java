package exercicios;

import java.util.Scanner;

public class exeo002 {

	public static void main(String[] args) {
	
		 Scanner in=new Scanner(System.in);

		int num1,num2,num3;
		
		
		
		System.out.println("digite um numero");
		num1=in.nextInt();
		

		System.out.println("digite um numero");
		num2=in.nextInt();
		
		
		System.out.println("digite um numero");
		num3=in.nextInt();
		
		
		
		if(num1>num2 && num1>num3) {
			
			
			System.out.println("o primeiro numero é o maior");
		}
		
		
		else if(num2>num3 && num2>num1) {
			
			
			
			System.out.println("o segundo numero é o maior");
		}
		
        else if(num3>num2 && num3>num1) {
			
			
			
			System.out.println("o terceiro numero é o maior");
		}
		
		
		
		
	}

}
