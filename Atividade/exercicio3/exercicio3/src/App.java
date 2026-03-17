import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Nome: Eduardo Ribeiro Mota
        //Matricula: 1261947321

        Scanner scanner = new Scanner(System.in);

        double d;
        double c = 4.95;
        
        System.out.println();
        System.out.println("Digete o valor em dolares: $");
        d = scanner.nextDouble();
        double conversao = d * c;
        System.out.println("O valor convertido em reais é: R$" + conversao);
    }
}
