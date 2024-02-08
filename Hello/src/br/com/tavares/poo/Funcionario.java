package br.com.tavares.poo;

public class Funcionario extends Pessoa {
	private Double salario;

	public Double getSalario() {
		return salario;
	}
	
	
	public Funcionario(String nome, String email, Double salario) {
		super(nome, email);
		this.salario = salario;
	}
	
	

	
	public static void Demo() {
		Funcionario will = new Funcionario("Will", "will@gmail.com", 12100d);
		will.setTelefone("(11)4444-4444");
		System.out.println(will.toString());
	}
	
	
	
	@Override
	public String toString() {
		return this.getNome() + ", "+this.getEmail()+", " +this.getTelefone()+", "+this.salario;
	}
}
