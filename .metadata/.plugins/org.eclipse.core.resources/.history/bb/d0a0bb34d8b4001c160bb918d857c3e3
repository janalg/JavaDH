package bancario;

public class ContaCorrente extends Conta{
	private double limite;
	
	public ContaCorrente() {
		this.limite = 500.0;
	}
	
	
	@Override
	public boolean sacar(double valor) {
		double saldoTotal = saldo + limite;
		if (valor > 0 && saldoTotal >= valor) {
			saldoTotal -= valor;
			return true;
		}
		return false;
		
	}
	@Override
	public boolean transferir(double valor, Conta destinatario) {
		if (valor > 0 && saldo >= valor) {
			saldo -= valor;
			destinatario.depositar(valor);
			return true;
		}
		return false;
	}
	
	
	
	public double getLimite() {
		return this.limite;
	}
}
