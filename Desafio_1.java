package DesafioIF;

import java.util.Scanner;

public class Desafio_1 
{	
	public static void main(String[] args) 
	{
		//Escreva um programa que receba um número do usuário e verifique se ele é maior do que 10.
		//Se for, imprima "O número é maior do que 10". Caso contrário, imprima "O número é menor ou igual a 10".

		int Numero;
		
		Scanner teclado = new Scanner(System.in);

		Numero = teclado.nextInt();
		
		if (Numero >= 10)
		{
			System.out.println("O número e maior do que 10");
		}
		else
		{
			System.out.println("O número e menor ou igual a 10");
		}				

		teclado.close();
		
	}
	
}
