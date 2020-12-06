//Programa que calcula e exibe a soma dos 50 primeiros números pares

public class Ex10 {

	public static void main(String[] args) {
		int soma = 0;
		int num = 0;
		
		for (int i=0 ; i<50 ; i++) {
			num = num +2;
			System.out.println(num);
			soma = soma+num;	} // fim do laço
		
		System.out.println("\n====================");
		System.out.println("\nA soma é " + soma);
}}


