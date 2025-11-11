import java.util.Scanner;
import java.util.Locale;

public class exercicio {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double a;
		double b;
		double c;

		double pi = 3.14159;

		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();

		System.out.printf("Triangulo: %.3f%n", a * c / 2);
		System.out.printf("Circulo: %.3f%n", c * c * pi);
		System.out.printf("Trapezio: %.3f%n", ((a + b) * c) / 2);
		System.out.printf("Quadrado: %.3f%n", b * b);
		System.out.printf("Retangulo: %.3f%n", a * b);

		sc.close();
	}
}
