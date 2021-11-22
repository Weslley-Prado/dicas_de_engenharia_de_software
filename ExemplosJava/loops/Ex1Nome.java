package br.com.dio.exercicios.loops;
import java.util.Scanner;

/* No programa abaixo, exemplifica como podemos usar While.
Por exemplo, quando queremos que uma instrução se repita utilizamos While;
Abaixo, haverá os comentários das linhas. Lembrando que abaixo são apenas 
exemplos de como podemos usar o while.
*/

public class Ex1Nome {

	public static void main(String[]args) {
		// Esse código utilizei no eclipse para não aparecer mensagens de atenção para o Scanner.
		@SuppressWarnings("resource")
		// Utilizamos essa forma para receber dados do teclado.
		Scanner scan = new Scanner(System.in);
		//Definimos uma variável para o dado que solicitamos, no caso do tipo String.
		String nome;
		@SuppressWarnings("unused")
		//Aqui definimos uma variável do tipo inteira de nome idade.
		int idade;

		// Enquanto a condição for true (verdadeira), o bloco irá se repetir.
		while(true) {
             
			System.out.println("Nome:");
			nome =scan.next();
            System.out.println("Idade:");
			idade = scan.nextInt();			
		     // Usamos o if para caso o usuário digite 0, se digitar 0, o bloco não será mais repetido.
			if (idade.equals("0")) break;
		}
		
		System.out.println("Continua...");
	}
	
}
