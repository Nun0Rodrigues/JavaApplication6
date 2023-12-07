import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para exibir a tabuada: ");
        
        int numero = scanner.nextInt();
        
        exibirTabuada(numero);

        scanner.close();
    }

    static void exibirTabuada(int numero) {
        System.out.println("Tabuada de " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}
