package introducao.Hheranca.teste;

import introducao.Hheranca.dominio.Endereco;
import introducao.Hheranca.dominio.Funcionario;
import introducao.Hheranca.dominio.Pessoa;

public class Teste01 {

    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("laranjeiras");
        endereco.setCep("7321654");

        Pessoa pessoa = new Pessoa("Ernandes");

        pessoa.setCpf("321654987-32");
        pessoa.setEndereco(endereco);

        pessoa.imprimi();

        Funcionario funcionario = new Funcionario("Ana");

        funcionario.setCpf("65498732-32");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2000);

        System.out.println("-------------");
        funcionario.imprimi();
      //  endereco.imprimi();
    }
}
