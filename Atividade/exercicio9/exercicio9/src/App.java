import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Nome: Eduardo Ribeiro Mota
        //Matricula: 1261947321
        Scanner scanner = new Scanner(System.in);
  
        double PrecoProduto;
        double ValorPago;
        System.out.println();
        System.out.println("Preço do produto: ");
        PrecoProduto = scanner.nextDouble();
        System.out.println("Valor pago: ");
        ValorPago = scanner.nextDouble();
        double troco = ValorPago - PrecoProduto;
        System.out.printf("Troco: R$ %.2f",troco);
    }
}
