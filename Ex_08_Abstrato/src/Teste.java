public class Teste {

	public static void main(String[] args) {

		FiguraGeometrica figura = new Quadrado("Quadrado", 3);
//		FiguraGeometrica figura = new Triangulo("Triângulo", 3, 4);

		System.out.println(figura.calcularArea());
		System.out.println(figura.obterNome());

		System.out.println(figura);

	}

}
