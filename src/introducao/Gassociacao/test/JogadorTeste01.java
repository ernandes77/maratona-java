package introducao.Gassociacao.test;

import introducao.Gassociacao.dominio.Jogador;

public class JogadorTeste01 {

    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("ernandes");
        Jogador jogador2 = new Jogador("pele");
        Jogador jogador3 = new Jogador("evandro");

        Jogador [] jogadores = {jogador1,jogador2,jogador3};
        for (Jogador jogador : jogadores) {
            jogador.imprimi();
        }


    }


    }
    }
}
