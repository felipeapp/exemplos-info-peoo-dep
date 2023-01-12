public class Triangulo implements FiguraGeometrica {

	private String nome;
	private double base;
	private double altura;

	public Triangulo(String nome, double base, double altura) {
		this.nome = nome;
		this.base = base;
		this.altura = altura;
	}

	public String toString() {
		return "[" + nome + "] Base: " + base + " e Altura: " + altura;
	}

	public double calcularArea() {
		return base * altura / 2;
	}

	public String obterNome() {
		return nome;
	}

}
