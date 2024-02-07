package br.com.tavares;

import br.com.tavares.poo.Carro;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Bom dia Turma!");	
		
		boolean condicao = true;
		if (!condicao) {
			System.out.println("Condição verdadeira");
		}else {
			System.out.println("Condição falsa");
		}
		
		int x =5;
		if(x>5) {
			System.out.println("x>5");
		}else if(x<5){
			System.out.println("x<5");
		}else{
			System.out.println("x==5");
		}
		
		Carro carro = new Carro();
		carro.setMarca("Ford");
		carro.setModelo("Escort");
		carro.setCor("Prata");
		carro.ligar();
		carro.parar();
		
		
	}

}
