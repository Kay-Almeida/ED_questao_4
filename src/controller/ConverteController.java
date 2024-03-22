package controller;

import br.org.Kay_Almeida.pilhaint.*;

public class ConverteController {
	
	public ConverteController () {
		
	}
	
	public void dectobin(int n){
		Pilha p = new Pilha(); 
		
		if (n == 0) {
			p.push(0);
	    }

		while (n > 0) {
			int resto = n % 2;
			p.push(resto);
			n /= 2;
	    }
	        
	    while(!p.isEmpty()) {
	        try {
				String valor = Integer.toString(p.pop());
		        System.out.print(valor);
		        
			} catch (Exception e) {
				e.printStackTrace();
			}
	     }
	        	    
	}
	
}


