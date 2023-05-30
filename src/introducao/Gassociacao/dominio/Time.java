package introducao.Gassociacao.dominio;

public class Time {
    private String nome;
    private Jogador[]jogadores;
    public Time(String nome) {
        this.nome = nome;
    }

    public Time(String nome, Jogador[] jogadores) {
        this.nome = nome;
        this.jogadores = jogadores;
    }

    public void imprimi(){
        System.out.println(this.nome);
        if(jogadores ==null)return;
        for (Jogador jogador : jogadores) {
            System.out.println(jogador.getNome());
        }


    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Jogador[] getJogador() {
        return jogadores;
    }

    public void setJogador(Jogador[] jogador) {
        this.jogadores = jogador;
    }
}
