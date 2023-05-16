package introducao.Eblocoinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;

    {
        System.out.println("Dentro do construtor");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }
    public Anime(){//cria construtor onde ele chama as posicoes com foreach
        for (int episodio:this.episodios) {
            System.out.print(episodio +" ");
        }
    System.out.println("");
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios(){
        return episodios;
    }
}
