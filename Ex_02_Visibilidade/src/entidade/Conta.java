package entidade;

public class Conta {

	// Visível apenas pela própria classe
	private double saldo;

	// Visível por todas as classes
	public String titular;

	// Visível por classes que estejam no mesmo pacote
	protected int tipo;

	public Conta() {
		System.out.println("Dentro do construtor padrão de Conta!");
		saldo = 0;
		titular = "Anônimo";
		tipo = 1;
	}

	public Conta(String titular, int tipo) {
		System.out.println("Dentro do construtor com 2 parâmetros de Conta!");
		this.saldo = 0;
		this.titular = titular;
		this.tipo = tipo;
	}

	public Conta(String titular, double saldo, int tipo) {
		System.out.println("Dentro do construtor com 3 parâmetros de Conta!");
		this.saldo = saldo;
		this.titular = titular;
		this.tipo = tipo;
	}

	public boolean deposito(double valor) {
		boolean sucesso = false;

		if (valor > 0) {
			saldo += valor;
			sucesso = true;
		}

		return sucesso;
	}

	public double lerSaldo() {
		return this.saldo;
	}

	public void alterarTipo(int tipo) {
		this.tipo = tipo;
	}

	public int lerTipo() {
		return this.tipo;
	}

}
