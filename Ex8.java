//Programa que recebe 10 números e diz qual é o menor e maior valor

import java.util.Scanner;

public class Ex8 {
	public static void main(String[] args) {
		int numero1 = 0;
		int maior = 0;
		int menor = 0;
		
		for (int i = 0 ; i < 10 ; i++) {
			System.out.println("Digite um numero");
			numero1 = new Scanner(System.in).nextInt();
						
			if (numero1 > maior) {
				maior = numero1;}	//verificação do maior número
				
			else {
				menor = numero1;}	//verificação do menor número				
		} //fim do laço
			
		//Exibição do resultado. Fora do laço.
		System.out.println("O numero maior é " + maior);
		System.out.println("O numero menor é " + menor);
		
	}}


