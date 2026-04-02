import java.util.Scanner;

public class maquinatroco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor da compra: ");
        int compra = sc.nextInt();

        System.out.print("Valor pago: ");
        int pago = sc.nextInt();

        if (pago < compra) {
            System.out.println("Quantia insuficiente!");
        } else {
            int troco = pago - compra;
            System.out.println("Troco: R$ " + troco);

            int[] notas = {50, 20, 10, 5, 2, 1};

            for (int nota : notas) {
                int qtd = troco / nota;
                troco %= nota;
                System.out.println("Notas de R$ " + nota + ": " + qtd);
            }
        }

        sc.close();
    }
}