//ler 10 inteiros positivos, ignorando os negativos e imprimir a m�dia

import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		int numero = 0 ;
		int soma = 0;
		int cont = 0 ;// nosso contador
		
		for (int i=0 ; i<10 ; i++) {
			System.out.println("Digite um numero");
			numero = new Scanner(System.in).nextInt();
				if (numero >= 0) {
					soma = numero+soma; // soma o valor digitado AGORA com o digitado ANTES
					cont++; } // contador recebendo 1 em cada loop
				else {
					System.out.println("numero invalido"); }
			} // fim do la�o
		
		float media = soma / cont; // A m�dia � calculada fora do loop, pois precisamos do valor da soma.
		System.out.println("A soma � " + soma);
		System.out.println("A quantidade de numeros digitados � " + cont); 
		System.out.println("A m�dia � " + media);
		}
	}
	