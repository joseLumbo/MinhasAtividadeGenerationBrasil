package Tarefas;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int nota1,nota2,nota3,media;
		System.out.println("Digite a primeira nota1: ");
		nota1 = leia.nextInt();
		System.out.println("Digite a primeira nota2: ");
		nota2 = leia.nextInt();
		System.out.println("Digite a primeira nota3: ");
		nota3 = leia.nextInt();
		media = (nota1 +nota2 +nota3) / 3;
		System.out.println("A media entre as notas foi de: "+media);
		
		
		

	}

}
