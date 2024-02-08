package br.com.tavares.poo;

public class Aluno extends Pessoa {
	private String matricula;
	private String dtMatricula;
	
	
	public Aluno(String nome, String email, String matricula, String idMatricula) {
		super(nome, email);
		this.matricula = matricula;
		this.dtMatricula = idMatricula;
	}
	
	public Aluno(String nome, String email, String telefone, String matricula, String idMatricula) {
		super(nome, email);
		this.setTelefone(telefone);
		this.matricula = matricula;
		this.dtMatricula = idMatricula;
	}

	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getIdMatricula() {
		return dtMatricula;
	}
	public void setIdMatricula(String idMatricula) {
		this.dtMatricula = idMatricula;
	}
	
	public static void Demo() {
		Aluno kennedy = new Aluno("Kennedy", "kennedy@gmail.com", "001","08/02/2024");
		System.out.println(kennedy.toString());
	}
	
	@Override
	public String toString() {
		return this.getNome() + ", "+this.getEmail()+", " +this.getTelefone()+", "+this.matricula+", "+this.dtMatricula;
	}
}
