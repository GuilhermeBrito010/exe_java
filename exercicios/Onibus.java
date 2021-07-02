package exercicios;
import java.util.*;


public class Onibus {

public static void main(String[] args) {	
  Scanner in=new Scanner(System.in);
	int opcao,cont,paradas = 0,caminho=0;
	int viajem;
	 System.out.println("bem vindo");
	 System.out.println("aproximadamente  de quantos KM será a viajem");
	 viajem=in.nextInt();
	 
	 do {
	System.out.println(" o que deseja fazer \n 1-andar \n 2-parar \n 3-embarcar \n 4-desembarcar");
	opcao=in.nextInt();
	
	onibus_metodos onibus_metodos=new onibus_metodos(opcao, opcao, opcao, null);
	
	
	
	if(opcao==1) {caminho = caminho+1;}
	if(opcao==1) {
		
		onibus_metodos.andar();

		
	}
	if(opcao==2) {paradas = paradas+1;}
	if(opcao==2) {
		
		
		
		onibus_metodos.parar();
	}

	if(opcao==3) {
		
		onibus_metodos.embarque();
		
		
	}
	
	if(opcao==4) {
		
		
		onibus_metodos.desembarque();
		
		
	}
	
	
	
	
	System.out.println("deseja continuar? \n1-sim \n2-nao");
	cont=in.nextInt();	
	
	if(cont==2) {
		
		System.out.println("ok até a proxima");
		
	}
	
if(caminho==viajem) {
		
		System.out.println("obrigado pela viajem no total foram feitas " + paradas + " " + "paradas");
		cont=2;
	}
}while(cont==1);
}	


}



