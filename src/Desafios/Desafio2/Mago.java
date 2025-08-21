package Desafios.Desafio2;

public class Mago extends Heroi{

    public Mago(String nome, String poder){
        super(nome, poder);
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + ": usa " + getPoder() + "!");
    }

}
