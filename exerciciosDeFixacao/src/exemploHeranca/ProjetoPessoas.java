package exemploHeranca;

public class ProjetoPessoas {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();
		
		p1.setNome("Pedro");
		p2.setNome("Maria");
		p3.setNome("Jo�o");
		p4.setNome("Caio");
		
		p1.setSexo("M");
		p2.setSexo("F");
		p3.setSexo("M");
		p4.setSexo("M");
		
		p1.setIdade(18);
		p2.setIdade(22);
		p3.setIdade(64);
		p4.setIdade(45);
		
		p2.setCurso("Inform�tica");
		p3.setSalario(2500.50f);
		p4.setSetor("Estoque");
		
		p2.cancelarMatr();
		p3.receberAumento(500);
		p4.mudaTrabalho();
		
		
		
		
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
	}
}
