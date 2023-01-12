public class Triangulo extends FiguraGeometrica {

	private double base;
	private double altura;

	public Triangulo(String nome, double base, double altura) {
		super(nome);
		this.base = base;
		this.altura = altura;
	}

	public String toString() {
		return "[" + obterNome() + "] Base: " + base + " e Altura: " + altura;
	}

	public double calcularArea() {
		return base * altura / 2;
	}

}
