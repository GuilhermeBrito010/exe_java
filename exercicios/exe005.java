package exercicios;

import java.util.Scanner;

public class exe005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		
		int num1,num2;
		String vouf;
		
		
		
		System.out.println("digite um numero");
		num1=in.nextInt();
		
		System.out.println("digite um numero");
		num2=in.nextInt();
		
		if(num1>0 &&num2>0 || num1<0 && num2<0) {
			
			vouf=new String ("verdadeiro");
			
		System.out.println(vouf);	
			
		
		
		}if(num1>0 &&num2<0 || num1>0 && num2<0) {
			
			vouf=new String ("falso");
			
		System.out.println(vouf);	
			
		}
		
	}

}
