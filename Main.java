import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        double pi = 3.14159;
        double a,b,c;
        System.out.println("Digite o valor de a: ");
        a = teclado.nextDouble();
        System.out.println("Digite o valor de b: ");
        b = teclado.nextDouble();
        System.out.println("Digite o valor de c: ");
        c = teclado.nextDouble();

        double areaTriangulo = (a*c)/2;
        double areaCirculo = pi*(Math.pow(c,2));
        double areaTrapezio = ((a+b)*c)/2;
        double areaQuadrado = b*b;
        double areaRetangulo = a*b;

        System.out.printf("Triangulo: %.3f\n", areaTriangulo);
        System.out.printf("Circulo: %.3f\n", areaCirculo);
        System.out.printf("Trapezio: %.3f\n", areaTrapezio);
        System.out.printf("Quadrado: %.3f\n", areaQuadrado);
        System.out.printf("Retangulo: %.3f\n", areaRetangulo);

    }
}
