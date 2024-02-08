package br.com.tavares.poo;

public class Carro {
	private String cor;
	private String marca;
	private String modelo;
	
	public Carro () {}
	
	public Carro(String marca, String modelo, String cor) {
		this.cor = cor;
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public Carro(String marca, String modelo) {
		this.cor = "Branco";
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public  void ligar() {
		String texto = "O "+this.marca + " "+ this.modelo+" "+ this.cor+" está em movimento.";
		System.out.println(texto);
	}
	public  void parar() {
		String texto = "O "+this.marca+" "+ this.modelo+" "+ this.cor+" parou.";
		System.out.println(texto);
	}
	//GET E SET
	public String getCor() {
		return this.cor;
	}
	public void setCor(String cor) {
		this.cor=cor;
	}
	public String getMarca() {
		return this.marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return this.modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public static void CarroExercises() {
		Carro carro = new Carro();
		carro.setMarca("Ford");
		carro.setModelo("Escort");
		carro.setCor("Prata");
		carro.ligar();
		carro.parar();
		
		Carro celta = new Carro("GM", "Celta", "Azul");
		celta.ligar();
		celta.parar();
		
		Carro kombi = new Carro("Volkswagen","Kombi");
		kombi.ligar();
		kombi.parar();
	}
	
	@Override
	public String toString() {
		return this.marca + " "+ this.modelo+" "+ this.cor+".";
	}
	
}
