package Desafios.Desafio2;

import java.util.Scanner;

import static Desafios.Desafio2.Heroi.criarHeroi;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha o herói 1 (Guerreiro, Mago, Arqueiro):");
        String heroi1Input = sc.nextLine();

        System.out.println("Escolha o herói 2 (Guerreiro, Mago, Arqueiro):");
        String heroi2Input = sc.nextLine();

        // Criar objetos de acordo com a escolha do usuário
        Heroi heroi1 = criarHeroi(heroi1Input);
        Heroi heroi2 = criarHeroi(heroi2Input);

        if (heroi1 != null && heroi2 != null) {
            Duelo duelo = new Duelo(heroi1, heroi2);
            duelo.iniciar();
        } else {
            System.out.println("Herói inválido! Por favor, escolha entre Guerreiro, Mago ou Arqueiro.");
        }

        sc.close();
    }

}
