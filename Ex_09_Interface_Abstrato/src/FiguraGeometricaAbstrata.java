public abstract class FiguraGeometricaAbstrata implements FiguraGeometrica {

	private String nome;

	public FiguraGeometricaAbstrata(String nome) {
		this.nome = nome;
	}

	public String obterNome() {
		return nome;
	}

}
