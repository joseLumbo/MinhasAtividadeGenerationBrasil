package Tarefas;
//Fa�a um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias. 
import java.util.Scanner;

public class Exercicioo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int idadeAnos, idadeMeses,idadeDias, totalDias;
		System.out.println("Digite sua idade ");
		totalDias = leia.nextInt();
		

		idadeAnos = totalDias/365;

		totalDias = totalDias%365;

		idadeMeses = totalDias/30;

		totalDias = totalDias%30;

		idadeDias = totalDias;
		
		System.out.println("A idade � : " + idadeAnos );
		System.out.println("A quantidade de meses � : " + idadeMeses);
		System.out.println("A quantidade de dias � : " + idadeDias ); 
		

		
		}
	}

