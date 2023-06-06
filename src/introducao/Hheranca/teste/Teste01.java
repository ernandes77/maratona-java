package introducao.Hheranca.teste;

import introducao.Hheranca.dominio.Endereco;
import introducao.Hheranca.dominio.Pessoa;

public class Teste01 {

    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("laranjeiras");
        endereco.setCep("7321654");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Ernandes");
        pessoa.setCpf("321654987");

        pessoa.imprimi();
        endereco.imprimi();
    }
}
