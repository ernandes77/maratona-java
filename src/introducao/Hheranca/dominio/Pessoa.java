package introducao.Hheranca.dominio;

public class Pessoa {
    private String nome;
    private String cpf;

    private Endereco endereco;

    public void imprimi(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
