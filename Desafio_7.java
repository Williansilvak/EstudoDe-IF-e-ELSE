package DesafioIF;

import java.util.Scanner;

public class Desafio_7 
{
	public static void main(String[] args) 
	{
	//Crie um programa que solicite ao usuário a entrada de uma letra do alfabeto.
	//O programa deve verificar se a letra é uma vogal ou uma consoante e imprimir uma mensagem correspondente na tela.

		String alfabeto;
		
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite uma letra do alfabeto");
		alfabeto = teclado.next();
		
		if(alfabeto.equalsIgnoreCase("a" + "e" + "i" + "o" + "u"))
		{
			System.out.println("A letra é vogal");
		}
		else
		{
			System.out.println("E uma consoante");
		}
		
		

		teclado.close();

	}

}
