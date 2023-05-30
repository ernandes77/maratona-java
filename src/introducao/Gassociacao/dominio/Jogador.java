package introducao.Gassociacao.dominio;

import java.sql.Time;

public class Jogador {
    private String nome;
    private Time time;


    public void imprimi(){
            System.out.println(this.nome);
          if(time!=null){
            System.out.println(time.getTime());
    }
    }
    public Jogador(String nome) {
        this.nome = nome;

    }

    public Jogador(String nome, Time time) {
        this.nome = nome;
        this.time = time;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    public void setTime(introducao.Gassociacao.dominio.Time time) {
    }
}
