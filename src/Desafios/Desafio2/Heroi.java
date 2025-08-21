package Desafios.Desafio2;

public class Heroi {

    private String nome;
    private String poder;

    public Heroi(String nome, String poder) {
        this.nome = nome;
        this.poder = poder;
    }

    public void atacar(){
        System.out.println(nome + "atacou!");
    }

    public String getNome() {
        return nome;
    }

    public String getPoder() {
        return poder;
    }

    public static Heroi criarHeroi(String nome) {
        return switch (nome.toLowerCase()) {
            case "guerreiro" -> new Guerreiro("Guerreiro", "Espada");
            case "mago" -> new Mago("Mago", "Bola de fogo");
            case "arqueiro" -> new Arqueiro("Arqueiro", "Arco e flecha");
            default -> null; // entrada inválida
        };
    }

}
