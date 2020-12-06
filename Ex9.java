// Programa que le um numero inteiro N e imprima os N primeiro numeros naturais ímpares.

import java.util.Scanner;

public class Ex9 {
	public static void main(String[] args) {
		int n , inicio=-1, cont=0; 
		try (Scanner ler = new Scanner(System.in)) {
		
			System.out.println("Digite a quantidade de loops");	
			n = ler.nextInt();
			
			while (cont<n) {
				inicio = inicio + 2;
				System.out.println(inicio);
				cont++;}
}}}
