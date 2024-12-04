import java.util.Scanner;

public class Vetores {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] vetor = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um valor: ");
            vetor[i] = scanner.nextInt();
        }
        int i = 0;

        System.out.println("Vetor: ");
        do {
            System.out.println(vetor[i]);
            i++;
        } while (i < 5);
        scanner.close();
    }
}
