//ler 10 inteiros e imprimir a média
// Usando FOR

import java.util.Scanner;
public class Ex6 {
public static void main(String[] args) {
	int numero = 0 ;
	int soma = 0;
	int i ; // nosso contador foi declarado antes do loop para podermos ter acesso fora do bloco de repetição
	for ( i=0 ; i<10 ; i++) {
		System.out.println("Digite um numero");
		numero = new Scanner(System.in).nextInt();
		soma = numero+soma; // soma o valor digitado AGORA com o digitado ANTES
		}
	int media = soma / i; // A média é calculada fora do loop, pois precisamos do valor da soma.
	System.out.println("A soma é " + soma);
	System.out.println("A quantidade de numeros digitados é " + i); 
	System.out.println("A média é " + media);
	
}
}