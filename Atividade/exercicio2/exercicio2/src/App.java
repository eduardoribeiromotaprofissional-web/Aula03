import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Nome: Eduardo Ribeiro Mota
        //Matricula: 1261947321

        Scanner scanner = new Scanner(System.in);
        int x;
        int y;
        System.out.println("Digite o número 1: ");
        x = scanner.nextInt();
        System.out.println("Digite o número 2: ");
        y = scanner.nextInt();
        int resultado = x % y;
        System.out.printf("O resto da divisão de %d por %d é: %d", x, y, resultado );
    }
}
