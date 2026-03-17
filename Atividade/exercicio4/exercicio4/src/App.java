import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Nome: Eduardo Ribeiro Mota
        //Matricula: 1261947321

        Scanner scanner = new Scanner(System.in);
        double salarioA;
        System.out.println();
        System.out.println("Digite o salário atual: R$ ");
        salarioA = scanner.nextDouble();

        double salarioN = salarioA * 1.07;

        System.out.println("Salário original: R$ " + salarioA);
        System.out.println("Novo salário: R$ " + salarioN);
    }
}
