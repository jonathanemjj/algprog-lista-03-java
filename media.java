import java.util.Scanner;

public class media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1, n2, n3;

        System.out.print("Digite o primeiro número: ");
        n1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        n2 = sc.nextDouble();

        System.out.print("Digite o terceiro número: ");
        n3 = sc.nextDouble();

        double maior = Math.max(n1, Math.max(n2, n3));
        double menor = Math.min(n1, Math.min(n2, n3));
        double media = (n1 + n2 + n3) / 3;

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Média: " + media);

        sc.close();
    }
}