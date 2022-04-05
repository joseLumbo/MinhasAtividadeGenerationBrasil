package Exercicio01;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Objeto de entraa de dados
		Scanner leia = new Scanner(System.in);
		
		int num1, num2, num3;
		System.out.println("Digite o primeiro numero: ");
		num1= leia.nextInt();
		System.out.println("Digite o segundo numero: ");
		num2=leia.nextInt();
		System.out.println("Digite o terceiro numero: ");
		num3=leia.nextInt();
		if(num1<num2 && num2<num3) {
			System.out.println("Em ordem crescente teremos: " + num1 + ", " + num2 + " e " + num3 );
			leia.close();	
		}
		else if(num2<num1 && num1<num3) {
			System.out.println("Em ordem crescente teremos: " + num2 + ", " + num1 + " e " + num3 );
			leia.close();
			
		}
		else if(num1<num3 && num3<num2) {
			System.out.println("Em ordem crescente teremos: " + num1 + ", " + num3 + " e " + num2 );
			leia.close();
			
		}
		else if(num3<num1 && num1<num2) {
			System.out.println("Em ordem crescente teremos: " + num3 + ", " + num1 + " e " + num2 );
			leia.close();
			
		}
		else if(num3<num2 && num2<num1) {
			System.out.println("Em ordem crescente teremos: " + num3 + ", " + num2 + " e " + num1 );
			leia.close();
			
		}
		else {
			System.out.println("Em ordem crescente teremos: " + num2 + ", " + num3 + " e " + num1 );
			leia.close();

		}

	}
	
}
