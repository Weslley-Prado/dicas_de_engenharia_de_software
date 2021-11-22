package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex2Nota {
	
	public static void main(String[]args) {
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			int nota;
			System.out.println("Nota:");
			nota = scan.nextInt();
			/* Enquanto a nota for entre 0 a 10, o programa não irá repetir, caso contrário, 
			solicitará uma nota dentro do intervalo */
			while(nota<0 | nota>10) {
				System.out.println("Nota Inválida, digite um nota válida:");
				nota = scan.nextInt();

				
			}
		}
		
	}


