
public class Conta {

	private String titular;
	private double saldo;
	private int tipo;

	public Conta() {
		titular = "Anônimo";
		saldo = 0;
		tipo = 1;
	}

	public Conta(String titular, int tipo) {
		this.titular = titular;
		this.saldo = 0;
		this.tipo = tipo;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
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

	public boolean saque(double valor) {
		boolean sucesso = false;

		if (saldo >= valor) {
			saldo -= valor;
			sucesso = true;
		}

		return sucesso;
	}

	public String toString() {
		return titular + ", " + saldo + ", " + tipo;
	}

}
