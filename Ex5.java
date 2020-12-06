import java.util.Scanner;

public class Ex5 {

//		    public static void main(String[] args){
//	        Scanner ler = new Scanner(System.in);
//	        
//	        int num, soma = 0;
//	        int cont = 0; //variavel para fazer a contagem dos loops
//	        
//	        do{
//	            System.out.println("Digite um número");
//	            num = ler.nextInt() ; // usuario digita um número que é lido pelo sistema
//	            
//	                soma = num + soma; // soma o valor digitado AGORA com o digitado ANTES
//	                cont++; // acrescenta + 1 ao contador
//	            }
//	         while(cont < 10); // para que o loop seja executado 10x.
//	        
//	        System.out.println("A soma é " + soma); // Exibe a soma quando acabar os loops
//	        
//		    }
//}
	
	
	    public static void main(String[] args){
        int num, soma = 0;
                
        for(int i = 0 ; i < 10 ; i++ ){
            System.out.println("Digite um número");
            num = new Scanner(System.in).nextInt() ; // usuario digita um número que é lido pelo sistema
            
                soma = num + soma; // soma o valor digitado AGORA com o digitado ANTES
            }
    
        
        System.out.println("A soma é " + soma); // Exibe a soma quando acabar os loops
        
	    }
}