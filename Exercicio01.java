package Exercicio01;

import java.util.Scanner;

public class Exercicio01 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Objeto para leitura de dados
		Scanner leia = new Scanner (System.in);
		int numero1, numero2, numero3, maior;
		System.out.println("Digite um numero: ");
		numero1 = leia.nextInt();
		System.out.println("Digite o segundo numero: ");
		numero2 = leia.nextInt();
		System.out.println("Digite o terceiro numero: ");
		numero3 = leia.nextInt();
 if(numero1 > numero2 && numero1 > numero3 ) {
			maior = numero1;
}
			
		else if(numero2>numero1 && numero3>numero3) {
			
			maior = numero2;
		}
		else {
			maior = numero3;
		}
		System.out.println("O maior numero digitado foi: " + maior);
		
		leia.close();
	}

}
