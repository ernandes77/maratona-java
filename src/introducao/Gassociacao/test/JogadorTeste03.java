package introducao.Gassociacao.test;

import introducao.Gassociacao.dominio.Jogador;
import introducao.Gassociacao.dominio.Time;

import java.sql.SQLOutput;

public class JogadorTeste03 {
    //associaçao bidimensional 
    public static void main(String[] args) {
        Jogador jogador = new Jogador("cafu");
        Time time = new Time("Brasil");

        Jogador[] jogadores = {jogador};

        jogador.setTime(time);
        time.setJogador(jogadores);


        System.out.println("------Jogador-----");
        jogador.imprimi();

        System.out.println("----Time---");
        time.imprimi();
    }
}
