

import java.util.Date;
import java.util.Scanner;

public class Projeto {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String[] dados = new String[4];

        System.out.println("Digite o nome:");
        dados[0] = scanner.nextLine();
        System.out.println("Digite o dia:");
        dados[1] = scanner.nextLine();
        System.out.println("Digite o mes:");
        dados[2] = scanner.nextLine();
        System.out.println("Digite o ano:");
        dados[3] = scanner.nextLine();


        int dianascimento = Integer.parseInt(dados[1]);
        int mesnascimento = Integer.parseInt(dados[2]);
        int anonascimento = Integer.parseInt(dados[3]);

        int anoAtual = 2024;
        int mesAtual = 12;
        int diaAtual = 04;

        int idade = anoAtual - anonascimento;

        if (mesAtual < mesnascimento || (mesAtual == mesnascimento && dianascimento < diaAtual)) {
            idade--;
        }

        System.out.println(dados[0] + ", você tem " + idade + " anos.");

    scanner.close();
    }

}
