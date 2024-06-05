package Codigo_limpo;

import java.util.Scanner;

public class At1 {

	public static void main(String[] args) {
		Scanner ler= new Scanner (System.in);
		int fat = 1,num;
		
		System.out.println("informe o Fatorial: ");
		num=ler.nextInt();
		
		if(num < 0) {//estrutura de decisão
			System.out.print(" não existe o fatoril de número negativo!");
			System.exit(0);
		}
			for (int i = 1 ; i <= num; i++) {//estrutura de repetição
				fat *= i;
			}
			System.out.println("O fatorial de "+ num + " é :" + fat);
		ler.close();
	}
}
