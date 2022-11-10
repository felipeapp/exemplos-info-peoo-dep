public class Teste {

	public static void main(String[] args) {

		var sga = new Campus();
		sga.setEndereco("Rua Prof. Carlos Guedes");

		var marilac = new DiretorGeral();
		marilac.setNome("Marilac");

		marilac.setCampus(sga);
		sga.setDiretor(marilac);

		System.out.println("Dados do Diretor");
		System.out.println(marilac.getNome());
		System.out.println(marilac.getCampus().getEndereco());

		System.out.println("---------------------");

		System.out.println("Dados do Campus");
		System.out.println(sga.getEndereco());
		System.out.println(sga.getDiretor().getNome());

	}

}
