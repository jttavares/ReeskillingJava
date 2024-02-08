package br.com.tavares.intro;

public class AulaIntrodutorua {
	public static void Start(){
		
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
		
	}
	
}
