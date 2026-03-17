import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Nome: Eduardo Ribeiro Mota
        //Matricula: 1261947321

        Scanner scanner = new Scanner(System.in);
        double C;
        System.out.println();
        System.out.println("Digite a temperatura em Celsius: ");
        C = scanner.nextDouble();
        double F = (C * 9 / 5) + 32;
        double K = C + 273.15;
        System.out.printf("Fahrenheit: %s °F",F);
        System.out.println();
        System.out.printf("Kelvin: %s K",K);
    }
}
