//Programa que recebe 10 n�meros e diz qual � o menor e maior valor

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
				maior = numero1;}	//verifica��o do maior n�mero
				
			else {
				menor = numero1;}	//verifica��o do menor n�mero				
		} //fim do la�o
			
		//Exibi��o do resultado. Fora do la�o.
		System.out.println("O numero maior � " + maior);
		System.out.println("O numero menor � " + menor);
		
	}}


