package exemploPolimorfismo;

public class Principal {
	public static void main(String[] args) {
		Mamifero m = new Mamifero();
		Reptil  r = new Reptil();
		Peixe p = new Peixe();
		
		m.setPeso(35.5f);
		m.setCorPelo("Marrom");
		m.alimentar();
		m.locomover();
		m.emitirSom();
		
		r.alimentar();
		r.locomover();
		r.emitirSom();
		
		p.alimentar();
		p.locomover();
		p.emitirSom();
		p.soltarBolhas();
	}
	
	
}
