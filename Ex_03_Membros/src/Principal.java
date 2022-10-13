
public class Principal {

	public static void main(String[] args) {

		var conta1 = new Conta();
		var conta2 = new Conta();
		var conta3 = new Conta("Maria", 3);

		conta2.setTitular("Felipe");
		conta2.setTipo(2);

		if (conta2.deposito(200))
			System.out.println("Depósito de 200");

		if (conta2.saque(250))
			System.out.println("Saque de 250");

		if (conta2.saque(50))
			System.out.println("Saque de 50");

		System.out.println("Conta 1: " + conta1);
		System.out.println("Conta 2: " + conta2);
		System.out.println("Conta 3: " + conta3);

	}

}
