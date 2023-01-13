package Ej1;
import java.util.Scanner;

public class RiderJimenezJavier_UF2178_EJ1 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		Scanner teclado = new Scanner(System.in);
		double peso;
		double altura;
		
		
		System.out.println("Introduce la altura del paciente ");
		altura = teclado.nextDouble();
		
		System.out.println("Introduce el peso del piente ");
		peso = teclado.nextDouble();
		
		double diagnostico = peso/(altura*altura);
		System.out.println(diagnostico);
		
		if ( diagnostico<= 0) {
			System.out.println("Imposible");
		}else if ( diagnostico<=18.5) {
			System.out.printf("El paciente de %.2f kg y %.2f m y tiene un diagnostico de %.2f lo que lo hace tener bajo peso ", peso, altura, diagnostico);
		}else if (diagnostico>=18.5 && diagnostico<=24.9) {
			System.out.printf("El paciente de %.2f kg y %.2f m y tiene un diagnostico de %.2f lo que lo hace tener un peso normal ", peso, altura, diagnostico);
		}else if (diagnostico>=25 &&diagnostico<=29.9) {
			System.out.printf("El paciente de %.2f kg y %.2f m y tiene un diagnostico de %.2f lo que lo hace tener sobrepeso ", peso, altura, diagnostico);
		}else if (diagnostico>=30 && diagnostico<=40) {
			System.out.printf("El paciente de %.2f kg y %.2f m y tiene un diagnostico de %.2f lo que lo hace tener obesidad permorbida ", peso, altura, diagnostico);
		}else if (diagnostico<=40)  {
			System.out.printf("El paciente de %.2f kg y %.2f m y tiene un diagnostico de %.2f lo que lo hace tener obesidad morbida ", peso, altura, diagnostico);
		}
	}

}
