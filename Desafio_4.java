package DesafioIF;

import java.util.Scanner;

public class Desafio_4 
{
	public static void main(String[] args) 
	{
	//Escreva um programa que receba dois números do usuário e verifique qual é o maior.
	//Se o primeiro número for maior, imprima "O primeiro número é maior".
	//Se o segundo número for maior, imprima "O segundo número é maior".
	//Caso contrário, imprima "Os números são iguais".

	int numero1;
	int numero2;
	String seila = "salve";
	Scanner teclado = new Scanner(System.in);
	numero1 = teclado.nextInt();
	numero2 = teclado.nextInt();		
	
	if (numero1 > numero2 )	
	{
		System.out.println("Maior numero " + numero1);		
	}
	
	seila = seila.concat("XXX");
	
	System.out.println(seila);
	

	teclado.close();	
	
		
	}

}
