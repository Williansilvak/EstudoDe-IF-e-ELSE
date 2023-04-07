package DesafioIF;

import java.util.Scanner;

public class Desafio_5 
{
	public static void main(String[] args) 
	{
		
	//Escreva um programa que receba um número do usuário e verifique se ele é positivo, negativo ou zero.
	//Se for positivo, imprima "O número é positivo". Se for negativo, imprima "O número é negativo".
	//Caso contrário, imprima "O número é zero".
		int Numero;
		
		Scanner teclado = new Scanner(System.in);

		Numero = teclado.nextInt();
		
		if (Numero > 0)
		{
			System.out.println("O número é positivo");
		}
		else
		{
			Numero = 0;
			System.out.println("O numero e zero "+ Numero);
		}

		teclado.close();

	}

}
