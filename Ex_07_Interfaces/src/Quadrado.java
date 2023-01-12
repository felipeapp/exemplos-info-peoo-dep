
public class Quadrado implements FiguraGeometrica {

	private String nome;
	private double lado;

	public Quadrado(String nome, double lado) {
		this.nome = nome;
		this.lado = lado;
	}

	public String toString() {
		return "[" + nome + "] Lado: " + lado;
	}

	public double calcularArea() {
		return lado * lado;
	}

	public String obterNome() {
		return nome;
	}

}
