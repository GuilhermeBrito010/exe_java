package exercicios;

import java.util.Scanner;

public class onibus_metodos {

	 Scanner in=new Scanner(System.in);
	 
	int acentos=120;
	
	int passageiros;
	
	int parada;
	
	String localParada;
	
	

	
	

	
public  onibus_metodos(int acentos,int passageiros,int parada,String localParada) {
		 
	
	
	passageiros=this.passageiros;
	
	parada=this.parada;	 
	
	localParada=this.localParada;
		 
		 
		
	 }





	void andar() {
		
	
	

		System.out.println("vrum vrum o onibus ta andando");
	
	}

	
	void parar(){
		
		
		System.out.println("o onibus parô");
			
		
		
	}

    
    
    
    

	void embarque() {
		
		int embarcar;
		
		System.out.println("quantas pessoas embracaram");
		embarcar=in.nextInt();
		
		if(embarcar>acentos) {
			
			
			System.out.println("erro!");
		}else {
		
		
		passageiros=passageiros+embarcar;
		acentos=acentos-passageiros;
		System.out.println("acentos ainda disponiveis:" + acentos);
		
		}
		
	}
	
	void desembarque() {
		
		int desembarcar;
		
		
		System.out.println("quantas pessoas desembarcaram");
		desembarcar=in.nextInt();
		
		
			
			passageiros=passageiros-desembarcar;
			
			acentos=acentos+desembarcar;
			
			System.out.println("acentos ainda disponiveis:" + acentos);
		
	}

	

	
}
