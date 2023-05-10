package introducao.Bmetodos.teste;

import introducao.Bmetodos.dominio.Pessoa;

public class PessoaTeste {

    public static void main(String[] args) {

    Pessoa pessoa = new Pessoa();
    pessoa.setNome("ernandes");//modificador privado sempre deve ser chamado o atributo pelo set
    pessoa.setIdade(14);

    //pessoa.imprimi();
    System.out.println(pessoa.getNome());//sempre que cria metodos com get assim que se chama
        System.out.println(pessoa.getIdade());

    }
}
