package exercicio02;
import java.util.Scanner;
import java.util.Locale;

public class CalculoDePerimetro {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double base = sc.nextDouble();
		double altura = sc.nextDouble();
		double area = base * altura;
		double perimetro = 2 * (base + altura);
		double diagonal = Math.sqrt(Math.pow(base,2.0) + Math.pow(altura, 2.0));
		System.out.printf("Área é = %.4f%n", area);
		System.out.printf("Perímetro é = %.4f%n", perimetro);
		System.out.printf("Diagonal é = %.4f%n", diagonal);
		
		
		sc.close();
	}

}
