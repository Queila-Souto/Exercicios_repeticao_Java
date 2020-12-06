/* Escreva um programa que escreva na tela, de 1 ate 100, de 1 em 1, 3 vezes. 
 * A primeira vez deve usar a estrutura de repeticão for, a segunda while, e a terceira do while. */

public class Ex2 {
	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 1;
	
		for (int i = 1 ; i<101 ; i++) {
		
			System.out.println(i); }
	
		while (num1 < 101) {
			System.out.println(num1++); } 
	
		do {
			System.out.println(num2++);	}
	while (num2 < 101);
}}
