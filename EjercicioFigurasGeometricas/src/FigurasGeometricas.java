
public class FigurasGeometricas {
	
	float area = 0;
	float perimetro = 0;
	
	public float calcularArea(float base, float h) {
		
		area = base  * h;
		
		return area;
	}

	public float calcularPerimetro(float base, float lados) {
		perimetro = base * lados;
		
		return perimetro;
	}
	
}
