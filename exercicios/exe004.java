package exercicios;

import java.util.Scanner;

public class exe004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
		Scanner in=new Scanner(System.in);
	    int x,y,a=0,operacao ;
	    
	    
	    System.out.println("num");
	    x=in.nextInt();
	    
	    System.out.println("num2");
	    y=in.nextInt();
	    
	    System.out.println("qual operacao tu que 1=+ 2=- 3=* 4=/");
		operacao=in.nextInt();
		
		
		if(operacao==1) {
			
			a=x+y;
			System.out.println(a);	
		
		}else if(operacao==2) {
			
			a=x-y;
				System.out.println(a);	
		
		}else if(operacao==3) {
			
		
		a=x*y;
		System.out.println(a);
		
		}
		
		
		
		else if(operacao==4) {
			
			
		a=x/y;
		System.out.println(a);
		
		}
		
					
							
			
		else {
			
			System.out.println("palhaco");
					
		
		
		
		}

	}
	
}


