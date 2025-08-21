package Desafios.Desafio2;

public class Duelo {

    private Heroi heroi1;
    private Heroi heroi2;

    public Duelo(Heroi heroi1, Heroi heroi2) {
        this.heroi1 = heroi1;
        this.heroi2 = heroi2;
    }

    public void iniciar() {
        System.out.println("Heróis escolhidos: " + heroi1.getNome() + " vs " + heroi2.getNome());
        heroi1.atacar();
        heroi2.atacar();
    }

}
