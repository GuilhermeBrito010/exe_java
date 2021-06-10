package exercicios;

import java.util.Scanner;


public class exe007 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int vet[]= new int[10];
		int soma = 0;
		
		System.out.println("digite dez numeros");
		vet[0]=in.nextInt();
		vet[1]=in.nextInt();
		vet[2]=in.nextInt();
		vet[3]=in.nextInt();
		vet[4]=in.nextInt();
		vet[5]=in.nextInt();
		vet[6]=in.nextInt();
		vet[7]=in.nextInt();
		vet[8]=in.nextInt();
		vet[9]=in.nextInt();
		
		
		 for (int valor=0;valor <vet.length;valor++){  
              
	     if(vet[valor]<40) {	
		 soma =soma+vet[valor];
		 }
		 }
	
		System.out.println("total"+" "+soma);
	
}
}