package BBB;

public class Exemplo1 {
	public static void main(String[] args) {
		Empresa e ;
		e = new Empresa("Mackenzie");
		System.out.println(e);
		e.adicionarDepartamento("Diversão");
		e.adicionarDepartamento("Estudo");
		e.adicionarDepartamento("mundo");
		System.out.println(e);
	}

}
