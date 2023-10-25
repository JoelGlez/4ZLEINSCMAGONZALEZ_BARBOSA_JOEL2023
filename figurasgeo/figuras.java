import java.util.InputMismatchException;
import java.util.Scanner;

class figuras {
    protected double area;

    public double getArea() {
        return area;
    }
}

class Rectangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
        calcularArea();
    }

    private void calcularArea() {
        area = base * altura;
    }
}

class Circulo extends FiguraGeometrica {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
        calcularArea();
    }

    private void calcularArea() {
        area = Math.PI * radio * radio;
    }
}

class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
        calcularArea();
    }

    private void calcularArea() {
        area = 0.5 * base * altura;
    }
}

class Rombo extends FiguraGeometrica {
    private double diagonalMayor;
    private double diagonalMenor;

    public Rombo(double diagonalMayor, double diagonalMenor) {
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
        calcularArea();
    }

    private void calcularArea() {
        area = (diagonalMayor * diagonalMenor) / 2;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Introduce la base y altura del rectángulo: ");
            double baseRectangulo = scanner.nextDouble();
            double alturaRectangulo = scanner.nextDouble();

            Rectangulo rectangulo = new Rectangulo(baseRectangulo, alturaRectangulo);
            System.out.println("Área del rectángulo: " + rectangulo.getArea());

            System.out.print("Introduce el radio del círculo: ");
            double radioCirculo = scanner.nextDouble();

            Circulo circulo = new Circulo(radioCirculo);
            System.out.println("Área del círculo: " + circulo.getArea());

            System.out.print("Introduce la base y altura del triángulo: ");
            double baseTriangulo = scanner.nextDouble();
            double alturaTriangulo = scanner.nextDouble();

            Triangulo triangulo = new Triangulo(baseTriangulo, alturaTriangulo);
            System.out.println("Área del triángulo: " + triangulo.getArea());

            System.out.print("Introduce las diagonales del rombo: ");
            double diagonalMayorRombo = scanner.nextDouble();
            double diagonalMenorRombo = scanner.nextDouble();

            Rombo rombo = new Rombo(diagonalMayorRombo, diagonalMenorRombo);
            System.out.println("Área del rombo: " + rombo.getArea());
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Asegúrate de ingresar números.");
        } finally {
            scanner.close();
        }
    }
}
