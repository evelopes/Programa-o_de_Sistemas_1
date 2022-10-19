package CONSTRUTOR;

public class TestaFuncionario {
	public static void main(String[] args) {
		Funcionario um = new Funcionario("Ricardo", 3950);
		System.out.println("Nome do funcionário: " +  um.nome);
		System.out.println("Salário: " +  um.salario);		
		System.out.println("Imposto devido: " + um.calculaImposto());
		
	}
	
}
