package view;

import javax.swing.JOptionPane;

import controller.ConverteController;

public class Principal {
	
	public static void main(String[] args) {
		
		ConverteController cv = new ConverteController(); 
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para ser convertido em binario: ")); 
		
		if (n<= 1000) {
			System.out.print(n + " em binario é: ");  
			cv.dectobin(n);  
		}else {
			System.out.println("Entrada inválida!. Digite um numero menor ou igual a 1000."); 
		}
	}

}
