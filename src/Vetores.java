import java.util.Scanner;

public class Vetores {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] vetor = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um valor: ");
            vetor[i] = teclado.nextInt();

        }
        System.out.println("Lista dos valores digitados:");
        for (int i = 0; i < 5; i++) {
            System.out.println(vetor[i] + " ");
        }
    }
}
