import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Nome: Eduardo Ribeiro Mota
        //Matricula: 1261947321

        Scanner scanner = new Scanner(System.in); 
        double distancia;
        double velocidade;
        System.out.println();
        System.out.println("Distância (km): ");
        distancia = scanner.nextDouble();
        System.out.println("Velocidade média (km/h): ");
        velocidade = scanner.nextDouble();
        double tempoHoras = distancia / velocidade;
        int horas = (int) tempoHoras;
        int minutos = (int) ((tempoHoras - horas) * 60);
        System.out.println();
        System.out.printf("Tempo estimado: %s horas e %s minutos",horas, minutos);
    }
}
