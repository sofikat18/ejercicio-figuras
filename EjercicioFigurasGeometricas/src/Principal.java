
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Crea una clase padre FigurasGeometricas con un método calcular área. 
		 * Escribir 3 clases hijos que hereden de figuras geométricas, definir 
		 * los atributos y métodos necesarios para calcular el área, y al final 
		 * crear objetos de esas 3 clases que sean capaces de calcular las 
		 * respectivas areas
		 */
		
		Triangulo t1 = new Triangulo();
		System.out.println("El área de tu triángulo es: " + t1.calcularArea(5, 8));
		
		Cuadrado c1 = new Cuadrado();
		System.out.println("El área de tu cuadrado es: " + c1.calcularArea(5, 8));
		
		Pentagono p1 = new Pentagono();
		float perimetro = p1.calcularPerimetro(4, 5);
		System.out.println("El área de tu pentágono es: " + p1.calcularArea(perimetro, 6));
	}

}
