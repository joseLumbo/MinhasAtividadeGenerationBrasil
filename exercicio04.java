package Tarefas;

import java.util.Scanner;

public class exercicio04 {
	//4-Escreva  um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e calcule a seguinte express�o: 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//4. Escreva  um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e calcule a seguinte express�o: 
		
		Scanner leia = new Scanner(System.in);
		int a,b,c,d=0,r=0,s=0;
		System.out.println("Insere o valor de a: ");
		a = leia.nextInt();
		System.out.println("Insere o valor de b: ");
		b = leia.nextInt();
		System.out.println("Insere o valor de c: ");
		c = leia.nextInt();
			d=(r+s) / 2;
			r=(a+b)*(a+b);
			s=(b+c)*(b+c);
			System.out.println(" A sua divisao foi de: "+d);
			System.out.println("O calculo foi de: "+r);
			System.out.println("O calculo foi de: "+s);
			
			leia.close();
	
		
		

	}

}
