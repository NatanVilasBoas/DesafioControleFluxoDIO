import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        int firstNumber = scanner.nextInt();
        System.out.println("Digite o segundo número");
        int secondNumber = scanner.nextInt();

        try {
            count(firstNumber, secondNumber);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void count(int firstNumber, int secondNumber) throws ParametrosInvalidosException {
        if(firstNumber > secondNumber) throw new ParametrosInvalidosException();
        int counter = secondNumber - firstNumber;
        for (int i = 1; i<= counter; i++){
            System.out.println("Imprimindo o número " + i);
        }
    }
}