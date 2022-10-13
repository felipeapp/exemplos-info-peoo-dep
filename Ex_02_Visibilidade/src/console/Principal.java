package console;

import entidade.Conta;

public class Principal {

	public static void main(String[] args) {
		var c1 = new Conta();
		var c2 = new Conta("Maria", 3);
		var c3 = new Conta("João", 200, 3);

		c1.titular = "Felipe";
		c1.alterarTipo(2);

		if (c1.deposito(100))
			System.out.println("Sucesso ao depositar!");
		else
			System.out.println("Falha ao depositar!");

		System.out.println("Conta 1:");
		System.out.println("Titular da conta: " + c1.titular);
		System.out.println("Tipo da conta: " + c1.lerTipo());
		System.out.println("Saldo da conta: " + c1.lerSaldo());
		System.out.println("------------------");
		System.out.println("Conta 2:");
		System.out.println("Titular da conta: " + c2.titular);
		System.out.println("Tipo da conta: " + c2.lerTipo());
		System.out.println("Saldo da conta: " + c2.lerSaldo());
		System.out.println("------------------");
		System.out.println("Conta 3:");
		System.out.println("Titular da conta: " + c3.titular);
		System.out.println("Tipo da conta: " + c3.lerTipo());
		System.out.println("Saldo da conta: " + c3.lerSaldo());
	}

}
