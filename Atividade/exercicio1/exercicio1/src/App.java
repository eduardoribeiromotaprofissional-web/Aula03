public class App {
    public static void main(String[] args) throws Exception {
        //Nome: Eduardo Ribeiro Mota
    
        //Matricula:  1261947321
    Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;

        System.out.println("Digite o número 1: ");
        num1 = scanner.nextDouble();

        System.out.println("Digite o número 1: ");
        num2 = scanner.nextDouble();
        
        double soma = num1 + num2;
        double subtracao = num1 - num2;
        double multiplicação = num1 * num2;
        double divisao = num1 / num2;

        System.out.println("O resultado da adição é: " + soma);
        System.out.println("O resultado da subtração é: " + subtracao);
        System.out.println("O resultado da multiplicação é: " + multiplicação);
        System.out.println("O resultado da divisão é: " + divisao);
        
    }
}
