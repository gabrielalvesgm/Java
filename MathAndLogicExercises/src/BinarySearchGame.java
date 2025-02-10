
//Utilizando o algoritimo de busca binária O(logn), irei estruturar um ''mini-game'' onde o
//usuário digitará qualquer número e o ''gênio'' utilizando busca binária O(logn) ''adivinhará''
//qual foi o número digitado em alguns passos.


import java.util.Locale;
import java.util.Scanner;

public class BinarySearchGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Olá! eu sou o gênio adivinhador, irei adivinhar qualquer número " +
                "que você pensar, em apenas alguns passos! " +
                "\n tudo oque precisa é dizer um número bem grande! e escolher qualquer " +
                "número entre 1 e ele!\n após isso é só me contar se seu número é maior ou " +
                "menor do que o número que eu estou pensando! OK? vamos lá!");

        int numero = scanner.nextInt();

        int piso = 1;
        int limite = numero;
        int chute = 0;
        String resposta = "";

        //Começo do ''jogo'' de adivinhação
        System.out.println("Pensando em um número entre 1 e " + numero
        + "\n");

        //busca binária
        while (piso <= limite) {
            chute = (piso + limite) /2;

            System.out.println("Diga me! o número que você está pensando é maior, menor ou " +
                    "igual à " + chute + "?");
            resposta = scanner.next().toLowerCase();

            if (resposta.equals("igual")) {
                System.out.println("Seu número é " + chute + "!");
                break;
            } else if (resposta.equals("maior")) {
                piso = chute +1;
            } else if (resposta.equals("menor")) {
                limite = chute - 1;
            } else {
                System.out.println("Resposta inválida, diga-me se é maior, menor ou igual.");
            }
        }

    scanner.close();
    }
}