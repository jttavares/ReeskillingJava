package br.com.tavares.poo;

public class Carro {
	private String cor;
	private String marca;
	private String modelo;
	
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
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
}
