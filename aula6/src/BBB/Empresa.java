package BBB;

public class Empresa {
	private String nome;
	private Departamento [] departamento;
	private int qtdDepartamento;
	public Empresa(String nome) {
		this.nome = nome;
		departamento = new Departamento[3];
	//	departamento[0] =  new Departamento("RH");
	//	departamento[1] =  new Departamento("Fianceiro");
	//	departamento[2] =  new Departamento("MKt");
	}
	
	public boolean adicionarDepartamento(String nomeDepto) {
		if(qtdDepartamento < departamento.length) {
			departamento[qtdDepartamento] = new Departamento(nomeDepto);
			qtdDepartamento++;
			return true;
		}
		return false;
	}
	
	
	public String toString() {
		String s = "Empresa " + nome + "[";
		s+= departamento[0] + ", " + departamento[1] + ", " +  departamento[2]; 
		return s;
	}
}
