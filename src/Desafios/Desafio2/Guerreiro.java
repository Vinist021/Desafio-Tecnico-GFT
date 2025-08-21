package Desafios.Desafio2;

public class Guerreiro extends Heroi{

    public Guerreiro(String nome, String poder){
        super(nome, poder);
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + ": usa " + getPoder() + "!");
    }

}
