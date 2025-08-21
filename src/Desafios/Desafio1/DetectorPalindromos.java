package Desafios.Desafio1;

import java.util.Scanner;

public class DetectorPalindromos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Insira uma frase para verificar se é um palíndromo");

        String frase = scanner.next().replaceAll("\\s+", "");

        String fraseInvertida = new StringBuilder(frase).reverse().toString().replaceAll("\\s+", "");

        System.out.println(frase);

        System.out.println(fraseInvertida);

        if (frase.equalsIgnoreCase(fraseInvertida)){
            System.out.println("É um palíndromo!");
        }
        else{
            System.out.println("Não é um palíndromo ):");
        }

    }

}
