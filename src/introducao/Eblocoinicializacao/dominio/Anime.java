package introducao.Eblocoinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios={1,2,3,4,5,6,7,8,9,1,11,12};//cria um array com 12 posicoes
    
    public Anime(){//cria construtor onde ele chama as posicoes com foreach
        for (int episodio:this.episodios
             ) {
    System.out.print(episodio +" ");
        }

    }
    public int[] getEpisodios(){
        return episodios;
    }
}
