public class Quadrado extends FiguraGeometrica {

	private double lado;

	public Quadrado(String nome, double lado) {
		super(nome);
		this.lado = lado;
	}

	public String toString() {
		return "[" + obterNome() + "] Lado: " + lado;
	}

	public double calcularArea() {
		return lado * lado;
	}

}
