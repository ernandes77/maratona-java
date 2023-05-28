package introducao.Gassociacao.test;

import introducao.Gassociacao.dominio.Escola;
import introducao.Gassociacao.dominio.Professor;

public class EscolaTeste01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Ernandes");
        Professor professor2 = new Professor("kakashi");
        Professor []professores = {professor1,professor2};
        Escola escola = new Escola("Kanoha",professores);

        escola.imprimi();
    }
}
