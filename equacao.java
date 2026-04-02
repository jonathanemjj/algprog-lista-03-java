import java.util.Scanner;

public class equacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b, c;

        System.out.print("Digite a: ");
        a = sc.nextDouble();

        System.out.print("Digite b: ");
        b = sc.nextDouble();

        System.out.print("Digite c: ");
        c = sc.nextDouble();

        if (a == 0 && b == 0 && c != 0) {
            System.out.println("Coeficientes informados incorretamente.");
        } else if (a == 0) {
            System.out.println("Equação de primeiro grau");
            double x = -c / b;
            System.out.println("Raiz: " + x);
        } else {
            double delta = (b * b) - (4 * a * c);

            if (delta < 0) {
                System.out.println("Não possui raízes reais");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Duas raízes iguais: " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Duas raízes diferentes:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }

        sc.close();
    }
}