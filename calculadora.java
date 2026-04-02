import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1, n2;
        char op;

        System.out.print("Digite o primeiro número: ");
        n1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        n2 = sc.nextDouble();

        System.out.print("Digite o operador (+, -, *, /, ^): ");
        op = sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println(n1 + n2);
                break;
            case '-':
                System.out.println(n1 - n2);
                break;
            case '*':
                System.out.println(n1 * n2);
                break;
            case '/':
                System.out.println(n1 / n2);
                break;
            case '^':
                System.out.println(Math.pow(n1, n2));
                break;
            default:
                System.out.println("Operador inválido!");
        }

        sc.close();
    }
}