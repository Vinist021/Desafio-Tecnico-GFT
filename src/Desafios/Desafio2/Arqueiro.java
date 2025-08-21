package Desafios.Desafio2;

public class Arqueiro extends Heroi{

    public Arqueiro(String nome, String poder){
        super(nome, poder);
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + ": usa " + getPoder() + "!");
    }

}
