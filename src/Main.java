import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        double num1 = scanner.nextDouble();

        System.out.println("Digite outro numero: ");
        double num2 = scanner.nextDouble();

        System.out.println("Escolha a operação");
        System.out.println("1 para soma");
        System.out.println("2 para subtração");
        System.out.println("3 para multiplicação");
        System.out.println("4 para divisão");
        int operacao = scanner.nextInt();

        double result = 0;
        boolean operacaoValida = true;

        switch (operacao) {
            case 1:
                result = num1 + num2;
                System.out.println("Resultado: " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("Resultado: " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("Resultado: " + result);
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Resultado: " + result);
                    break;
                } else {
                    System.out.println("Error: Não é possivel dividir por zero");

                }
                break;
            default:
                operacaoValida = false;
                System.out.println("Erro Operação invalida");
                break;
        }
        scanner.close();
    }

}
