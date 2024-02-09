package br.com.tavares.poo;

public class Professor extends Pessoa {
	String materia;
    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    String turma;
   
    
    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public Professor(String nome, String email, String telefone, String materia, String turma) {
        super(nome, email);
        this.materia = materia;
        this.turma = turma;
        this.setTelefone(telefone);
        
    }

    public static void Demo(){
        Professor klaus = new Professor("Klaus", "klaus@gmail.com", "(11)99999-9999", "Java", "Reeskilling");
        System.out.println(klaus.toString());
        }

    public String toString(){
        return this.getNome()+", "+this.getEmail()+", "+this.getTelefone()+", "
+this.materia+", "+this.turma;    }
}
