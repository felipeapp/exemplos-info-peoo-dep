public class Principal {

	public static void main(String[] args) {
		var prof = new Professor();
		
		prof.nome = "Felipe Alves";
		prof.cpf = "111.222.333-44";
		prof.matricula = 1812384;
		prof.titulacao = "Doutor";
		prof.formacao = "Ciência da Computação";
		
		System.out.println("Nome: " + prof.nome);
		System.out.println("CPF: " + prof.cpf);
		System.out.println("Matrícula: " + prof.matricula);
		System.out.println("Titulação: " + prof.titulacao);
		System.out.println("Formação: " + prof.formacao);
	}

}
