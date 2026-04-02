import java.util.Scanner;

public class operacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int op;
        double r;
        double pi = 3.141592;

        System.out.print("Digite a operação (1,2,3): ");
        op = sc.nextInt();

        System.out.print("Digite o raio: ");
        r = sc.nextDouble();

        switch (op) {
            case 1:
                System.out.println("Perímetro: " + (2 * pi * r));
                break;
            case 2:
                System.out.println("Área: " + (pi * r * r));
                break;
            case 3:
                System.out.println("Volume: " + ((4.0/3) * pi * Math.pow(r, 3)));
                break;
            default:
                System.out.println("Código inválido!");
        }

        sc.close();
    }
}