package Codigo_limpo;

import java.util.Scanner;

public class At2 {

	public static void main(String[] args) {
		// variaveis 
		double a;
		//Instanciar classe Scanner
		Scanner ler=new Scanner (System.in);
		
		//entrada de dados 
		System.out.println("informe um valor: ");
		a= ler.nextDouble();
		
		if (a % 5 == 0)//estrutura de repetição
			System.out.println ("o numero "+a+ " é multiplo de 5");
		
		if (a % 5 == 0)//estrutura de repetição 
			System.out.println("o numero " + a + "não é multiplo de 5");
		ler.close();
		

	}

}
