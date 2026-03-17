import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Nome: Eduardo Ribeiro Mota
        // Matrícula: 1261947321

        Scanner scanner = new Scanner(System.in);

        double base;
        double altura;

        System.out.println();
        System.out.println("Digite a base em cm: ");
        base = scanner.nextDouble();
        System.out.println("Digite a altura em cm: ");
        altura = scanner.nextDouble();
        double area = base * altura;
        System.out.printf("Área do retângulo: %s cm²", area);


    }
}
