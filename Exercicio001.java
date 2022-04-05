package Exercicio01;

import java.util.Scanner;

public class Exercicio001 {
	public static void main(String[] args){
		
		int idadeAnos, idadeMeses,idadeDias, totalDias;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe a sua idade.");
		System.out.print("Anos: ");
		idadeAnos = leia.nextShort();
		
		System.out.print("Meses: ");
		idadeMeses = leia.nextShort();
		
		System.out.print("Dias: ");
		idadeDias = leia.nextShort();
		
		totalDias = (idadeAnos * idadeAnos) + (idadeMeses * idadeMeses);
		
		System.out.println(" sua idade em dias é " + totalDias);
	}
}
