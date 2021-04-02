package meusaldo;

import java.util.Scanner;

import static java.lang.System.in;

public class Saidas {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(in); //Ler as entradas do sistema.

        System.out.println("Digite sua entrada: ");
        float recebendo =  entrada.nextFloat();

        System.out.println("Digite sua entrada foi de: " + recebendo);
    }
}
