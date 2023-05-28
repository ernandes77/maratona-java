package introducao.Gassociacao.test;

import introducao.Gassociacao.dominio.Jogador;
import introducao.Gassociacao.dominio.Time;

public class JogadorTeste02 {

    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("pele");
        Time time = new Time("selecao brasileira");

        jogador1.setTime(time);
        jogador1.imprimi();

    }
}
