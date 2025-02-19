package Main;

import java.util.Locale;
import java.util.Scanner;

public class while_2 {

	public static void main(String[] args) {

		/*
		 * Fa�a um programa para ler um n�mero indeterminado de dados, contendo cada um,
		 * a idade de um indiv�duo. O �ltimo dado, que n�o entrar� nos c�lculos, cont�m
		 * um valor de idade negativa. Calcular e imprimir a idade m�dia deste grupo de
		 * indiv�duos. Se for entrado um valor negativo na primeira vez, mostrar a
		 * mensagem "IMPOSSIVEL CALCULAR".
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int idade, npessoas;
		double soma,media;

		System.out.println("Digite as idades: ");
		idade = sc.nextInt();
		
		if (idade < 0) {
			System.out.println("IMPOSSIVEL CALCULAR");
		}
		else {
			 soma = 0;
			 npessoas = 0;
			 while (idade >=0) {
				 soma = soma + idade;
				 npessoas++;
				 idade = sc.nextInt();
			 }
			 media = soma / npessoas;
			 
			 System.out.printf("MEDIA = %.2f\n", media);
		}

		sc.close();

	}

}
