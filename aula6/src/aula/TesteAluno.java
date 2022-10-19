package aula;

public class TesteAluno {
	public static void main(String[] args) {
		Aluno alu1 =  new Aluno();
		Endereco local = new Endereco();
		local.logradouro = "Aniz T. Resek";
		local.numero = 115459;
		local.CEP = "08793-020";
		local.cidade = "Mogi das Cruzes";
		local.estado = "São Paulo";
		alu1.tia = 22007431;
		alu1.nome = "Evelin";
		alu1.endereco = local;
		System.out.println("Aluno:" + alu1.nome);
		System.out.println("Endereço:" + alu1.endereco.logradouro + ", "+
							alu1.endereco.numero+ "\n" + alu1.endereco.CEP 
							+ " - " + alu1.endereco.cidade + " - " + 
							alu1.endereco.estado);
	}
}
