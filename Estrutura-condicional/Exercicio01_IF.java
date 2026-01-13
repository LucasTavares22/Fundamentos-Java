package exercicio01_if;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01_IF {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();
		
		double notafinal = nota1 + nota2;
		if (notafinal > 60) { 
			System.out.println("PARABENS! APROVADO!");
		}
		else { 
			System.out.println("REPROVADO! TENTE NOVAMENTE ANO QUE VEM!");
		}
		
		
		sc.close();

	}

}
