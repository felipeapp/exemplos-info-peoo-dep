public abstract class FiguraGeometrica {

	private String nome;

	public FiguraGeometrica(String nome) {
		this.nome = nome;
	}

	public String obterNome() {
		return nome;
	}

	public abstract double calcularArea();

}
