package Alunos;

public class Aluno {
	public String nome;
	public double notaMat, notaFis, media;
	
	public double calculaMedia() {
		media = (notaMat + notaFis)/2;
		return media;
	}
	
	public String verificaStatus() {
		if (media >= 6.0)
			return "Aprovado";
		else
			return "Reprovado";
	}
}
