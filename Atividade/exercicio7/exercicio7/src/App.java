import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Nome: Eduardo Ribeiro Mota
        // Matrícula: 1261947321

        Scanner scanner = new Scanner(System.in);

        double distanciaPercorrida;
        double combustivelGastasto;
        System.out.println();
        System.out.println("Digite a distância percorrida (km): ");
        distanciaPercorrida = scanner.nextDouble();
        System.out.println("Digite o combustível gasto (litros): ");
        combustivelGastasto = scanner.nextDouble();
        double consumo = distanciaPercorrida / combustivelGastasto;
        System.out.printf("Consumo médio: %s km/l", consumo);
    }
}
