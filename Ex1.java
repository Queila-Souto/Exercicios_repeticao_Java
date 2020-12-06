//Faça um programa que determine ou mostre cinco os primeiros múltiplos de três considerando números maiores que zero 


public class Ex1 {
	public static void main(String[] args) {
		int numero  = 0;
		for (int i = 0; i<5 ; i++){
			numero = numero + 3;
	    	System.out.println(numero);
		}// A cada loop o program soma 3 a variavel numero. Como temos 5 loops, o programa exibirá os 5 primeiros resultados
}}

/* ESTRUTURA WHILE: 
	public static void main(String[] args) {
		int numero  = 0;
		int cont = 0;// contador 
		
		while (cont < 5){
			numero = numero + 3;
			System.out.println(numero);
			cont++; } // acresce uma unidade a cada loop
		
	} */