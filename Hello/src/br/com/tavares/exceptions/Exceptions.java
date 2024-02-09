package br.com.tavares.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptions {
	
	public static void Demo() {
		try {
			int divisao = 10/0;
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Erro: "+ e.getMessage()+"\n --"+ e.getStackTrace());
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Erro: "+ e.getMessage());
		}
		System.out.println("Saiu da divisão por zero");
		
		
		System.out.println("\n-----------------------------\n");
		
		try {
			int[] numeros= {0,1,2};
			int valor1=0;
			
			for(int i=0;i<=5;i++) {
				valor1 = numeros[i];
				int valor2=10/valor1;
				System.out.println("Valor2 = "+valor2);
			}
			
			
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Erro de cálculo: "+ e.getMessage() +"\n --"+ e.getStackTrace());
		}
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Erro ao buscar posicao no array: "+ e.getMessage() +"\n --"+ e.getStackTrace());
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Erro: "+ e.getMessage());
		}
		System.out.println("** Continuou 01");
	}
	
	public static void DemoFile() {
		try {
			lerArquivo(null);
			
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("Erro ao ler arquivo: "+ e.getMessage());
			e.printStackTrace();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("**Continuou 2");
	}
	
	public static void DemoExceptionPersonalizada(){
		ContaBancaria contaBancaria = new ContaBancaria();
		try {
			contaBancaria.fazerSaque(1500.0);
		} catch (LimiteCreditoExcedidoException e) {
			System.out.println(e.getMessage());
			System.out.println("Quantia excedida: "+ e.getQuantiaExcedida());
		}
	}


	public static void lerArquivo(String nome) throws FileNotFoundException {
		FileInputStream file= new FileInputStream(nome) ;
	}
}
