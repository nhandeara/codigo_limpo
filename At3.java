package Codigo_limpo;

import java.util.Scanner;

public class At3 {

	public static void main(String[] args) {
		int senhaMestre, senhaTentativa;
		double n1,n2, soma;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Cadastre uma senha (Apenas Números): ");
		senhaMestre=ler.nextInt();
		
		System.out.println("Digite um numero: ");
		n1=ler.nextDouble();
		System.out.println("Digite outro número: ");
		n2 = ler.nextDouble();
		soma = n1+n2;
		
		System.out.print("Digite a sua senha para desbloquear a soma: ");
		senhaTentativa= ler.nextInt();
		
		if (senhaTentativa==senhaMestre) {
		System.out.println("a soma é: " + soma);
		}
		
		else {
			
			System.out.println("erro! Senha erradas!");
		ler.close();
			
		}
	}

}
