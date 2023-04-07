package DesafioIF;

import java.util.Scanner;

public class Desafio_6
{
	public static void main(String[] args) 
	{
	//Escreva um programa que receba a idade de uma pessoa e verifique se ela pode votar ou não.
	//Se a idade for igual ou superior a 18, imprima "Você pode votar".
	//Caso contrário, imprima "Você não pode votar".
		
		int idade;		
		
		Scanner teclado = new Scanner(System.in);
		idade = teclado.nextInt();
		
		if (idade >= 18)
		{
			System.out.println("Você pode votar");
		}
		else 
		{
			System.out.println("Você não pode votar");
		}

		teclado.close();


		
	}

}
