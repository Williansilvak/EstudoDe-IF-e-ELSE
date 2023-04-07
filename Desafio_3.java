package DesafioIF;

import java.util.Scanner;

public class Desafio_3 
{
	public static void main(String[] args) 
	{
	//Escreva um programa que receba a idade de uma pessoa e verifique se ela é maior de idade ou não.
	//Se for maior de idade, imprima "Você é maior de idade". Caso contrário, imprima "Você é menor de idade".
	
		int idade;
		
		Scanner teclado = new Scanner(System.in);

		idade = teclado.nextInt();
		
		if(idade >= 18)
		{
			System.out.println("Você é maior de idade");
		}
		else
		{
			System.out.println("Você é menor de idade");
		}
		
		
		

		teclado.close();
		
		
	}

}
