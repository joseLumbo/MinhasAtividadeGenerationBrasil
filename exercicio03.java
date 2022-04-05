package Tarefas;

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int idade;
		System.out.println("Digite a sua idade: ");
		idade = leia.nextInt();
		if(idade >= 10 && idade <=14) {
			System.out.println("Idade infatil: ");
			leia.close();	
		}
		else if(idade >= 15 && idade <=17) {
			System.out.println("Idade Juvenil: ");
		}
		else if(idade >= 18 && idade <=25) {
			System.out.println("Idade  adulta ");
		}
	else {
		System.out.println("Idade Invalida!");
	}

}
}
