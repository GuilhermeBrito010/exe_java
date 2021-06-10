package exercicios;

import java.util.Scanner;

public class exe003 {

	public static void main(String[] args) {
		 Scanner in=new Scanner(System.in);
	
	int n1,n2,n3,soma=0;
	
	
	System.out.println("digite um valor");
	n1=in.nextInt();
	
	
	System.out.println("digite um valor");
	n2=in.nextInt();
	
	
	System.out.println("digite um valor");
	n3=in.nextInt();
	
	
	if(n1<n2 && n1<n3){
		soma=(n3+n2);
	
	
	}else if(n2<n1 && n2<n3){
		soma=(n1+n3);
	
	
	
	}else if(n3<n1 && n3<n2){
		soma=(n2+n1);
		
	
} 

	
	System.out.println(soma);
	
	}
}	
