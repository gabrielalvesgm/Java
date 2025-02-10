import java.util.Scanner;

public class TreinoLogica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Irei calcular todos os divisores de um número e a porcentagem da divisão para você!");
        System.out.println("Digite o número inteiro que quiser:");
        int numero = scanner.nextInt(); //Atribui o valor do número digitado a variável numero.

        System.out.println("\nDivisores de: " + numero + ":"); //Exibe os divisores do número

        for (int i = 1; i <= numero; i++) { //loop for para percorrer todos os números de 1 a x(numero) checando seus divisores.
            if(numero % i == 0) { //condicional if para checar seus divisores comuns (onde a sobra da divisão é 0)
                double percentual = ((double) i / numero) *100; //uma variável double para verificar a % da divisão em suas partes
                System.out.printf("%d - %.2f%%%n", i, percentual);
            }
        }
        scanner.close();
    }
}
