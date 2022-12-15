public class Principal {

	public static void main(String[] args) {

		Conta cc = new ContaCorrente("Felipe", 0.05);
		Conta cp = new ContaPoupanca("Maria", 0.015);

		System.out.println(cc.deposito(100));
		System.out.println(cp.deposito(150));
		System.out.println(cc.saque(25));
		System.out.println(cp.saque(200));

		System.out.println("-----");
		System.out.println(cc);
		System.out.println("-----");
		System.out.println(cp);

	}

}
