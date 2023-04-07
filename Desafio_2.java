package DesafioIF;

import java.util.Scanner;

public class Desafio_2 
{
	public static void main(String[] args) 
	{
	//Escreva um programa que receba um número do usuário e verifique se ele é par ou ímpar.
	//Se for par, imprima "O número é par". Caso contrário, imprima "O número é ímpar".

		int numero;
		
		Scanner teclado = new Scanner(System.in);
		
		numero = teclado.nextInt();
		
		//o programa usa o operador de módulo % para verificar se o número é divisível por 2.
		//Se o número for divisível por 2, o resultado do operador de módulo será 0, o que significa que o número é par.
		//Caso contrário, se o resultado do operador de módulo for diferente de 0, o número é ímpar.
		if( numero %  2 == 0)
		{
			System.out.println("O número e par");
		}
		else
			
		{
			System.out.println("O número e impar");
		}
		
		
		
		

		teclado.close();

	}

}
